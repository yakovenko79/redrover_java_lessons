public class Main {

    public static double distance(Point point1, Point point2) {
        int deltax = point2.x - point1.x;
        int deltay = point2.y - point1.y;

        return Math.sqrt(deltax * deltax + deltay * deltay);

    }
    public static void main(String[] args) {
        Point p1 = new Point();
        p1.x = 4;
        p1.y = 3;

        Point p2 = new Point();
        p2.x = 0;
        p2.y = 0;

        System.out.println(distance(p1, p2));



    }
}