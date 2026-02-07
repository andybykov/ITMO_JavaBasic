package Lab10;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileInstruments {

    //Задание 1. метод, который читает текстовый файл и возвращает его в виде списка строк.
    public static List<String> readFileToListString(String inputPath) {
        if (inputPath== null || inputPath.isEmpty()) {
            throw new IllegalArgumentException("Null or empty path to file");
        }

        File file = new File(inputPath);
        List<String> stringList = new ArrayList<>();
        // try-with-resources
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String input;
            while ((input = reader.readLine()) != null) {
                stringList.add(input);
            }

        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

        return stringList;
    }

    // Задание 2. метод, который записывает в файл строку, переданную параметром.
    // append отвечает за перезапись файла или добавление в конец
    public static void writeStringToFile(String outputPath, String line, boolean append) {
        if ((outputPath == null || outputPath.isEmpty()) || (line == null || line.isEmpty())) {
            throw new IllegalArgumentException("Null or empty arguments");
        }
        File file = new File(outputPath);
        // try-with-resources
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, append))) {
            writer.write(line);
            writer.newLine();

        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    // Задание 3. метод, который склеивает два текстовых файла в один.
    /*
    Используя решение 1 и 2, напишите метод, который склеивает два текстовый файла один.
     */
    public static void mergeFiles(String inputPath1, String inputPath2, String outputPath) {
        if ((inputPath1 == null || inputPath1.isEmpty())
                || (inputPath2== null || inputPath2.isEmpty())
                || (outputPath == null || outputPath.isEmpty())) {
            throw new IllegalArgumentException("Null or empty arguments");
        }
        List<String> file1Lines = readFileToListString(inputPath1);
        List<String> file2Lines = readFileToListString(inputPath2);

        // Добавляем все строки 1 файла
        for (String line : file1Lines) {
            writeStringToFile(outputPath, line, true);
        }
        // все строки 2 файла
        for (String line : file2Lines) {
            writeStringToFile(outputPath, line, true);
        }

    }
}

