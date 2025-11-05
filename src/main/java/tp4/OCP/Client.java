package tp4.OCP;

import tp4.OCP.modele.Color;
import tp4.OCP.modele.Product;
import tp4.OCP.modele.ProductFilter;
import tp4.OCP.modele.Size;

import java.util.List;

public class Client {
    public static void main(String[] args) {
        Product apple = new Product("Apple", Color.RED, Size.SMALL);
        Product tree = new Product("Tree", Color.GREEN, Size.LARGE);
        Product house = new Product("House", Color.BLUE, Size.HUGE);
        Product car = new Product("Car", Color.BLUE, Size.LARGE);

        List<Product> products = List.of(apple, tree, house, car);

        ProductFilter filter = new ProductFilter();
        System.out.println("Green products : ");
        filter.filterByColor(products, Color.GREEN).forEach(product -> System.out.println(product.name + " is green."));
        System.out.println("Large products : ");
        filter.filterBySize(products, Size.LARGE).forEach(product -> System.out.println(product.name + " is large."));
        System.out.println("Blue and large products : ");
        filter.filterBySizeAndColor(products, Size.LARGE, Color.BLUE).forEach(product -> System.out.println(product.name + " is blue and large."));
    }
}
