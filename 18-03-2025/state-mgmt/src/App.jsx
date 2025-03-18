import { useState } from 'react';
import './App.css';
import Menu from './components/Menu';
import { countCtx } from './state/Context';

function App() {

    const [count, setCount] = useState(0);

  return (
    <div className="App">
      <countCtx.Provider value={{count, setCount}}>
        <h1>State Management</h1>
        <Menu count={count} />
      </countCtx.Provider>
    </div>
  )
}

export default App
