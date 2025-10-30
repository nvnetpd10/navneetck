let numbers = [10, 20, 30, 20, 40, 20];
console.log("Before:", numbers);

let updatedNumbers = numbers.map((num) => (num === 20 ? 99 : num));

console.log("After:", updatedNumbers);
