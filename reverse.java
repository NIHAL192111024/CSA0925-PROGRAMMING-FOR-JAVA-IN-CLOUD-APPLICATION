import java.util.*;
class reverse
{
public static void main (String[] args) {
String str= "Nihal", n="";
char ch;
System.out.print("Original word: ");
System.out.println("Nihal"); 
       
for (int i=0; i<str.length(); i++)
{
ch= str.charAt(i);        
n= ch+n;       
}
System.out.println("Reversed word: "+ n);
}
}