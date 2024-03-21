class FindCharacter 
{
public static void main(String[] args) 
{
String str = "Hello World!";
char ch = 'o';
boolean found = false;
int index = 0;
for (int i = 0; i < str.length(); i++) 
{
if (str.charAt(i) == ch) 
{
found = true;
index = i;
break;
}
}
if (found)
{
System.out.println("Character " + ch + " is present at index " + index);
}
else
{
System.out.println("Character " + ch + " is not present in the string");
}
}
}