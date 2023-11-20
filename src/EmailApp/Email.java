package EmailApp;

import java.util.Scanner;

public class Email {
    private String ime;
    private String prezime;
    private String lozinka;
    private String odjel;
    private int kapacitetSpremnika = 500;
    private String alternativniEmail;
    private int duljinaZadaneLozinke = 10;
    private String email;
    private String sufiksTvrtke = "tvrtka.com";

    public Email(String ime, String prezime) {
        this.ime = ime;
        this.prezime = prezime;
        this.odjel = postaviOdjel();

        this.lozinka = nasumicnaLozinka(duljinaZadaneLozinke);
        System.out.println("Vaša lozinka je: " + this.lozinka);

        email = ime.toLowerCase() + "." + prezime.toLowerCase() + "@" + odjel + "." + sufiksTvrtke;
    }

    private String postaviOdjel() {
        System.out.print("Zaposlenik: " + ime + "\nOznake odjela:\n1 za Prodaju\n2 za Razvoj\n3 za Računovodstvo\n0 za ništa\nUnesite oznaku odjela: ");
        Scanner in = new Scanner(System.in);
        int odjelIzbor = in.nextInt();
        if (odjelIzbor == 1) {
            return "prodaja";
        } else if (odjelIzbor == 2) {
            return "razvoj";
        } else if (odjelIzbor == 3) {
            return "racunovodstvo";
        } else {
            return "";
        }
    }

    private String nasumicnaLozinka(int duljina) {
        String skupLozinki = "ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789!@&%";
        char[] lozinka = new char[duljina];
        for (int i = 0; i < duljina; i++) {
            int rand = (int) (Math.random() * skupLozinki.length());
            lozinka[i] = skupLozinki.charAt(rand);
        }
        return new String(lozinka);
    }

    public void postaviKapacitetSpremnika(int kapacitet) {
        this.kapacitetSpremnika = kapacitet;
    }

    public void postaviAlternativniEmail(String altEmail) {
        this.alternativniEmail = altEmail;
    }

    public void promijeniLozinku(String lozinka) {
        this.lozinka = lozinka;
    }

    public int dohvatiKapacitetSpremnika() {
        return kapacitetSpremnika;
    }

    public String dohvatiAlternativniEmail() {
        return alternativniEmail;
    }

    public String dohvatiLozinku() {
        return lozinka;
    }

    public String prikaziInfo() {
        return "PRIKAZ IMENA: " + ime + " " + prezime +
                "\nEMAIL TVRTKE:" + email +
                "\nKAPACITET SANDUČIĆA: " + kapacitetSpremnika + "mb";
    }
}
