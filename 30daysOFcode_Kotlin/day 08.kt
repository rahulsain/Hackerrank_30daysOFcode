fun main(args: Array<String>) {
    
    var T:Int=readInt();

    val contactList=mutableMapOf<String,Long>();

    while(T-->0){
    val contact=readStrings();
      contactList[contact[0]]=contact[1].toLong();
    }
   println(contactList)
   while(true){
       val query=readLn();
       if(query.isEmpty()){
           break;
       }
       if(contactList.containsKey(query)){
        println("$query=${contactList[query]}");
    }else{
        println("Not found");
    }
   }

}

private fun readLn() = readLine()!! ;
private fun readInt() = readLn().toInt();
private fun readLong() = readLn().toLong();
private fun readStrings() = readLn().split(" ") ;
private fun readInts() = readStrings().map { it.toInt() } 