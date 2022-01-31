import java.io.FileReader;
import java.io.IOException;

/**
 * Demonstruje czytanie znaków z pliku tekstowego
 */

public class plik6
{
    public static void main(String[] args)
    {
        if (args.length != 1) {
            System.err.println("Sposób użycia: java TextFileReadingDemo1 nazwaPliku");
            System.exit(1);
        }
        try {
            FileReader reader = new FileReader(args[0]);
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

