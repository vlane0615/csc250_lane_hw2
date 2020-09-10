import java.util.Scanner; //import the Scanner class

public class Driver
{
		public static void main(String[] args)
	{
		Scanner myObj = new Scanner(System.in);
		String userInputString;
		//Enter string and press Enter
		System.out.println("Input String Here: ");
		userInputString = myObj.nextLine();
		
		System.out.println("String is: " + userInputString);
		String vowels = "aeiouAEIOU";
		int count = 0; //begin count at zero before the loop
		
		for(int i = 0; i < userInputString.length(); i++) //test if i is a vowel for the length of the input string
		{
				if(vowels.indexOf(userInputString.charAt(i)) != -1) 
				{
						count++; //increment the vowel count
				}
		}
		System.out.println(count);
	}
}
