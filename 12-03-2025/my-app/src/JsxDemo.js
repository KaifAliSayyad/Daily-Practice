function JsxDemo() {
    const a = 30;
    const b = 20;
    return (
        <div>
            <h1>JsxDemo</h1>
            {
                (a>b) ? <h2> {a} is greater than {b}</h2> : <h2> Sum of {a} and {b} is {a+b}</h2>
            }
        </div>
    );
}

export default JsxDemo;