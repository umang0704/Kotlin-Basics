package BasicSyntax

/**
 * - Declaration of class
 * - Creation of properties of the class
 * - Inheritance and changing default un-inheritable class to inheritable class
 */

    //1-Creating a class
    class A

    //2- properties can be written in the body
    // & in the declaration as well
    class Cricle(var radius : Double ){
        val PI = 3.14;
        var area = PI * radius * radius;
    }

    //3- inheritance
    // By default class in final, we create them open using keyword "open"

    open class Shape
    class Square(var side : Double) : Shape(){
        var area = side * side;
    }

    fun main(args : Array<String>){
        val sq = Square(10.5);
        println("Area of sq id ${sq.area}");
    }