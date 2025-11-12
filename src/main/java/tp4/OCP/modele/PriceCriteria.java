package tp4.OCP.modele;

public class PriceCriteria implements Criteria<Product> {
    private double a;
    private double b;

    public PriceCriteria(double price, double a, double b) {
        this.a = a;
        this.b = b;
    }

    public boolean isSatisfied(Product product) {
        return a < product.price && product.price < b;
    }
}
