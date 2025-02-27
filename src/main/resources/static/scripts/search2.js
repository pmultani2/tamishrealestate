const searchInput = document.getElementById("search-input");
const query = window.location.pathname.split("/").pop()
searchInput.value = query === "search" ? "" : query.replaceAll("-", " ");