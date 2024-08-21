const fs = require('fs');
const [n,...input] = fs.readFileSync('example.txt').toString().split('\n');

console.log(n);
console.log(input);