<?php



$stdin = fopen("php://stdin", "r");

fscanf($stdin, "%d\n", $N);

if($N%2==1)
    print("Weird");
elseif($N%2==0 and $N>=2 and $N<=5)
    print("Not Weird");
elseif($N%2==0 and $N>=6 and $N<=20)
    print("Weird");
else
    print("Not Weird");
fclose($stdin);
