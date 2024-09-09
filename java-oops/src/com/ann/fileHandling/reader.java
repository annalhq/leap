package com.ann.fileHandling;

import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;

class reader {
    public static void main(String[] args) {

        try (InputStreamReader isr = new InputStreamReader(System.in)){
            System.out.println("enter some letters");
            int letters = isr.read();

            while (isr.ready()){
                System.out.println((char) letters);
                letters = isr.read();
            }
            isr.close();
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}