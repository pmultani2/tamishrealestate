// DOM Elements
const resultsGrid = document.getElementById("results-grid");
const loader = document.getElementById("loader");
const searchInput = document.getElementById("search-input");
const loadMoreBtn = document.getElementById("load-more-btn");
const saleInputs = document.querySelectorAll("input[name='sale-type']");
const collectionInputs = document.querySelectorAll("input[name='collection']");
const bedInputs = document.querySelectorAll("input[name='beds']");
const bathInputs = document.querySelectorAll("input[name='baths']");
const minPriceSelect = document.getElementById("min-price");
const maxPriceSelect = document.getElementById("max-price");

// URL
let url = "localhost/search";
const urlSearchParams = new URLSearchParams(location.search);
const searchKeys = ["collection", "limit", "page", "q"];
let collection = "residential";
let limit = 10;
let page = 1;
let query = "";
let beds = 0;
let baths = 0;
let saleType = "Sale";
let minPrice = 0;
let maxPrice = 50000000;

if (urlSearchParams.has("collection") && urlSearchParams.has("limit") && urlSearchParams.has("page") && urlSearchParams.has("q")) {
  collection = urlSearchParams.get("collection");
  limit = urlSearchParams.get("limit");
  page = urlSearchParams.get("page");
  query = urlSearchParams.get("q");
}

// Manage radio buttons
document.getElementById(`${saleType}`).checked = true;
for (const saleInput of saleInputs) {
  saleInput.addEventListener("change", () => {
    resultsGrid.innerHTML = "";
    page = 1;
    saleType = saleInput.value;

    minPriceSelect.innerHTML = "";
    maxPriceSelect.innerHTML = "";
    if (saleType === "Sale") {
      for (let i = 0; i < buyMinPrices.length; i ++) {
        const newOption = document.createElement("option");
        newOption.innerText = "$" + buyMinPrices[i].toLocaleString();
        newOption.value = buyMinPrices[i];
        minPriceSelect.appendChild(newOption);
      }
      minPriceSelect.firstElementChild.setAttribute("selected", "selected");

      for (let i = buyMaxPrices.length-1; i >= 0; i --) {
        const newOption = document.createElement("option");
        newOption.innerText = "$" + buyMaxPrices[i].toLocaleString();
        newOption.value = buyMaxPrices[i];
        maxPriceSelect.appendChild(newOption);
      }
      maxPriceSelect.firstElementChild.setAttribute("selected", "selected");
    } else if (saleType === "Lease") {
      for (let i = 0; i < rentMinPrices.length; i ++) {
        const newOption = document.createElement("option");
        newOption.innerText = "$" + rentMinPrices[i].toLocaleString();
        newOption.value = rentMinPrices[i];
        minPriceSelect.appendChild(newOption);
      }
      minPriceSelect.firstElementChild.setAttribute("selected", "selected");

      for (let i = rentMaxPrices.length-1; i >= 0; i --) {
        const newOption = document.createElement("option");
        newOption.innerText = "$" + rentMaxPrices[i].toLocaleString();
        newOption.value = rentMaxPrices[i];
        maxPriceSelect.appendChild(newOption);
      }
      maxPriceSelect.firstElementChild.setAttribute("selected", "selected");
    }

    getData(url, collection, limit, page, query, beds, baths, saleType, minPrice, maxPrice);
  });
}

document.getElementById(`${collection}`).checked = true;
for (const collectionInput of collectionInputs) {
  collectionInput.addEventListener("change", () => {
    resultsGrid.innerHTML = "";
    page = 1;
    collection = collectionInput.value;

    getData(url, collection, limit, page, query, beds, baths, saleType, minPrice, maxPrice);
  });
}

document.getElementById(`${beds}-beds`).checked = true;
for (const bedInput of bedInputs) {
  bedInput.addEventListener("change", () => {
    resultsGrid.innerHTML = "";
    page = 1;
    beds = bedInput.value;

    getData(url, collection, limit, page, query, beds, baths, saleType, minPrice, maxPrice);
  });
}

document.getElementById(`${baths}-baths`).checked = true;
for (const bathInput of bathInputs) {
  bathInput.addEventListener("change", () => {
    resultsGrid.innerHTML = "";
    page = 1;
    baths = bathInput.value;

    getData(url, collection, limit, page, query, beds, baths, saleType, minPrice, maxPrice);
  });
}

// Manage price input
const buyMinPrices = [300000, 400000, 500000, 600000, 700000, 800000, 900000, 1000000, 1250000, 1500000, 1750000, 2000000, 2500000, 3000000, 4000000, 5000000, 6000000, 7000000, 8000000, 10000000, 12000000, 15000000];
const buyMaxPrices = [300000, 400000, 500000, 600000, 700000, 800000, 900000, 1000000, 1250000, 1500000, 1750000, 2000000, 2500000, 3000000, 4000000, 5000000, 6000000, 7000000, 8000000, 10000000, 12000000, 15000000, 20000000, 30000000, 40000000, 50000000];

const rentMinPrices = [500, 750, 1000, 1250, 1500, 1750, 2000, 2500, 3000, 3500, 4000, 4500, 5000, 6000, 7000, 8000, 9000, 10000, 15000];
const rentMaxPrices = [1000, 1250, 1500, 1750, 2000, 2500, 3000, 3500, 4000, 4500, 5000, 6000, 7000, 8000, 9000, 10000, 12000, 15000, 20000];

if (saleType === "Sale") {
  for (let i = 0; i < buyMinPrices.length; i ++) {
    const newOption = document.createElement("option");
    newOption.innerText = "$" + buyMinPrices[i].toLocaleString();
    newOption.value = buyMinPrices[i];
    minPriceSelect.appendChild(newOption);
  }
  minPriceSelect.firstElementChild.setAttribute("selected", "selected");

  for (let i = buyMaxPrices.length-1; i >= 0; i --) {
    const newOption = document.createElement("option");
    newOption.innerText = "$" + buyMaxPrices[i].toLocaleString();
    newOption.value = buyMaxPrices[i];
    maxPriceSelect.appendChild(newOption);
  }
  maxPriceSelect.firstElementChild.setAttribute("selected", "selected");
} else if (saleType === "Lease") {
  for (let i = 0; i < rentMinPrices.length; i ++) {
    const newOption = document.createElement("option");
    newOption.innerText = "$" + rentMinPrices[i].toLocaleString();
    newOption.value = rentMinPrices[i];
    minPriceSelect.appendChild(newOption);
  }
  minPriceSelect.firstElementChild.setAttribute("selected", "selected");

  for (let i = rentMaxPrices.length-1; i >= 0; i --) {
    const newOption = document.createElement("option");
    newOption.innerText = "$" + rentMaxPrices[i].toLocaleString();
    newOption.value = rentMaxPrices[i];
    maxPriceSelect.appendChild(newOption);
  }
  maxPriceSelect.firstElementChild.setAttribute("selected", "selected");
}

minPriceSelect.onchange = function() {
  resultsGrid.innerHTML = "";
    page = 1;
    minPrice = minPriceSelect.value;

    getData(url, collection, limit, page, query, beds, baths, saleType, minPrice, maxPrice);
};

maxPriceSelect.onchange = function() {
  resultsGrid.innerHTML = "";
    page = 1;
    maxPrice = maxPriceSelect.value;

    getData(url, collection, limit, page, query, beds, baths, saleType, minPrice, maxPrice);
};

getData(url, collection, limit, page, query, beds, baths, saleType, minPrice, maxPrice);

// Manage searchbox
searchInput.onsearch = function() {
  if (searchInput.value.length > 0) {
    resultsGrid.innerHTML = "";
    page = 1;
    query = searchInput.value;

    getData(url, collection, limit, page, query, beds, baths, saleType, minPrice, maxPrice);
  }
};

async function getData(url, collection, limit, page, query, beds, baths, saleType, minPrice, maxPrice) {
  try {
    loadMoreBtn.style.display = "none";

    const response = await fetch(url + `/${collection}?limit=${limit}&page=${page}&q=${query}&beds=${beds}&baths=${baths}&saletype=${saleType}&minprice=${minPrice}&maxprice=${maxPrice}`);
    const data = await response.json();
    console.log(data);

    createResults(data.listings);

    if (resultsGrid.childElementCount >= data.count || resultsGrid.childElementCount >= 100) {
      loadMoreBtn.style.display = "none";
    } else {
      loadMoreBtn.style.display = "initial";
    }
  } catch(err) {
    console.log(err);
    resultsGrid.parentElement.innerHTML = "<h1 class='bold' style='font-size:64px; text-align: center;'>Something went wrong</h1>";
  }
}

function createResults(data) {
  for (let i = 0; i < data.length; i ++) {
    const listing = data[i].Listing
    const result = document.createElement("a");
    result.className = "result";
    result.href = `property.html?collection=${collection}&id=${data[i]._id}`;

    const image = document.createElement("img");
    image.className = "property-img";
    image.src = "https://www.salonlfc.com/wp-content/uploads/2018/01/image-not-found-1-scaled.png";
    result.appendChild(image);

    const address = document.createElement("p");
    address.className = "property-address";
    address.innerText = listing.Address;
    result.appendChild(address);

    const bedBath = document.createElement("p")
    bedBath.className = "property-bed-bath";
    if (listing.Bedrooms !== "null") {
      bedBath.innerText = listing.Bedrooms + " BD";
    }
    if (listing.Washrooms !== "null") {
      bedBath.innerText += " | " + listing.Washrooms + " BA";
    }
    result.appendChild(bedBath);

    const price = document.createElement("p");
    price.className = "property-price";
    price.innerText = "$" + parseInt(listing.ListPrice).toLocaleString();
    if (listing.SaleLease === "Lease") {
      price.innerText += " per month"
    }
    result.appendChild(price);

    const brokerage = document.createElement("p");
    brokerage.className = "property-brokerage";
    brokerage.innerText = "Listing courtesy of " + listing.ListBrokerage;
    result.appendChild(brokerage);

    resultsGrid.appendChild(result);
  }
}

loadMoreBtn.onclick = async function() {
  page++;
  await getData(url, collection, limit, page, query, beds, baths, saleType, minPrice, maxPrice);
};

