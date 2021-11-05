
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class spiralMatrix {

  public static void main(String[] args) {
    int[][] array = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
    int[][] arr = {{1,2,3,9},{4,5,6,4},{7,8,9,1},{1,2,3,4}};

    System.out.println(Arrays.toString(snails(array)));
    System.out.println(Arrays.toString(snails(arr)));

  }

  public static int[] snails(int[][] array) {

    if(array[0].length == 0){
      return new int[0];
    }

    if(array.length == 1){
      return array[0];
    }

    int i;
    int k = 0;
    int l = 0;

    int lastRow = array.length -1;
    int lastColumn = array[0].length -1;

    List<Integer> list = new ArrayList<>();

    while(k <= lastRow && l <= lastColumn){
      for(i = l; i<=lastColumn;i++){
        list.add(array[k][i]);
      }
      k++;
      for(i = k; i <= lastRow;i++){
        list.add(array[i][lastColumn]);
      }
      lastColumn--;
      if(k<=lastRow){
        for(i = lastColumn;i>=l;i--){
          list.add(array[lastRow][i]);
        }
        lastRow--;
      }
      if(l<=lastColumn){
        for(i=lastRow;i>=k;i--){
          list.add(array[i][l]);
        }
        l++;
      }
    }
    return list.stream().mapToInt(j->j).toArray();
  }

}