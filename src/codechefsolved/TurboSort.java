//using any sorting algo
//Bubble sort used here
package codechefsolved;
import java.util.*;
interface T_Sort{
    void input();
    void sort();
    void display();
}
class QuestionSix implements T_Sort{
 Scanner sc=new Scanner(System.in);
 int a[]=new int[100];
 int size,temp;
 QuestionSix(){
     
 }
 @Override
 public void input(){
     System.out.print("Enter the size of array : ");
     size=sc.nextInt();
     System.out.println("Enter the array :->");
     for(int i=0;i<size;i++){
         a[i]=sc.nextInt();
     }
 }
 @Override
 public void sort(){
     for(int i=0;i<size;i++){
         for(int j=i+1;j<size;j++){
             if(a[i]>a[j]){
                 temp=a[j];
                 a[j]=a[i];
                 a[i]=temp;
             }
         }
     }
 }
 @Override
 public void display(){
     for(int i=0;i<size;i++){
         System.out.print(" "+a[i]);
     }
 }
}
public class TurboSort {
    public static void main(String args[]){
        QuestionSix q6=new QuestionSix();
        q6.input();
        q6.sort();
        q6.display();
    }
}
