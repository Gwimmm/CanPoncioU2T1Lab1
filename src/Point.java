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
    public String coordinate() {
        return ("(" + x + "," + y + ")");
    }
    public String quadrant() {
        if ( x > 0){
            if (y > 0) {
                return ("Quadrant I");
            }
            if (y < 0) {
                return ("Quadrant IV");
            }
        }
        if ( x < 0) {
            if ( y > 0 ){
                return("Quadrant III");
            }
            if ( y < 0 ) {
                return("quadrant II");
            }
        }
        if ( x == 0 && y == 0){
            return("At Origin");
        }
        return ("On an axis");
    }

}
