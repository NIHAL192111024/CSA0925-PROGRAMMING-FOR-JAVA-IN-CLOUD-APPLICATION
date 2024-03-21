import java.util.*;

class LuckyGuess 
{
public static void main(String[] args) 
{        
Scanner s = new Scanner(System.in); 
System.out.println("Enter a number between 1 and 10: ");
int guess = scanner.nextInt();        
switch (guess) 
{
case 1:
System.out.println("Your guess is lucky!");
break;
case 2:
System.out.println("Your guess is not so lucky.");
break;
case 3:
System.out.println("Your guess is lucky!");
break;
case 4:
System.out.println("Your guess is not so lucky.");
break;
case 5:
System.out.println("Your guess is lucky!");
break;
case 6:
System.out.println("Your guess is not so lucky.");
break;
case 7:
System.out.println("Your guess is lucky!");
break;
case 8:
System.out.println("Your guess is not so lucky.");
break;
case 9:
System.out.println("Your guess is lucky!");
break;
case 10:
System.out.println("Your guess is not so lucky.");
break;
default:
System.out.println("Invalid guess.");
break;
}
scanner.close();
}
}