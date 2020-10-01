this.removeDuplicates=function(head){
    //Write your code here
    let prev = head;

    while (prev) {
        let next = prev.next;

        (next && prev.data == next.data)
            ? (prev.next = next.next)
            : (prev = prev.next);
    }

    return head;
}