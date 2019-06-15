import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      for(int i =2; i<= n ; i++)
      {
        if(is_prime(i))
          System.out.println(i);
      }
	}
  public static boolean is_prime(int n)
  {
    boolean p = true;
    for(int j=2; j <= n/2; j++)
    {
      if(n%j == 0)
      {
        p=false;
        break;
      }
    }
    return p;
  }
}