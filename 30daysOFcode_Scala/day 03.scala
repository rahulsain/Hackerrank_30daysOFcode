import java.io._
import java.math._
import java.security._
import java.text._
import java.util._
import java.util.concurrent._
import java.util.function._
import java.util.regex._
import java.util.stream._

object Solution {



    def main(args: Array[String]) {
        val stdin = scala.io.StdIn

        val n = stdin.readLine.trim.toInt

        if(n%2!=0){
        println("Weird")}
        else if(n%2==0 && n>=2 && n<=5){
        println("Not Weird")}
        else if(n%2==0 && n>=6 && n<=20){
        println("Weird")}
        else{
        println("Not Weird")}



    }
}
