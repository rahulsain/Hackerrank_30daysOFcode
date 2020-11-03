import java.util.Scanner

fun main() {
    val scan = Scanner(System.`in`)

    val N = scan.nextLine().trim().toInt();

    if(N%2==1){
        println("Weird");
    }
    else{
        if(N>20){
            println("Not Weird");
        }
        else 
            if(N>=6){
            println("Weird");
        }
        else{
            println("Not Weird");
        }
    }
}
