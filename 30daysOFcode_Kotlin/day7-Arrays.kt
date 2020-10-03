fun main(args: Array<String>) {
    val n:Int=readInt();
    val array=readInts();
    for(i in array.reversed())
    {
        print("$i ");
    }
}

private fun readLn() = readLine()!! 
private fun readInt() = readLn().toInt()
private fun readStrings() = readLn().split(" ") 
private fun readInts() = readStrings().map { it.toInt() } 