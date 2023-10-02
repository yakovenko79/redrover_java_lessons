public class Lecture7 {
    public static void main(String[] args) {

        System.out.println("Max is " + Point.MAX);
        Point p1 = new Point(250, 0);
        System.out.println("before point 1 valid:" + p1.isValid());

        Point p2 = new Point(200, 200);
        System.out.println("before point 2 valid:" + p2.isValid());
        Point.MAX = 300;

        System.out.println("Max is " + Point.MAX);
        System.out.println("after point 1 valid:" + p1.isValid());
        System.out.println("after point 2 valid:" + p2.isValid());

    }
}