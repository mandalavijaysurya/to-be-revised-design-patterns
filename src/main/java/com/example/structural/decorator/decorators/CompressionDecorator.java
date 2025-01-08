package com.example.structural.decorator.decorators;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Base64;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;

import com.example.structural.decorator.components.Datasource;

public class CompressionDecorator extends DatasourceDecorator{

    private int compressionLevel = 6;

    public CompressionDecorator(Datasource source) {
        super(source);
    }

    @Override
    public void writeData(String data) {
        System.out.println("Compressing data");
        super.writeData(compress(data));
    }

    @Override
    public String readData() {
        System.out.println("Decompressing data");
        return decompress(super.readData());
    }

    private String compress(String stringData){
        byte[] data = stringData.getBytes();
        try{
            ByteArrayOutputStream bout = new ByteArrayOutputStream(512); 
            DeflaterOutputStream dos = new DeflaterOutputStream(bout, new Deflater(compressionLevel));
            dos.write(data);
            dos.close();
            bout.close();
            return Base64.getEncoder().encodeToString(bout.toByteArray());
        }catch(IOException ex){
            return null;
        }
    }

    private String decompress(String data){
        byte[] decodedData = Base64.getDecoder().decode(data);
        try{
            InputStream in = new ByteArrayInputStream(decodedData);
            InflaterInputStream iin = new InflaterInputStream(in);
            ByteArrayOutputStream bout = new ByteArrayOutputStream(512);
            int b;
            while((b = iin.read()) != -1){
                bout.write(b);
            }
            in.close();
            iin.close();
            bout.close();
            return new String(bout.toByteArray());
        }catch(IOException ex){
            return null;
        }
    }
}
