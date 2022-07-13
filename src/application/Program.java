package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Locale;

import entities.Funcionario;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Funcionario> list = new ArrayList<>();

        System.out.print("Quantos funcionários você vai cadastrar? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println();
            System.out.println("Funcionario #" + i + ":");

            System.out.print("Id: ");
            int id = sc.nextInt();
            while (hasId(list, id)) {
                System.out.print("Id já está em uso. Tente novamente: ");
                id = sc.nextInt();
            }

            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Salário: ");
            Double salario = sc.nextDouble();
            list.add(new Funcionario(id, nome, salario));

        }

        System.out.println();
        System.out.print("Entre com o id do funcionario que irá receber o aumento de salario: ");
        int id = sc.nextInt();
        Funcionario emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if (emp == null) {
            System.out.println("Este id não existe!");
        } else {
            System.out.print("Coloque a porcentagem do aumento: ");
            double porcentagem = sc.nextDouble();
            emp.aumentoSalario(porcentagem);
        }

        System.out.println();
        System.out.println("Lista de funcionarios:");
        for (Funcionario obj : list) {
            System.out.println(obj);
        }


        sc.close();
    }

    private static boolean hasId(List<Funcionario> list, int id) {
        Funcionario emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
}

