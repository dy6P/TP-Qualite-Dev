package tp4.OCP;

import tp4.OCP.modele.*;

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
        filter.filterProducts(products, new ColorCriteria(Color.GREEN)).forEach(product -> System.out.println(product.name + " is green."));
        System.out.println("Large products : ");
        filter.filterProducts(products, new SizeCriteria(Size.LARGE)).forEach(product -> System.out.println(product.name + " is large."));
        System.out.println("Blue and large products : ");
        filter.filterProducts(products, new List<new SizeCriteria()>).forEach(product -> System.out.println(product.name + " is blue and large."));
    }
}
