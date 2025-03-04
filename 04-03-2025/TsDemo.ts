class Person{
	name: string;
		
	constructor(name){
		console.log("Start of constructor");
		this.name = name;
		setTimeout(()=>{
			console.log("From within the constructor :"+this.name);
		},5000);
	}
}

new Person("Ramesh");
console.log("This statement is not waiting for anyone");

console.log("------------------------------------------------------------------------");

console.log("Closure in js");

var increment = function inc(){
	var a = 0;
	var plus = function(){
		a = a + 1;
		console.log(a);
	}

	return plus;
}();

increment();
increment();
increment();
increment();

console.log("------------------------------------------------------------------------");
