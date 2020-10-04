<?php

$handle = fopen("php://stdin", "r");
fscanf($handle, "%d", $n);
$a_temp = fgets($handle);
$a = explode(' ', $a_temp);
$a = array_map('intval', $a);

function swap($a, $left, $right)
{
    $old = $a[$right];
    $a[$right] = $a[$left];
    $a[$left] = $old;

    return $a;
}

$numberOfSwaps = 0;
for ($i = 0; $i < $n; $i++) {
    for ($j = 0; $j < $n - 1 - $i; $j++) {
        if ($a[$j + 1] < $a[$j]) {
            $a = swap($a, $j, $j + 1);
            $numberOfSwaps++;
        }
    }
}

print('Array is sorted in ' . $numberOfSwaps . ' swaps.') . PHP_EOL;
print('First Element: ' . current($a)) . PHP_EOL;
print('Last Element: ' . end($a)) . PHP_EOL;
