package tp4.OCP.modele;

public class SizeCriteria implements Criteria <Product> {
    private Size size;

    public SizeCriteria(Size size) {
        this.size = size;
    }

    @Override
    public boolean isSatisfied(Product product) {
        return product.size == this.size;
    }
}
