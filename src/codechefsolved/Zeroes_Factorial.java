//Counting number of zeroes at the end of a factorial of number
package codechefsolved;
import java.util.*;
interface NumberOfZeroes{
    void input();
    void count();
    void display();
}
class QuestionFour implements NumberOfZeroes{
    Scanner sc =new Scanner(System.in);
    int i,j,number,temp;
    int count=0;
    QuestionFour(){
        
    }
    @Override
    public void input(){
        System.out.print("Enter the number  : ");
        number=sc.nextInt();
    }
    @Override
    public void count(){
        temp=number;
        while(temp!=0){
            while(temp%5==0){
            ++count;
            temp=temp/5;   
          }
          temp=--number;
       }
    }
    @Override
    public void display(){
      System.out.println("The number of trailing zeroes are : "+count);
    }
}
public class Zeroes_Factorial {
    public static void main(String args[]){
        QuestionFour q4=new QuestionFour();
        q4.input();
        q4.count();
        q4.display();
    }
}
