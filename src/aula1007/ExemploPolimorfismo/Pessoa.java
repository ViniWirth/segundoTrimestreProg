package aula1007.ExemploPolimorfismo;

public class Pessoa {
    private String nome;
    private String sobrenome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String obterDados(){
        return "Nome: "+nome+" "+sobrenome;
    }

    //é Override pois está manipulando o método que está no codigo fonte do java
    @Override
    public String toString(){
        return obterDados();
    }
}
