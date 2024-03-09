

class box{


int length;
int breath;



 void setlb(int l,int b){

    length=l;
     breath=b;
 }

 int getl(){

    return length;
 }
 
 int getb(){

    return breath;
 }

  int volume(){

    return breath*length;
  }

 boolean isequal(box b){
  if(length == b.length && breath == b.breath){
      return true;
  }
  else{
   return false;
  }
  
 }

 box doublethesize(){
      box temp = new box(2*length,2*breath);
      
      return temp;
 }


};

public class returningobject{

public static void main(String args[]){

    box v1=new box();
    v1.setlb(12,10);
    
   box b = v1.doublethesize();  

}

}