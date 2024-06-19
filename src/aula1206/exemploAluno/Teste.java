package aula1206.exemploAluno;
import aula1206.exemploLampada.Lampada;

import java.util.Scanner;
public class Teste {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Aluno a1 = new Aluno();
        System.out.println("Qual o nome do aluno?");
        a1.nome = ler.next();
        System.out.println("Qual a primeira nota do aluno?(0-10)");
        a1.notaUm = ler.nextFloat();
        System.out.println("Qual a segunda nota do aluno?(0-10)");
        a1.notaDois = ler.nextFloat();

        float media = (a1.notaUm + a1.notaDois) / 2;

        if (media>=8){
            System.out.println("O aluno"+a1.nome+" está aprovado.");
        } else if(media>=6){
            System.out.println("O aluno"+a1.nome+" está em recuperação");
        } else if (media<6){
            System.out.println("O aluno"+a1.nome+" está reprovado");
        }
    }
}
