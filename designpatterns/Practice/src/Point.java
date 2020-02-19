public class Point {
    private int x=0;
    private int y=0;

//Constructor
    public Point(){
        this.x=0;
        this.y=0;
    }
    public Point(int x,int y){
        this.x=x;
        this.y=y;
    }

//Method
    public int getX(){
        return this.x;
    }
    public void setX(int x){
        this.x=x;
    }
    public int getY(){
        return this.y;
    }
    public void setY(int y){
        this.y=y;
    }
    public String toString(){
        return "("+this.x+","+this.y+")";
    }
    public int[] getXY(){
        int[] result= new int [2];
        result[0]=this.x;
        result[1]=this.y;
        return result;
    }
    public void setXY(int x , int y){
        this.x=x;
        this.y=y;
    }
    public double distance (int x,int y){
        return Math.sqrt(((this.x-x)*(this.x-x))+((this.y-y)*(this.y-y)));
    }
    public double distance(Point another){
        return Math.sqrt(((another.x-this.x)*(another.x-this.x))+((another.y-this.y)*(another.y-this.y)));
    }
    public double distance(){
        return Math.sqrt((this.x*this.x)+(this.y+this.y));
    }
}
