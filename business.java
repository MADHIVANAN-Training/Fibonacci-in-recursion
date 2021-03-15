package fibo;
import java.util.*;
 
public class business {
 
	void busdata(int number){
	
    System.out.print("Enter number Fibonacci series: ");

    System.out.println("\n\nFibonacci series upto " + number +" numbers : ");

    for(int i=1; i<=number; i++){
        System.out.println(businessRecusion(i) +" ");
    }
}
    public static int businessRecusion(int number){
    if(number == 1 || number == 2){
        return 1;
    }
    return businessRecusion(number-1) + businessRecusion(number -2);
}
    public static void main(String args[]) {
    	
       business bus=new business();
       bus.busdata(5);
    }   
}
