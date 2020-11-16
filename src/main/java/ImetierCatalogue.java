import java.util.List;
public interface ImetierCatalogue {
    public List<Produit> getProduitsParMotCle(String mc);
    public void addProduit(Produit p);
}


/*import java.util.List;
public interface ICatalogue {
    public List<Produit> getProduitsParMotCle(String mc);
    public void addProduit(Produit p);
}*/