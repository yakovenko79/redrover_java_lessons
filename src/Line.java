public class Line {
    Point p1;
    Point p2;
    public double length() {
        int deltax = p2.x - p1.x;
        int deltay = p2.y - p1.y;
        return Math.sqrt(deltax * deltax + deltay * deltay);

    }

}
