import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String switchCase = "Izbornik";

        ArrayList<GeoLik> likovi = new ArrayList<>();

//        Krug k1 = new Krug("K1", 6);
//        Krug k2 = new Krug("K2", 5);
//        Trokut t1 = new Trokut("T1", 5, 6, 5);
//        Trokut t2 = new Trokut("T2", 3, 6, 4);
//        Pravokutnik p1 = new Pravokutnik("P1", 5, 3);
//        Pravokutnik p2 = new Pravokutnik("P2", 4, 6);
//        likovi.addAll(Arrays.asList(k1, k2, t1, t2, p1, p2));

        Krug zadnjiKrug = null;
        Pravokutnik zadnjiPravokutnik = null;
        Trokut zadnjiTrokut = null;

        boolean isKrug = false;
        boolean isPravokutnik = false;
        boolean isTrokut = false;

        while (true) {
            switch (switchCase.toLowerCase()) {

                case "izbornik":
                    System.out.println("Odaberi oblik:");
                    System.out.println("1 - Krug");
                    System.out.println("2 - Pravokutnik");
                    System.out.println("3 - Trokut");

                    int izbor = scanner.nextInt();
                    scanner.nextLine();

                    if (izbor == 1) switchCase = "krug";
                    else if (izbor == 2) switchCase = "pravokutnik";
                    else if (izbor == 3) switchCase = "trokut";
                    else System.out.println("Neispravan unos!");
                    break;

                case "krug":
                    System.out.println("Unesi naziv kruga:");
                    String nazivK = scanner.nextLine();

                    System.out.println("Unesi radius:");
                    double radius = scanner.nextDouble();
                    scanner.nextLine();

                    zadnjiKrug = new Krug(nazivK, radius);
                    likovi.add(zadnjiKrug);

                    isKrug = true;
                    isPravokutnik = false;
                    isTrokut = false;

                    String odg = pitajZaIspis(scanner, likovi);

                    if (odg.equalsIgnoreCase("da")) {
                        switchCase = "podatci";
                    } else {
                        System.out.println("Želiš li unijeti novi lik? (da/ne)");
                        odg = scanner.nextLine();

                        if (odg.equalsIgnoreCase("da")) switchCase = "izbornik";
                        else {
                            scanner.close();
                            return;
                        }
                    }
                    break;

                case "pravokutnik":
                    System.out.println("Unesi naziv pravokutnika:");
                    String nazivP = scanner.nextLine();

                    System.out.println("Unesi stranicu A:");
                    double ac = scanner.nextDouble();

                    System.out.println("Unesi stranicu B:");
                    double bd = scanner.nextDouble();
                    scanner.nextLine();

                    zadnjiPravokutnik = new Pravokutnik(nazivP, ac, bd);
                    likovi.add(zadnjiPravokutnik);

                    isKrug = false;
                    isPravokutnik = true;
                    isTrokut = false;

                    odg = pitajZaIspis(scanner, likovi);

                    if (odg.equalsIgnoreCase("da")) {
                        switchCase = "podatci";
                    } else {
                        System.out.println("Želiš li unijeti novi lik? (da/ne)");
                        odg = scanner.nextLine();

                        if (odg.equalsIgnoreCase("da")) switchCase = "izbornik";
                        else {
                            scanner.close();
                            return;
                        }
                    }
                    break;

                case "trokut":
                    System.out.println("Unesi naziv trokuta:");
                    String nazivT = scanner.nextLine();

                    System.out.println("Unesi stranicu a:");
                    double ta = scanner.nextDouble();

                    System.out.println("Unesi stranicu b:");
                    double tb = scanner.nextDouble();

                    System.out.println("Unesi stranicu c:");
                    double tc = scanner.nextDouble();
                    scanner.nextLine();

                    zadnjiTrokut = new Trokut(nazivT, ta, tb, tc);
                    likovi.add(zadnjiTrokut);

                    isKrug = false;
                    isPravokutnik = false;
                    isTrokut = true;

                    odg = pitajZaIspis(scanner, likovi);

                    if (odg.equalsIgnoreCase("da")) {
                        switchCase = "podatci";
                    } else {
                        System.out.println("Želiš li unijeti novi lik? (da/ne)");
                        odg = scanner.nextLine();

                        if (odg.equalsIgnoreCase("da")) switchCase = "izbornik";
                        else {
                            scanner.close();
                            return;
                        }
                    }
                    break;

                case "podatci":
                    System.out.println("\n--- Podatci zadnjeg lika ---");

                    if (isKrug && zadnjiKrug != null) {
                        System.out.println("Lik: KRUG");
                        System.out.println("Naziv: " + zadnjiKrug.getNaziv());
                        System.out.println("Radius: " + zadnjiKrug.getRadius());
                        System.out.println("Opseg: " + zadnjiKrug.opseg());
                        System.out.println("Površina: " + zadnjiKrug.povrsina());
                    }

                    if (isPravokutnik && zadnjiPravokutnik != null) {
                        System.out.println("Lik: PRAVOKUTNIK");
                        System.out.println("Naziv: " + zadnjiPravokutnik.getNaziv());
                        System.out.println("a: " + zadnjiPravokutnik.getVelicinaAC());
                        System.out.println("b: " + zadnjiPravokutnik.getVelicinaBD());
                        System.out.println("Opseg: " + zadnjiPravokutnik.opseg());
                        System.out.println("Površina: " + zadnjiPravokutnik.povrsina());
                    }

                    if (isTrokut && zadnjiTrokut != null) {
                        System.out.println("Lik: TROKUT");
                        System.out.println("Naziv: " + zadnjiTrokut.getNaziv());
                        System.out.println("a: " + zadnjiTrokut.getPrvaStranica());
                        System.out.println("b: " + zadnjiTrokut.getDrugaStranica());
                        System.out.println("c: " + zadnjiTrokut.getTrecaStranica());
                        System.out.println("Opseg: " + zadnjiTrokut.opseg());
                        System.out.println("Površina: " + zadnjiTrokut.povrsina());
                    }

                    if (likovi.size() > 1) {
                        likovi.sort((l1, l2) -> Double.compare(l1.povrsina(), l2.povrsina()));

                        System.out.println("\nPoredak po površini:");
                        for (GeoLik lik : likovi) {
                            System.out.println(lik.getNaziv() + " - " + lik.povrsina());
                        }
                    }

                    System.out.println("\nŽeliš li unijeti novi lik? (da/ne)");
                    String novi = scanner.nextLine();

                    if (novi.equalsIgnoreCase("da")) switchCase = "izbornik";
                    else {
                        scanner.close();
                        return;
                    }
                    break;
            }
        }
    }

    public static String pitajZaIspis(Scanner scanner, ArrayList<GeoLik> likovi) {

        if (likovi.size() > 1) {
            System.out.println("Želiš li ispisati podatke i poredati po površini? (da/ne)");
        } else {
            System.out.println("Želiš li ispisati podatke? (da/ne)");
        }

        return scanner.nextLine();
    }
}