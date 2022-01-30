import java.time.LocalDate;
import java.util.Random;

public class Main {

    static <t extends Comparable> boolean isSported (t[] tablica){
        boolean wynik =true;
        t temp=tablica[0];
        for (int i=1;i<tablica.length; i++){
            if((tablica[i].compareTo(temp))==-1){
                wynik=false;
            }
            temp=tablica[i];
        }
        return wynik;
    }
    public static void main(String[] args) {
        Integer[] dupa = new Integer[]{1,2,3,4,5};
        LocalDate[] cipa = new LocalDate[]{LocalDate.of(14,12,1),LocalDate.of(13,12,1),LocalDate.of(14,12,1)};
        System.out.print(isSported(dupa));
        System.out.print(isSported(cipa));
        // write your code here
    }
}
