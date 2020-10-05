import java.io._
import java.math._
import java.security._
import java.text._
import java.util._
import java.util.concurrent._
import java.util.function._
import java.util.regex._
import java.util.stream._
import scala.collection.mutable.ListBuffer
import scala.collection.mutable.HashSet

object Solution {
    def main(args: Array[String]) {
    
    var count=1
    var max_seq=0
    val hash_set: HashSet[Int] = HashSet.empty[Int]
    val stdin = scala.io.StdIn
    var n = stdin.readLine.trim.toInt
    var list = new ListBuffer[Int]()

    while(n>=1){
       list+=n%2
       n =n/2
    }
    
    list=list.reverse.zipWithIndex.filter(_._1>0).map(x=>(x._2+1))
    
    for (e <- list) hash_set+=e

    for (e <- list){
         if(hash_set.contains(e-1)){
            count=count+1
         }else{
           count=1
         }
         if(count>max_seq){
        max_seq=count
      }
    }
        println(max_seq)
    }
}
