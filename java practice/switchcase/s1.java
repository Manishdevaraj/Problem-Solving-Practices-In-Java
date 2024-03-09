// You are using Java
import java.util.*;
class s1
{
    public static void main(String args[])
    
    {
        Scanner sc=new Scanner (System.in);
        char a;
        a=sc.next().charAt(0);
        String t=" ";
        switch(a)
        
        {
            case "E":
            case "e":    
                t="Early Bird Ticket";
            case "D":
            case "d":
                t="Discount Ticket";
            case "V":
            case "v":
                t="VIP Ticket";
            case "S":
            case "s":
                t="Standard Ticket";
            case "C":
            case "c":
                t="Children Ticket";
                
                System.out.println(t);
        }
        
        
        
        
    }
}