class box{
private

int length;
int breath;

public

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


};

public class passingobject{

public static void main(String args[]){

    box v1=new box();
    v1.setlb(12,10);
    box v2=v1;
    System.out.println(v2.isequal(v3));
  

}

}