import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String switchCase = "Izbornik";

        ArrayList<GeoLik> likovi = new ArrayList<>();

        // vec generirani likovi
        Krug k1 = new Krug("K1", 6);
        Krug k2 = new Krug("K2", 5);
        Trokut t1 = new Trokut("T1", 5, 6, 5);
        Trokut t2 = new Trokut("T2", 3, 6, 4);
        Pravokutnik p1 = new Pravokutnik("P1", 5, 3);
        Pravokutnik p2 = new Pravokutnik("P2", 4, 6);

        likovi.addAll(Arrays.asList(k1, k2, t1, t2, p1, p2));

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

                    if (izbor == 1)
                    {
                        isKrug = true;
                        switchCase = "krug";
                    }
                    else if (izbor == 2)
                    {
                        isPravokutnik = true;
                        switchCase = "pravokutnik";
                    }
                    else if (izbor == 3)
                    {
                        isTrokut = true;
                        switchCase = "trokut";
                    }
                    else System.out.println("Neispravan unos!");
                    break;

                case "krug":
                    System.out.println("Unesi naziv kruga:");
                    String nazivK = scanner.nextLine();

                    System.out.println("Unesi radius:");
                    double radius = scanner.nextDouble();
                    scanner.nextLine();

                    Krug krug = new Krug(nazivK, radius);
                    likovi.add(krug);

                    if (likovi.size() > 1) {
                        System.out.println("Želiš li ispisati podatke i poredati ih po površini? (da/ne)");
                    } else {
                        System.out.println("Želiš li ispisati podatke? (da/ne)");
                    }

                    String odgK = scanner.nextLine();

                    if (odgK.equalsIgnoreCase("da")) {
                        switchCase = "podatci";
                    } else {
                        System.out.println("Želiš li unijeti novi lik? (da/ne)");
                        odgK = scanner.nextLine();
                        if (odgK.equalsIgnoreCase("da")) switchCase = "izbornik";
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
                    double a = scanner.nextDouble();

                    System.out.println("Unesi stranicu B:");
                    double b = scanner.nextDouble();
                    scanner.nextLine();

                    Pravokutnik pravokutnik = new Pravokutnik(nazivP, a, b);
                    likovi.add(pravokutnik);

                    if (likovi.size() > 1) {
                        System.out.println("Želiš li ispisati podatke i poredati ih po površini? (da/ne)");
                    } else {
                        System.out.println("Želiš li ispisati podatke? (da/ne)");
                    }

                    String odgP = scanner.nextLine();

                    if (odgP.equalsIgnoreCase("da")) {
                        switchCase = "podatci";
                    } else {
                        System.out.println("Želiš li unijeti novi lik? (da/ne)");
                        odgP = scanner.nextLine();
                        if (odgP.equalsIgnoreCase("da")) switchCase = "izbornik";
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

                    Trokut trokut = new Trokut(nazivT, ta, tb, tc);
                    likovi.add(trokut);

                    if (likovi.size() > 1) {
                        System.out.println("Želiš li ispisati podatke i poredati ih po površini? (da/ne)");
                    } else {
                        System.out.println("Želiš li ispisati podatke? (da/ne)");
                    }

                    String odgT = scanner.nextLine();

                    if (odgT.equalsIgnoreCase("da")) {
                        switchCase = "podatci";
                    } else {
                        System.out.println("Želiš li unijeti novi lik? (da/ne)");
                        odgT = scanner.nextLine();
                        if (odgT.equalsIgnoreCase("da")) switchCase = "izbornik";
                        else {
                            scanner.close();
                            return;
                        }
                    }
                    break;

                case "podatci":
                    System.out.println("\nPodatci zadnjeg lika:");
                    if(isKrug){
                        System.out.println("Naziv: " + krug.getNaziv());
                        System.out.println("Radius: " + krug.getradius());

                    }

                    if (likovi.size() > 1) {
                        likovi.sort((l1, l2) -> Double.compare(l1.povrsina(), l2.povrsina()));

                        System.out.println("\nPoredak po površini:");
                        for (GeoLik lik : likovi) {
                            System.out.println(lik.getNaziv() + " - " + lik.povrsina());
                        }
                    }

                    System.out.println("\nŽeliš li unijeti novi lik? (da/ne)");
                    String odg = scanner.nextLine();

                    if (odg.equalsIgnoreCase("da")) {
                        switchCase = "izbornik";
                    } else {
                        scanner.close();
                        return;
                    }
                    break;
            }
        }
    }
}