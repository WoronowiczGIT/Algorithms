public class TestPoint {

    public static void main(String[] args) {
        PointXY punkt = new PointXY(2,7);
        System.out.println("X ="+ punkt.getCordX());
        System.out.println("y ="+ punkt.getCordY());
        punkt.addOne(true,false);
        punkt.changeCord(0,-3);
        punkt.displayCords();


    }
}
