// Exercise #2
// Write a JavaScript program to construct the following pattern, using a nested for loop.


// – Repeatedly print the value of the variable xValue, decreasing it by 0.5 each time,
// as long as xValue remains positive.
// - Print all the odd numbers between 1 - 100.
// - Write a method with a while loop to print 1 through n in square brackets. 
// For example, if n = 6 print [1] [2] [3] [4] [5] [6]
// - Write a method with a while loop that computes the sum of first n positive integers: 
// sum = 1 + 2 + 3 + … + n
// Examples:
// n = 5 sum = 15
// n = 19 sum = 190

var names2 = ["Maria", "Leticia", "Joy", "Hugo"];
console.log(names2);
var iguales = 0;
for (let i = 0; i < names.length; i++) {
    for (let j = 0; j < names2.length; j++) {
        if (names[i] == names2[j]) {
            iguales++;
            console.log(names2[j]);
        }

    }
}