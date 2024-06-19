package aula1206.exemploLampada;

public class Teste {
    public static void main(String[] args) {
        Lampada l1 = new Lampada();
        l1.marca = "Tesla";
        l1.modelo = "Led";
        l1.cor = "Vermelho";

        Lampada l2 = new Lampada();
        l2.marca = "Philco";
        l2.modelo = "Unicornio";
        l2.cor = "Rosa";

        Lampada l3 = new Lampada();
        l3.marca = "Mc Donalds";
        l3.modelo = "Big mac";
        l3.cor = "Marrom";

        Lampada l4 = new Lampada();
        l4.marca = "Samsung";
        l4.modelo = "Galaxy";
        l4.cor = "Azul";

        Lampada l5 = new Lampada();
        l5.marca = "TGT";
        l5.modelo = "Mouse";
        l5.cor = "Preto";

        System.out.println("Sobre a lâmpada 1, sua marca é "+l1.marca+", o modelo é "+l1.modelo+", e a sua cor é "+l1.cor+".");
        System.out.println("Sobre a lâmpada 2, sua marca é "+l2.marca+", o modelo é "+l2.modelo+", e a sua cor é "+l2.cor+".");
        System.out.println("Sobre a lâmpada 3, sua marca é "+l3.marca+", o modelo é "+l3.modelo+", e a sua cor é "+l3.cor+".");
        System.out.println("Sobre a lâmpada 4, sua marca é "+l4.marca+", o modelo é "+l4.modelo+", e a sua cor é "+l4.cor+".");
        System.out.println("Sobre a lâmpada 5, sua marca é "+l5.marca+", o modelo é "+l5.modelo+", e a sua cor é "+l5.cor+".");
    }
}
