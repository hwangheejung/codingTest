const fs = require('fs');
const [n,...input] = fs.readFileSync('example.txt').toString().trim().split('\n');

console.log(n);
for(let i=0;i<n;i++){
    let a = input.shift();
    let [x,y] = input.shift().split(' ');
    let [next_x,next_y] = input.shift().split(' ');

    console.log(x);
    console.log(y);
    console.log(next_x);
    console.log(next_y);


}