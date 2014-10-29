import java.util.ArrayList;
import java.util.Collections;
import java.lang.Character;
import java.lang.StringBuilder;

public class WordSort {
	public static void main (String[] args) throws Exception{
		// Setup
		java.io.BufferedReader stdIn = new java.io.BufferedReader ( new java.io.InputStreamReader ( System.in ) );
		ArrayList <String> words = new ArrayList<String>();
		String[] tLine;
		StringBuilder tWord;
		boolean isSensitive = (args.length > 0 && args[0].equals("-sensitive"));

		// Capture System Input & Seprate out words
		String s = stdIn.readLine();
		while ( s != null ) {
			tLine = s.split("(;|:|,|-| )");
			for (int i = 0; i < tLine.length; i++) {
				tWord = new StringBuilder(tLine[i]);
				for (int j = 0; j < tWord.length(); j++) {
					if (!Character.isLetter(tWord.charAt(j))) tWord.deleteCharAt(j--);
				}
				if (tWord.length() != 0) {
					if (isSensitive) {
						words.add(tWord.toString());
					} else {
						words.add(tWord.toString().toUpperCase());
					}
				}
			}
			s = stdIn.readLine();
		}

		// Sorting
		Collections.sort(words);

		// Counting & Printing
		int counter = 1;
		for (int i = 1; i < words.size(); i++) {
			if (words.get(i).equals(words.get(i - 1))) {
				counter++;
			} else {
				System.out.println(words.get(i - 1) + " " + counter);
				counter = 1;
			}
		}
		System.out.println(words.get(words.size() - 1) + " " + counter);
	}
}