public class Box {

    private int length;
    private String color;
    private int height;
    private int width;

    public Box (int length, int height, int width){}
    this.length = length

    public void boxInfo(int length, int height, int width, String color){
        System.out.print("The box's length is: " + length + ", height:" + height + ", width: " + width + ", and Color" + color);
    }

    public void printArea (int length, int width){
        double area = length * width;
                System.out.println("The area is" + area);
    }
    public void printVolume (int length, int width, int height){
        double volume = length * width * height;
        System.out.println("The volume is " + volume );
    }

}
