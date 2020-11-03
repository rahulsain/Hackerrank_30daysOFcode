class Solution {
    stack: Array<string>;
    queue: Array<string>;

    constructor() {
        this.stack = [];
        this.queue = [];
    }

    pushCharacter(c: string): void {
        this.stack.push(c);
    }

    popCharacter(): string {
        return this.stack.pop();
    }

    enqueueCharacter(c: string): void {
        this.queue.push(c);
    }

    dequeueCharacter(): string {
        return this.queue.shift();
    }
}
