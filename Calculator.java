public class Calculator {
	public static void main(String[] args) {
		System.out.println("Input a number: ");
		double x = Double.parseDouble(System.console().readLine());
		System.out.println("Input a number: ");
		double y = Double.parseDouble(System.console().readLine());
		System.out.println("select an operation: ");
		String operation = System.console().readLine();
		if (operation.equals("+")) {
			System.out.println(x + y);
		} else if (operation.equals("-")) {
			System.out.println(x - y);
		} else if (operation.equals("*")) {
			System.out.println(x * y);
		} else if (operation.equals("/")) {
			System.out.println(x / y);
		} else {
			System.out.println("This sucks");
		}
	}
}