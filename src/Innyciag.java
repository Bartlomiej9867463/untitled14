import org.jetbrains.annotations.Contract;

import java.util.ArrayList;
import java.util.Arrays;

interface Sekwencja// Abstrakcja ktora zawiera metody i stale wartosci
{
    double typwyjscia();//TO jest abstrakcyjna metoda potrzeban aby lymbda dzialala To wskazuje na returna na to co jest returnowane, nie mogą być dwa bo lambda nei bedzie widziala co zrobić z tym
    static Sekwencja stala(int value)//Implementavcja metody abstrakcyjne Stala wskazuje na typwyjscia, moze byc poza interfejsem
    {
        return ()->value*value;
    }
}

public class Innyciag
{
    static Sekwencja stala(int value)//Stala wskazuje na typwyjscia, moze byc poza interfejsem
    {
        return ()->value*value;
    }
    public static void squares(int value)
    {
        while(true)
        {
            Sekwencja stala = stala(value);
            value++;
            System.out.println(stala.typwyjscia());
        }
    }
    public static void main(String[] args)
    {
        // IntSequence seq = IntSequence.of(3,1,4,1,5,9);
        // while(seq.hasNext())
        // System.out.print(seq.next());
        squares(3);
    }

}