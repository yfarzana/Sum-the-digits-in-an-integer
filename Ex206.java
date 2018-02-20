/* (Sum the digits in an integer) Write a program that reads an integer between 0 and 1000 and adds all the digits in the integer. For example, if an integer is 932, the sum of all its digits is 14. 
	Hint: Use the % operator to extract digits, and use the / operator to remove the extracted digit. For instance, 932 % 10 = 2 and 932 / 10 = 93.
*/
import java.util.Scanner;
public class Ex206 {
public static void main(String[]args) {
Scanner input = new Scanner(System.in);    
System.out.println("Enter a number between 0 and 1000:");
int num = input.nextInt();
int ones = num%10;			// takes out the ones’ place digit
num/= 10;
int tens = num%10;			// takes out the tens’ place digit
num/=10;
int hundreds = num%10;		// takes out the hundreds’ place digit
num/=10;

int sum = ones+tens+hundreds;		// take sum for the digits
System.out.println("The sum of the digits is " + sum);

}
}