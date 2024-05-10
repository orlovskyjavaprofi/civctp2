package orlovsky.consulting.gbr;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CDBConverter {

    public static void main(String[] args) {
        if (args.length != 2) {
            System.err.println("Usage: java CDBConverter <input_cdb_file> <output_directory>");
            System.exit(1);
        }

        String inputFilePath = args[0];
        String outputDirectory = args[1];

        try {
            List<String> cdbContents = readCDBFile(inputFilePath);

            String headerContent = generateHeader(cdbContents);
            String sourceContent = generateSource(cdbContents);

            writeToFile(outputDirectory, "output.h", headerContent);
            writeToFile(outputDirectory, "output.cpp", sourceContent);

            System.out.println("Header and source files generated successfully.");
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static List<String> readCDBFile(String filePath) throws IOException {
        List<String> lines = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
            reader.close();
        }
        return lines;
    }

    private static String generateHeader(List<String> cdbContents) {
        StringBuilder header = new StringBuilder();
        header.append("/* Generated Header */\n\n");

        // Iterate over the cdbContents and process each line to generate header content
        for (String line : cdbContents) {
            // Assuming each line in the CDB file represents a record or data
            String[] parts = line.split("\\s+"); // Split the line into parts based on whitespace
            if (parts.length > 0) {
                String recordName = parts[0]; // Assuming the first part represents the record name
                header.append("class ").append(recordName).append(" {\n");

                // Add member variables based on the remaining parts of the line
                for (int i = 1; i < parts.length; i++) {
                    header.append("    private ").append(parts[i]).append(";\n");
                }

                header.append("};\n\n");
            }
        }

        return header.toString();
    }

    private static String generateSource(List<String> cdbContents) {
        StringBuilder source = new StringBuilder();
        source.append("/* Generated Source */\n\n");

        // Iterate over the cdbContents and process each line to generate source content
        for (String line : cdbContents) {
            // Assuming each line in the CDB file represents a record or data
            String[] parts = line.split("\\s+"); // Split the line into parts based on whitespace
            if (parts.length > 0) {
                String recordName = parts[0]; // Assuming the first part represents the record name
                source.append(recordName).append("::").append(recordName).append("() {\n");
                
                // Add initialization of member variables based on the remaining parts of the line
                for (int i = 1; i < parts.length; i++) {
                    source.append("    // Initialize ").append(parts[i]).append("\n");
                }

                source.append("}\n\n");
            }
        }

        return source.toString();
    }

    private static void writeToFile(String outputDirectory, String fileName, String content) throws IOException {
        File outputFile = new File(outputDirectory, fileName);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            writer.write(content);
            writer.close();
        }
    }
}
