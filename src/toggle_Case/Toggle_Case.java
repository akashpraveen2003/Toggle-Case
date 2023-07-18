package toggle_Case;

import java.util.Scanner;

/*
  You are given a character string A having length N, consisting of only lowercase and uppercase latin letters.

	You have to toggle case of each character of string A. For e.g 'A' is changed to 'a', 'e' is changed to 'E', etc.
		
	Input 1:
	
	A = "Hello"
	
	Input 2:
	
	A = "tHiSiSaStRiNg"

	Output 1:
	
	hELLO
	
	Output 2:
	
	ThIsIsAsTrInG 
	
 */
public class Toggle_Case {
		
	private static void toggle_case(char [] array)		// But, here we use bit Manipulation
	{
		for(int i=0;i<array.length;i++)					// If we observe, 5th bit is set for lowercase and unset for uppercase
		{
			System.out.print((char)(array[i]^(1<<5)));	// So, we XOR to make set bit  unset and viceversa, Which toggles the cases
		}
	}

	public static void main(String[] args) {
		
			Scanner scanner=new Scanner(System.in);
			String s=scanner.nextLine();
			toggle_case(s.toCharArray());				// We can also solve using ascii values of uppercase and lowercase

	}

	

}
