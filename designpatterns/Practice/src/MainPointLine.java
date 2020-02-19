public class MainPointLine {
    public static void main (String[] args){
        Line l1 = new Line(0, 0, 3, 4);
        System.out.println(l1);
        Point p1 = new Point(2,1);
        Point p2 = new Point(2,3);
        Line l2 = new Line(p1, p2);
        System.out.println(l2);
        System.out.println(l2.getLength());
        System.out.println(l1.getGradient());
        Point p3=new  Point();
        p3.setXY(7,8);
        System.out.println(p3.toString());
        Line l3 =new Line(p2,p3);
        System.out.println(l3.toString());
    }
}
