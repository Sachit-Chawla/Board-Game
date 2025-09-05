/**
Name: Sachit Singh Chawla , Banner: B00865842
This is the point class which defines x position and y position for point
 */
public class Point  {
    // X and Y position declaration
    private int X;
    private int Y;
    public Point(int Xpos,int Ypos){
        this.X=Xpos;
        this.Y=Ypos;
    }
    // getters and setters
    public int getX(){return X;}
    public int getY() {return Y;}
    public void setX(int varX) {this.X = varX;}
    public void setY(int varY) {this.Y = varY;}
    public void setLocation(int xpos, int ypos){X=xpos;Y=ypos;}
   //toString method
    @Override
    public String toString() {
        String s=  "XPOS: " + X + " YPOS: " + Y ;
        return s;
    }
}

