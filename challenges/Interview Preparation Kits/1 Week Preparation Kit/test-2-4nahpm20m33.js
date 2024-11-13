/*
 * Complete the 'flippingMatrix' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts 2D_INTEGER_ARRAY matrix as parameter.
 */
function flippingMatrix(matrix) {
    // Write your code here
    /*
        0 1 ... l-2 l-1
        1
        .
        .
        .
        l-2
        l-1 ...

        [0,0] [0, l-1] [l-1,0] [l-1,l-1]
        [0,1] [0, l-2] [l-1,1] [l-1,l-2]
        [1,0] [1, l-1] [l-2,0] [l-2,l-1]
        [1,1] [1, l-2] [l-2,1] [l-2,l-2]

        [a,b] [a,l-1-b] [l-1-a,b] [l-1-a,l-1-b]
    */
    let sum = 0;
    let l = matrix.length;
    for (let a = 0; a < l / 2; a++) {
        for (let b = 0; b < l / 2; b++) {
            sum += Math.max(matrix[a][b], matrix[a][l - 1 - b], matrix[l - 1 - a][b], matrix[l - 1 - a][l - 1 - b]);
        }
    }
    return sum;
}
