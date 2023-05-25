package Poo;

public class Cachorro extends Animal {

    //Atributos
    static int numerosDeCachoros;

    //Construtores
    // public Cachorro(){} //Construtor padrão, valores deault
    public Cachorro(String nome, String cor, int altura, double peso, String estadoDeEspirito) {
        super(nome, cor, altura, peso, estadoDeEspirito);
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
        this.estadoDeEspirito = estadoDeEspirito;
        numerosDeCachoros++;
    }

    //Métodos

    public static int getNumerosDeCachoros() {
        return numerosDeCachoros;
    }

    public static void setNumerosDeCachoros(int numerosDeCachoros) {
        Cachorro.numerosDeCachoros = numerosDeCachoros;
    }

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

    public String pegar() {
        return "Bolinha";
    }

    public String interagir(String acao) {
        switch (acao) {
            case "Carinho":
                this.estadoDeEspirito = "Feliz";
                break;
            case "Vai dormi":
                this.estadoDeEspirito = "Bravo";
                break;
            case "Pisar na patinha":
                this.estadoDeEspirito = "Triste";
                break;
            default:
                this.estadoDeEspirito = "Neutro";
        }
        return estadoDeEspirito;
    }

    @Override
    public String toString() {
        return "Cachorro{" +
                "nome='" + nome + '\'' +
                '}';
    }

    @Override
    public void soar() {
        System.out.println("Auuuu ");
    }
}
