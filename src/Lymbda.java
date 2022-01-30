    interface StringFunction {
        String run(String str);
        StringFunction exclaim = (s) -> s + "!";
        StringFunction ask = (s) -> s + "?";
        }
        interface CHUJ{
            int cipka(int n, int m);
        }
    interface wielkiCHUJ{
        int wielkacipka(int costam, int costam2);
        static wielkiCHUJ test_bez_returna(){
           return (costam,costam2)->costam+costam2;
        }
    }

public class Lymbda {
    public static int dodawanko(int wartosc1, int wartosc2) {
        return wartosc1 + wartosc2;
    }

    StringFunction exclaim = (s) -> s + "!";
    StringFunction ask = (s) -> s + "?";

    public static void printFormatted(String str, StringFunction format) {
        String result = format.run(str);
        System.out.println(result);
    }

    public static void main(String[] args) {

        printFormatted("Hello", StringFunction.exclaim);
        printFormatted("Hello", StringFunction.ask);
        CHUJ nowychuj = (n,m) ->{return n+m;};
        System.out.print( nowychuj.cipka(3,4));
        System.out.print("\n");
        wielkiCHUJ x = wielkiCHUJ.test_bez_returna();
        System.out.print(x.wielkacipka(4,9));


    }
}
