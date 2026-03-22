package run;

import java.util.Scanner;

public class ejercicio2 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese su nota(0-100): ");
        int nota = sc.nextInt();

        if(nota <= 100 && nota >= 90)
            System.out.println("Su nota es Excelente");
        if(nota <= 89 && nota >= 70)
            System.out.println("Su nota es Buena");
        if(nota <= 69 && nota >= 60)
            System.out.println("Su nota es regular ");
        if(nota < 60)
            System.out.println("Su nota es deficiente ");
    }
}

