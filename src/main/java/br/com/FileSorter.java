package br.com;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class FileSorter {
    public static void main(String[] args) {
        String inputFile = "meuarquivo.txt";
        String outputFile = "meuarquivo_ordenado.txt";

        try {
            // Leitura do arquivo original
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            ArrayList<String> lines = new ArrayList<>();
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
            reader.close();

            // Ordenação das linhas
            Collections.sort(lines);

            // Escrita das linhas ordenadas no arquivo de saída
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
            for (String sortedLine : lines) {
                writer.write(sortedLine);
                writer.newLine();
            }
            writer.close();

            System.out.println("Arquivo ordenado salvo com sucesso!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
