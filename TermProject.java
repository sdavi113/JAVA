import java.util.Scanner;

public class TermProject { 

     static final int ISBN = 10; 
 
 
     public static void main(String[] strings) { 
  
         Scanner kb = new Scanner(System.in); 
         System.out.print("Enter the first 9 digits of an ISBN as integer: "); 
         int nineDigitISBN = kb.nextInt(); 

         
         char[] tenDigitISBN = new char[ISBN]; 

         int nineDigitSum = 0; 
         for (int i = ISBN - 2; i >= 0; i--) { 
             int digit = nineDigitISBN % 10; 
             tenDigitISBN[i] = Integer.toString(digit).charAt(0); 
 
             digit = digit * (i + 1); 
             nineDigitSum += digit; 
             nineDigitISBN /= 10; 
         } 

         int lastDigit = nineDigitSum % 11; 
         if (lastDigit == 10) { 
             tenDigitISBN[ISBN - 1] = 'X'; 
         } else { 
             tenDigitISBN[ISBN - 1] = Integer.toString(lastDigit).charAt(0); 
         } 
 
 
   System.out.println("The ISBN-10 number is " + new String(tenDigitISBN)); 
} 
} 
//Enter the first 9 digits of an ISBN as integer: 013601267
//The ISBN-10 number is 0136012671
//Enter the first 9 digits of an ISBN as integer: 013031997
//The ISBN-10 number is 013031997X

