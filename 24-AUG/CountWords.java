import java.util.Scanner;

public class CountWords {

	public static void main(String[] args) {
		int counter=0;
		Scanner scan=new Scanner("this is java programming 111 222 333");
		while(scan.hasNext())// while(1)
		{
		String str=scan.next();
		System.out.println("the string is "+str);	
		counter++;
		}
		System.out.println(" the number of words in the STring are "+counter);
		
	}

}
