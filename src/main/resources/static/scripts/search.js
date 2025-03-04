const searchBar = document.getElementById("search-input");
const searchButton = document.getElementById("search-button");
searchBar.addEventListener("keyup", event => {
  if (event.key === "Enter") {
    let query = searchBar.value.trim();
    if (query.length > 0) {
      window.location.href = "/search/" + query.replaceAll(" ", "-");
    } else {
      window.location.href = "/search"
    }
    event.preventDefault();
  }
});
searchButton.addEventListener("click", event => {
  let query = searchBar.value.trim();
  if (query.length > 0) {
    window.location.href = "/search/" + query.replaceAll(" ", "-");
  } else {
    window.location.href = "/search"
  }
  event.preventDefault();
});
