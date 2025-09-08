//Copy constructors
public class Rectangle {
    private float height;
    private float lenght;

    public Rectangle(float height,float lenght){
        this.height = height;
        this.lenght = lenght;
    }
    public Rectangle(Rectangle rectangle){
        this.height=rectangle.height;
        this.lenght=rectangle.lenght;
    }
    public static void main(String[] args) {
        Rectangle Rect = new Rectangle(10, 12);
        System.out.println(Rect.height+" "+Rect.lenght);

        Rectangle Rect2 = new Rectangle(Rect);
        System.out.println(Rect2.height+"  "+Rect2.lenght);
    }
}
