import java.util.Scanner;

public class Square {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Please insert a number: ");
    int n = scanner.nextInt();

    square(n);
    squareSecond(n);
    diagonalSquare(n);
    chessTable(n);
  }

  public static void square(int n) {
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++)
        System.out.print("*  ");
      System.out.println();
    }
  }

  public static void squareSecond(int n){
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n; j++) {
        if ( i == 1 || i == n || j == 1 || j == n) {
          System.out.print("*");}
        else {System.out.print(" ");}

      }
      System.out.println();
    }
  }

  public static void diagonalSquare(int n){
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n; j++) {
        if ( i == 1 || i == n || j == 1 || j == n || j == (n - i +1)) {
          System.out.print("*");}
        else {System.out.print(" ");}

      }
      System.out.println();
    }
  }

  public static void chessTable(int n){
    for (int row = 0; row < n; row++) {
      for (int column = 0; column < n; column++) {
        if (row % 2 == 0 && column == 0) {
          System.out.print(" ");
        }
        //if (row % 2 != 0 && column == n)
        if ((row+column) % 2 == 0) {
          System.out.print(" ");
        }
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}
