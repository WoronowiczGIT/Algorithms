package SDA.ProductMenager;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class ProdProvider {
    List<Product> products = new LinkedList<>();

    public void addProd(Product product) {
        products.add(product);
    }

    public Product findByID(int id) {
        for (Product x : products
        ) {
            if (x.getId() == id) return x;
        }
        return null;
    }
    public List<Product> getAllProducts(){
        return products;
    }

    public List<Product> findByTekst(String tekst) {
            List<Product> resault = new LinkedList<>();
        for (Product x: products
             ) {
            if(x.getProdName().contains(tekst)
                    || x.getProdName().contains(tekst)){
                resault.add(x);
            }
        }
        return resault;
    }

    public void sortBy(Comparator<Product> comparator){
        products.sort(comparator);
    }


}