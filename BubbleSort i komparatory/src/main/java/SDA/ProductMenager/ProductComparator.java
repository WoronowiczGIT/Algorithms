package SDA.ProductMenager;

import java.util.Comparator;

public class ProductComparator {

    Comparator<Product> byID = new Comparator<Product>() {
        @Override
        public int compare(Product o1, Product o2) {
            return o1.id.compareTo(o2.id);
        }
    };
    Comparator<Product> byName = new Comparator<Product>() {
        @Override
        public int compare(Product o1, Product o2) {
            return o1.id.compareTo(o2.id);
        }
    };
    Comparator<Product> byPrize = new Comparator<Product>() {
        @Override
        public int compare(Product o1, Product o2) {
            return o1.getPrize().compareTo(o2.getPrize());
        }
    };

    Comparator<Product> byAmmount = new Comparator<Product>() {
        @Override
        public int compare(Product o1, Product o2) {
            return o1.getHowMany().compareTo(o2.getHowMany());
        }
    };

    Comparator<Product> byPrizeAndAmmount = new Comparator<Product>() {
        @Override
        public int compare(Product o1, Product o2) {
            if (o1.getPrize().compareTo(o2.getPrize()) != 0) {
                return o1.getPrize().compareTo(o2.getPrize());
            } else return o1.getHowMany().compareTo(o2.getHowMany());
        }

    };

}
