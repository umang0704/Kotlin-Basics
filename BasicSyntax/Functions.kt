package BasicSyntax

// with return type
    fun sum(a : Int , b: Int) : Int{
        return a+b;
    }

    fun sum1( a: Int , b : Int) = a+b


//without return type
    fun printHello() : Unit {
        println("hello");
    }

    // there can be omition of unit or void (in java) return statement
    fun printHi() {
        println("Hi")
    }