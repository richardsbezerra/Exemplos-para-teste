package pjOrfisi;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MainPjOrPf {

    public static void main (String args[]) {

        Scanner s = new Scanner(System.in);


        Set<PJ> pjts = new HashSet<>();
        Set<CPF> pfts = new HashSet<>();

        while(true) {
            System.out.println("\nVocê quer cadastrar uma pessoa PJ ou CPF? (Digite 'sair' para encerrar)");
            String options = s.nextLine().trim().toLowerCase();

            if(options.equals("pj")) {
                pjts.add(cadastrarPJ(s));
            } else if (options.equals(("cpf"))) {
                pfts.add(cadastrarCPF(s));
            } else if (options.equals("exit")) {
                break;
            } else {
                System.out.println("Opção inválida. Digite 'pj', 'cpf' ou 'exit'.");
            }
        }

        PrintlnPjOrPf.imprimirPessoas(pjts, pfts);
        s.close();
    }

    private static  PJ cadastrarPJ(Scanner s) {
        System.out.println("\n Cadastro de Pessoa Jurídica (PJ)");

        System.out.println("Nome: ");
        String nome = s.nextLine();
        System.out.println("Sobrenome: ");
        String sobrenome = s.nextLine();
        System.out.println("Endereço: ");
        String endereco = s.nextLine();
        System.out.println("Genero: ");
        String genero = s.nextLine();
        System.out.println("Etinia: ");
        String etinia = s.nextLine();
        System.out.println("CNPJ: ");
        String cnpj = s.nextLine();
        System.out.println("Empresa: ");
        String nomeEmpresa = s.nextLine();

        return new PJ(nome, sobrenome, endereco, genero, etinia, cnpj, nomeEmpresa);

    }

    private static CPF cadastrarCPF(Scanner s) {
        System.out.println("\n Cadastro de Pessoa Física (CPF)");

        System.out.println("Nome: ");
        String nome = s.nextLine();
        System.out.println("Sobrenome: ");
        String sobrenome = s.nextLine();
        System.out.println("Endereço: ");
        String endereco = s.nextLine();
        System.out.println("Genero: ");
        String genero = s.nextLine();
        System.out.println("Etinia: ");
        String etinia = s.nextLine();
        System.out.println("CPF: ");
        String cpf = s.nextLine();


        return new CPF(nome, sobrenome, endereco, genero, etinia, cpf);
    }


}
