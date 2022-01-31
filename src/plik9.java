import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * This program demonstrates how to write characters to a text file
 * using a BufferedReader for efficiency.
 */

public class plik9
{
    public static void main(String[] args)
    {
        if (args.length != 1) {
            System.err.println("Sposób użycia: java TextFileWritingDemo1 nazwaPliku");
            System.exit(1);
        }
        try {
            FileWriter writer = new FileWriter(args[0], false);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write("Hello World");
            bufferedWriter.newLine();
            bufferedWriter.write("Do zobaczenia wkrótce!");
            bufferedWriter.newLine(); // bez tego niekompletny ostatni wiersz
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

