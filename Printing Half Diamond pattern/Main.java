import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      for(int r=1; r<= n ; r++)   // for rows
      {
        for(int sp=1; sp<= n-r  ; sp++)
      {
        System.out.print(" ");
      }
        for(int str=1; str<= r+(r-1) ; str++)
      {
        System.out.print("*");
      }
        System.out.print("\n");
      }
	}
}