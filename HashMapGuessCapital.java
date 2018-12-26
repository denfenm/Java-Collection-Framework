import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapGuessCapital {
	public static void main(String[] args) 	
	{
	int correct = 0;
	String country, capital;
	Scanner in = new Scanner(System.in);
	Map<String, String> countryMap = new HashMap<String, String>();
	boolean cont = true;
	
	do {
		System.out.println("Please enter the Country");
		country = in.nextLine();
		if(country.equals(" "))
		{
			cont =false;
			break;
		}
		System.out.println("Please enter the country's capital ");
		capital = in.nextLine();
		countryMap.put(country, capital);
		
	}
	while(cont);
	
	System.out.println(countryMap);
	System.out.println(countryMap.size());
	
	System.out.println("Please enter the country guessed");
	country = in.nextLine();
	if(countryMap.containsKey(country)) 
	{
		System.out.println(country + " -> " + countryMap.get(country));
	} else {
		System.out.println("Country not found");
	}
	
	for(String value : countryMap.keySet())
	{
		System.out.println("What is the capital of " + value + " ?");
		capital = in.nextLine();
		
		if(countryMap.get(value).equals(capital))
		{
			System.out.println("Your answer is correct");
			correct++;
		} 
		else
		{
			System.out.println("Your answer should be " + countryMap.get(value));
		}
	}
	
	in.close();
	}
}
 