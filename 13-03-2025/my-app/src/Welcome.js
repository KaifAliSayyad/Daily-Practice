import { useState, useRef } from "react";

export default function Welcome(){

    const [name, setName] = useState("Kaif");
    const refElement = useRef("");

    function clearField(){
        refElement.current.value = "";
        setName("");
        refElement.current.focus();
        
    }

    return(
        <div>
            <hr></hr>
            <h2>Welcome! {name}</h2>
            <input ref={refElement} type="text" value={name} onChange={(e) => setName(e.target.value)} />
            <button onClick={clearField}>Clear</button>
        </div>
    )
}