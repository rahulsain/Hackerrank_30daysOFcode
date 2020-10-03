<?php
abstract class Book
{
    
    protected $title;
    protected  $author;
    
     function __construct($t,$a){
        $this->title=$t;
        $this->author=$a;
    }
    abstract protected function display();
}

//Write MyBook class
class MyBook extends Book {

  public function __construct (string $title, string $author, float $price) {
    $this->title = $title;
    $this->author = $author;
    $this->price = $price;
  }

  public function display() {
    echo "Title: " . $this->title;
    echo "Author: " . $this->author;
    echo "Price: " . $this->price;
  }
}

$title=fgets(STDIN);
$author=fgets(STDIN);
$price=intval(fgets(STDIN));
$novel=new MyBook($title,$author,$price);
$novel->display();

?>
