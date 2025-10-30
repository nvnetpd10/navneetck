document
  .getElementById("userForm")
  .addEventListener("submit", function (event) {
    event.preventDefault();
    const name = document.getElementById("name").value.trim();
    const age = parseInt(document.getElementById("age").value);
    const message = document.getElementById("message");

    if (name === "") {
      message.textContent = "Please enter your name.";
      message.style.color = "red";
    } else if (isNaN(age) || age < 18) {
      message.textContent = "You must be at least 18 years old.";
      message.style.color = "red";
    } else {
      message.textContent = "Form submitted successfully!";
      message.style.color = "green";
    }
  });
