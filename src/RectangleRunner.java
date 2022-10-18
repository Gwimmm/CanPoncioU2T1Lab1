public class RectangleRunner {
    public static void main(String [] args){
        int len = 65;
        int wid = len + 10;
        Rectangle rect1 = new Rectangle(len, wid);
        Rectangle rect2 = new Rectangle(10.0, 30.0);
        Rectangle rect3 = new Rectangle(0);

rect1.setWidth(75);
rect2.setWidth(75);
rect2.setLength(75);
rect3.setWidth(75);

        int len = 65;
        int wid = len + 10;
        Rectangle rect1 = new Rectangle(len, wid);
        Rectangle rect2 = new Rectangle(10.0, 30.0);
        Rectangle rect3 = new Rectangle(0);

System.out.println("These three plots requires " + (rect1.calculateArea() + rect2.calculateArea() + rect3.calculateArea()) +  " square feet of seed");

    }
}
