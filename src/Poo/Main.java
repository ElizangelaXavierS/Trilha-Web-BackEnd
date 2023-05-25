package Poo;

import Poo.Animais.Cachorro;
import Poo.Animais.Gato;
import Poo.Animais.Passaro;
import Poo.Lojas.Petshop;

public class Main {
    public static void main(String[] args) {

        Cachorro cachorro1 =  new Cachorro("Pluf", "caramelo", 2, 5.5,"Vai dormi");
        Gato gato1 = new Gato("Feliz", "Preto", 2, 1.5, "Nada");
        Passaro passaro1 = new Passaro("Jose","Vermelho",3,3.2, "Nada");

        Petshop petshop1 = new Petshop();

        petshop1.darBanho(cachorro1);
        System.out.println(cachorro1.getEstadoDeEspirito());

        petshop1.darBanho(gato1);
        System.out.println(gato1.getEstadoDeEspirito());

        petshop1.tosar(cachorro1);
        System.out.println(cachorro1.getEstadoDeEspirito());

        cachorro1.soar();
        passaro1.soar();
        gato1.soar();
    }


}
