package tp4.OCP.modele;

import java.util.List;
import java.util.stream.Stream;

public class ProductFilter {

    public Stream<Product> filterCriterias(List<Product> products, List<Criteria<Product>> criterias) {
        return products.stream().filter(product -> criterias.stream().allMatch(criteria -> criteria.isSatisfied(product)));
    }
}

