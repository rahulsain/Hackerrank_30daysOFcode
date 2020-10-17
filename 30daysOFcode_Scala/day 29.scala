object Solution {

  def main(args: Array[String]) {
    val sc = new java.util.Scanner (System.in);
    var t = sc.nextInt();
    var a0 = 0;
    while(a0 < t){
      var n = sc.nextInt();
      var k = sc.nextInt();
      a0+=1;
      val list = List.range(1, n+1, 1)
      var max = 0
      for (i <- 1 to n-1) {
        for (j <- i+1 to n) {
//          println(s"a: ${i} b: ${j}: (a&b): ${(i & j)}")
          if ((i & j) > max && (i & j) < k) {

            max = (i & j)
          }
        }
      }
      println(max)
    }
  }
}
