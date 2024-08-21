let input = require('fs').readFileSync('example.txt').toString().trim().split('\n');


let [person,snackNum] = input[0].map(Number);
let snackList = input[1].map(Number);
snackList.sort((a,b)=>a-b);
let answer = 0;
let min = 1;
let max = snackList[snackNum-1];
let standNum,checkNum;

loop();
function loop(){
    while(min<=max){
        standNum = Math.floor((min+max)/2);
        checkNum = 0;
        for(let i=0;i < snackNum;i++){
            checkNum += Math.floor(snackList[i]/standNum);
        }
        if(checkNum>=person){min=standNum+1;answer=min-1;}
        else{max=standNum-1;}
    }
    console.log(answer);
}