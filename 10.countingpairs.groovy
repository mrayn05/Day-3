print "Enter short text: ";
String small = System.console().readLine();
print "Enter long text: "
String big = System.console().readLine();
int count1 = 0;
int count2 = 0;
for (i = 0; i < big.length(); i++) {
	if (big.charAt(i) == small.charAt(count1)) {
		count1 += 1;
		if (count1 == small.length()) {
			count2 += 1;
			count1 = 0;
		}
	}
}	
print count2;	
