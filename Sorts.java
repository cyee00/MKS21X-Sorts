public class Sorts{
  public static void selectionsort(int [] ary) {
    int x=ary[0];
    int index=0;
    for (int n=0;n<ary.length;n++){
      for (int i=n;i<ary.length;i++){
        if (ary[i]<ary[n-1]){
          x=ary[i];
          index=i;
        }
        ary[i]=ary[n];
        ary[n]=x;
      }
    }
  }
}
