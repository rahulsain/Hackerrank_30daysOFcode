fun main(args: Array<String>) {
    var actualDate=readInts().toTypedArray();
    var expectedDate=readInts().toTypedArray();

    var fine=0;
    if(expectedDate[2]==actualDate[2]){
        if(expectedDate[1]<actualDate[1]){
            fine=(actualDate[1]-expectedDate[1])*500;
        }else if((expectedDate[1]==actualDate[1])&&(expectedDate[0]<actualDate[0])){
            fine=(actualDate[0]-expectedDate[0])*15;
        }
    }else if(expectedDate[2]<actualDate[2]){
        fine=10000;
    }
    println(fine);
}
private fun readLn() = readLine()!! ;
private fun readInt() = readLn().toInt();
private fun readStrings() = readLn().split(" ") ;
private fun readInts() = readStrings().map { it.toInt() } 