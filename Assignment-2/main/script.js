var students = [];
window.onload = function () {
  var savedData = localStorage.getItem("studentsData");
  if (savedData) {
    students = JSON.parse(savedData);
    renderTable();
  }
};
document.getElementById("addStudentBtn").addEventListener("click", function () {
  addStudent();
});
function addStudent() {
  var name = prompt("Enter student name:");
  if (!name || name.trim() === "") {
    alert("Name cannot be empty!");
    return;
  }
  var marks = [];
  for (var i = 1; i <= 5; i++) {
    var mark = prompt("Enter marks for subject " + i + " (0-100):");
    if (mark === null || mark.trim() === "" || isNaN(mark)) {
      alert("Invalid input! Marks must be a number between 0 and 100.");
      return;
    }
    mark = parseFloat(mark);
    if (mark < 0 || mark > 100) {
      alert("Marks must be between 0 and 100.");
      return;
    }

    marks.push(mark);
  }

  var total = calculateTotal(marks);
  var average = calculateAverage(total, marks.length);

  var student = {
    name: name,
    marks: marks,
    total: total,
    average: average,
  };

  students.push(student);

  localStorage.setItem("studentsData", JSON.stringify(students));

  renderTable();
}

function calculateTotal(marks) {
  var sum = 0;
  for (var i = 0; i < marks.length; i++) {
    sum += marks[i];
  }
  return sum;
}

function calculateAverage(total, count) {
  return (total / count).toFixed(2);
}

const renderTable = () => {
  var tbody = document.querySelector("#studentTable tbody");
  tbody.innerHTML = "";

  for (var i = 0; i < students.length; i++) {
    var s = students[i];
    var row = document.createElement("tr");

    // Name
    var tdName = document.createElement("td");
    tdName.textContent = s.name;
    row.appendChild(tdName);

    // Marks
    for (var j = 0; j < s.marks.length; j++) {
      var tdMark = document.createElement("td");
      tdMark.textContent = s.marks[j];
      row.appendChild(tdMark);
    }

    // Total
    var tdTotal = document.createElement("td");
    tdTotal.textContent = s.total;
    row.appendChild(tdTotal);

    // Average
    var tdAvg = document.createElement("td");
    tdAvg.textContent = s.average;
    row.appendChild(tdAvg);

    tbody.appendChild(row);
  }
};
