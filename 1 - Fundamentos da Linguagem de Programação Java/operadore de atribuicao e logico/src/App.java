import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Quanto é 2 + 2: ");
    int result = scanner.nextInt();
    boolean isWrong = result != 4;
    System.out.printf("O resultado é 4, você errou: (%s)", isWrong);
  }
}
