<?php
$stdin = fopen("php://stdin", "r");
fscanf($stdin, "%d\n", $n);

$s = explode('0',decbin($n));
echo strlen(max($s));

fclose($stdin);
