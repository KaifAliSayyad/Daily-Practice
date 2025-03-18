import { useState } from "react";
import { Route, Routes } from "react-router-dom"
import Header from "./components/Header"
import Footer from "./components/Footer"
import Home from "./screens/Home"
import About from "./screens/About"
import Contact from "./screens/Contact"
import Services from "./screens/Services"
import Netbanking from "./screens/Netbanking"
import Welcome from "./screens/Welcome";

function App() {

  const [isLoggedIn, setIsLoggedIn] = useState(false);

  const handleLogin = () => {
    setIsLoggedIn(true);
  }

  return (
    <div className="App">
      <div className="header">
        <Header />
      </div>
      <div className="body">
        <Routes>
          {isLoggedIn ?
            <>
              <Route path="/welcome" element={<Welcome />} />
              <Route path="/" element={<Home />} />
              <Route path="/about" element={<About />} />
              <Route path="/contact" element={<Contact />} />
              <Route path="/services" element={<Services />} />
              <Route path="/netbanking" element={<Netbanking handleLogin={handleLogin} />} />
            </>
            :
            <>
              <Route path="/" element={<Home />} />
              <Route path="/about" element={<About />} />
              <Route path="/contact" element={<Contact />} />
              <Route path="/services" element={<Services />} />
              <Route path="/netbanking" element={<Netbanking handleLogin={handleLogin} />} />
            </>
          }
        </Routes>
      </div>
      <div className="footer">
        <Footer />
      </div>
    </div>
  )
}

export default App
