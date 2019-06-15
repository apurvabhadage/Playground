import java.util.*;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int arr[] = new int[n];
    for(int i = 0; i< n ; i++)
    {
      arr[i]= in.nextInt();
    }
    batch(arr,n);
  }
  
  public static void batch(int arr[], int n)
  {
    boolean match=true;
    int curr_batch = 0;
    int batch_sum = arr[0] + arr[1] + arr[2];
    for(int i =3; i<= n-1; i=i+3)
    {
      curr_batch = arr[i] + arr[i+1] + arr[i+2];
    }
    
    if(curr_batch != batch_sum)
    {
      match = false;
    }
    if (match == true)
    {
      System.out.println("Perfect Batch");
    }
    else
      System.out.println("Not a Perfect Batch");
  }
}