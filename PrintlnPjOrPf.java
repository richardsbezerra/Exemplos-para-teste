package pjOrfisi;

import java.util.Set;

public class PrintlnPjOrPf {
    public static void imprimirPessoas(Set<PJ> pjs, Set<CPF> cpfs) {
        System.out.println("\n--- CNPJ ---");
        for (PJ j : pjs) {
            System.out.println("Nome: " + j.getName() + ", Sobrenome: " + j.getSobrenome() + ", Endereço: " + j.getEndereco() + ", Genero: " + j.getGenero() + ", Etinia: " + j.getEtinia() + ", CNPJ: " + j.getCnpj() + ", Empresa: " + j.getNomeEmpresa());
        }

        System.out.println("\n--- CPF ---");
        for (CPF f : cpfs) {
            System.out.println("Nome: " + f.getName() + ", Sobrenome: " + f.getSobrenome() + ", Endereço: " + f.getEndereco() + ", Genero: " + f.getGenero() + ", Etinia: " + f.getEtinia() + ", CPF: " + f.getCpf());
        }
    }

}
