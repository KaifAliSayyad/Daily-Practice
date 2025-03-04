console.log("Promises");

let s1 = "Wissen"
let s2 = "Technology"

var promise = new Promise(
			function(success, failure){
				if((s1 + s2) === "WissenTechnology") success("Employee Object");
				else failure();
		});

promise.then((val)=>{
		console.log("Tax deducted for Employee : ["+val+"]");
		return val;
		
	},
	()=>{
		console.log("Failure!!");
		throw new Error(" 'o' missing in Tehcnology");
	}
	).then((val)=>{
		console.log("Tax deducted for Employee : ["+val+"]");
		
	},
	()=>{
		console.log("Failure!!");
		throw new Error(" 'o' missing in Tehcnology");
	}
	).catch((err) =>{
		console.log("Error handling done here.....");
		console.log(err);	
	}).finally(()=>{
		console.log("Finally block");
	});

//state - fullfilled/ resolved, rejected, pending, settled
//value - data returned by the resolver/ rejecter function

//Promise.add(promise1, promise2, promise3)
//Promise.allSettled(promise1, promise2, promise3)
//Promise.race(promise1, promise2, promise3);
//etc.