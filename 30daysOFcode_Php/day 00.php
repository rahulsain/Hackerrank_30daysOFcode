<?php
	$_fp = fopen("php://stdin", "r");

	$inputString = fgets($_fp); 
	// get a line of input from stdin and save it to our variable

	// first line of output goes here
	print("Hello, World.\n");

	// Write the second line of output
	print($inputString);

	fclose($_fp);
?>