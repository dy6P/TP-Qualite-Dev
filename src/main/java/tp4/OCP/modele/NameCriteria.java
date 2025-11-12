package tp4.OCP.modele;

public class NameCriteria implements Criteria <Product> {
    private String name;

    public NameCriteria(String name) {
        this.name = name;
    }

    @Override
    public boolean isSatisfied(Product product) {
        return product.name.equalsIgnoreCase(this.name);
    }
}
