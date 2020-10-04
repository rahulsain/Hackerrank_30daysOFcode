<?php

$stdin = fopen("php://stdin", "r");

fscanf($stdin, "%d\n", $t);

for ($t_itr = 0; $t_itr < $t; $t_itr++) {
    fscanf($stdin, "%[^\n]", $nk_temp);
    $nk = explode(' ', $nk_temp);

    $n = intval($nk[0]);

    $k = intval($nk[1]);

    // print(k-1 if ((k-1) | k) <= n else k-2)

    if((($k-1)|$k)<=$n){
        echo($k-1);
        echo("\n");
    }
    else{
        echo($k-2);
        echo("\n");
    }
}

fclose($stdin);
?>
