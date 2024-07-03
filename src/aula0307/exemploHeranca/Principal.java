package aula0307.exemploHeranca;

public class Principal {
    static void main(String[] args) {
        Motorista m1 = new Motorista("Jonas", "Silva");
        m1.setNome ("Jonas");
        m1.setSobrenome ("Silva");
        m1.setSalario (1000);
        m1.setCnh("5252642");

        Engenheiro e1 = new Engenheiro("Vinícius", "Wirth");
        e1.setNome("Vinícius");
        e1.setSobrenome("Wirth");
        e1.setSalario(3000);
        e1.setCrea("8472537");
    }
}