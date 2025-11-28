import java.util.Date;
import java.util.GregorianCalendar;

public class Pracownik {
    private String nazwa;
    private double pensja;
    private Date dzat; //data zatrudnienia

    //konstruktor
    public Pracownik(String n, double p, int r, int m, int d) {
        nazwa = n;
        pensja = p;
        // m-1 is used because Calendar months are 0-indexed (0 is January)
        GregorianCalendar rmd = new GregorianCalendar(r, m - 1, d);
        dzat = rmd.getTime();
    }

    //metody
    public String getNazwa() {
        return nazwa;
    }

    public Date getDzat() {
        return dzat;
    }

    public Double getPensja() {
        return pensja;
    }
}