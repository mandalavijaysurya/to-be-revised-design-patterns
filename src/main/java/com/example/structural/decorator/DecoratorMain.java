package com.example.structural.decorator;

import com.example.structural.decorator.components.Datasource;
import com.example.structural.decorator.decorators.CompressionDecorator;
import com.example.structural.decorator.decorators.DatasourceDecorator;
import com.example.structural.decorator.decorators.EncryptionDecorator;
import com.example.structural.decorator.decorators.basedecorators.FileDataSource;

public class DecoratorMain {

    public static void main(String[] args) {

        String salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";
        DatasourceDecorator encoded = new CompressionDecorator(new EncryptionDecorator(new FileDataSource("OutputDemo.txt")));
        encoded.writeData(salaryRecords);
        Datasource plain = new FileDataSource("OutputDemo.txt");

        System.out.println("- Input ----------------");
        System.out.println(salaryRecords);
        System.out.println("- Encoded --------------");
        System.out.println(plain.readData());
        System.out.println("- Decoded --------------");
        System.out.println(encoded.readData());
    }
    
}
