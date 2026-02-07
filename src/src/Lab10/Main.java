package Lab10;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // 1.
            String inputPath ="files/input_text1.txt";
            List<String> stringList1 = new ArrayList<>();
            stringList1 = FileInstruments.readFileToListString(inputPath);

            //2.
            String outputPath ="files/output_text.txt";
            FileInstruments.writeStringToFile(outputPath, "Hello world!", false);

            //3.
            String inputPath1 = "files/input_text1.txt";
            String inputPath2 = "files/input_text2.txt";
            FileInstruments.mergeFiles(inputPath1, inputPath2, outputPath);

            //4.
            FileInstruments.replaceSomeSymbols(outputPath);

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }


    }
}
