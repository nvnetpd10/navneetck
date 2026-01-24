import { Navigate, NavLink, Outlet } from "react-router-dom";
import { isLoggedIn, logout } from "../utils/auth";

const ProtectedLayout = () => {
  if (!isLoggedIn()) return <Navigate to="/login" replace />;

  return (
    <div style={{ padding: 20 }}>
      <nav style={{ display: "flex", gap: 20, marginBottom: 20 }}>
        <NavLink to="/dashboard/counter">Counter</NavLink>
        <NavLink to="/dashboard/watch">Digital Watch</NavLink>

        <button
          onClick={() => {
            logout();
            window.location.href = "/login";
          }}
        >
          Logout
        </button>
      </nav>

      <Outlet />
    </div>
  );
};

export default ProtectedLayout;
