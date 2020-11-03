<?php
$_fp = fopen("php://stdin", "r");
/* Enter your code here. Read input from STDIN. Print output to STDOUT */

$row = 0;
while($string = fgetcsv($_fp)){
    $str = $string[0];
    $even = $odd = '';
    $row++;
    if($row > 1){
        $i = 0;
        foreach(str_split($str) as $k => $v){
            if($i % 2 == 1){
                $odd .= $v;
            }else{
                $even .= $v;
            }
            $i++;
        }

        echo $even . ' '. $odd."\n";
    }
}

?>
