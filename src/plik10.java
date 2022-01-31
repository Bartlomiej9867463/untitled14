import java.io.*;

/**
 * Kopiuje kolejne fragmenty pliku o wielkości 4 kB
 */

public class plik10
{
    private static final int BLOCK_SIZE = 4096; // 4kB

    public static void main(String[] args)
    {
        if (args.length < 2) {
            System.out.println("Please provide input and output files");
            System.exit(0);
        }
        String inputFile = args[0];
        String outputFile = args[1];
        try {
            InputStream inputStream = new BufferedInputStream(new FileInputStream(inputFile));
            OutputStream outputStream = new BufferedOutputStream(new FileOutputStream(outputFile));
            byte[] block = new byte[BLOCK_SIZE];
            int len;
            while ((len = inputStream.read(block)) != -1) {
                outputStream.write(block, 0, len);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}

