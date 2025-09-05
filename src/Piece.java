/**
 * Name: Sachit Singh Chawla , Banner: B00865842
 * This Piece class creates a piece using name, color and position it should be assigned
 */
public class Piece {
    private String Name;
    private String Colour;
     private Point position;
//constructor
    public Piece (String Name,String Colour,Point position){
        this.Name=Name;
        this.Colour=Colour;
       this.position= new Point (position.getX (),position.getY ());
    }

//getters and setters
    public String getName(){return this.Name;}
    public String getColour(){return this.Colour;}
    public int getXPosition(){return this.position.getX ();}
    public int getYPosition(){return this.position.getY ();}
    public void setName ( String name ) {Name = name;}
    public void setColour ( String colour ) {Colour = colour;}
    public void setXPosition (int Xpos) {this.position.setX ( Xpos );}
    public void setYPosition(int Ypos ){this.position.setY ( Ypos );}

    @Override
    public String toString () {
        return Name+Colour;
    }


}
