print "Enter a letter: "
String letter = System.console().readLine();
print "Input some text:"
String text = System.console().readLine();
int count = 0;
for (i = 0; i < text.length(); i++) {
	if (text.charAt(i) == letter) {
		count += 1;
	}
}
println count;
