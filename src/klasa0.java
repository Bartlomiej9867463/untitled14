import java.lang.Comparable;
import java.lang.Cloneable;
import java.time.LocalDate;

public class klasa0<T extends klasa0<T>> implements Cloneable, Comparable<T> {
    private LocalDate rokUrodzenia;
    private String nazwisko;

    klasa0(String nazwisko, LocalDate rokUrodzenia) {
        this.nazwisko = nazwisko;
        this.rokUrodzenia = rokUrodzenia;
    }

    LocalDate getRokUrodzenia() {
        return rokUrodzenia;
    }

    String getNazwisko() {
        return nazwisko;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof klasa0)) return false;
        klasa0 osoba = (klasa0) o;
        return rokUrodzenia.equals(osoba.rokUrodzenia) && nazwisko.equals(osoba.nazwisko);
    }
    @Override
    public int compareTo(T o) {
        String str1=this.toString();
        String str2=o.toString();
        if (str1.length()>str2.length())
            return 1;
        else if (str1.length()<str2.length())
            return -1;
        else
            return 0;
    }
    @Override
    public String toString() {
        return "Osoba" +
                "[rokUrodzenia=" + rokUrodzenia +
                "], [nazwisko='" + nazwisko + '\'' +
                ']';
    }
}