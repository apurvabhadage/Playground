import java.util.Scanner;
class Main{
  public static void sum(int arr_size, int arr[], int value)
  {
    
    for(int ind1 = 0; ind1 < arr_size ; ind1++)
    {
      for( int ind2 = ind1+1; ind2 < arr_size; ind2++)
      { 
        int sum = 0;
        sum = arr[ind1]+arr[ind2];
        if(sum == value)
        {
          System.out.println(arr[ind1]+","+" "+arr[ind2]);
        }
      }
    }
  }
    public static void main(String args[]) {
      // Type your code here
      Scanner in = new Scanner(System.in);
      int arr_size = in.nextInt();
      int arr[] = new int[arr_size];
      for(int i = 0 ; i< arr_size; i++)
      {
        arr[i] = in.nextInt();
      }
      int value = in.nextInt();
      sum(arr_size, arr, value);
    }
}