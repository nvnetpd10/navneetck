import { Routes, Route } from "react-router-dom";
import Login from "./pages/Login";
import Counter from "./pages/Counter";
import DigitalWatch from "./pages/DigitalWatch";
import NotFound from "./pages/NotFound";
import ProtectedLayout from "./layout/ProtectedLayout";

function App() {
  return (
    <Routes>
      <Route path="/login" element={<Login />} />

      <Route path="/dashboard" element={<ProtectedLayout />}>
        <Route path="counter" element={<Counter />} />
        <Route path="watch" element={<DigitalWatch />} />
      </Route>

      <Route path="/" element={<Login />} />

      <Route path="*" element={<NotFound />} />
    </Routes>
  );
}

export default App;
