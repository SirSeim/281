import java.util.ArrayList;
import java.util.Arrays;
import java.lang.Character;

public class WordSort {
	public static void main (String[] args) {
		// Setup reader
		java.io.BufferedReader stdIn = new java.io.BufferedReader ( new java.io.InputStreamReader ( System.in ) );
		ArrayList <String> lines = new ArrayList<String>();
		boolean isSensitive = false;
		if (args.length > 0 && args[0].equals("-sensitive")) {
			isSensitive = true;
		}

		// Capture System Input
		String s;
		try {
			s = stdIn.readLine();
		} catch (Exception e) {
			throw new IllegalArgumentException("Failed readLine");
		}
		while ( s != null ) {
			lines.add(s);
			try {
				s = stdIn.readLine();
			} catch (Exception e) {
				throw new IllegalArgumentException("Failed continued readLine");
			}
		}

		// Separate out words
		ArrayList <String> words = new ArrayList<String>();
		boolean isDone = false;
		int start, end, index;
		boolean isFound;
		String currentLine;
		for (int i = 0; i < lines.size(); i++) {
			start = 0;
			end = 0;
			index = 0;
			isDone = false;
			currentLine = lines.get(i);
			if (currentLine.length() == 0) {
				isDone = true;
			}
			while (!isDone) {
				isFound = Character.isLowerCase(currentLine.charAt(index)) || Character.isUpperCase(currentLine.charAt(index));
				if (isFound) {
					end++;
				} else {
					if (start < end - 1) {
						if (isSensitive) {
							words.add(currentLine.substring(start, end));
						} else {
							words.add(currentLine.substring(start, end).toUpperCase());
						}
					}
					end++;
					start = end;
				}
				index++;
				if (index == currentLine.length()){
					if (start < end - 1) {
						if (isSensitive) {
							words.add(currentLine.substring(start, end));
						} else {
							words.add(currentLine.substring(start, end).toUpperCase());
						}
					}
					isDone = true;
				}
			}
		}

		// Sorting
		Object[] sortingArray = words.toArray();
		Arrays.sort(sortingArray);

		// Counting and Printing
		int counter = 1;
		for (int i = 1; i < sortingArray.length; i++) {
			if (sortingArray[i].equals(sortingArray[i - 1])) {
				counter++;
			} else {
				System.out.println(sortingArray[i - 1] + " " + counter);
				counter = 1;
			}
		}
		System.out.println(sortingArray[sortingArray.length - 1] + " " + counter);
	}
}