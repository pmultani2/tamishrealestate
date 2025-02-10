const searchBar = document.getElementById("search-input");
searchBar.addEventListener("keyup", event => {
  if (event.key === "Enter") {
    window.location.href = "/search/" + searchBar.value
    event.preventDefault();
  }
});
