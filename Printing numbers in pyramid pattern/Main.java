import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int val = 1;
      for(int r=1; r<= n ; r++)   // for rows
      {
        for(int sp=1; sp<= n-r  ; sp++)
      {
        System.out.print(" ");
      }
        for(int num=1; num <= r ; num++)
      {
        System.out.print(val+" ");
          val++;
      }
        System.out.print("\n");
        
      }
	}
}