import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * This program demonstrates how to read lines from a text file
 * using a BufferedReader for efficiency.
 *
 */

public class plik8
{
    public static void main(String[] args)
    {
        if (args.length != 1) {
            System.err.println("Sposób użycia: java TextFileReadingDemo nazwaPliku");
            System.exit(1);
        }
        try {
            FileReader reader = new FileReader(args[0]);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

