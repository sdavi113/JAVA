import java.util.Scanner;
 
 
public class chapter5exercse {
 
 public static void main(String[] args) {
 
  System.out.print("Enter number of lines:");
  Scanner kb = new Scanner(System.in);
   
  int n = kb.nextInt();
   
  for (int i = 1; i <= n; i++) {
 
   for (int j = 1; j <= (n - i); j++) {
    System.out.print("  ");
   }
    
   for (int j = i; j >= 1; j--) {
    System.out.print(j + " ");
   }
    
   for (int j = 2; j <= i; j++) {
    System.out.print(j + " ");
   }
   System.out.println();
 
  }
 
 }
 
 //Enter number of lines:7
 //1 
//2 1 2 
//3 2 1 2 3 
//4 3 2 1 2 3 4 
//5 4 3 2 1 2 3 4 5 
//6 5 4 3 2 1 2 3 4 5 6 
//7 6 5 4 3 2 1 2 3 4 5 6 7 
 
}
