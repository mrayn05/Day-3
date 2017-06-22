System.out.println("Enter some text");
String str = System.console().readLine();
for (i = str.length(); i-- > 0;) {
	System.out.print(str.charAt(i))
}

