import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Odaberi oblik:");
        System.out.println("1 - Krug");
        System.out.println("2 - Pravokutnik");
        System.out.println("3 - Trokut");

        int izbor = scanner.nextInt();
        scanner.nextLine(); // čišćenje buffer-a

        if (izbor == 1) {

            System.out.println("Unesi naziv kruga:");
            String naziv = scanner.nextLine();

            System.out.println("Unesi radius:");
            double radius = scanner.nextDouble();

            Krug krug = new Krug(naziv, radius);

            System.out.println("\nŽeliš li ispis podataka? (da/ne)");
            scanner.nextLine();
            String odgovor = scanner.nextLine();

            if (odgovor.equalsIgnoreCase("da")) {
                System.out.println("Naziv: " + krug.getNaziv());
                System.out.println("Radius: " + krug.getRadius());
            }

        } else if (izbor == 2) {

            System.out.println("Unesi naziv pravokutnika:");
            String naziv = scanner.nextLine();

            System.out.println("Unesi velicinu AC:");
            double ac = scanner.nextDouble();

            System.out.println("Unesi velicinu BD:");
            double bd = scanner.nextDouble();

            Pravokutnik pravokutnik = new Pravokutnik(naziv, ac, bd);

            System.out.println("\nŽeliš li ispis podataka? (da/ne)");
            scanner.nextLine();
            String odgovor = scanner.nextLine();

            if (odgovor.equalsIgnoreCase("da")) {
                System.out.println("Naziv: " + pravokutnik.getNaziv());
                System.out.println("AC: " + pravokutnik.getVelicinaAC());
                System.out.println("BD: " + pravokutnik.getVelicinaBD());
            }

        } else if (izbor == 3) {

            System.out.println("Unesi naziv trokuta:");
            String naziv = scanner.nextLine();

            System.out.println("Unesi prvu stranicu:");
            double a = scanner.nextDouble();

            System.out.println("Unesi drugu stranicu:");
            double b = scanner.nextDouble();

            System.out.println("Unesi trecu stranicu:");
            double c = scanner.nextDouble();

            Trokut trokut = new Trokut(naziv, a, b, c);

            System.out.println("\nŽeliš li ispis podataka? (da/ne)");
            scanner.nextLine();
            String odgovor = scanner.nextLine();

            if (odgovor.equalsIgnoreCase("da")) {
                System.out.println("Naziv: " + trokut.getNaziv());
                System.out.println("Stranica 1: " + trokut.getPrvaStranica());
                System.out.println("Stranica 2: " + trokut.getDrugaStranica());
                System.out.println("Stranica 3: " + trokut.getTrecaStranica());
            }

        } else {
            System.out.println("Neispravan izbor.");
        }

        scanner.close();
    }
}
