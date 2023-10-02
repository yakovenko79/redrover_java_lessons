public class Point {
    int x;
    int y;
    static int MIN = 0;
    static int MAX = 100;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public boolean isValid() {
        return x >= MIN && x <= MAX && y >= MIN && y <= MAX;
    }
}
