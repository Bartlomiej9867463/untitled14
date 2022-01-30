import java.io.File;
import java.util.Arrays;

 public class plikiplikipliki {
        public static File[] wypisz(String path)
        {
            File dir = new File(path);
            return dir.listFiles(f->f.isFile());
        }

        public static String[] wypisz2(String path,String ext)
        {
            File dir = new File(path);
            return dir.list((directory,name)->{
                String[] nazwy = name.split("./");
                System.out.println(Arrays.toString(nazwy));
                return nazwy[nazwy.length-1].equals(ext);
            });
        }
        public static void main(String[] args)
        {
            System.out.println(Arrays.toString(wypisz(".")));
            System.out.println(Arrays.toString(wypisz2(".","py")));
        }
    }
