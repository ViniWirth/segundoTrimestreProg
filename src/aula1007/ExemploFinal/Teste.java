package aula1007.ExemploFinal;

public class Teste {
    public static void main(String[] args) {
        //Acesso a uma constante
        System.out.println(Operacoes.PI);
        Operacoes op = new Operacoes();
        //Acessar um atributo final
        System.out.println(op.pi);
        //Não é possível alterar o valor de um produto final
        //op.pi = 3.14;
    }
}
