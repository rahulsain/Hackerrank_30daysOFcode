function Solution() {
  //Write your code here
  this.stack = [];
  this.queue = [];

  this.pushCharacter = this.stack.push;
  this.popCharacter = this.stack.pop;
  this.enqueueCharacter = this.queue.push;
  this.dequeueCharacter = this.queue.shift;
}
