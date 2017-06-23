//Takes input from user
System.out.print("Enter an equation: ");
String str = System.console().readLine();
String first = "";
String second = "";

//Stores the first number
for (i = 0; i < str.length(); i++) {
	if (str.charAt(i) == "+"){
		break;
	} else if (str.charAt(i) == "-") {
		break;
	} else if (str.charAt(i) == "*") {
		break;
	} else if (str.charAt(i) == "/") {
		break;
	} else {
		first += str.charAt(i);
	}
	
}

//Stores the second number(in reverse order)
for (i = str.length(); i-- > 0;) {
	if (str.charAt(i) == "+"){
		break;
	} else if (str.charAt(i) == "-") {
		break;
	} else if (str.charAt(i) == "*") {
		break;
	} else if (str.charAt(i) == "/") {
		break;
	} else {
		second += str.charAt(i);
	}
}

//Puts second number in correct order
String newsecond = "";
for (i = second.length(); i-- > 0;) {
	newsecond += second.charAt(i);
}

//Determines what mathematical operation to perform
if (str.contains("+")) {
	print (Integer.parseInt(first) + Integer.parseInt(newsecond));
} else if (str.contains("-")) {
	print (Integer.parseInt(first) - Integer.parseInt(newsecond));
} else if (str.contains("*")) {
	print (Integer.parseInt(first) * Integer.parseInt(newsecond));
} else if (str.contains("/")) {
	print (Double.parseDouble(first) / Double.parseDouble(newsecond));
}