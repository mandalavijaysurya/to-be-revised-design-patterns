package com.example.structural.decorator.decorators;

import java.util.Base64;

import com.example.structural.decorator.components.Datasource;

public class EncryptionDecorator extends DatasourceDecorator{

    public EncryptionDecorator(Datasource source) {
        super(source);
    }

    @Override
    public void writeData(String data) {
        System.out.println("Encrypting data");
        super.writeData(encode(data));
    }

    @Override
    public String readData() {
        System.out.println("Decrypting data");
        return decode(super.readData());
    }

    private String decode(String data){
        byte[] result = Base64.getDecoder().decode(data);
        for(int i = 0; i < result.length; i++){
            result[i] = (byte) (result[i] ^ (byte) 0x5);
        }
        return new String(result);
    }

    private String encode(String data){
        byte[] result = data.getBytes();
        for(int i = 0; i < result.length; i++){
            result[i] = (byte) (result[i] ^ (byte) 0x5);
        }
        return Base64.getEncoder().encodeToString(result);
    } 
}
