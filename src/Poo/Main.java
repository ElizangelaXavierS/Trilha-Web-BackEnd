package Poo;

public class Main {
    public static void main(String[] args) {

        Cachorro cachorro1 =  new Cachorro();

        cachorro1.nome = "Zeus";
        cachorro1.cor = "Caramelo";
        cachorro1.altura = 1;
        cachorro1.peso = 5.5;

        cachorro1.latir();

        System.out.println(cachorro1.pegar());
        System.out.println(cachorro1.interagir("nada"));
        System.out.println(cachorro1.interagir("Vai dormi"));

    }
}
