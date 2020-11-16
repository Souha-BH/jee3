
import java.util.List;
public class TestMetier {
    public static void main(String[] args) {
        MetierImpl metier= new MetierImpl();
        List <Produit> prods = metier.getProduitsParMotCle("HP");
        for (Produit p : prods)
            System.out.println(p.getNomProduit());
    }
}
/*import java.util.List;
public class TestCatalogue {
    public static void main(String[] args) {
        CatalogueImpl metier= new
                CatalogueImpl();
        List<Produit> prods = metier.getProduitsParMotCle("HP");
        for (Produit p : prods)
            System.out.println(p.getNomProduit());
    }
}*/
