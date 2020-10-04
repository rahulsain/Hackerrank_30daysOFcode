struct Stack<Element> {
    var items = [Element]()
    mutating func push(_ item: Element) {
        items.append(item);
    }
    mutating func pop() -> Element {
        return items.removeLast();
    }
}

struct Queue<Element> {
    var items = [Element]()
    mutating func enqueue(_ item: Element) {
        items.append(item);
    }
    mutating func dequeue() -> Element {
        return items.removeFirst();
    }
}


class Solution {

    var stack = Stack<Character>();
    var queue = Queue<Character>();

    func pushCharacter(ch: Character){
        stack.push(ch);
    }
    
    func popCharacter() -> Character {
        return stack.pop();
    }
    
    func enqueueCharacter(ch: Character){
        queue.enqueue(ch);
    }
    
    func dequeueCharacter() -> Character {
        return queue.dequeue();
    }
}
