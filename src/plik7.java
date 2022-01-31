import java.io.FileWriter;
import java.io.IOException;

/**
 * This program demonstrates how to write characters to a text file.
 */

public class plik7
{
    public static void main(String[] args)
    {
        if (args.length != 1) {
            System.err.println("Sposób użycia: java TextFileWritingDemo1 nazwaPliku");
            System.exit(1);
        }
        try {
            // Gdy chcemy dopisywać do istniejącego pliku
            // FileWriter writer = new FileWriter(args[0], true);
            FileWriter writer = new FileWriter(args[0], false);
            writer.write("Hello World");
            // writer.write("\r\n");   // new line in Windows
            writer.write("\n");   // new line in Unix, Linux and MacOs
            writer.write("Good Bye!");
            writer.write("\n");   // bez tego niekompletny ostatni wiersz
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

