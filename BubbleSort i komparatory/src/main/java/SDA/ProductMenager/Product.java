package SDA.ProductMenager;

public class Product {
    Integer id;
    String prodName;
    String desc;
    Integer howMany;
    Double prize;
    public Product(int id, String name, String desc, int ammount, double prize){

        this.prodName=name;
        this.id=id;
        this.desc=desc;
        this.howMany=ammount;
        this.prize=prize;
    }

    public Integer getId() {
        return id;
    }

    public String getProdName() {
        return prodName;
    }

    public String getDesc() {
        return desc;
    }

    public Integer getHowMany() {
        return howMany;
    }

    public Double getPrize() {
        return prize;
    }


}
