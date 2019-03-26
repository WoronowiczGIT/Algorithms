public class Dodawator {

    int dodaj(int a, int b){
        System.out.println("return int for int/int");
        return a+b;

    }
    double dodaj(double a, double b){
        System.out.println("return double for double/double");

        return a+b;
    }
    int dodaj(short a, short b){
        System.out.println("return int for short/short");

        return a+b;
    }
    int dodaj(short a, int b){
        System.out.println("return int for short/short");
        return a+b;
    }

}
