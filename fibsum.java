import java.util.*;
class fibsum 
{
public static void main(String[] args)
{
int my_input, i, sum;
System.out.println("Required packages have been imported");
Scanner my_scanner = new Scanner(System.in);
System.out.println("A reader object has been defined ");
System.out.println("Enter the value of N: ");
my_input = my_scanner.nextInt();
int fabonacci[] = new int[2 * my_input + 1];
fabonacci[0] = 0;
fabonacci[1] = 1;
sum = 0;
for (i = 2; i <= 2 * my_input; i++) {
fabonacci[i] = fabonacci[i - 1] + fabonacci[i - 2];
if (i % 2 == 0)
sum += fabonacci[i];
}
System.out.printf("Even sum of fibonacci series till number %d is %d" , my_input, sum);
}
}