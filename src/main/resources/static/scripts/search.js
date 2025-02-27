const searchBar = document.getElementById("search-input");
searchBar.addEventListener("keyup", event => {
  if (event.key === "Enter") {
    let query = searchBar.value;
    window.location.href = "/search/" + query.replaceAll(" ", "-")
    event.preventDefault();
  }
});
