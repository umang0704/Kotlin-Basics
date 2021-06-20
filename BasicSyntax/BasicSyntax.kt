package BasicSyntax

//Programme Entry Point
fun main(){
//print statements
    println("Hi from main 1");
}

fun main(args : Array<String>){
//print statements
    println("Hello from main 2");
    main();
}
