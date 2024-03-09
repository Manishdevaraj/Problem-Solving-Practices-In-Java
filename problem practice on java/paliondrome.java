import java.util.Scanner;


public class paliondrome{


static int factorial(int n)
{
  if(n==0)
  {
    return 1;
  }
  else
  {
    return n*factorial(n-1);
  }
}

public static void main(String args[]){
  // Scanner scanner = new Scanner(System.in);
  // String p;
  //     p = scanner.nextLine();

  // int i=0;
  // int j=p.length()-1;
  //  while(i<j){
  //     if(p.charAt(i) !=p.charAt(j)){

  //       System.out.println("it is not a paliondrome");
  //       System.exit(0);
  //     }
  //     i++;
  //     j--;
        
  //  }

  //       System.out.print("it is paliondrome");

    int n=5;
    int fact=factorial(n);
    System.out.println(fact);



}




}