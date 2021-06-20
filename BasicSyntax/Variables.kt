package BasicSyntax

//variables can be read-only and reassign-able

    // Read only variables
    fun m1(){
        val a = 10;
        //a++;//CE
        println("Value of 'val a' is $a");
    }

    //Re-assign-able variables
    fun m2(){
        var a =1;
        println("Value of 'var a' is $a++");
    }

    //Variables can also be declared at the top leve,
    //i.e. out of any block or functions
    val PI = 3.14;
    var a = "hi";