//
//Your program is to use the brute-force approach in order to find the Answer to Life,
//the Universe, and Everything. More precisely... rewrite small numbers from input to output. 
//Stop processing input after reading in the number 42. 
//All numbers at input are integers of one or two digits.
//
//Example
//
//Input:
//1
//2
//88
//42
//99
//
//Output:
//1
//2
//88
package codechefsolved;
import java.util.*;
interface LUE{
    void input();
    void display();
}
class QuestionOne implements LUE{
    int a[]=new int[100];
    int j=0,i,count=0,size;
    Scanner sc=new Scanner(System.in);
    
    QuestionOne(){
        
    }
    @Override
    public void input(){
        System.out.println("Enter the size of array :");
        size=sc.nextInt();
        System.out.println("Enter the numbers : ");
        for(i=0;i<size;i++){
            a[i]=sc.nextInt();
        }
    }
    @Override
    public void display(){
       System.out.println("Output : ");
       while(a[j]!=42){
          
           System.out.println(a[j]);
           j++;
       }
    }
    }

public class LifeUniverseEverything {
   public static void main(String args[]){
       QuestionOne q1=new QuestionOne();
       q1.input();
       q1.display();
   }
}
