<?php
$handle = fopen ("php://stdin","r");
$i = 4;
$d = 4.0;
$s = "HackerRank ";



// Declare second integer, double, and String variables.
$fp=fopen("php://stdin", "r");
$x=(int)readline();
$y=(float)readline();
$z=readline();


print($x+$i."\n");
print(sprintf("%.1f",$y+$d)."\n");
print($s.$z);

fclose($handle);
?>