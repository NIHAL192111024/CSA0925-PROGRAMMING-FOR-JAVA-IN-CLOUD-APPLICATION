import java.util.*;  
class square   
{  
public static void main(String[] args)    
{   
System.out.print("Enter a number: ");  
Scanner s = new Scanner(System.in);  
int n = s.nextInt();  
System.out.println("The square root of "+ n+ " is: "+squareRoot(n));  
}  
public static double squareRoot(int num)   
{  
double t;  
double sqrtroot=num/2;  
do   
{  
t=sqrtroot;  
sqrtroot=(t+(num/t))/2;  
}   
while((t-sqrtroot)!= 0);  
return sqrtroot;  
}  
}