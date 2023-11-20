package EmailApp;

import java.util.Scanner;

public class EmailApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Unesite ime: ");
        String ime = scanner.next();

        System.out.print("Unesite prezime: ");
        String prezime = scanner.next();

        Email em1 = new Email(ime, prezime);
        System.out.println(em1.prikaziInfo());

        scanner.close();
    }
}
