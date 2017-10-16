import java.util.Scanner;

public class NamePrinter {

	public static void main(String[] args) {

Scanner scan =new Scanner(System.in);
System.out.println("Enter the string ");
String str=scan.next();
for(int i =0;i<str.length();i++)
{
	char firstChar=str.charAt(0);
	str=str+firstChar;
	System.out.println(str);
	str=str.substring(1);
	System.out.println(str);
	System.out.println(" the string at "+(i+1)+ " is "+str);
	
	
}


	}

}
