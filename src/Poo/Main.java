package Poo;

public class Main {
    public static void main(String[] args) {

        Cachorro cachorro1 =  new Cachorro();
        Cachorro cachorro2 =  new Cachorro("Rex" ,"Preto", 1, 2.5,"Nada");
        System.out.println(cachorro2.getNome());

        System.out.println(cachorro1.pegar());
        System.out.println(cachorro1.interagir("nada"));
        System.out.println(cachorro1.interagir("Vai dormi"));
        System.out.println(cachorro1.interagir("Pisar na patinha"));
        System.out.println(cachorro1.interagir("Carinho"));

    }
}
