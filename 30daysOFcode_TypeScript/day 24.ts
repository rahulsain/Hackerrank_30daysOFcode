class Nodes {
    data: number;
    next: Nodes;

    constructor(data: number, next: Nodes) {
        this.data = data;
        this.next = next;
    }
}

this.removeDuplicates = function(head: Nodes): Nodes {
    let curr: Nodes = head;

    while (curr) {
        let nextNodes: Nodes = curr.next;

        if (nextNodes &&  curr.data == nextNodes.data) {
            curr.next = nextNodes.next;
        }
        else {
            curr = curr.next;
        }
    }

    return head;
}