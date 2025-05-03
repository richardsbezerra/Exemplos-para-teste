package pjOrfisi;

public abstract class Peoples {

    private String name;
    private String sobrenome;
    private String endereco;
    private String genero;
    private String etinia;

    public Peoples(String name, String sobrenome, String endereco, String genero, String etinia) {
        this.name = name;
        this.sobrenome = sobrenome;
        this.endereco = endereco;
        this.genero = genero;
        this.etinia = etinia;
    }



    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public String getSobrenome() {return sobrenome;}
    public void setSobrenome(String sobrenome) {this.sobrenome = sobrenome;}

    public String getEndereco() {return endereco;}
    public void setEndereco(String endereco) {this.endereco = endereco;}

    public String getGenero() {return genero;}
    public void setGenero(String genero) {this.genero = genero;}

    public String getEtinia() {return etinia;}
    public void setEtinia(String etinia) {this.etinia = etinia;}
}
