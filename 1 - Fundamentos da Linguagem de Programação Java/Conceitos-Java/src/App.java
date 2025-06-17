import java.util.Scanner;

public class App {

  private final static String WELCOME_PASSAGE = "Ola, informe o seu nome";

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Informa seu nome: ");
    String name = scanner.next();
    System.out.println("Informa sua idade: ");
    int age = scanner.nextInt();
    System.out.printf("Ola %s sua idade é %s", name, age);
  }
}
