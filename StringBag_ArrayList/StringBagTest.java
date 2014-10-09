public class StringBagTest {
	public static void main (String[] args) {
		StringBag test = new StringBag(args);
		
		System.out.println("Size: " + test.size());
		System.out.println("isEmpty: " + test.isEmpty());
		System.out.println("Contains \"big\": " + test.contains("big"));
		System.out.println();

		System.out.println(test);
		System.out.println();

		System.out.println("Add \"large\": " + test.add("large"));

		System.out.println(test);
		System.out.println();

		System.out.println("Remove \"small\": " + test.remove("small"));

		System.out.println(test);
		System.out.println();

		System.out.println("Clearing...");
		test.clear();
		System.out.println(test);
	}

	public static void print (String[] material) {
		if (material.length == 0) {
			System.out.println("{EMPTY}");
		} else {
			for (int i = 0; i < material.length; i++) {
				System.out.println("\"" + material[i] + "\"");
			}
		}
	}
}