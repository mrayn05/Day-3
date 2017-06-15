class Point {
    double x
    double y
}

class Rectangle {
	Point upLeft;
	Point downRight;	
}

boolean inside1 = false
boolean inside2 = false

//First Point
Point a = new Point()
print "enter first x co-ordinate: "
a.x = Double.parseDouble(System.console().readLine())
print "enter first y co-ordinate: "
a.y = Double.parseDouble(System.console().readLine())

//Second Point
Point b = new Point()
print "enter second x co-ordinate: "
b.x = Double.parseDouble(System.console().readLine())
print "enter second y co-ordinate "
b.y = Double.parseDouble(System.console().readLine())

//Third Point
Point c = new Point()
print "enter third x co-ordinate: "
c.x = Double.parseDouble(System.console().readLine())
print "enter third y co-ordinate: "
c.y = Double.parseDouble(System.console().readLine())

// Fourth Point
Point d = new Point()
print "enter fourth x co-ordinate: "
d.x = Double.parseDouble(System.console().readLine())
print "enter fourth y co-ordinate: "
d.y = Double.parseDouble(System.console().readLine())

//Fifth point
Point e = new Point()
print "enter fifth x co-ordinate: "
e.x = Double.parseDouble(System.console().readLine())
print "enter fifth y co-ordinate: "
e.y = Double.parseDouble(System.console().readLine())


// Create First Rectangle
Rectangle rectangle1 = new Rectangle()
rectangle1.upLeft = a
rectangle1.downRight = b

// Create Second Rectangle
Rectangle rectangle2 = new Rectangle()
rectangle2.upLeft = c
rectangle2.downRight = d

if (e.x < rectangle1.upLeft.x) {
	inside1 = false
} else if (e.y > rectangle1.upLeft.y) {
	inside1 = false
} else if (e.x > rectangle1.downRight.x) {
	inside1 = false
} else if (e.y < rectangle1.downRight.y) {
	inside1 = false
} else {
	inside1 = true	
}

if (e.x < rectangle2.upLeft.x) {
	inside1 = false
} else if (e.y > rectangle2.upLeft.y) {
	inside1 = false
} else if (e.x > rectangle2.downRight.x) {
	inside1 = false
} else if (e.y < rectangle2.downRight.y) {
	inside1 = false
} else {
	inside2 = true	
}

if (inside1 == true && inside2 == true) {
	println "inside both"
} else if (inside1 == true && inside2 == false) {
	println "inside first rectangle"
} else if (inside1 == false && inside2 == true) {
	println "inside second rectangle"
} else if (inside1 == false && inside2 == false) {
	println "outside both"
}
