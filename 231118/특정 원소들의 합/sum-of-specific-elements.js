const input = require('fs').readFileSync(0).toString().split('\n');

let arr = [];

for (let i = 0; i < 4; ++i){
    arr.push(input[i].split(' '));
}

let ans = 0;

for (let i = 0; i < 4; ++i){
    for (let j = 0; j <= i; ++j){
        ans += parseInt(arr[i][j]);
    }
}

console.log(ans);