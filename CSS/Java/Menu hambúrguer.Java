// scripts.js
function toggleMenu() {
    var menuOptions = document.getElementById("menu-options");
    if (menuOptions.style.display === "none" || menuOptions.style.display === "") {
        menuOptions.style.display = "flex";
    } else {
        menuOptions.style.display = "none";
    }
}
