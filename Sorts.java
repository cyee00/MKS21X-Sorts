public class Sorts{

  private static int smallest(int[] ary,int n){//returns index of smallest
    int index=0;
    for (int i=n;i<ary.length;i++){
      if(ary[i]<=ary[index]){
        index=i;
      }
    }
    return index;
  }

  public static void selectionSort(int [] ary) {
    for (int i=0;i<ary.length;i++){
      int x=ary[smallest(ary,i)];
      ary[smallest(ary,i)]=ary[i];
      ary[i]=x;
      System.out.println(printArray(ary));
    }
  }


  //Testing
  public static String printArray(int[] ary) {
      String output = "[";
      for(int i=0; i<ary.length-1; i++) {
        output += ary[i] + ", ";
      }
      return output += ary[ary.length-1] + "]";
  }

  public static void main(String[] args) {

      // Google random int generator

      String sorted = "";

      // 8 nums, [0:10]
      int[] test_a = { 3, 4, 7, 1, 6, 2, 8, 6 };
      System.out.println(printArray(test_a));               // [3, 4, 7, 1, 6, 2, 8, 6]

      selectionSort(test_a);

      sorted = printArray(test_a);
      System.out.println(sorted);               // [1, 2, 3, 4, 6, 6, 7, 8]

      if(sorted.equals("[1, 2, 3, 4, 6, 6, 7, 8]")) {
        System.out.println("TEST CASE - PASS");
      } else {
        System.out.println("TEST CASE - FAIL");
      }
/*
      // 12 nums, [0:20]
      int[] test_b = { 17, 1, 19, 2, 18, 20, 1, 18, 11, 13, 5, 17 };
      System.out.println(printArray(test_b));   // [17, 1, 19, 2, 18, 20, 1, 18, 11, 13, 5, 17]

      selectionSort(test_b);

      sorted = printArray(test_b);
      System.out.println(sorted);               // [1, 1, 2, 5, 11, 13, 17, 17, 18, 18, 19, 20]

      if(sorted.equals("[1, 1, 2, 5, 11, 13, 17, 17, 18, 18, 19, 20]")) {
        System.out.println("TEST CASE - PASS");
      } else {
        System.out.println("TEST CASE - FAIL");
      }

      // 20 nums, [0:100]
      int[] test_c = { 14, 32, 19, 66, 61, 96, 33, 48, 30, 100, 65, 37, 15, 85, 1, 35, 9, 57, 50, 52 };
      System.out.println(printArray(test_c));   // [14, 32, 19, 66, 61, 96, 33, 48, 30, 100, 65, 37, 15, 85, 1, 35, 9, 57, 50, 52]

      selectionSort(test_c);

      sorted = printArray(test_c);
      System.out.println(sorted);               // [1, 9, 14, 15, 19, 30, 32, 33, 35, 37, 48, 50, 52, 57, 61, 65, 66, 85, 96, 100]

      if(sorted.equals("[1, 9, 14, 15, 19, 30, 32, 33, 35, 37, 48, 50, 52, 57, 61, 65, 66, 85, 96, 100]")) {
        System.out.println("TEST CASE - PASS");
      } else {
        System.out.println("TEST CASE - FAIL");
      }
*/
    }/*public static void main(String[]args){
      int[] ary = new int[5];
      /*for (int i=0;i<ary.length;i++){
        ary[i]=Math.random();
      }
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
    }*/
}
