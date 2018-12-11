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

  /**Selection sort of an int array.
    *Upon completion, the elements of the array will be in increasing order.
    *@param data  the elements to be sorted.
    */
  public static void selectionSort(int [] ary) {
    for (int i=0;i<ary.length;i++){
      int x=ary[smallest(ary,i)]; //find the smallest val in rest of array, assign x to it
      //System.out.println("min: "+x);
      ary[smallest(ary,i)]=ary[i]; //replace the smallest val with the current index
      ary[i]=x; //replace current index with smallest val
      //System.out.println(printArray(ary));
    }
  }

  private static boolean sorted(int[]ary){
    for (int i=0;i<ary.length-1;i++){
      if (ary[i]>ary[i+1]){
        return false;
      }
    }
    return true;
  }

  /**Bubble sort of an int array.
   *Upon completion, the elements of the array will be in increasing order.
   *@param data  the elements to be sorted.
   */
   public static void bubbleSort(int[] data){
     int length = data.length;
     while (!sorted(data)){
       for (int i=0;i<length-1;i++){
         if (data[i]>data[i+1]){
           int swap=data[i];
           data[i]=data[i+1];
           data[i+1]=swap;
         }
       }
       //System.out.println(printArray(data));
       length--;
     }
   }

   public static void insertionSort(int[] data){
     if (data.length>1){
       for (int i=1;i<data.length;i++){
         int current=data[i];
         int n=-1;
         if (data[i-1]>current){
           for (n=i-1;n>-1;n--){
             data[n+1]=data[n];
             System.out.println(printArray(data));
           }
         }
         System.out.println(""+n);
         if (n!=-1){
           data[n]=current;
         }
         System.out.println(i+"\n"+printArray(data));
      }
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

  /*public static void main(String[] args) {

      // Google random int generator

      String sorted = "";

      // 8 nums, [0:10]
      int[] test_a = { 3, 4, 7, 1, 6, 2, 8, 6 };
      System.out.println(printArray(test_a));               // [3, 4, 7, 1, 6, 2, 8, 6]

      bubbleSort(test_a);

      sorted = printArray(test_a);
      System.out.println(sorted);               // [1, 2, 3, 4, 6, 6, 7, 8]

      if(sorted.equals("[1, 2, 3, 4, 6, 6, 7, 8]")) {
        System.out.println("TEST CASE - PASS");
      } else {
        System.out.println("TEST CASE - FAIL");
      }

      // 12 nums, [0:20]
      int[] test_b = { 17, 1, 19, 2, 18, 20, 1, 18, 11, 13, 5, 17 };
      System.out.println(printArray(test_b));   // [17, 1, 19, 2, 18, 20, 1, 18, 11, 13, 5, 17]

      bubbleSort(test_b);

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

      bubbleSort(test_c);

      sorted = printArray(test_c);
      System.out.println(sorted);               // [1, 9, 14, 15, 19, 30, 32, 33, 35, 37, 48, 50, 52, 57, 61, 65, 66, 85, 96, 100]

      if(sorted.equals("[1, 9, 14, 15, 19, 30, 32, 33, 35, 37, 48, 50, 52, 57, 61, 65, 66, 85, 96, 100]")) {
        System.out.println("TEST CASE - PASS");
      } else {
        System.out.println("TEST CASE - FAIL");
      }

    }*/
    public static void main(String[]args){
      int[]test={0,2,3,4,1};
      insertionSort(test);
    }
}
