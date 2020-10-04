object Solution {

    def main(args: Array[String]) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution
*/

val stdin = scala.io.StdIn

        var t = stdin.readLine.trim.toInt

        while(t>0){
        val str = stdin.readLine.trim

        for(i<- 0 to str.length-1){
        if(i%2==0){
        print(str(i))}
        }
        print(" ")

        for(i<- 0 to str.length-1){
        if(i%2!=0){
        print(str(i))}
        }
        println("")

        t=t-1}
    }
}
