import java.util.Arrays;

public class Driver{
  public static void main(String[]args){
    int[] ary = new int[5];
    /*for (int i=0;i<ary.length;i++){
      ary[i]=Math.random();
    }*/
    ary[0]=23;
    ary[1]=3;
    ary[2]=2333;
    ary[3]=231;
    ary[4]=230;
    System.out.println(java.util.Arrays.toString(ary));
    System.out.println("\nTesting selectionSort");
    System.out.println("\nselectionSort(ary) --> [1,2,3,4,5]");
    Sorts.selectionSort(ary);
    System.out.println(""+java.util.Arrays.toString(ary));
  }
}
