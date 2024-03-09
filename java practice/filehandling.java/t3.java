import java.io.*;
class t3
{
    public static void main(String args[])
    {
          try
           {
                File file=new File("sample.txt");
                if(!file.exists())
                {
                    file.createNewFile();

                }

                try
                {
                      FileWriter mywr=new FileWriter("sample.txt");

                      mywr.write("hello manish what are you doing?");

                      mywr.close();
                }

                catch(Exception e)
                {
                    System.err.println("an error occured");
                    e.printStackTrace();
                }
       
        



            }

        catch(Exception e)
        {
            System.out.println("an error occured");
            e.printStackTrace();
        }
     
    }
}
