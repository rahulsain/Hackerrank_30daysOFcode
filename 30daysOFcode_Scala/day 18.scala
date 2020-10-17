import scala.collection.mutable.ListBuffer
class Solution {
  //Write your code here
    var lb = new ListBuffer[Char];
    var ch = 'a';
    def outputListBuffer() = {
        println(lb)
    }
    def pushCharacter(c: Char) = {
        lb += c;
    }
    def enqueueCharacter(c: Char) = {
        //lb.insert(0, c);
    }
    def popCharacter() : Char = {
        ch = lb.last;
        if ( lb.size < 2 ) {
            return ch;
        }
        try {
            ch = lb.remove(lb.size-1);
        } catch {
            case _: Throwable => 
        }
        ch
    }
    def dequeueCharacter() : Char = {
        ch = ' ';
        try {
            ch = lb.remove(0);
        } catch {
            case _: Throwable => 
        }
        ch
    }
}
