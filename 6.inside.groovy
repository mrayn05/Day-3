class Point {
    double x
    double y
}

class Rectangle {
	Point upLeft;
	Point downRight;	
}

//First Point
Point a = new Point()
println "enter first x co-ordinate"
a.x = Double.parseDouble(System.console().readLine())
println "enter first y co-ordinate"
a.y = Double.parseDouble(System.console().readLine())

//Second Point
Point b = new Point()
println "enter second x co-ordinate"
b.x = Double.parseDouble(System.console().readLine())
println "enter second y co-ordinate"
b.y = Double.parseDouble(System.console().readLine())

//Third Point
Point c = new Point()
println "enter first x co-ordinate"
c.x = Double.parseDouble(System.console().readLine())
println "enter first y co-ordinate"
c.y = Double.parseDouble(System.console().readLine())


//Create Rectangle
Rectangle rectangle = new Rectangle()
rectangle.upLeft = a
rectangle.downRight = b


if (c.x < rectangle.upLeft.x) {
	println "Outside of rectangle"
} else if (c.y > rectangle.upLeft.y) {
	println "Outside of rectangle"
} else if (c.x > rectangle.downRight.x) {
	println "Outside of rectangle"
} else if (c.y < rectangle.downRight.y) {
	println "Outside of rectangle"
} else {
	println "Inside rectangle"
}