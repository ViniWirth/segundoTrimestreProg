package aula1206.exemploLampada;

public class Lampada {
    String marca;
    String modelo;
    String cor;
    boolean estaLigada;

    void ligar(){
        estaLigada = true;
    }
    void desligar(){
        estaLigada = false;
    }

    boolean estaLigada(){
        return estaLigada;
    }
}