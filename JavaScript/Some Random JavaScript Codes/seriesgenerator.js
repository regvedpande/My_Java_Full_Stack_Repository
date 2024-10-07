function fibonacciGenerator(n) {
    var fibSequence = [];
    if (n === 1) {
        fibSequence.push(0);
    } else if (n === 2) {
        fibSequence = [0, 1];
    } else {
        fibSequence = [0, 1];
        for (var i = 2; i < n; i++) {
            fibSequence.push(fibSequence[i - 1] + fibSequence[i - 2]);
        }
    }
    return fibSequence;
}

var n = 10; // Change n to generate different lengths of Fibonacci sequence
console.log("Fibonacci sequence of length", n, ":", fibonacciGenerator(n));
