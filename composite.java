import java.util.*;
class composite
{
static boolean isComposite(int num) 
{
if (num <= 1) 
{
return false; 
}
for (int i = 2; i < num; i++) 
{
if (num % i == 0) 
{
return true; 
}
}
return false; 
}
public static void main(String[] args) 
{
System.out.println("Composite numbers in the range 1 to 10:");
for (int i = 1; i <= 10; i++) 
{
if (isComposite(i)) 
{
System.out.print(i + " ");
}
}
}
}