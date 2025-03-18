import React from "react";
import { countCtx } from "../state/Context";

function CompB() {

    const obj = React.useContext(countCtx)

    return(
        <>
        <hr></hr>
            <h2>From Copmonent B : {obj.count}</h2>
        </>
    )
}

export default CompB;