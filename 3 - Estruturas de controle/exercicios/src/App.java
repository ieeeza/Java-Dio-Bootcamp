import java.util.Scanner;

public class App {
  // public static void main(String[] args) throws Exception {
  // Scanner scanner = new Scanner(System.in);
  // int inputNumber = scanner.nextInt();

  // for (int n = 0; n <= 10; n++) {
  // System.out.println(inputNumber * n);
  // }
  // }

  // public static void main(String[] args) {
  // Scanner scanner = new Scanner(System.in);
  // System.out.println("Digite sua altura");
  // double altura = scanner.nextDouble();
  // System.out.println("Digite seu peso");
  // double peso = scanner.nextDouble();

  // double imc = peso / (altura * altura);

  // if (imc < 18.6) {
  // System.out.println("Abaixo do peso");
  // } else if (imc > 18.6 && imc < 29.9) {
  // System.out.println("Peso ideal");
  // } else if (imc > 25.0 && imc < 29.9) {
  // System.out.println("Levemente acima do peso!");
  // }
  // }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite o numero 1:");
    int n1 = scanner.nextInt();
    System.out.println("Digite o numero 2:");
    int n2 = scanner.nextInt();

    if (n1 > n2) {
      System.out.println("O segundo numero tem que ser maior que o primeiro!");
    }

    System.out.println("Voce deseja 1 - impar ou 2 - par?");
    int choice = scanner.nextInt();

    if (choice == 1) {
      for (int i = n1; i <= n2; i++) {
        if (i % 2 != 0) {
          System.out.println(i);
        }
      }
    } else {
      for (int i = n1; i <= n2; i++) {
        if (i % 2 == 0) {
          System.out.println(i);
        }
      }
    }
  }
}
