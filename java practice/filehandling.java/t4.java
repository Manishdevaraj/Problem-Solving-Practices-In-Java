// import java.io.*;
// import java.util.*;
// class t4
// {
//     public static void main(String arg[])
//     {
//         try
//         {
           
//         File fl=new File("sample.txt");
//         Scanner myreader=new Scanner(fl);

//         while(myreader.hasNextLine())
//         {
//             String data=myreader.nextLine();
//             System.out.print(data);

//         }

//         myreader.close();
//         }

//         catch(Exception e)
//         {
//             e.printStackTrace();
//         }
//     }
// }


import java.io.*;
import java.util.*;
class t4
{
    public static void main(String args[])
    {
        try
        {

         File f=new File("sample.txt");
         Scanner ms=new Scanner(f);
         while(ms.hasNextLine())
         {
            String data=ms.nextLine();
             System.out.println(data);
            
         }
         
        }
        catch(Exception a)
        {
            System.out.println("error");
        }
    }

}