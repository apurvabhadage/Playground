import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner in  = new Scanner(System.in);
        // Get the n value
	    int n = in.nextInt();
      int last = n%10;
      while(n>=10)
      {
        n = n/10;
      }
       int sum = last+n;
      System.out.println(sum);
	}
}