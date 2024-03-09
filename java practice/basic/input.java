import java.util.Scanner;
public class input
{

public static void main(String args[] )
{

  Scanner scanner = new Scanner(System.in);


  System.out.println("What is your name");
  String name;

  name = scanner.nextLine();
  int n;
  System.out.println("EN]nter your ratings ");
  n = scanner.nextInt();
  scanner.nextLine();
  
   String email;
   System.out.println("enter your email");
   email = scanner.nextLine();
  System.out.println(name);
  System.out.println(n);
  System.out.println(email);






}


}