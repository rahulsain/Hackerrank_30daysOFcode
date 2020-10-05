<?php

class person {
    protected $firstName, $lastName, $id;
    
    public function __construct($first_name, $last_name, $identification) {
        $this->firstName = $first_name;
        $this->lastName = $last_name;
        $this->id = $identification;
    }
    
    function printPerson() {
        print("Name: {$this->lastName}, {$this->firstName}\n");
        print("ID: {$this->id}\n");
    }
}

class Student extends person {
    
    private $testScores;
    public $firstName;
    public $lastName;
    public $id;
    public $scores;

    public function __construct(
        
        string $firstName,
        string $lastName,
        int $id,
        
        array $scores)
        {
            parent::__construct($firstName, $lastName, $id);
            $this->firstName = $firstName;
            $this->lastName = $lastName;
            $this->id = $id;
            $this->scores = $scores;
        }
                
    /*    
    *   Function Name: calculate
    *   Return: A character denoting the grade.
    */
    public function calculate() : string
    {
        $avg = array_sum($this->scores) / count($this->scores);

        if ($avg >= 90 && $avg <= 100) {
            return 'O';
        } elseif ($avg >= 80 && $avg < 90) {
            return 'E';
        } elseif ($avg >= 70 && $avg < 80) {
            return 'A';
        } elseif ($avg >= 55 && $avg < 70) {
            return 'P';
        } elseif ($avg >= 40 && $avg < 55) {
            return 'D';
        } else {
            return 'T';
        }
    }
}


$file = fopen("php://stdin", "r");

$name_id = explode(' ', fgets($file));

$first_name = $name_id[0];
$last_name = $name_id[1];
$id = (int)$name_id[2];

fgets($file);

$scores = array_map(intval, explode(' ', fgets($file)));

$student = new Student($first_name, $last_name, $id, $scores);

$student->printPerson();

print("Grade: {$student->calculate()}");
