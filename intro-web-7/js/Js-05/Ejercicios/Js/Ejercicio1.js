// Exercise #1
// You have a list of names: var names = ["Maria", "Antony", "Joy", "Juan"]
var names = ["Maria", "Anthony", "Joy", "Juan"];
console.log(names);

// Part 1
// Write a function to insert a name to the end of the list. Add your own name to the end of the list.
names.push ("Carlos");
console.log(names);

// Part 2
// Write a function that takes in a name and checks if the list has that name. It should return back a boolean - true/false.
var indice = names.indexOf("Carlos");
if(indice !== -1){
    console.log("Verdadero")
}else{
    console.log("Falso")
}

// Part 3
// Write a function that takes in a list of names. This function should compare the list taken into the names list you currently have. The function should pass back an array with the names that are in both lists.


// Part 4
// Write a function that takes in a list of names and returns a list of Integers with the length of the names in the same order as received. Hint use the push function
for(let i = 0; i < names.length; i++){
    console.log(names[i].length)
}
