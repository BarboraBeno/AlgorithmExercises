import java.util.Scanner;

public class Diamond {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Please insert a number: ");
    int n = scanner.nextInt();

    diamondOne(n);
    diamondTwo(n);
  }

  public static void diamondOne(int n){

    for (int i = 1; i<n; i++) {
      for (int j = i; j<=n; j++) {
        System.out.print("  ");
      }
      for (int j = 1; j<i; j++) {
        System.out.print("* ");
      }
      for (int j = 1; j<=i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
    for (int i =1; i <= n; i++) {
      for (int j =1; j<=i; j++) {
        System.out.print("  ");
      }
      for (int j = i; j<n; j++) {
        System.out.print("* ");
      }
      for (int j = i; j<=n; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }

  public static void diamondTwo(int n){
    int space = 1;
    space = n - 1;

    for (int j = 1; j<= n; j++)
    {
      for (int i = 1; i<= space; i++)
      {
        System.out.print(" ");
      }
      space--;
      for (int i = 1; i <= 2 * j - 1; i++)
      {
        System.out.print("*");
      }
      System.out.println("");
    }
    space = 1;
    for (int j = 1; j<= n - 1; j++)
    {
      for (int i = 1; i<= space; i++)
      {
        System.out.print(" ");
      }
      space++;
      for (int i = 1; i<= 2 * (n - j) - 1; i++)
      {
        System.out.print("*");
      }
      System.out.println("");
    }
  }

}
