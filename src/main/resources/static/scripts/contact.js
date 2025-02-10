const form = document.querySelector("form");
const submitButton = document.getElementById("submit-btn");

form.onsubmit = event => {
  event.preventDefault();
  const data = new URLSearchParams(new FormData(form));
  submitForm(data); 
};

async function submitForm(data) {
  try {
    const response = await fetch("https://tamish-server.onrender.com/email", {
    method: "POST",
    body: data
    });
    const result = await response.json();
  } catch (error) {
    if (error.name === "SyntaxError") {
      form.innerHTML = "<p>Thank you!</p>";
    }
  }
};