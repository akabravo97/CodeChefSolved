//The purpose of this problem is to verify whether the method you are using to 
//read input data is sufficiently fast to handle problems branded with the enormous
//Input/Output warning. You are expected to be able to process at least 2.5MB of input 
//data per second at runtime.
//
//Input
//
//The input begins with two positive integers n k (n, k<=107). The next n lines of input contain one positive integer ti, not greater than 109, each.
//
//Output
//
//Write a single integer to output, denoting how many integers ti are divisible by k.
//
//Example
//
//Input:
//7 3
//1
//51
//966369
//7
//9
//999996
//11
//
//Output:
//4
package codechefsolved;
import java.util.*;
interface EIP{
    void input();
    void test();
}
class QuestionThree implements EIP{
    Scanner sc=new Scanner(System.in);
    double a[]=new double[100];
    double size;
    double count=0;
    double number;
    QuestionThree(){
}
    @Override
    public void input(){
        try{
        System.out.println("Enter the size : ");
        size=sc.nextInt();
        System.out.println("Enter the number to test with");
        number=sc.nextInt();
        }catch(Exception e){
            System.out.println("Number very large");
        }
        if(number<10000000){
        
       
        
        System.out.println("Enter the array :");
        try{
        for(int i=0;i<size;i++){
            a[i]=sc.nextInt();
            System.out.println();
            if(a[i]>1000000000) break;
        }
    }catch(Exception e){
        System.out.println("Large number not allowed");
        
    }
    }else {
           System.out.println("Number should be less than 10^7");
        }
    }
        
    @Override
    public void test(){
        for(int i=0;i<size;i++){
            if(a[i]%number==0) count++;
        }
    System.out.println("Count : "+count);
}
}
public class EnourmousI_P {
    public static void main(String args[]){
        QuestionThree q3=new QuestionThree();
        q3.input();
        q3.test();
    }
}
