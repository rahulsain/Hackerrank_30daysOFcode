<?php

class Node
{
    public $left, $right;
    public $data;

    function __construct($data)
    {
        $this->left = $this->right = null;
        $this->data = $data;
    }
}

class Solution
{
    public function insert($root, $data)
    {
        if ($root == null) {
            return new Node($data);
        } else {
            if ($data <= $root->data) {
                $cur = $this->insert($root->left, $data);
                $root->left = $cur;
            } else {
                $cur = $this->insert($root->right, $data);
                $root->right = $cur;
            }
            return $root;
        }
    }

    public function levelOrder($root)
    {
        $data = [];
        $queue[] = $root;

        while (!empty($queue)) {
            $curr = array_shift($queue);
            $data[] = (int)$curr->data;

            if ($curr->left !== null) {
                $queue[] = $curr->left;
            }
            if ($curr->right !== null) {
                $queue[] = $curr->right;
            }
        }

        echo implode(' ', $data);
    }

}

//End of Solution

$myTree = new Solution();
$root = null;
$T = intval(fgets(STDIN));
while ($T-- > 0) {
    $data = intval(fgets(STDIN));
    $root = $myTree->insert($root, $data);
}

$myTree->levelOrder($root);
