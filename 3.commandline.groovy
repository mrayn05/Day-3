System.out.print("Enter an equation: ");
String str = System.console().readLine();
String first = str.charAt(0);
String second = str.charAt(2);
if (str.contains("+")) {
	print (Integer.parseInt(first) + Integer.parseInt(second));
} else if (str.contains("-")) {
	print (Integer.parseInt(first) - Integer.parseInt(second));
} else if (str.contains("*")) {
	print (Integer.parseInt(first) * Integer.parseInt(second));
} else if (str.contains("/")) {
	print (Double.parseDouble(first) / Double.parseDouble(second));
}