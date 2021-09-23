public class TaskFour{

public static void main(String[] args) {

  String[] sArray = new String[]{"hej","med","dig"};
  int[] iArray = new int[]{1,2,3};
  boolean[] bArray = new boolean[3];


printArray(sArray);
sumArray(iArray);
averageArray(iArray);
}
public static void printArray(String[] sArray){
  for (int i=0; i<sArray.length; i++) {
    System.out.println(sArray[i]);
  }
}
public static void sumArray(int[] iArray){
      int sum = 0;
  for (int i=0; i<iArray.length; i++){
    sum += iArray[i];
  }

  System.out.println(sum);
}
public static void averageArray(int[] iArray){
  int avg = 0;
for (int i=0; i<iArray.length; i++){
  avg += iArray[i];
}
avg=avg/iArray.length;
System.out.println(avg);
}
}
