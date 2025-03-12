import { useState } from "react";

export default function Counter(){
    const [count, setCount] = useState(0);

    function increment(){
        setCount(count + 1);
    }

    function decrement(){
        setCount(count - 1);
    }

    function zero(){
        setCount(0);
    }

    return(
        <div>
            <h1>Counter</h1>
            <h2>{count}</h2>
            <button onClick={increment}>Increment</button>
            <button onClick={decrement}>Decrement</button>
            <button onClick={zero}>Zero</button>
        </div>
    )
}
