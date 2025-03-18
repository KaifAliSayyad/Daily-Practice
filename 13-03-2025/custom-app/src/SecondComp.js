import React from 'react';
import useCount from './useCounter';

export default function FirstComp() {

    const [cnt, inc, dec] = useCount(20);

    return (
    <div>
        <h2>Second Component</h2>
        <span>Count : {cnt}</span>
        <br></br><br></br>
        <button onClick={() => inc()}>Increment</button>
        <button onClick={() => dec()}>Decrement</button>
    </div>
  )
}
