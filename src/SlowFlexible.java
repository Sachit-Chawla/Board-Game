/**
 * Name: Sachit Singh Chawla , Banner: B00865842
 *A Piece that moves left/right/up/down specified, by  1 move
 */

public class SlowFlexible extends SlowPiece{
    public SlowFlexible ( String Name, String Colour, Point Position ) {
        super ( Name, Colour, Position );
    }

    /**
     *A method to move the piece left /right/up/down by one space. This method
     * will accept a direction parameter. If a move is requested that would take the Piece off the edge
     * of the board, simply return without doing anything
     * @param moveDirection direction it should be moved
     * @return the point which is moved by one space
     */
    public Point move ( String moveDirection ) {
        int xVar = getXPosition ();
        int yVar = getYPosition ( );
        if ( moveDirection.equalsIgnoreCase ( "right" ) && xVar == 7 ||
                moveDirection.equalsIgnoreCase ( "left" ) && xVar == 0 ||
                moveDirection.equalsIgnoreCase ( "up" ) && yVar == 0||
                moveDirection.equalsIgnoreCase ( "down" ) && yVar ==7 ) {
            return null;
        }
        else {
            if ( moveDirection.equalsIgnoreCase ( "right" ) ) {
                xVar = xVar + 1;
            }
            if ( moveDirection.equalsIgnoreCase ( "left" ) ) {
                xVar = xVar - 1;
            }
            if ( moveDirection.equalsIgnoreCase ( "up" ) ) {
                yVar = yVar - 1;
            }
            if ( moveDirection.equalsIgnoreCase ( "down" ) ) {
                yVar = yVar + 1;
            }
        }
        return new Point ( xVar, yVar );
    }
    public String toString () {
        return getName ()+getColour ()+"SF";
    }
}

