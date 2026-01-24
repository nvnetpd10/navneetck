import { useEffect, useState } from "react";
import { getUsers, createUser, updateUser, deleteUser } from "./api";

function App() {
  const [list, setList] = useState([]);
  const [name, setName] = useState("");
  const [editingId, setEditingId] = useState(null);

  useEffect(() => {
    loadUsers();
  }, []);

  async function loadUsers() {
    try {
      const data = await getUsers();
      setList(data);
    } catch (e) {
      console.log("API Error:", e);
    }
  }

  async function handleSave() {
    if (!name.trim()) return;

    if (editingId) {
      await updateUser(editingId, { name });
      setEditingId(null);
    } else {
      await createUser({ name });
    }

    setName("");
    loadUsers();
  }

  async function handleDelete(id) {
    await deleteUser(id);
    loadUsers();
  }

  function handleEdit(user) {
    setEditingId(user.id);
    setName(user.name);
  }

  return (
    <div style={{ padding: 30, fontFamily: "Arial" }}>
      <h1>User CRUD App</h1>

      {/* INPUT FIELD */}
      <input
        placeholder="Enter User Name"
        value={name}
        onChange={(e) => setName(e.target.value)}
        style={{ padding: "10px", width: "200px" }}
      />

      <button
        onClick={handleSave}
        style={{
          padding: "10px 15px",
          marginLeft: 10,
          background: "black",
          color: "white",
          border: "none",
          cursor: "pointer",
        }}
      >
        {editingId ? "Update" : "Add"}
      </button>

      {/* USER LIST */}
      <div style={{ marginTop: "30px" }}>
        <h2>User List</h2>

        {list.length === 0 && <p>No users found.</p>}

        {list.map((user) => (
          <div
            key={user.id}
            style={{
              padding: "10px",
              borderBottom: "1px solid #ccc",
              display: "flex",
              justifyContent: "space-between",
              width: "350px",
            }}
          >
            <span>{user.name}</span>

            <div>
              <button
                onClick={() => handleEdit(user)}
                style={{ marginRight: 10 }}
              >
                Edit
              </button>

              <button
                onClick={() => handleDelete(user.id)}
                style={{ background: "red", color: "white" }}
              >
                Delete
              </button>
            </div>
          </div>
        ))}
      </div>
    </div>
  );
}

export default App;
