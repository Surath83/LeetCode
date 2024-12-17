/**
 * @param {number} x
 * @return {boolean}
 */
var isPalindrome = function(x) {
    if(x<0){
    return false;
    }
    const str = x.toString();

class Stack {
    constructor() {
    this.items = [];
    }
    push(element) {
    this.items.push(element);
    }
    pop() {
    if (this.isEmpty()) {
      return false;
    }
    return this.items.pop();
    }
    peek(){
    if (this.isEmpty()) {
      return false;
    }
    return this.items[this.items.length - 1];
    }
    isEmpty() {
    return this.items.length === 0;
    }
}   

    const stack = new Stack();

    for(let i=0;i<str.length;i++){
        stack.push(str[i]);
    }
    for(let i=0;i<str.length;i++){
        if(str[i] != stack.peek()){
            return false;
        }
        stack.pop();
    }
    if(stack.isEmpty()){
        return true;
    }else
    return false;
};
