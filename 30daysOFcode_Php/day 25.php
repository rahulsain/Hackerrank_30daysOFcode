<?php
$_fp = fopen("php://stdin", "r");
/* Enter your code here. Read input from STDIN. Print output to STDOUT */
$T=(int)readline();
function isPrime($n){
    if($n==2){
        return true;
    }
    else if($n%2==0){
        return false;
    }
    else{
        if($n==1 || $n<=0){
            return false;
        }
        else{
            for($j=3;$j*$j<=$n;$j+=2){
                if($n%$j===0){
                    return false;
                }
            }
            return true;
        }
    }
}
for($i=0;$i<$T;$i++){
    $a=(int)readline();
    $stat=isPrime($a);
    if($stat){
        echo("Prime\n");
    }
    else{
        echo("Not prime\n");
    }
}
?>
