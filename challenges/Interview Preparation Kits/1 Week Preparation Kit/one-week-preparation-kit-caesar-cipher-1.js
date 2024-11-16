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
 * Complete the 'caesarCipher' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts following parameters:
 *  1. STRING s
 *  2. INTEGER k
 */
const low = "abcdefghijklmnopqrstuvwxyz";
const high = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
function letterShift(letter, k) {
    if (low.includes(letter)) {
        let code = letter.charCodeAt(0) - 97;
        return String.fromCharCode(97 + (((k % 26) + code) % 26));
    } else if (high.includes(letter)) {
        let code = letter.charCodeAt(0) - 65;
        return String.fromCharCode(65 + (((k % 26) + code) % 26));
    } else {
        return letter;
    }
}
function caesarCipher(s, k) {
    // Write your code here
    return s
        .split("")
        .map((letter) => letterShift(letter, k))
        .join("");
}

function main() {
    const ws = fs.createWriteStream(process.env.OUTPUT_PATH);

    const n = parseInt(readLine().trim(), 10);

    const s = readLine();

    const k = parseInt(readLine().trim(), 10);

    const result = caesarCipher(s, k);

    ws.write(result + "\n");

    ws.end();
}
