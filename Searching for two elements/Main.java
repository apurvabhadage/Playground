import java.util.Scanner;
class Main{
    public static void main(String args[]){
       Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int idx = 0; idx <= n - 1; idx++)
        {
            arr[idx] = in.nextInt();
        }
      int ele1= in.nextInt();
      int ele2 = in.nextInt();
      int ind1 = -1;
      int ind2 = -1;
      
      for(int i = 0 ; i <= n-1; i++)
      {
        if (ele1 == arr[i])
          ind1 = i;
        if(ele2 == arr[i])
          ind2 = i;
      }
      System.out.println(ind1);
      System.out.println(ind2);
    }
}