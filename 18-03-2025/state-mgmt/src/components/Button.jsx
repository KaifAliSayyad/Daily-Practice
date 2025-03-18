import React from "react";
import CompA  from "./CompA";
import CompB from "./CompB";
import { countCtx } from "../state/Context";
import { useContext } from "react";

function Button ({count}) {

    const obj = useContext(countCtx);

    const incr = () => {
        obj.setCount(obj.count + 1);
    }

    return (
        <div>
            <h2>Clickable Button : {obj.count}</h2>
            <button onClick={incr}>Click Here : {obj.count}</button>
            <CompA count={count}/>
            <CompB />
        </div>
    )
}

export default Button;