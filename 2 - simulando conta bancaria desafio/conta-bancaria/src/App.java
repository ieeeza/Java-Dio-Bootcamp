import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite o nome do cliente:");
    String nomeCliente = scanner.next();
    System.out.println("Informa o número da conta:");
    int numeroConta = scanner.nextInt();
    System.out.println("Digite o numero da agência:");
    int numeroAgencia = scanner.nextInt();
    System.out.println("Digite o saldo da conta:");
    int saldo = scanner.nextInt();

    System.out.printf(
        "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %s já está disponível para saque!",
        nomeCliente, numeroConta, numeroAgencia, saldo);
  }
}
