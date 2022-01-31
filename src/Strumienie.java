import java.io.File;
import java.util.stream.Stream;
import java.util.stream.IntStream;
public class Strumienie {
    public static File[] pliki(String path)
    {
        File dir = new File(path);
        return dir.listFiles(f->f.isFile());
    }
    public static void main(String[] args)
    {
        //System.out.print(Arrays.toString(pliki(".")));
        String[] nazwa = {"Kokos","Pedał","Penis","Kot","XD","Rak","Ananas"};
        int[] nazwa2 = {1,2,3,4,5,6,7,8,9,10};
        long licznik = Stream.of(nazwa).filter((s)->s.length()>5).count();
        int licznik2 = IntStream.of(nazwa2).sum();
        int dupa= IntStream.of(nazwa2).sum();
        System.out.print(licznik2);
    }
}