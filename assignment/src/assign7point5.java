/**
 * Created by steven on 2/21/15.
 */
public class assign7point5 {

    public static Line findLine(Square s1, Square s2) {
        if (s1.y1 == s2.y1 && s1.y2 == s2.y2)
            return new Line(0, (s1.y1 + s1.y2)/2);
        else if (s1.x1 == s2.x1 && s1.x2 == s2.x2)
            return null;
        else {
            Point p1 = new Point((s1.x1 + s1.x2)/2,(s1.y1 + s1.y2)/2);
            Point p2 = new Point((s2.x1 + s2.x2)/2,(s2.y1 + s2.y2)/2);

            return new Line((p2.y-p1.y)/(p2.x-p1.x),p1.y - (p2.y-p1.y)/(p2.x-p1.x) * p1.x);
        }
    }

    private static class Square {
        int x1, x2, y1, y2;

        Square(int x1, int x2, int y1, int y2) {
            this.x1 = x1;
            this.x2 = x2;
            this.y1 = y1;
            this.y2 = y2;
        }
    }

    private static class Point {
        int x, y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    private static class Line {
        int k, c;

        Line(int k, int c) {
            this.k = k;
            this.c = c;
        }

    }
}
