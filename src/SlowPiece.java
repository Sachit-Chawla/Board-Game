/**
 * Name: Sachit Singh Chawla , Banner: B00865842
 * A Piece that moves left or right a specified, by 1 move
 */
public class SlowPiece extends Piece{
    public SlowPiece ( String Name, String Colour, Point position ){
        super (Name,Colour,position);
    }

    /**
     *A method to move the piece left or right by one space. This method
     * will accept a direction parameter. If a move is requested that would take the Piece off the edge
     * of the board, simply return without doing anything
     * @param moveDirection direction it should be moved
     * @return the point which is moved by one space
     */
    public Point move ( String moveDirection ){
        int xVar = getXPosition();
        int yVar = getYPosition ();
        if(moveDirection.equalsIgnoreCase ( "right" )&& xVar==7 ||
                moveDirection.equalsIgnoreCase ( "left" ) && xVar==0){
            return null;
        }
        else{
            if ( moveDirection.equalsIgnoreCase ( "right" ) ) {
                xVar = xVar + 1;
            }
            if ( moveDirection.equalsIgnoreCase ( "left" ) ) {
                xVar = xVar - 1;
            }
        }
        return new Point ( xVar, yVar );
    }
    public String toString () {
        return getName ()+getColour ()+"S";
    }

}
