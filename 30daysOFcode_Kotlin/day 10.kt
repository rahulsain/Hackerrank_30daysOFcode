fun main(args: Array<String>) {
    var n:Int=readLine()!!.toInt();
    var ans=0;
    while(n!=0){
        n=(n and (n shl 1));
        ans++;
    }
  print(ans);
}
