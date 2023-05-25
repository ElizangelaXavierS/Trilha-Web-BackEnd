package Poo.Lojas;

import Poo.Animais.Animal;
import Poo.Animais.Cachorro;

public class Petshop {
    public void darBanho(Animal animal){
        animal.setEstadoDeEspirito("Limpo");
    }

    public void tosar(Cachorro cachorro){
        cachorro.setEstadoDeEspirito("Tosado");
    }

    public void deixarNoHotel(Animal animal){
        animal.setEstadoDeEspirito("Sausdade");
    }
}
