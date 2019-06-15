import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int val = n;
      for(int r=1; r<= n ; r++)   // for rows
      {
        for(int num= val; num >=1 ; num--)
      {
        System.out.print(num);
      }
        System.out.print("\n");
        val--;
      }
	}
}