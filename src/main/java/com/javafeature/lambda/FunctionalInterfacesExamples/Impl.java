package com.javafeature.lambda.FunctionalInterfacesExamples;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Impl {

    public Impl() throws IOException {
    }

    //alt
    public String processFile() throws IOException{
        try(BufferedReader br = new BufferedReader(new FileReader("data.txt"))){
            return br.readLine();
        }
    }

    //neu
    public String processFile(BufferedReaderProcessor p) throws IOException{
        try (BufferedReader br = new BufferedReader(new FileReader("data.txt"))){
            return p.process(br);
        }
    }

    String oneLine = processFile(BufferedReader::readLine);

    String twoLines = processFile((BufferedReader br) -> br.readLine() + br.readLine());
}
