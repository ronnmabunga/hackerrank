/*
 * Complete the 'findMedian' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts INTEGER_ARRAY arr as parameter.
 */
function findMedian(arr) {
    // Write your code here
    arr.sort((a, b) => a - b);
    if (arr.length % 2 === 0) {
        return (arr[arr.length / 2 - 1] + arr[arr.length / 2]) / 2;
    } else {
        return arr[(arr.length - 1) / 2];
    }
}
