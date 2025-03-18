import Greet from "./Greet";
import JsxDemo from "./JsxDemo";
import Counter from "./Counter";
import Welcome from "./Welcome";
import UseEffect from "./UseEffect";

function App() {
  return (
    <div className="App">
      <h1> Hello from App Component!</h1>
      <JsxDemo />
      <Greet day="Afternoon" name="Kaif" />
      <Counter />
      <Welcome />
      <UseEffect />
    </div>
  );
}

export default App;
