"use strict";

process.stdin.resume();
process.stdin.setEncoding("utf-8");

let inputString = "";
let currentLine = 0;

process.stdin.on("data", (inputStdin) => {
    inputString += inputStdin;
});

process.stdin.on("end", (_) => {
    inputString = inputString
        .trim()
        .split("\n")
        .map((string) => {
            return string.trim();
        });

    main();
});

function readLine() {
    return inputString[currentLine++];
}

/*
 * Complete the vowelsAndConsonants function.
 * Print your output using 'console.log()'.
 */
function vowelsAndConsonants(s) {
    for (let ch of s) {
        if (ch == "a" || ch == "e" || ch == "i" || ch == "o" || ch == "u") {
            console.log(ch);
        }
    }
    for (let ch of s) {
        if (!(ch == "a" || ch == "e" || ch == "i" || ch == "o" || ch == "u")) {
            console.log(ch);
        }
    }
}

function main() {
    const s = readLine();

    vowelsAndConsonants(s);
}
