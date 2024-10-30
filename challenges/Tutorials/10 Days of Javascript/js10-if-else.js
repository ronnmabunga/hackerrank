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

function getGrade(score) {
    let grade;
    // Write your code here
    if (score <= 30 && 25 < score) grade = "A";
    if (score <= 25 && 20 < score) grade = "B";
    if (score <= 20 && 15 < score) grade = "C";
    if (score <= 15 && 10 < score) grade = "D";
    if (score <= 10 && 5 < score) grade = "E";
    if (score <= 5 && 0 < score) grade = "F";
    return grade;
}

function main() {
    const score = +readLine();

    console.log(getGrade(score));
}
