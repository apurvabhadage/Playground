import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int b = in.nextInt();
       int e = in.nextInt();
      int output = power(b,e);
        System.out.println(output);
    }
  public static int power(int b, int e)
  {
    int p=1;
    while(e>=1)
    {
      p=p*b;
      e--;
    }
    return p;
  }
}