package devops.numbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.NumberFormat;

public final class NumberWordsApplication {
	String[] units= { "","One","Two","Three","Four",
			"Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen",
			"Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
	
	
	String[] tens= { 
			"","",
			"Twenty",
			"Thirty",
			"Fourty",
			"Fifty",
			"Sixty",
			"Seventy",
			"Eighty",
			"Ninety"};
			
			
	public String convert(int n) {
		if (n < 20) {
			return units[n];
		}

		else if (n < 100) {
			return tens[n / 10] + ((n % 10 != 0) ? " " : "") + units[n % 10];
		}
		else
		{
			return units[n / 100] + " Hundred" + ((n % 100 != 0) ? " " : "") + convert(n % 100);
		}
	}

	public static void main(final String[] args) throws IOException {


		
		NumberWordsApplication fizz=new NumberWordsApplication();
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		while(true)
		{
			System.out.println("Enter a Number (entering 0 will EXIT) ");
			String value = reader.readLine();
			
			int no = Integer.parseInt(value);
			
			if (no==0)
			{
				System.out.println("Bye");
				return;
			}
			else if (no<0 || no>999)
			{
				System.out.println("You have entered a Invalid number.");
				return;
			}
			else
			{
				String result = fizz.convert(no);
				System.out.println(result);
			}
		}

	}		
	public String play( int number ) {
		String result = String.valueOf( number ) ;
		return result ;
	}
}
