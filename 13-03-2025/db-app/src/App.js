import './App.css';
import GetEmployees from './GetEmployees';
import AddEmployee from './AddEmployee';

function App() {

  

  return (
    <div className="App">
      <header>Employee Management Application</header>
      <AddEmployee />
      <GetEmployees />
    </div>
  );
}

export default App;
