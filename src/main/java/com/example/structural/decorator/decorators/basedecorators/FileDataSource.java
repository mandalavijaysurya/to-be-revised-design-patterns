package com.example.structural.decorator.decorators.basedecorators;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;

import com.example.structural.decorator.components.Datasource;

public class FileDataSource implements Datasource {

    private String fileName;

    public FileDataSource(String fileName){
        this.fileName = fileName;
    }


    @Override
    public void writeData(String data) {
        File file = new File(fileName);
        // write data to file
        try(OutputStream fos = new java.io.FileOutputStream(file)){
            fos.write(data.getBytes(), 0, data.length());
        }catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public String readData() {
        char[] buffer = null;
        File file = new File(fileName);

        // read data from file
        try(FileReader fileReader = new FileReader(file)) {
            buffer = new char[(int) file.length()];
            fileReader.read(buffer);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return new String(buffer);
    }
    
}
