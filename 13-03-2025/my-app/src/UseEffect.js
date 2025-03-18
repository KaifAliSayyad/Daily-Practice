import { useEffect, useState } from "react";

export default function CustomHook() {
    const [count, setCount] = useState(0);
    
    useEffect(() => {
        console.log("This runs when component is mounted and when any state is changed..");
    });

    useEffect(() => {
        console.log("This runs when component is mounted..");
    }, []);
    
    useEffect(() => {
        console.log("This runs when count is changed..");
    }, [count]);


    return (
        <div>
            <hr></hr>
            <h1>UseEffect Hook Demo</h1>
            <h2>{count}</h2>
            <button onClick={() => setCount(count + 1)}>Increment</button>
        </div>
    );

}