class Rectangle {
	Point upLeft;
	Point downRight;	
}

class Point {
    double x
    double y
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

//Create Rectangle
Rectangle rectangle = new Rectangle()
rectangle.upLeft = a
rectangle.downRight = b

//Calculate Rectangle Width
double width = rectangle.downRight.x - rectangle.upLeft.y

//Calculate Rectangle Height
double height = rectangle.upLeft.y - rectangle.downRight.y

//Calculate area
double area = width * height
println "area is " + area

//Calculate Perimeter 
double perimeter = 2 * (width * height)
println "perimeter is " + perimeter

 






