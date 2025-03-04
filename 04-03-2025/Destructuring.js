let emp = {"name" : "Prakash", "age": 35, "salary" : 60000, "designation" : "Programmer"}
let emp2 = ["Suman", 34, 65000, "Programmer"]

let {name, age, salary, designation="Tester"} = emp
let [a_name, a_age, a_salary, a_designation="Tester"] = emp2

console.log("Name : "+name);
console.log("Age  : "+age);
console.log("Salary : "+salary);
console.log("Designation : "+designation);


console.log("Name : "+a_name);
console.log("Age  : "+a_age);
console.log("Salary : "+a_salary);
console.log("Designation : "+a_designation);


let arr1 = [1, 2, 3];
let arr2 = [4, 5, 6, 7];
let arr3 = [8, 9, 10]

let arr = [arr1, arr2, arr3]

let arr_f = [...arr1, arr2, ...arr3]

console.log(arr);
console.log(arr_f);