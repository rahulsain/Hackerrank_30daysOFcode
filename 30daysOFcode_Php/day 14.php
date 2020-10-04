<?php
    class Difference{
    private $elements=array();
    public $maximumDifference;

// Write your code here
function __construct($elements) {
        $this->elements = $elements;
    }

    function computeDifference() {
        $el = $this->elements;
        $this->maximumDifference = 0;

        for($i = 0; $i < count($el); $i++) {
            for($j = 0; $j < count($el); $j++) {
                $val = $el[$i] - $el[$j];
                if($val > $this->maximumDifference) {
                    $this->maximumDifference = $val;
                }
            }
        }
    }

} //End of Difference class  
     

$N=intval(fgets(STDIN));
$a =array_map('intval', explode(' ', fgets(STDIN)));
$d=new Difference($a);
$d->ComputeDifference();
print ($d->maximumDifference);
?>
