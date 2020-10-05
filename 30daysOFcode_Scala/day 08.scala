object Solution {

  def main(args: Array[String]) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution
*/
    var str :String=null
    val stdin = scala.io.StdIn
    val map = scala.collection.mutable.Map[String,String]()

    var t = stdin.readLine.trim.toInt
    while(t>0){
      str = stdin.readLine.trim
      val key=str.split(" ").array(0)
      val value=str.split(" ").array(1)
      map(key)=value
      t=t-1
    }
var flag=false


    while(flag==false){
        try{
            str = stdin.readLine.trim}catch{
        case x: Throwable => {flag=true}}
            if(str!=null && flag==false){
                try{println(str+"="+map(str))}
                catch{
                    case x => {println("Not found")}
                }
            }
        }
    }
}
