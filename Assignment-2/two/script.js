const box = document.getElementById("colorBox");
box.addEventListener("mouseover", function () {
  box.style.backgroundColor = "orange";
});
box.addEventListener("mouseout", function () {
  box.style.backgroundColor = "lightblue";
});
