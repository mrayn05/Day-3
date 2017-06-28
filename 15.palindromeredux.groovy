System.out.print("Enter some text: ");
String str = System.console().readLine();
boolean palindrome = true;
int count = 0;
String second = "";
for (i = 0; i < str.length(); i++) {	
	if (Character.isLetter(str.charAt(i))) {		
		second += Character.toLowerCase(str.charAt(i));
	}  
}

for (i = second.length(); i-- > 0;) {
 if (second.charAt(i) != second.charAt(count)) {
		palindrome = false;
	} else {
		count += 1;
	}
}

if (palindrome) {
	System.out.println("Is Palindrome")
} else {
	System.out.println("Is not a Palindrome")
}