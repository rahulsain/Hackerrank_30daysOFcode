<?php

// Complete the solve function below.
function solve($meal_cost, $tip_percent, $tax_percent) {
    $tip=((float)($tip_percent*$meal_cost))/(float)100;
    $tax=((float)($tax_percent*$meal_cost))/(float)100;
    $totalCost=$meal_cost+$tip+$tax;
    $totalCost=round($totalCost);
    print((int)$totalCost);
    

}

$stdin = fopen("php://stdin", "r");

fscanf($stdin, "%lf\n", $meal_cost);

fscanf($stdin, "%d\n", $tip_percent);

fscanf($stdin, "%d\n", $tax_percent);

solve($meal_cost, $tip_percent, $tax_percent);

fclose($stdin);
