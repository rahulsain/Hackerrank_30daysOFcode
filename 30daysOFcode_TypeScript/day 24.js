var Nodes = /** @class */ (function () {
    function Nodes(data, next) {
        this.data = data;
        this.next = next;
    }
    return Nodes;
}());
this.removeDuplicates = function (head) {
    var curr = head;
    while (curr) {
        var nextNodes = curr.next;
        if (nextNodes && curr.data == nextNodes.data) {
            curr.next = nextNodes.next;
        }
        else {
            curr = curr.next;
        }
    }
    return head;
};
var head = new Nodes(1, null);
head.next = new Nodes(1, null);
head.next.next = new Nodes(1, null);
head.next.next.next = new Nodes(4, new Nodes(5, null));
head = this.removeDuplicates(head);
function printList(head) {
    var temp = head;
    while (temp) {
        console.log(temp.data);
        temp = temp.next;
    }
}
printList(head);
