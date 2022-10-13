public class Main {
    public static void main(String[] args) {
        Point myPoint = new Point(1.5f,2.6f);
        System.out.println(myPoint);
        System.out.println("----------");
        MovablePoint myPoint2 = new MovablePoint(1.5f,2.6f,5.4f,10.6f);
        System.out.println(myPoint2);
        System.out.println("----------");
        System.out.println(myPoint2.move());
        System.out.println(myPoint2);
    }
}