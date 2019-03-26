public class PointXY {

    private int cordX;
    private int cordY;
    PointXY(int cordX, int cordY){
        setCordX(cordX);
        setCordY(cordY);
    }

    public void setCordX(int cordX) {
        this.cordX = cordX;
    }

    public void setCordY(int cordY) {
        this.cordY = cordY;
    }

    public int getCordX() {
        return cordX;
    }

    public int getCordY() {
        return cordY;
    }

    void displayCords(){
        System.out.println("\nX: "+getCordX());
        System.out.println("Y: "+getCordY());
    }
    public void addOne(boolean X, boolean Y){
        if(X == true){this.cordX++;}
        if(Y ==true){this.cordY++;}
    }
    public void changeCord(int X, int Y){
        this.cordX +=X;
        this.cordY +=Y;
    }



}
