package application3;

import java.util.Scanner;
import entities3.Aluguel;

public class Programa {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Aluguel[] vect = new Aluguel[10];

        System.out.print("Quantos quartos você vai alugar? ");
        int n = sc.nextInt();

        for (int i = 1; i<= n; i++) {
            System.out.println();
            System.out.println("Aluguel #:" + i + ":");
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("E-mail: ");
            String email = sc.nextLine();
            System.out.print("Quarto: ");
            int quarto = sc.nextInt();
            vect[quarto] = new Aluguel(nome,email);

        }

        System.out.println();
        System.out.println("Quartos ocupados:");

        for (int i=0; i<10; i++) {
            if (vect[i] != null) {
                System.out.println(i + ": " + vect[i]);
            }

        }


        sc.close();
    }
}