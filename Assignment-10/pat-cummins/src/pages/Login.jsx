import { Navigate, useNavigate } from "react-router-dom";
import { login, isLoggedIn } from "../utils/auth";

const Login = () => {
  const navigate = useNavigate();

  if (isLoggedIn()) return <Navigate to="/dashboard/counter" replace />;

  return (
    <div style={{ padding: 40 }}>
      <h2>Login Page</h2>
      <button
        onClick={() => {
          login();
          navigate("/dashboard/counter");
        }}
      >
        Login
      </button>
    </div>
  );
};

export default Login;
