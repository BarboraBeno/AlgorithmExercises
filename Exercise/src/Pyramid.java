import java.util.Scanner;

public class Pyramid {


  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please insert a number: ");
    int row = scanner.nextInt();

    drawPyr(row);
  }

  public static void drawPyr(int row){
    for(int i=0; i<=row; i++)
    {
      for(int j=0; j<row-i; j++)
        System.out.print(" ");
      for(int j=0; j<(2*i-1); j++)
        System.out.print("*");
      System.out.println();
    }
  }

}
