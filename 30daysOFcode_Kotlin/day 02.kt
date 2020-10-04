import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

// Complete the solve function below.
fun solve(meal_cost: Double, tip_percent: Int, tax_percent: Int): Unit {

    val tip:Double = meal_cost*(tip_percent.toDouble()/100);
    val tax:Double = meal_cost*(tax_percent.toDouble()/100);
    val totalCost:Double = meal_cost + tip + tax;

    print(Math.round(totalCost));
}

fun main() {
    val scan = Scanner(System.`in`)

    val meal_cost = scan.nextLine().trim().toDouble()

    val tip_percent = scan.nextLine().trim().toInt()

    val tax_percent = scan.nextLine().trim().toInt()

    solve(meal_cost, tip_percent, tax_percent)
}
