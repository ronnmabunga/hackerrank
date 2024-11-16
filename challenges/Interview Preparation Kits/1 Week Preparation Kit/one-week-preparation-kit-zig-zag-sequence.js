function processData(input) {
    console.log(
        input
            .sort()
            .slice(0, input.length % 2 === 0 ? (input.length - 1) / 2 : input.length / 2 - 1 + 1)
            .concat(
                input
                    .sort()
                    .slice(input.length % 2 === 0 ? (input.length - 1) / 2 : input.length / 2 - 1 + 1)
                    .reverse()
            )
            .join(" ")
            .trim()
    );
}

process.stdin.resume();
process.stdin.setEncoding("ascii");
_input = "";
process.stdin.on("data", function (input) {
    _input = input.split("\n");
});

process.stdin.on("end", function () {
    for (let i = 0; i < parseInt(_input[0].trim(), 10); i += 2)
        processData(
            _input[i + 2]
                .replace(/\s+$/g, "")
                .split(" ")
                .map((arrTemp) => parseInt(arrTemp, 10))
        );
});
