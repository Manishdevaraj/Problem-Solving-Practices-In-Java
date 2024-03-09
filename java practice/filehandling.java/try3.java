class try3
{
    public static void main(String args[])
    {
        int a=10;
        int b=1;
        int c=0;
        try
        {
           c=a/b;
        }
        catch(Exception e)
        {
            System.err.println("An error occured");
        }
        finally
        {
            System.err.println("hello i am manish");
                    
        }
        
        System.out.println(c);
    }
}