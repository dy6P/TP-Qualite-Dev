package tp4.OCP.modele;

public class PriceCriteria implements Criteria<Product> {
    private double a;
    private double b;
    private double price;

    public PriceCriteria(double price, double a, double b) {
        this.a = a;
        this.b = b;
        this.price = price;
    }

    public boolean isSatisfied(Product product) {
        return a < product.price && product.price < b;
    }
}
