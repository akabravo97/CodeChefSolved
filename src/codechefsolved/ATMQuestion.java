//Pooja would like to withdraw X $US from an ATM. The cash machine will only 
//accept the transaction if X is a multiple of 5, and Pooja's account balance 
//has enough cash to perform the withdrawal transaction (including bank charges). 
//For each successful withdrawal the bank charges 0.50 $US. Calculate Pooja's account 
//balance after an attempted transaction.
//
//Input
//
//Positive integer 0 < X <= 2000 - the amount of cash which Pooja wishes to withdraw.
//
//Nonnegative number 0<= Y <= 2000 with two digits of precision - Pooja's initial account balance.
//
//Output
//
//Output the account balance after the attempted transaction, 
//given as a number with two digits of precision. If there is 
//not enough money in the account to complete the transaction, output the current bank balance.
//
//Example - Successful Transaction
//
//Input:
//30 120.00
//
//Output:
//89.50
//Example - Incorrect Withdrawal Amount (not multiple of 5)
//
//Input:
//42 120.00
//
//Output:
//120.00
//Example - Insufficient Funds
//
//Input:
//300 120.00
//
//Output:
//120.00
package codechefsolved;
import java.util.*;
interface InfoBank{
    void DataInput();
    void Withdrawl();
}
class QuestionTwo implements InfoBank{
    Scanner sc=new Scanner(System.in);
    double Current_Balance,Withdrawl_Amount;

    QuestionTwo(){
        
    }
    @Override
    public void DataInput(){
        System.out.println("Enter the current bank balance : ");
        Current_Balance=sc.nextInt();
        
        System.out.println("Enter the withdrawl amount : ");
        Withdrawl_Amount=sc.nextInt();
    
    }
    @Override 
    public void Withdrawl(){
        if(Current_Balance<2000 && Withdrawl_Amount<2000){
        if(Withdrawl_Amount>Current_Balance || Withdrawl_Amount%5!=0){
            System.out.println("Insufficent fund or Withdrawl amount is not divisible by 5");
            System.out.println("Current Balance : "+Current_Balance);
        }
        else {
            Current_Balance=Current_Balance-Withdrawl_Amount;
            Current_Balance=Current_Balance-0.5;
            System.out.println("Transcation Successful!");
            System.out.println("Current Balance : "+Current_Balance);
        }
}
        else{
            System.out.println("Enter the Balance and Withdrawl amount between 0 and 2000");
        }
}
}
public class ATMQuestion {
    public static void main(String args[]){
        QuestionTwo q2=new QuestionTwo();
        q2.DataInput();
        q2.Withdrawl();
    }
    
}
