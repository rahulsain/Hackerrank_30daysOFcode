class NodeBST {
  left: NodeBST;
  right: NodeBST;
  data: number;

  constructor(data: number) {
    this.data = data;
  }
}

class SolutionBST {
  getHeight(root: NodeBST): number {
    var p: NodeBST;
    p = root;

    if (p == null) return -1;
    else {
      var l = this.getHeight(p.left);
      var r = this.getHeight(p.right);
      if (l > r) return l + 1;
      else return r + 1;
    }
  }

  insert(root: NodeBST, data: number): NodeBST {
    if (root == null) {
      return new NodeBST(data);
    } else {
      var cur: NodeBST;
      if (data <= root.data) {
        cur = this.insert(root.left, data);
        root.left = cur;
      } else {
        cur = this.insert(root.right, data);
        root.right = cur;
      }
      return root;
    }
  }
}

var root: NodeBST = null;
var noOfNodes: number = 3;
var sol: SolutionBST = new SolutionBST();
var data: number = 1;
while (noOfNodes--) {
  root = sol.insert(root, data);
}
console.log(sol.getHeight(root));
