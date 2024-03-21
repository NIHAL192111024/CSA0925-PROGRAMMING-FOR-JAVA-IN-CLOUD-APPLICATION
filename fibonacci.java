import java.util.*;
class fibonacci 
{
public static void main(String[] args)
{		
int num1 = 0, num2 = 1,N=10;
for (int i = 0; i < N; i++) 
{
System.out.print(num1 + " ");
int num3 = num2 + num1;
num1 = num2;
num2 = num3;
}
}
}

