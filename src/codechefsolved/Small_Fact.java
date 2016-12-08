/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codechefsolved;
import java.util.*;
interface Factorial{
    void input();
    void calculate();
    void display();
}
class QuestionFive implements Factorial{
    Scanner sc=new Scanner(System.in);
    int number,factorial=1;
    QuestionFive(){
        
    }
    @Override
    public void input(){
     System.out.print("Enter the number : ");
     number=sc.nextInt();
    }
    @Override
    public void calculate(){
        if(number==1){
        factorial=1;    
        }else{
        while(number!=0){
            factorial=factorial*number;
            number--;
        }
    }
    }
    @Override
    public void display(){
        System.out.println("The factorial of the number is : "+factorial);
    }
}
public class Small_Fact {
    public static void main(String args[]){
        QuestionFive q5=new QuestionFive();
        q5.input();
        q5.calculate();
        q5.display();
    }
}
