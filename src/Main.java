import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        /*String pozdrav = "Hello, World!";

        //toto je pro print
        System.out.println(pozdrav);
        System.out.println(pozdrav);
        System.out.println(pozdrav);
        System.out.println(pozdrav);*/

/*
        int prvniCislo = 10;
        int druheCislo = 5;

        prvniCislo = druheCislo * 5;

        System.out.println(prvniCislo + druheCislo);
        System.out.println(prvniCislo - druheCislo);
        System.out.println(prvniCislo * druheCislo);
        System.out.println(prvniCislo / druheCislo);

        String pozdrav2 = "Ahoj";
        String jmeno = "Honza";

        System.out.println(pozdrav2 + jmeno);
*/
        //Uloha: Uzivatel napise sve jmeno a program pozdravi
/*
        String pozdrav3 = "Ahoj, ";
        Scanner mujScanner = new Scanner(System.in);
        System.out.println("Zadej sve jmeno:");
        String jmeno = mujScanner.nextLine();
        System.out.println(pozdrav3 + jmeno + ".");
*/

        //Kalkulacka

        float  prvniCislo;
        float druheCislo;
        Scanner mujScanner = new Scanner(System.in);

        System.out.println("Zadej prvni cislo:");
        prvniCislo = mujScanner.nextFloat();
        System.out.println("Zadej druhe cislo:");
        druheCislo = mujScanner.nextFloat();

        System.out.println(prvniCislo + druheCislo);
        System.out.println(prvniCislo - druheCislo);
        System.out.println(prvniCislo * druheCislo);
        System.out.println(prvniCislo / druheCislo);







    }
}





/* toto je vice radkovy komentar */