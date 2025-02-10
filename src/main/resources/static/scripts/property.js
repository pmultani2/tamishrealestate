const img = document.getElementById("property-img");
const address = document.getElementById("property-address")
const bedBath = document.getElementById("property-bed-bath");
const price = document.getElementById("property-price");
const description = document.getElementById("property-description");
const extras = document.getElementById("property-extras");

const map = document.querySelector("iframe");

const params = new URLSearchParams(window.location.search);
const id = params.get("id"); 
const collection = params.get("collection");

const API_KEY = "AIzaSyDwQ7nsDIwoYefviRHL-Fjt_bQwR1MrW50";

getData(id);

async function getData(id) {
  try {
    const response = await fetch(`http://localhost/property/${collection}/${id}`);
    const data = (await response.json()).Listing;
    console.log(data);
    img.src = "https://www.salonlfc.com/wp-content/uploads/2018/01/image-not-found-1-scaled.png";
    address.innerText = data.Address;
    if (data.Bedrooms !== null) {
      bedBath.innerText += data.Bedrooms + " BD";
    }
    if (data.Washrooms !== null && bedBath.innerText.length > 0) {
      bedBath.innerText += " | " + data.Washrooms + " BA";
    } else if (data.Washrooms !== null) {
      bedBath.innerText = data.Washrooms + " BA";
    }
    price.innerText = "$" + parseInt(data.ListPrice).toLocaleString();
    description.innerText = data.RemarksForClients;
    extras.innerText = data.Extras;

    map.src = "https://www.google.com/maps/embed/v1/place?key=" + API_KEY + "&q=" + data.Address +", " + data.Municipality;

    document.title = data.Address + " - Tamish Multani Real Estate";
  } catch(error) {
    img.parentElement.parentElement.parentElement.innerHTML = "<h1 class='bold' style='font-size:64px; text-align: center;'>404</h1>";
  }
}