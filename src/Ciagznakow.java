import java.util.ArrayList;
import java.util.Arrays;

interface IntSequence
{
    int next();
    default boolean hasNext()
    {
        return true;
    }
    static IntSequence of(Integer... values)
    {
        return new IntSequence() {
            int zliczacz = 0;
            ArrayList<Integer> lista =new ArrayList<>(Arrays.asList(values));
            int rozmiar=lista.size();
            public int next() {
                zliczacz++;
                if (zliczacz>=rozmiar){
                    lista.add(1);
                }
                return lista.get(zliczacz-1);
            }
        };

    }

}

public class Ciagznakow
{

    public static void main(String[] args)
    {
        IntSequence duper = IntSequence.of(1,2,3,4);
        while (true){
            System.out.print(duper.next());
        }
    }

}