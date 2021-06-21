package BasicSyntax

//conditional expressions : if can also be used as an expression, which returns a value
    fun maxOf2(a: Int, b: Int) = if (a > b) a else b;

// for loop
    fun forLoop1() {
        var cal1 = listOf('a', 'b', 'c');
        for( i in cal1)
            println(i)
    }


