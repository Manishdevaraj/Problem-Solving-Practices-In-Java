 class Stack{
int tos;
 int s[]=new int[10];
  Stack(){

    tos=-1;
  }
 void push(int i){

    s[++tos]=i;
 }

 int pop(){
    return s[tos--];
 }

};

public class  Stackdemo{
    public static void main(String args[]){

     Stack s1=new Stack();
     s1.push(5);
     s1.push(9);
    System.out.println (s1.pop());
    }
}