<?php

$handle = fopen("php://stdin", "r");
fscanf($handle, "%s", $S);

echo ctype_digit($S) ? $S : 'Bad String';
