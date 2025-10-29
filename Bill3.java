// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
		// To get you started, here is the first line in the program:
	    String name1 = args[0];
		String name2 = args[1];
		String name3 = args[2];
		double sum = Double.parseDouble(args[3]);

		double each = Math.ceil(sum / 3);
		String message = "Dear " + name3 + ", " + name2 + ", and " + name1 + ": Pay " + each + " Shekels each";

		System.out.println(message);
	}
}
