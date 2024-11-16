"use strict";

const fs = require("fs");

process.stdin.resume();
process.stdin.setEncoding("utf-8");

let inputString = "";
let currentLine = 0;

process.stdin.on("data", function (inputStdin) {
    inputString += inputStdin;
});

process.stdin.on("end", function () {
    inputString = inputString.split("\n");

    main();
});

function readLine() {
    return inputString[currentLine++];
}

/*
 * Complete the 'palindromeIndex' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts STRING s as parameter.
 */
function palindromeIndex(s) {
    // Write your code here
    let l = s.length;
    if (l === 1) {
        return -1;
    }
    let wrongIndex = -1;
    let i = 0;
    let e = l - 1;
    while (i < e) {
        if (s[i] !== s[e]) {
            if (s[i + 1] !== s[e] && s[i] !== s[e - 1] && i + 1 !== e - 1) {
                return e + 1;
            }
            if (s[i + 1] === s[e]) {
                if (wrongIndex !== -1 && i !== wrongIndex) {
                    return -1;
                }
                wrongIndex = i;
                e++;
            }
            if (s[i] === s[e - 1] && e !== wrongIndex) {
                if (wrongIndex !== -1) {
                    return -1;
                }
                wrongIndex = e;
                i--;
            }
        }
        i++;
        e--;
    }
    return wrongIndex;
}

function main() {
    const ws = fs.createWriteStream(process.env.OUTPUT_PATH);

    const q = parseInt(readLine().trim(), 10);

    for (let qItr = 0; qItr < q; qItr++) {
        const s = readLine();

        const result = palindromeIndex(s);

        ws.write(result + "\n");
    }

    ws.end();
}
