fun main(args: Array<String>) {
var T:Int=readInt();

    while(T-->0){
        val inputString = readLn();
        for (i in 0..inputString.length-1 step 2) {
            print(inputString[i]);
        }
        print(" ");
        for (i in 1..inputString.length-1 step 2) {
            print(inputString[i]);
        }  
        println("");
    }   
}

//for ease

private fun readLn() = readLine()!! 
private fun readInt() = readLn().toInt()