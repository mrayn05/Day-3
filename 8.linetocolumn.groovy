print "Input some text:"
String text = System.console().readLine();
for (i = 0; i < text.length(); i++) {
	if (text.charAt(i) == " ") {
		println text.charAt(i);
	} else {
		print text.charAt(i);
	}
}