package Poo;

public class Main {
    public static void main(String[] args) {

        Cachorro cachorro1 =  new Cachorro("Pluf", "caramelo", 2, 5.5,"Vai dormi");
        Gato gato1 = new Gato("Feliz", "Preto", 2, 1.5, "Nada");
        Passaro passaro1 = new Passaro("Jose","Vermelho",3,3.2, "Nada");


    cachorro1.soar();
    gato1.soar();
    passaro1.soar();

    }
}
