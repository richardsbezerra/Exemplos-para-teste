package pjOrfisi;

import java.lang.classfile.Superclass;

public class CPF extends Peoples{

    private String cpf;

    public CPF(String nome, String sobrenome, String endereco, String genero, String etinia, String cpf) {
        super(nome, sobrenome, endereco, genero, etinia);
        this.cpf = cpf;
    }


    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}
