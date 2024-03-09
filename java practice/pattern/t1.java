public class t1
{


 static void pattern1(int n)
 {
  for(int row=1;row<=n;row++)
  {
    for(int col=1;col<=n;col++)
    {
      System.out.print("*");

    }
    System.out.println();
  }
 }

 static void pattern2(int n)
 {
  for(int row=1;row<=n;row++)
  {
    for(int col=1;col<=row;col++)
    {
      System.out.print("*");

    }
    System.out.println();
  }
 }


  static void pattern3(int n)
  {
    for(int row=1;row<=n;row++)
  {
    for(int col=row;col<=n;col++)
    {
      System.out.print("*");

    }
    System.out.println();
  }
  }

  static void pattern4(int n)
  {
    for(int row=1;row<=n;row++)
  {
    for(int col=1;col<=row;col++)
    {
      System.out.print(col);

    }
    System.out.println();
  }
  }

  static void pattern5(int n)
  {
    for(int row=1;row<=n;row++)
  {
    for(int col=1;col<=row;col++)
    {
      System.out.print("*");
    }
    System.out.println();
     if(row==n)
      {
         for(int row2=1;row2<=n;row2++)
  {
    for(int col2=row2;col2<=n-1;col2++)
    {
      System.out.print("*");

    }
    System.out.println();
  }

      }

  }
  }

 static void pattern6(int n)
  {
    for(int row=1;row<=n;row++)
  {
    for(int col=1;col<=n;col++)
    {
      
      if(col==n)
      {
        for(int row2=1;row2<=n;row2++)
        {
            for(int col2=row2;col2<=n;col2++)
            {
              System.out.print("*");
            }
        }
        System.out.println();
      }

      else
      {
        System.out.print(" ");
      }


    }
    System.out.println();
  }
  }

 public static void main(String args[])
 {

  int n=5;
  pattern6(n);
 }

}