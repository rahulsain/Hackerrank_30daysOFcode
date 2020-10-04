object Solution {
    def main(args: Array[String]) {
        val i = 4
        val d = 4.0
        val s = "HackerRank "

        // Read values of another integer, double, and string variables
        // Note use scala.io.StdIn to read from stdin
         val a = scala.io.StdIn.readLine().toInt
         val b = scala.io.StdIn.readLine().toDouble
         val c = scala.io.StdIn.readLine()
         val sum_1=a+i
         val sum_2=b+d

        // Print the sum of both the integer variables
        println(sum_1)
        // Print the sum of both the double variables
        println(sum_2)
        // Concatenate and print the string variables
        // The 's' variable above should be printed first.
        println(s+c)
    }
}
