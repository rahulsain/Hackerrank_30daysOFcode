<?php



$stdin = fopen("php://stdin", "r");

$arr == array();

for ($i = 0; $i < 6; $i++) {
    fscanf($stdin, "%[^\n]", $arr_temp);
    $arr[] = array_map('intval', preg_split('/ /', $arr_temp, -1, PREG_SPLIT_NO_EMPTY));
}

for($row=0; $row<4; $row++) {
    for($col=0; $col<4; $col++) {
        $sum = $arr[$row][$col] 
             + $arr[$row][$col+1]
             + $arr[$row][$col+2] 
             + $arr[$row+1][$col+1]
             + $arr[$row+2][$col]
             + $arr[$row+2][$col+1]
             + $arr[$row+2][$col+2];
        if(!isset($max)) $max = $sum;
        $max = max($max, $sum);
    }
}
echo $max;

fclose($stdin);
