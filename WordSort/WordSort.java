import java.util.ArrayList;
import java.lang.Character;

public class WordSort {
	public static void main (String[] args) {
		java.io.BufferedReader stdIn = new java.io.BufferedReader ( new java.io.InputStreamReader ( System.in ) );
		ArrayList <String> lines = new ArrayList<String>();
		boolean isSensitive = false;
		if (args.length > 0 && args[0].equals("-sensitive")) {
			isSensitive = true;
		}

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

		for (int o = 0; o < lines.size(); o++) {
			System.out.println("[" + lines.get(o) + "]");
		}

		ArrayList <String> words = new ArrayList<String>();
		boolean isDone = false;
		int start, end, index;
		boolean isFound;
		String currentLine;
		for (int i = 0; i < lines.size(); i++) {
			System.out.println("Begin");
			start = 0;
			end = 0;
			index = 0;
			isFound = false;
			isDone = false;
			currentLine = lines.get(i);
			if (currentLine.length() == 0) {
				isDone = true;
			}
			while (!isDone) {
				isFound = Character.isLowerCase(currentLine.charAt(index)) || Character.isUpperCase(currentLine.charAt(index));
				if (isFound) {
					System.out.println("Found");
					end++;
					index++;
				} else {
					System.out.println("!Found");
					if (start < end - 1) {
						words.add(currentLine.substring(start, end));
					}
					start = end;
					end++;
					index++;
				}
				if (index == currentLine.length() - 1){
					System.out.println("End of Line");
					if (start < end - 1) {
						words.add(currentLine.substring(start, end));
					}
					isDone = true;
				}
			}
		}

		System.out.println();
		for (int o = 0; o < words.size(); o++) {
			System.out.println("{" + words.get(o) + "}");
		}
	}
}