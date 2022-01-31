import java.util.ArrayList;
import java.util.Arrays;
interface BartekChuj
{
    int sum(int a,int b);
}

interface GrubyChuj
{
    String connect(String x,String y);
}

interface Pedał
{
    public void dopisz(ArrayList<Integer> source, ArrayList<Integer> destination);
}

interface Niggers<T>
{
    public  void dopisz2(ArrayList<T> source,ArrayList<T> destination);
}



public class lambda01 {

    public static void main(String[] args)
    {
        BartekChuj gruby = (a,b)->{return a+b;};
        System.out.println(gruby.sum(2, 3));
        GrubyChuj bartek = (x,y)->{return x+y;};
        System.out.println(bartek.connect("Ma małego", " fiuta."));
        Pedał Bartek = (source,destination)->{
            for(Integer i: source)
                destination.add(i);
        };
        ArrayList<Integer> as = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
        ArrayList<Integer> bj = new ArrayList<>(Arrays.asList(8,9,10));
        Bartek.dopisz(as, bj);
        System.out.print(bj);

        Niggers<Integer> fuckthem = (source,destinaton)->{
            ArrayList<Integer> xd = new ArrayList<>();
            for(Integer cos: destinaton)
                source.add(cos);

        };

        ArrayList<Integer> cd = new ArrayList<>(Arrays.asList(0,0,0,0,0,0,1));
        ArrayList<Integer> de = new ArrayList<>(Arrays.asList(1,1,1,1,1,1,1));
        fuckthem.dopisz2(cd, de);
        System.out.print(cd);
    }



}