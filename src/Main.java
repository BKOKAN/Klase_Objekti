import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<GeoLik> likovi = new ArrayList<>();

        // vec generirani likovi
        Krug k1 = new Krug("K1", 6);
        Krug k2 = new Krug("K2", 5);
        Trokut t1 = new Trokut("T1", 5,6,5);
        Trokut t2 = new Trokut("T2", 3,6,4);
        Pravokutnik p1 = new Pravokutnik("P1", 5,3);
        Pravokutnik p2 = new Pravokutnik("P2", 4,6);

        likovi.addAll(Arrays.asList(k1, k2, t1, t2, p1, p2));

        System.out.println("Odaberi oblik:");
        System.out.println("1 - Krug");
        System.out.println("2 - Pravokutnik");
        System.out.println("3 - Trokut");

        int izbor = scanner.nextInt();
        scanner.nextLine();

        if (izbor == 1) {

            System.out.println("Unesi naziv kruga:");
            String naziv = scanner.nextLine();

            System.out.println("Unesi radius:");
            double radius = scanner.nextDouble();

            Krug krug = new Krug(naziv, radius);
            likovi.add(krug);
            likovi.sort((l1, l2) -> Double.compare(l1.povrsina(), l2.povrsina()));

            System.out.println("\nŽeliš li ispis podataka? (da/ne)");
            scanner.nextLine();
            String odgovor = scanner.nextLine();

            if (odgovor.equalsIgnoreCase("da")) {
                System.out.println("Naziv: " + krug.getNaziv());
                System.out.println("Radius: " + krug.getRadius());
                System.out.println("Opseg:" + krug.opseg());
                System.out.println("Povrsina:" + krug.povrsina());
                System.out.println("\nSortirani po površini:");
                for (GeoLik lik : likovi) {
                    System.out.println(lik.getNaziv() + " : " + lik.povrsina());
                }
            }

        }
        else if (izbor == 2) {

            System.out.println("Unesi naziv pravokutnika:");
            String naziv = scanner.nextLine();

            System.out.println("Unesi velicinu AC:");
            double ac = scanner.nextDouble();

            System.out.println("Unesi velicinu BD:");
            double bd = scanner.nextDouble();

            Pravokutnik pravokutnik = new Pravokutnik(naziv, ac, bd);
            likovi.add(pravokutnik);
            likovi.sort((l1, l2) -> Double.compare(l1.povrsina(), l2.povrsina()));

            System.out.println("\nŽeliš li ispis podataka? (da/ne)");
            scanner.nextLine();
            String odgovor = scanner.nextLine();

            if (odgovor.equalsIgnoreCase("da")) {
                System.out.println("Naziv: " + pravokutnik.getNaziv());
                System.out.println("AC: " + pravokutnik.getVelicinaAC());
                System.out.println("BD: " + pravokutnik.getVelicinaBD());
                System.out.println("Opseg:" + pravokutnik.opseg());
                System.out.println("Povrsina:" + pravokutnik.povrsina());
                System.out.println("\nSortirani po površini:");
                for (GeoLik lik : likovi) {
                    System.out.println(lik.getNaziv() + " : " + lik.povrsina());
                }
            }

        }
        else if (izbor == 3) {

            System.out.println("Unesi naziv trokuta:");
            String naziv = scanner.nextLine();

            System.out.println("Unesi prvu stranicu:");
            double a = scanner.nextDouble();

            System.out.println("Unesi drugu stranicu:");
            double b = scanner.nextDouble();

            System.out.println("Unesi trecu stranicu:");
            double c = scanner.nextDouble();

            Trokut trokut = new Trokut(naziv, a, b, c);
            likovi.add(trokut);
            likovi.sort((l1, l2) -> Double.compare(l1.povrsina(), l2.povrsina()));

            System.out.println("\nŽeliš li ispis podataka? (da/ne)");
            scanner.nextLine();
            String odgovor = scanner.nextLine();

            if (odgovor.equalsIgnoreCase("da")) {
                System.out.println("Naziv: " + trokut.getNaziv());
                System.out.println("Stranica 1: " + trokut.getPrvaStranica());
                System.out.println("Stranica 2: " + trokut.getDrugaStranica());
                System.out.println("Stranica 3: " + trokut.getTrecaStranica());
                System.out.println("Opseg:" + trokut.opseg());
                System.out.println("Povrsina:" + trokut.povrsina());
                System.out.println("\nSortirani po površini:");
                for (GeoLik lik : likovi) {
                    System.out.println(lik.getNaziv() + " : " + lik.povrsina());
                }

            }

        }
        else {
            System.out.println("Neispravan izbor.");
        }

        scanner.close();
    }
}
