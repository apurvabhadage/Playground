import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner in  = new Scanner(System.in);
        // Get the n value
	    int n = in.nextInt();
      while(n>=100)
      {
        n = n/10;
      }
       int sec = n %10;
      System.out.println(sec);
        
	}
}