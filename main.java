import java.io.FileNotFoundException;
import java.util.Scanner;

public class main{
    public static void main(String[] args) throws FileNotFoundException {
        kawa k=new kawa();
        Scanner scan= new Scanner(System.in);
        int answer=0;


        System.out.println("Witaj użytkowniku w systemie eksperckim, który pomoże ci w doborze kawy!");
        System.out.println("Odpowiedz na kilka pytań poniżej, a na końcu dowiesz się o co poprosić baristę :)");
        System.out.println("Czy kawa ma byc ciepla czy zimna?");
        System.out.println("1. ciepla       2.zimna");
        System.out.print("Twoja odpowiedz: ");
        answer = scan.nextInt();
        if(answer==1 && k.stan=="ciepla") {
            k.punkt=+1;
        } // cały czas w obiekcie mam null i nie wiem w jaki sposób pobrać dane z obiektu aby mi zwracały poszczególne rzeczy do porównania :C
        // chce sprawdzac aby odpowiedz uzytkownika z poszczegolnymi polami w obiekcie, a nastepnie dawać punkt odpowiedniej kawie(jezeli odpowiedzi sie zgadzaja)
        // a  na koniec wybrać kawe która ma najwiecej punktów, halp bo nie mam siły na to gówno
        System.out.println("Ile espresso chciałbys w kawie?");
        System.out.println("Pssst pamietaj,ze im wiecej tym mocniejsza kawa :)");
        System.out.println("1. jedno       2. dwa        3. trzy");
        System.out.print("Twoja odpowiedz: ");
        answer = scan.nextInt();
        System.out.println("Jaką grubość ma mieć piana mleczna?");
        System.out.println("1. 0cm      2. mniej niz 1cm 3. wiecej niz 1cm, ale mniej niz 2cm       3. wiecej niz 2cm");
        System.out.print("Twoja odpowiedz: ");
        answer = scan.nextInt();
        /*



         */
        System.out.println("Czy kawa ma miec syrop smakowy?");
        System.out.println("1. tak      2. nie");
        System.out.print("Twoja odpowiedz: ");
        answer = scan.nextInt();
        /*


         */
        System.out.println("Czy kawa ma miec mieszanke przypraw?");
        System.out.println("1. tak      2. nie");
        System.out.print("Twoja odpowiedz: ");
        answer = scan.nextInt();
        /*


         */
        System.out.print("Brawo! U baristy mozesz zamowic: " );

}
}