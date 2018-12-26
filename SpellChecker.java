import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SpellChecker {

	public static void main(String[] args) throws FileNotFoundException
	{
		Set<String> dictionaryWords = readWords("words");
		Set<String> documentwords = readWords("alice.txt");
		
		for(String word : documentwords)
		{
			if(!dictionaryWords.contains(word))
				
			{
				System.out.println(word);
			}
		}
		
	}

	public static Set<String> readWords(String filename) throws FileNotFoundException
	{
		Set<String> words = new HashSet<String>();
		Scanner scanner = new Scanner(new File(filename));
		
		while(scanner.hasNext())
		{
			words.add(scanner.next().toLowerCase());
			
		}
		return words;
		
	}

}