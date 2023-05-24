package Poo;

public class Cachorro {
    String nome;
    String cor;
    int altura;
    double peso;
    public String estadoDeEspirito;

    public void comer() {
    }

    public void latir() {
        System.out.println("Au Au");
    }

    public String pegar() {
        return "Bolinha";
    }

    public String interagir(String acao) {
        if (acao.equals("carinho")) {
            this.estadoDeEspirito = "feliz";
        } else if (acao.equals("Vai dormi")) {
            this.estadoDeEspirito = "Bravo";
        } else {
            this.estadoDeEspirito = "Neutro";
        }
        return estadoDeEspirito;
    }
}
