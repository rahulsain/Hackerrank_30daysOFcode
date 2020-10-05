
fun main(args: Array<String>) {
    var T=readLine()!!.toInt();
    while(T-->0){
        val query=readInts().toTypedArray();
       println(findMax(query[0], query[1]));
    }
    
}
private fun findMax(n:Int,k:Int):Int{
    var max=0;
    var a=n-1;
    while(a-->0){
        for(b in (a+1)..n){
            val temp=a and b;
            if(temp<k && temp>max){
                max=temp;
            }
        }
    }
    return max;

}
private fun readLn() = readLine()!! ;
private fun readInt() = readLn().toInt();
private fun readStrings() = readLn().split(" ") ;
private fun readInts() = readStrings().map { it.toInt() } 