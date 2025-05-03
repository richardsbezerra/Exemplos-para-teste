package pjOrfisi;

public class PJ extends Peoples{

    private String cnpj;
    private String nomeEmpresa;

    public PJ(String name, String sobrenome, String endereco, String genero, String etinia, String cnpj, String nomeEmpresa) {
        super(name, sobrenome, endereco, genero, etinia);
        this.cnpj = cnpj;
        this.nomeEmpresa = nomeEmpresa;
    }

    public String getCnpj() {return cnpj;}
    public void setCnpj(String cnpj) {this.cnpj = cnpj;}

    public String getNomeEmpresa() {return nomeEmpresa;}
    public void setNomeEmpresa(String nomeEmpresa) {this.nomeEmpresa = nomeEmpresa;}


}
