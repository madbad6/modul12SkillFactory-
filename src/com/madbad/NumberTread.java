package com.madbad;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class NumberTread implements Runnable {

    private File file;

    public NumberTread(String fileName) {
        file = new File(fileName);
    }

    @Override
    public void run() {
            try {
                FileInputStream fis = new FileInputStream(file);
                int i;
                while ((i = fis.read()) != -1) {
                    System.out.print((char) i);
                }
            } catch (IOException e) {
                System.err.println("File is not found");
            }
            System.out.println();
    }

    @Override
    public String toString() {
        return "  Tread:"+ file;
    }
}
