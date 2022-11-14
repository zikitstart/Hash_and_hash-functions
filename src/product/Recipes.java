package product;

import utility.Utility;

import java.util.*;

public final class Recipes {
    private String recipeName;
    private double  totalCostAllProducts;
    private Set<Product> products = new HashSet<>();

    public Recipes(String recipeName) {
        this.recipeName = Utility.checkNull(recipeName,"Default");
    }

    public void addProduct(Product... products) {
        this.products.addAll(Arrays.asList(products));
    }

    public Set<Product> getProducts() {
        return products;
    }

    public double getTotalCostAllProducts() {
        for (Product product : products) {
            totalCostAllProducts += product.getPrice();
        }
        return totalCostAllProducts;
    }

    public String getRecipeName() {
        return recipeName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipes recipes = (Recipes) o;
        return Double.compare(recipes.totalCostAllProducts, totalCostAllProducts) == 0 && Objects.equals(products, recipes.products) && Objects.equals(recipeName, recipes.recipeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(products, totalCostAllProducts, recipeName);
    }

    @Override
    public String toString() {
        return  recipeName + ": " +
                products +
                "  (Общая стоимость продуктов:" + getTotalCostAllProducts() +
                "рублей.)";
    }
}
