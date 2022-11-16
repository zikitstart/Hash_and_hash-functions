package product;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Product bananas = new Product("Бананы", 150.0, 2);
        Product oranges = new Product("Апельсины", 100.0, 5);
        Product mandarins = new Product("Мандарины", 80.0, 3);
        Product mandarins2 = new Product("Мандарины", 80.0, 4);
        Product garnet = new Product("Гранат", 200.0, 3);
        Product cabbage = new Product("Капуста", 50.0, 3);
        Product zucchini = new Product("Кабачки", 80.0, 5);

        System.out.println("ДЗ1 Задание-1.");
        Set<Product> products = new HashSet<>();
        addProduct(products,bananas);
        addProduct(products,zucchini);
        addProduct(products,mandarins);
        //addProduct(products,mandarins2);
        //addProduct(products,bananas);

        for (Product product : products) {
            System.out.println(product);
        }


        Recipes recipe1 = new Recipes("Рецепт коктейля 1 ");
        recipe1.addProduct(bananas,garnet,oranges);
        Recipes recipe2 = new Recipes("Рецепт коктейля 2 ");
        recipe2.addProduct(bananas,garnet,oranges);
        Recipes recipe3 = new Recipes("Рецепт коктейля 3 ");
        recipe3.addProduct(bananas,mandarins,zucchini);

        System.out.println("ДЗ2 Задание-1.");
        Set<Recipes> recipesList = new HashSet<>();
        addRecipes(recipesList,recipe1);
        addRecipes(recipesList,recipe2);
        addRecipes(recipesList,recipe3);
        //addRecipes(recipesList,recipe3);

        for (Recipes recipes : recipesList) {
            System.out.println(recipes);
        }

        System.out.println("ДЗ2 Задание-2.");
        Set<Integer> list = new HashSet<>();
        for (int i=0; i < 20 ; i++) {
            list.add((int)Math.round(Math.random()*1000));
        }
        System.out.println(list);
        list.removeIf(i -> i % 2 != 0);
        System.out.println(list);
    }

    public static void addProduct(Set<Product> products, Product product) {
        if (product.getPrice() == 0.0 || product.getWeight() == 0 || product.getName().equals("Default")){
            throw new RuntimeException("Заполните карточку товара полностью.");
        }
        if (products.contains(product)){
            throw new RuntimeException(product + " уже находится в корзине.");
        }
        products.add(product);
    }
    public static void addRecipes(Set<Recipes> recipesList,Recipes recipes) {
        if (recipesList.contains(recipes)) {
            throw new RuntimeException(recipes + " уже существует.");
        }
        recipesList.add(recipes);
    }
}