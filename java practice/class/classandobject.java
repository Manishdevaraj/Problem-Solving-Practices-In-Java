class box{
private
int length,breath;
public 

   void setlength(int l){
           length=l;
   }
   void setbreath(int b){
           breath=b;
   }

   int getlength(){
        return length;
    }

   int getbreath(){
        return breath;
    }

   double area(){

        return length*breath;
    }

};


public class classandobject {

    public static void main(String args[])
{

  box wool = new box();
       wool.setlength(12);
       wool.setbreath(10);
       System.out.println(wool.getbreath());
       System.out.println(wool.getlength());
       System.out.println(wool.area()  );

}}