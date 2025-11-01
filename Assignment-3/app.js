(function () {
  function Product(name, price, category) {
    this.name = name;
    this.price = price;
    this.category = category;
  }

  Product.prototype.getDiscountedPrice = function (percent) {
    return this.price - (this.price * percent) / 100;
  };

  var products = [
    new Product("Phone", 899, "Electronics"),
    new Product("Shoes", 499, "Fashion"),
    new Product("Watch", 1299, "Accessories"),
    new Product("Laptop", 3499, "Electronics"),
  ];

  var container = document.getElementById("productContainer");
  products.forEach(function (p) {
    var c = document.createElement("div");
    c.className = "card";
    c.innerHTML = `<h4>${p.name}</h4><p>₹${p.price}</p><p>${p.category}</p>`;
    container.appendChild(c);
  });

  var prices = products.map((p) => p.price);
  function getMaxPrice() {
    return Math.max.apply(null, this);
  }
  var max = getMaxPrice.call(prices);
  document.getElementById(
    "maxPrice"
  ).textContent = `Price of costliest product is ₹${max}`;
})();
