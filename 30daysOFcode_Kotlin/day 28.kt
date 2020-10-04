
fun main(args: Array<String>) {
    val names=ArrayList<String>();
    val n=readInt();
    
    for (i in 0..n-1) {
        var input=readStrings().toTypedArray();
        var isvalid=input[1].split("@");

        if(isvalid[1].equals("gmail.com")){
            names.add(input[0]);
        }
    }
    names.sort();
    for (i in names) {
        println(i);
    }
}
private fun readLn() = readLine()!! ;
private fun readInt() = readLn().toInt();
private fun readStrings() = readLn().split(" ") ;
private fun readInts() = readStrings().map { it.toInt() } 