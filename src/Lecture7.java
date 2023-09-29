public class Lecture7 {

    public static double distance(Point point1, Point point2) {
        int deltax = point2.x - point1.x;
        int deltay = point2.y - point1.y;

        return Math.sqrt(deltax * deltax + deltay * deltay);

    }
    public static void main(String[] args) {
        Point daleko = new Point(4, 3);
        System.out.println(daleko.isValid());

        Point blizko = new Point(0, 0);
        System.out.println(blizko.isValid());

        System.out.println(distance(daleko, blizko));



    }
}