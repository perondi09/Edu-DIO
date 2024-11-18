import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Por favor, digite o número da Agência:");
            String agencia = scanner.nextLine();

            System.out.println("Por favor, digite o número da Conta:");
            int numero = scanner.nextInt();

            scanner.nextLine();

            System.out.println("Por favor, digite o Nome do Cliente:");
            String nomeCliente = scanner.nextLine();

            System.out.println("Por favor, digite o Saldo inicial:");
            double saldo = scanner.nextDouble();

            String mensagem = String.format(
                "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.",
                nomeCliente, agencia, numero, saldo
            );

            System.out.println(mensagem);
        }
    }
}
