const input = require('fs').readFileSync(0).toString().split('\n');

let [N, M] = input[0].split(' ').map((element) => parseInt(element));

let arr1 = Array(N).fill(0).map(() => Array(M).fill(0));
let arr2 = Array(N).fill(0).map(() => Array(M).fill(0));
let ans = Array(N).fill(0).map(() => Array(M).fill(0));

for(let i = 0; i < N; ++i){
    for (let j = 0; j < M; ++j){
        arr1[i][j] = input[i+1].split(' ')[j];
    }
}

let result = '';

for(let i = 0; i < N; ++i){
    for (let j = 0; j < M; ++j){
        if(input[i+1+N].split(' ')[j] != arr1[i][j]){
            ans[i][j] = 1;
        }
    }
    result += ans[i].join(' ') + '\n';
}

console.log(result);