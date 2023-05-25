package Poo;

public class Cachorro {

    //Atributos
    private String nome;
    private String cor;
    private int altura;
    private double peso;
    private String estadoDeEspirito;

    //Construtores
    public Cachorro(){} //Construtor padrão, valores deault
    public Cachorro(String nome, String cor, int altura, double peso, String estadoDeEspirito) {
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
        this.estadoDeEspirito = estadoDeEspirito;
    }

    //Métodos
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public int getAltura() {
        return altura;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public String getEstadoDeEspirito() {
        return estadoDeEspirito;
    }
    public void setEstadoDeEspirito(String estadoDeEspirito) {
        this.estadoDeEspirito = estadoDeEspirito;
    }
    public void comer() {
    }

    public void latir() {
        System.out.println("Au Au");
    }

    public String pegar() {
        return "Bolinha";
    }

    public String interagir(String acao) {
        switch (acao){
            case "Carinho" : this.estadoDeEspirito = "Feliz"; break;
            case "Vai dormi" : this.estadoDeEspirito = "Bravo"; break;
            case "Pisar na patinha" : this.estadoDeEspirito = "Triste"; break;
            default: this.estadoDeEspirito = "Neutro";
        }
      return estadoDeEspirito;
    }
}
