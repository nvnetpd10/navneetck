const API = "http://localhost:8080/api/users";

export async function getUsers() {
  return fetch(API).then((res) => res.json());
}

export async function createUser(user) {
  return fetch(API, {
    method: "POST",
    headers: { "Content-Type": "application/json" },
    body: JSON.stringify(user),
  });
}

export async function updateUser(id, user) {
  return fetch(`${API}/${id}`, {
    method: "PUT",
    headers: { "Content-Type": "application/json" },
    body: JSON.stringify(user),
  });
}

export async function deleteUser(id) {
  return fetch(`${API}/${id}`, {
    method: "DELETE",
  });
}
