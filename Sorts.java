public class Sorts{
  public static void selectionSort(int [] ary) {
    int x=ary[0];
    int index=0;
    for (int n=0;n<ary.length;n++){
      for (int i=n;i<ary.length;i++){
        int smallest=ary[n];
        if (ary[i]<=smallest){
          smallest=ary[i];
          index=i;
        }
      }
      x=ary[index];
      ary[index]=ary[n];
      ary[n]=x;
    }
  }
}
