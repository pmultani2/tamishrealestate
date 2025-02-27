const btnLeft = document.getElementsByClassName("carousel-left-btn");
const btnRight = document.getElementsByClassName("carousel-right-btn");
const carousel = document.getElementsByClassName("carousel-elements-wrapper");

function createCarousel() {
  for (let i = 0; i < carousel.length; i ++) {
    let t;
    let start = 100;
    let speedup = 2;
    let scrollAmount;

    let scrollFunction = function () {
      carousel[i].scrollLeft += scrollAmount;
      console.log(start);
      t = setTimeout(scrollFunction, start);
      start = start / speedup;
    }

    btnLeft[i].onpointerdown = function() {
      scrollAmount = -5;
      scrollFunction()
    };
    btnLeft[i].onpointerup = function() {
      clearTimeout(t);
    }

    btnRight[i].onpointerdown = function() {
      scrollAmount = 5;
      scrollFunction();
    };
    btnRight[i].onpointerup = function() {
      clearTimeout(t);
    }
  }
}

createCarousel();




