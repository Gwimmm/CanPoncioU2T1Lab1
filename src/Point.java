public class Point {

    private int x;
    private int y;
    private int xy;

    public Point (int x, int y){
       this.x = x;
       this.y = y;
    }
    public Point (int xy){
        this.x = xy;
        this.y = xy;
    }
    public Point () {
        this.x = 0;
        this.y = 0;
    }
    public int getX () {
        return x;
    }
    public int getY () {
        return y;
    }
    public void setX (int newX) {
        x = newX;
    }
    public void setY (int newY) {
        x = newY;
    }
    public String Coordinate() {
        return ("(" + x + "," + y + ")");
    }

}
