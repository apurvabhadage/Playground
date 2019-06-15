import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int arr[] = new int[n];
    for(int i = 0; i< n ; i++)
    {
      arr[i]= in.nextInt();
    }
    max(arr,n);
  }
  
  public static void max(int arr[], int n)
  {
   // int a = arr[0];
    //int b = arr[1];
    int max_ind;
    if (arr[0] > arr[1])
      max_ind = 0;
    else
      max_ind = 1;
     
    for(int i =2; i<= n-1 ; i++)
    {
      if(arr[max_ind] < arr[i])
        max_ind = i;
    }
   System.out.println(max_ind);
  }
}