package SDA.ProductMenager;

public class Tester {
    public static void main(String[] args) {
        //#######################PROD MENAGEER #######################

        ProdProvider sklep = new ProdProvider();
        sklep.addProd(new Product(2, "ball","bigball",10,2.33));
        sklep.addProd(new Product(3, "zebra","ugly zebra",2,999.33));
        sklep.addProd(new Product(4, "horse","small horse",1,50.21));
        sklep.addProd(new Product(25, "dog","big dog",4,200.00));


        System.out.println(sklep.findByID(25).getProdName());
        System.out.println();
        for (Product x: sklep.findByTekst("e")
        ) {

            System.out.println(x.getProdName());
        }
        ProductComparator porownywarka = new ProductComparator();

        for (Product x: sklep.getAllProducts()
        ) {

            System.out.println(x.getProdName());
        }



    }


}
