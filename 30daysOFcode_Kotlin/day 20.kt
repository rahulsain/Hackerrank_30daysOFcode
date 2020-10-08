
fun main(args: Array<String>) {
    val n:Int=readInt();
    var inputArray=readInts().toTypedArray();
      
    var ans=0;
    for(i in 0..n-1){
        for(j in 0..n-2){
            if(inputArray[j]>inputArray[j+1]){
              inputArray[j]=inputArray[j+1].also( { inputArray[j+1]=inputArray[j]}); //swap 
             
              ans++;
            }
        }
        if(ans==0)
          break;
    }
    println("Array is sorted in $ans swaps.");
    println("First Element: ${inputArray[0]}\nLast Element: ${inputArray[n-1]}");
  }
  private fun readLn() = readLine()!! ;
  private fun readInt() = readLn().toInt();
  private fun readStrings() = readLn().split(" ") ;
  private fun readInts() = readStrings().map { it.toInt() } 