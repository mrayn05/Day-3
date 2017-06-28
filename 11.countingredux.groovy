print "Please write a text::"
String text = System.console().readLine();
int count = 0;
String contain = "";
boolean inside = false;
while (!inside) {
	print "Which letter would you like to count now?: "
	String letter = System.console().readLine();
	for (i = 0; i < text.length(); i++) {
		if (text.charAt(i) == letter) {
			count += 1;
		} else if (contain.contains(letter)) {
			inside = true;
		}

	}
	contain += letter;
	if (!inside) {
		println "There are " + count + " in your text";
		count = 0;
		
	} else {
		println "Repeated character. Exiting the program..."
		println "Thank you for your cooperation. Good bye!"
	}
}	