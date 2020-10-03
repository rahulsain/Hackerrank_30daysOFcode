import java.util.Scanner
fun main(args: Array<String>) {
    var matrix=Array(6){IntArray(6)}

    val input = Scanner(System.`in`);
    
    for(i in 0..5){
        for(j in 0..5){
            matrix[i][j]=input.nextInt();
        }
    }

   var sum=Int.MIN_VALUE;
   
   for(i in 0..3){
       for(j in 0..3){
           val curSum=matrix[i][j] + matrix[i][j+1] + matrix[i][j+2]+ matrix[i+1][j+1]+ matrix[i+2][j] + matrix[i+2][j+1] + matrix[i+2][j+2];
           if(curSum>sum){
               sum=curSum;
           }
       }
   }

   print(sum);
}
