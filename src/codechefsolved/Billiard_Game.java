
package codechefsolved;
import java.util.*;
interface Lead_Game{
    void input_score();
    void winner();
    void display();
}
class QuestionSeven implements Lead_Game{
    Scanner sc=new Scanner(System.in);
    int p1[]=new int[10];
    int p2[]=new int[10];
    int score_diff[]=new int[10];
    int sum1[]=new int[10];
    int sum2[]=new int[10];
    int round;
    int index=0,max;
    @Override
    public void input_score(){
    System.out.print("Enter the number of round : ");
    round=sc.nextInt();
    for(int i=0;i<round;i++){
        System.out.print((i+1)+"-Round : ");
        System.out.print("Score of Player 1: ");
        p1[i]=sc.nextInt();
        System.out.print("Score of Player 2: ");
        p2[i]=sc.nextInt();
        
    }
}
    @Override
    public void winner(){
        sum1[0]=0;
        sum2[0]=0;
    for(int i=0;i<round;i++){
      sum1[i]=sum1[i]+p1[i];
      sum2[i]=sum2[i]+p2[i];
      if(sum1[i]>sum2[i])
      score_diff[i]=sum1[i]-sum2[i];
      else
      score_diff[i]=sum2[i]-sum1[i];
}
    max=score_diff[index];
    while(index<round){
        if(score_diff[index+1]>max){
          max=score_diff[index+1];
        }
          index++;
    }
}
    @Override
    public void display(){
        System.out.println("Player 1   Player2   Score Difference");
        for(int i=0;i<round;i++){
            System.out.print(p1[i]+"         "+p2[i]+"            "+score_diff[i]);
            System.out.println();
        }
        System.out.println("Maximum difference is "+max);
        for(int i=0;i<round;i++){
            if(max==score_diff[i]){
                if(p1[i]>p2[i]){
                System.out.println("The winner is player 1");
                }
                else
                System.out.println("The winner is player 2");
            }
        }
    }
}
public class Billiard_Game {
    public static void main(String args[]){
        QuestionSeven q7=new QuestionSeven();
        q7.input_score();
        q7.winner();
        q7.display();
    }
}
