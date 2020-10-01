var node = new Node(data);

if (head == null) {
  head = node
} else {
  var temp = head;

  while (temp.next != null)
    temp = temp.next
  temp.next = node;
}

return head;
