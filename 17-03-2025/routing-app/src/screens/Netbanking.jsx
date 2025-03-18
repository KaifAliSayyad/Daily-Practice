import { useNavigate } from "react-router-dom";

const Netbanking = ({handleLogin}) => {

  const navigate = useNavigate();

  const handleSubmit = (e) => {
    e.preventDefault();
    const username = e.target.username.value;
    const password = e.target.password.value;
    
    if(username === "admin" && password === "admin"){
      console.info("Login Successfull");
      handleLogin(true);
      navigate('/welcome');
    }else{
      alert("Login Failed");
    }
  };

  return (
    <div>
      <h2>Net Banking Portal</h2>
      <div className="login-section">
        <h3>Login to Your Account</h3>
        <form className="login-form" onSubmit={(e) => handleSubmit(e)}>
          <div>
            <label htmlFor="username">Username:</label>
            <input type="text" id="username" name="username" />
          </div>
          
          <div>
            <label htmlFor="password">Password:</label>
            <input type="password" id="password" name="password" />
          </div>
          
          <button type="submit">Login</button>
        </form>
        
        <div className="help-links">
          <a href="#">Forgot Username?</a>
          <a href="#">Forgot Password?</a>
          <a href="#">Signup</a>
        </div>
      </div>
    </div>
  );
};

export default Netbanking;