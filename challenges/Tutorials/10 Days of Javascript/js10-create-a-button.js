var b = document.createElement("button");
b.id = "btn";
b.innerHTML = "0";
document.body.appendChild(b);
b.addEventListener("click", function () {
    var value = b.innerHTML;
    value++;
    b.innerHTML = value;
});
