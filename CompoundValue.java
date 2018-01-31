import java.util.Scanner;
public class CompoundValue {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);

	System.out.print("Enter monthly saving amount: ");
	double amount = scan.nextDouble();
	
	double interestRate = 0.00417;
	double firstMonth = amount * (1 + interestRate);
	double secondMonth = (amount + firstMonth) * (1 +interestRate);
	double thirdMonth = (amount + secondMonth) * (1 + interestRate);
	double fourthMonth = (amount + thirdMonth) * (1 + interestRate);
	double fifthMonth = (amount + fourthMonth) * (1 + interestRate);
	double sixthMonth = (amount + fifthMonth) * (1 + interestRate);
	
	System.out.println("After six months, the account value is: " +sixthMonth);
	
	scan.close();
	
	}

}
