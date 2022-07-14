package application2;

import java.util.Locale;
import java.util.Scanner;
import entities2.Conta;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Conta conta;

        System.out.println("Digite o numero da conta: ");
        int numero = sc.nextInt();
        System.out.println("Digite o nome do titular:");
        sc.nextLine();
        String titular = sc.nextLine();
        System.out.println("Você vai fazer um deposito inicial (s/n)? ");
        char resposta  = sc.next().charAt(0);
        if (resposta == 's') {
            System.out.println("Digite o valor do deposito inicial: ");
            double depositoInicial = sc.nextDouble();
            conta = new Conta(numero, titular, depositoInicial);
        }
        else {
            conta = new Conta(numero, titular);
        }

        System.out.println();
        System.out.println("Dados da conta:");
        System.out.println(conta);

        System.out.println();
        System.out.print("Digite o valor para deposito: ");
        double valorDeposito = sc.nextDouble();
        conta.deposito(valorDeposito);
        System.out.println("Dados atualizados da conta:");
        System.out.println(conta);

        System.out.println();
        System.out.print("Digite o valor do saque: ");
        double valorSaque = sc.nextDouble();
        conta.saque(valorSaque);
        System.out.println("Dados atualizados da conta: ");
        System.out.println(conta);

        sc.close();

    }

}