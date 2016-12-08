
package codechefsolved;
import java.util.*;
interface Cupcakes{
    void info_cupcakes();
    
}
class QuestionEight implements Cupcakes{
    Scanner sc=new Scanner(System.in);
    int number,index,max;
    int rem[]=new int[100];
    QuestionEight(){
        
    }
    @Override
    public void info_cupcakes(){
        System.out.print("Enter number of cupcakes : " );
        number=sc.nextInt();
        for(int i=2;i<=number;i++){
            rem[i]=number%i;
        }
        max=rem[0];
        while(index<=number){
            if(rem[index+1]>max){
            max=rem[index+1];
            }
            index++;
        }
        for(int i=0;i<=number;i++){
            if(rem[i]==max){
                System.out.println("The size of package will be "+i);
            }
        }
    }
}
public class Hungary_Chef {
    public static void main(String args[]){
        QuestionEight q8=new QuestionEight();
        q8.info_cupcakes();
    }
}
