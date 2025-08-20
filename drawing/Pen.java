package drawing;

import geometry.Point;

public class Pen {
    private Point CP;
    private Canvas cvs;

    public Pen(Canvas canva){
        this.cvs= canva;
        this.CP= new Point(0,0);
    }

    public void moveTo(float x, float y){
        this.CP=new Point(x,y);
    }

    public void lineTo(float x, float y){
        Point newPoint=new Point(x,y);
        cvs.addLine(this.CP, newPoint);
        this.CP=newPoint;
    }

    public Point getPosition(){
        return this.CP;
    }
}