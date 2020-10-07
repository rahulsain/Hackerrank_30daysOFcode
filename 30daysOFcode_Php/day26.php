<?php

function libraryFine($d1, $m1, $y1, $d2, $m2, $y2)
{
    if (mktime(0, 0, 0, $m1, $d1, $y1) < mktime(0, 0, 0, $m2, $d2, $y2)) {
        return 0;
    }

    $d = 15 * ($d1 - $d2) > 0 ? 15 * ($d1 - $d2) : 0;
    $m = 500 * ($m1 - $m2) > 0 ? 500 * ($m1 - $m2) : 0;
    $y = $y1 - $y2 > 0 ? 10000 : 0;

    if ($y > 0) {
        return $y;
    }

    if ($m > 0) {
        return $m;
    }

    if ($d > 0) {
        return $d + $m + $y;
    }

    return 0;
}

$_fp = fopen("php://stdin", "r");

fscanf($_fp, "%[^\n]", $date1);
fscanf($_fp, "%[^\n]", $date2);

$date1 = date_parse_from_format('j m Y', $date1);
$date2 = date_parse_from_format('j m Y', $date2);

echo libraryFine($date1['day'], $date1['month'], $date1['year'], $date2['day'], $date2['month'], $date2['year']);
