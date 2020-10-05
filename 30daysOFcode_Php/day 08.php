<?php
$file = fopen("php://stdin", "r");
$data = array();
$phoneBook = array();

while (!feof($file)) array_push($data, trim(fgets($file)));
$entries = intval($data[0]);

for ($i = 1; $i <= $entries; $i++) {
  $exploted = explode(" ", $data[$i]);
  $phoneBook[$exploted[0]] = $exploted[1];
}

for ($i = $entries + 1; $i < count($data); $i++) {
  if (array_key_exists($data[$i], $phoneBook)) echo  $data[$i] . '=' . $phoneBook[$data[$i]] . "\n";
  else echo "Not found\n";
}
