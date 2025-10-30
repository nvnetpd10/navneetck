let arr = [10, 20, 30, 40, 50];
let reversed = [];

for (let i = arr.length - 1; i >= 0; i--) {
  reversed.push(arr[i]);
}

console.log("Original:", arr);
console.log("Reversed:", reversed);
