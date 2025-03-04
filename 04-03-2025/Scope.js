function abc(){
	{
		a = 10;
		var b = 20;
		let c = 30;
		console.log("From inner abc() - c : "+c);
	}
	console.log("From abc() - a : "+a);
	console.log("From abc() - b : "+b);
	//console.log("From abc() - c : "+c);

}

abc();

console.log("From outside abc() - a : "+a);
//console.log("From outside abc() - b : "+b);
//console.log("From outside abc() - c : "+c);
