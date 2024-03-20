import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {





            String user = "Luis Fernando Cutilak";
            String tipoConta = "Corrente";
            double saldo = 1599.99;
            char sim = 'S';

            System.out.println("***************************************************");
            System.out.println("\nNome do cliente: " + user);
            System.out.println("Tipo conta: " + tipoConta);
            System.out.println("Saldo atual: " + saldo);
            System.out.println("\n***************************************************");

        do {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite a operação desejada: ");

            System.out.println("1. Visualizar Saldo");
            System.out.println("2. Depositar ou Receber");
            System.out.println("3. Transferência");

            int operacao = scanner.nextInt();

            String tipoTransacao;

            switch (operacao) {

                case 1:
                    tipoTransacao = "Saldo Atualizado.";
                    System.out.println("Seu saldo é : " + saldo);
                    break;

                case 2:
                    tipoTransacao = "Depósito.";
                    operacao = 2;
                    Scanner leituraDeposito = new Scanner(System.in);
                    System.out.println("Digite o valor a ser depositado/Recebido: ");
                    double deposito = leituraDeposito.nextDouble();
                    saldo += deposito;
                    System.out.println("Deposito no valor de: " + deposito + " recebido com sucesso!\n" +
                            "Saldo atual de: " + saldo);
                    break;

                case 3:
                    tipoTransacao = "Saque/Transferencia.";
                    System.out.println(tipoTransacao);
                    operacao = 3;
                    Scanner leituraTransferencia = new Scanner(System.in);
                    System.out.println("Digite o valor que deseja transferir ou sacar: ");
                    double saque = leituraTransferencia.nextDouble();
                    if (saque > saldo) {
                        System.out.println("Saldo Insuficiente");
                    } else {
                        saldo -= saque;
                        System.out.println("Saque de: " + saque + " realizado com sucesso!\n" +
                                "Saldo atual de: " + saldo);
                    }
                    break;

                default:
                    System.out.println("Opção inválida");
            }
            Scanner entrada = new Scanner(System.in);
            System.out.println("Deseja realizar outra operação? Digite 'S' para sim e 'N' para não. ");
            sim = entrada.next().charAt(0);
            sim = Character.toUpperCase(sim);
        }   while(sim == 'S');

    }

}


