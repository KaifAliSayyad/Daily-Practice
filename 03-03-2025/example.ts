class Emp{
	name: string
	age: number

	constructor(name:string, age:number){
		this.name = name;
		this.age = age;
	}

	display(){
		console.log("Name : "+this.name);
		console.log("Age  : "+this.age);
	}
}

class Clerk extends Emp{
	salary;
	designation;
	constructor(name, age, salary, designation){
		super(name, age);
		this.salary = salary;
		this.designation = designation;
	}

	displayAll(){
		this.display();
		console.log("Salary	: "+this.salary);
		console.log("Designation: "+this.designation);
	}
}

var c1 = new Clerk("Raju", 25, 25000, "TESTER");

c1.displayAll();

console.log("-------------------------------------------------------------------");

interface Car{
	speed:number;
	accelerate():void;
	brake(): void;
}

class Hatchback implements Car{
	speed:number = 0;
	accelerate(): void{
		console.log("Accelerator : "+ ++this.speed);
	}

	brake(): void{
		console.log("Brake : "+ --this.speed);
	}
}

let h1 = new Hatchback();
h1.accelerate();
h1.accelerate();
h1.accelerate();
h1.brake();

interface CarProperties{
	company: string;
	model: string;
	price: number;
	gear? : boolean;
}

var m1 = {"company": "Maruti", "model": "Brezza", "price": 1825000, "gear": true};
var t1 = {"company": "Tata", "model": "Nexon", "price": 202500};
var m2 = {"company": "Maruti", "model": "M&M", "price": 1825000};

console.log(m1);
console.log(t1);
console.log(m2);

console.log("-------------------------------------------------------------------");
let arr1:string[] = ["Hi", "Hello", "How are you", "Thanks", "Bye"];
let arr2:Array<String> = ["Hi", "Hello", "How are you", "Thanks", "Bye"];
arr1.push("Just for Demo");
console.log(arr1);
console.log(arr2);