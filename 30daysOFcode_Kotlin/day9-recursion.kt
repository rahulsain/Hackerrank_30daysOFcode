fun main(args: Array<String>) {
    val n:Int=readLine()!!.toInt();
    println(factorial(n));
}

private fun factorial(n:Int):Int{
    if(n==0||n==1)
        return 1;
    else
        return n*factorial(n-1);
}