/**
 * @param {number} x
 * @return {number}
 */
var reverse = function(x) {
    if(x === null || x === undefined){
        return 0;
    }
    class Stack{
        constructor(){
            this.data = [];
        }
        push(record){
            this.data.push(record);
        }
        pop(){
            return this.data.pop();
        }
        peek(){
            return this.data[this.data.length-1];
        }
        isEmpty(){
            return this.data.length === 0;
        }
    }
    const stack = new Stack();
    const str = x.toString();
    let result = '';
    let count = 1;
    const isNegative = (str[0] === '-');
    for(let i= isNegative ? 1 : 0;i<str.length;i++){
            stack.push(str[i]);
    }
    while(!stack.isEmpty()){
        result += stack.pop();
    }
    const reversedNumber = isNegative ? -parseInt(result, 10) : parseInt(result, 10);
    if (reversedNumber > Math.pow(2, 31) - 1 || reversedNumber < Math.pow(-2, 31)) {
        return 0;
    }
    return reversedNumber;
};
