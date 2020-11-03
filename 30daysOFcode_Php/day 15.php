<?php
// Bubble sort in PHP - Day 15

$handle = fopen ("php://stdin", "r");
fscanf($handle, "%d",$n);
$a_temp = fgets($handle);
$a = explode(" ",$a_temp);
$a = array_map('intval', $a);
// Write Your Code Here
$n = count($a);
$totalSwaps = 0;

for ($i = 0; $i < $n; ++$i) {
    $swaps = 0;

    for ($j = 0; $j + 1 < $n; ++$j) {
        if ($a[$j] > $a[$j+1]) {
            $tmp = $a[$j];
            $a[$j] = $a[$j+1];
            $a[$j+1] = $tmp;
            ++$swaps;
        }
    }

    if ($swaps == 0)
        break;

    $totalSwaps += $swaps;
}

echo "Array is sorted in $totalSwaps swaps.\n";
echo "First Element: $a[0]\n";
$last = $a[$n-1];
echo "Last Element: $last";

?>