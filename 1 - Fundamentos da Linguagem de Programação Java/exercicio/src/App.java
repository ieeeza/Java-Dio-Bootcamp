import java.util.Scanner;

// public class App {
//   public static void main(String[] args) {
//     Scanner scanner = new Scanner(System.in);
//     System.out.println("Qual o seu nome?");
//     String nome = scanner.next();
//     System.out.println("Quantos anos você tem?");
//     int idade = scanner.nextInt();
//     System.out.printf("Ola %s, voce tem %s anos de idade", nome, idade);
//   }
// }

// public class App {
//   public static void main(String[] args) {
//     Scanner scanner = new Scanner(System.in);
//     System.out.println("Qual tamanho do lado do quadrado?");
//     int tamanho = scanner.nextInt();
//     int area = tamanho * tamanho;
//     System.out.printf("O quadrado tem %s de area", area);
//   }
// }

public class App {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Qual tamanho da base?");
    int base = scanner.nextInt();
    System.out.println("Qual tamanho da altura?");
    int altura = scanner.nextInt();
    int area = altura * base;
    System.out.printf("O quadrado tem %s de area", area);
  }
}
