<?php

$stdin = fopen("php://stdin", "r");

$data = [];
fscanf($stdin, "%d\n", $N);
for ($N_itr = 0; $N_itr < $N; $N_itr++) {
    fscanf($stdin, "%[^\n]", $firstNameEmailID_temp);
    $firstNameEmailID = explode(' ', $firstNameEmailID_temp);

    $firstName = $firstNameEmailID[0];
    $emailID = $firstNameEmailID[1];

    preg_match('/([a-z]+)@gmail.com/', $emailID, $matches);
    if (isset($matches[1])) {
        $data[] = $firstName;
    }
}

sort($data);
echo implode(PHP_EOL, $data);

fclose($stdin);
