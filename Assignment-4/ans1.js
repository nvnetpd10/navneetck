// 1
const add = (a, b) => a + b;

// 2
const greet = (name, message = "Welcome!") => `${message} ${name}`;

// 3
const formatString = (name, age) =>
  `Hello, my name is ${name} and I am ${age} years old.`;

// 4
const person = {
  name: "Alice",
  age: 25,
  address: {
    city: "New York",
    country: "NY",
  },
};

const showInfo = ({ name, address: { city } }) => {
  console.log(`${name} lives in ${city}.`);
  console.log(person.address);
};

showInfo(person);

// 5
let numbers = [10, 20, 30, 40, 50];
let [first, second, ...rest] = numbers;
console.log(first);
console.log(second);
console.log(rest);

// 6
function filterEvens(...numbers) {
  return numbers.filter((num) => num % 2 === 0);
}

let result = filterEvens(10, 15, 20, 25, 30, 35, 40);
console.log(result);

// 7
function doubleValues(numbers) {
  return numbers.map((num) => num * 2);
}

let results = doubleValues([1, 2, 3]);
console.log(results);

// 8
function findMax(numbers) {
  let max = numbers[0];
  for (let num of [...numbers]) {
    if (num > max) {
      max = num;
    }
  }
  return max;
}

let resultt = findMax([10, 25, 7, 50, 32]);
console.log(resultt);

// 8
const data = [
  { name: "Bob", age: 24 },
  { name: "Alice", age: 21 },
];

function createSentence(data) {
  let { name } = data[1];
  let { age } = data[0];
  return `${name}'s age is ${age}.`;
}

console.log(createSentence(data));

// 9
const dataa = [
  {
    id: 1,
    title: "Fjallraven - Foldsack No. 1 Backpack, Fits 15 Laptops",
    price: 109.95,
    description:
      "Your perfect pack for everyday use and walks in the forest. Stash your laptop (up to 15 inches) in the padded sleeve, your everyday",
    category: "men's clothing",
    image: "https://fakestoreapi.com/img/81fPKd-2AYL._AC_SL1500_.jpg",
    rating: {
      rate: 3.9,
      count: 120,
    },
  },
];

function selectKeys(arr) {
  return arr.map(({ id, title, rating: { rate, count } }) => ({
    id,
    title,
    rate,
    count,
  }));
}

console.log(selectKeys(dataa));

// 10
function deepClone(obj) {
  return JSON.parse(JSON.stringify(obj));
}

const obj = { a: 1, b: { c: 2 } };
const clonedObj = deepClone(obj);

clonedObj.b.c = 42;

console.log(obj.b.c);

// 11
function flattenArray(arr) {
  return arr.reduce(
    (flat, item) =>
      Array.isArray(item) ? flat.concat(flattenArray(item)) : flat.concat(item),
    []
  );
}

const nested = [1, [2, [3, 4], 5], [6, 7]];
const resultts = flattenArray(nested);
console.log(resultts); // [1, 2, 3, 4, 5, 6, 7]
