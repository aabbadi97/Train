public class Line {
    private Point begin,end;

//Constructors
    public Line(Point begin, Point end){
        this.begin=begin;
        this.end=end;
    }

    public Line(int beginX, int beginY, int endX, int endY){
        begin= new Point(beginX,beginY);
        end= new Point(endX,endY);
    }


/////Methods
    public String toString(){
        return "d("+this.begin+","+this.end+")";
    }
    public Point getBegin(){
        return this.begin;
    }
    public Point getEnd(){
        return this.end;
    }
    public int getBeginX(){
        return this.begin.getX();
    }
    public int getBeginY(){
        return this.begin.getY();
    }
    public int getEndX(){
        return this.end.getX();
    }
    public int getEndY(){
        return this.end.getY();
    }
    public void setBeginX(int x){
        this.begin.setX(x);
    }
    public void setBeginY(int y){
        this.begin.setY(y);
    }
    public void setEndX(int x){
        this.end.setX(x);
    }
    public void setEndY(int y){
        this.end.setY(y);
    }
    public void setBeginXY(int x , int y){
        this.begin.setX(x);
        this.begin.setY(y);
    }
    public void setEndXY(int x , int y) {
        this.end.setX(x);
        this.end.setY(y);
    }
    public Point[] getBeginEnd(){
        Point[] result= new Point [2];
        result[0]=this.begin;
        result[1]=this.end;
        return result;
    }
    public double getLength(){
        int a=this.begin.getX()-this.end.getX();
        int b=this.begin.getY()-this.end.getY();
        return Math.sqrt((a*a)+(b*b));
    }
    public double getGradient(){
        int a=this.begin.getX()-this.end.getX();
        int b=this.begin.getY()-this.end.getY();
        return Math.atan2(b,a);
    }
}
