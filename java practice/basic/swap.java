//(a^b)^a=b  and (a^b)^b=a;
public class swap{

public static void main(String args[]){

int a,b,c;
     a = 5 ;
    b = 2 ;
    c = 9 ;
    a=a^b; //7       //0101 =5            0111=7     0111=7
    b=a^b; //        //0010  =2           0010=2     0101=5                                                    
    a=a^b; //        //0111 =7            0101=5     0010= 2  
    
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
}





}