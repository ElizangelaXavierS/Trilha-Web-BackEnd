package exercicios;

import java.util.Scanner;

public class CaixaSimples {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int opcao = 0;
        float saldo = 0;
        float deposito;
        float saque;

        while (opcao != 4) {

            System.out.println("******************************************");
            System.out.println("                                          ");
            System.out.println("         Bem-vindos ao Banco Simples      ");
            System.out.println("                                          ");
            System.out.println("******************************************");
            System.out.println("                                          ");
            System.out.println("*********** MENU DE OPERAÇÕES ************");
            System.out.println("                                          ");
            System.out.println("             [1] Saldo                    ");
            System.out.println("             [2] Depósito                 ");
            System.out.println("             [3] Saque                    ");
            System.out.println("             [4] Sair                     ");
            System.out.println("                                          ");
            System.out.println("******************************************");

            opcao = leia.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("O seu saldo é: " + saldo);
                    break;
                case 2:
                    System.out.println("Digite o valor do depósito:");
                    deposito = leia.nextFloat();

                    saldo = saldo + deposito;
                    System.out.println("O valor depisitado foi:" + deposito + " e seu saldo agora é:" + saldo);

                    break;
                case 3:
                    System.out.println("Digite o valor do Saque:");
                    saque = leia.nextFloat();

                    saldo = saldo - saque;
                    System.out.println(" o valor do seu saque foi:" + saque + " e seu saldo agora é:" + saldo);
                    break;
                case 4:
                    System.out.println("Você saiu da sua conta. Volte sempre!");
                    break;

                default:
                    System.out.println("Opção Inválida ");
            }
        }

    }
}
