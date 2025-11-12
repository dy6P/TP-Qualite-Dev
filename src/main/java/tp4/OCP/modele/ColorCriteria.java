package tp4.OCP.modele;

public class ColorCriteria implements Criteria <Product> {
    private Color color;

    public ColorCriteria(Color color) {
        this.color = color;
    }

    @Override
    public boolean isSatisfied(Product product) {
        return product.color == this.color;
    }
}
