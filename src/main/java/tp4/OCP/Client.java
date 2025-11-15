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

        System.out.println("\nGreen products :");
        filter.filterCriterias(products, List.of(new ColorCriteria(Color.GREEN))).forEach(product -> System.out.println(product.name + " is green."));

        System.out.println("\nLarge products :");
        filter.filterCriterias(products, List.of(new SizeCriteria(Size.LARGE))).forEach(product -> System.out.println(product.name + " is large."));

        System.out.println("\nBlue and large products :");
        filter.filterCriterias(products, List.of(new SizeCriteria(Size.LARGE), new ColorCriteria(Color.BLUE))).forEach(product -> System.out.println(product.name + " is blue and large."));
    }
}
