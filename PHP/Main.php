<?php

include 'shirt.php'; 

// Hardcoded input data
$products = [];
$products[] = new Shirt(1, "T-Shirt", "Brand A", 19.99, "M", "Cotton", "Male", "Red", "Short Sleeve");
$products[] = new Shirt(2, "Polo Shirt", "Brand B", 29.99, "L", "Polyester", "Male", "Blue", "Short Sleeve");
$products[] = new Shirt(3, "Blouse", "Brand C", 24.99, "S", "Silk", "Female", "White", "Long Sleeve");

// Display products in table format
echo "<table border='1'>";
echo "<tr><th>ID</th><th>Name</th><th>Brand</th><th>Price</th><th>Size</th><th>Material</th><th>Gender</th><th>Color</th><th>Sleeve Type</th></tr>";
foreach ($products as $product) {
    echo "<tr>";
    echo "<td>{$product->getIdProduct()}</td>";
    echo "<td>{$product->getName()}</td>";
    echo "<td>{$product->getBrand()}</td>";
    echo "<td>{$product->getPrice()}</td>";
    if ($product instanceof Clothing) {
        echo "<td>{$product->getSize()}</td>";
        echo "<td>{$product->getMaterial()}</td>";
        echo "<td>{$product->getGender()}</td>";
        if ($product instanceof Shirt) {
            echo "<td>{$product->getColor()}</td>";
            echo "<td>{$product->getSleeveType()}</td>";
        } else {
            echo "<td></td><td></td>"; // For non-Shirt clothing items, leave color and sleeve type cells empty
        }
    } else {
        echo "<td></td><td></td><td></td><td></td>"; // For non-Clothing items, leave size, material, gender, color, and sleeve type cells empty
    }
    echo "</tr>";
}
echo "</table>";
