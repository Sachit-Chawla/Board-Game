/**
 * Name: Sachit Singh Chawla , Banner: B00865842
 * A Piece that moves left/right/up/down specified, arbitrary number of steps per move
 */
public class FastFlexible extends FastPiece {
    public FastFlexible ( String Name, String Colour, Point Position ) {
        super ( Name, Colour, Position );
    }

    /**
     *A method to move the piece left / right / up/ downby a specified
     * number of spaces. This method will accept a direction parameter and a number of spaces.
     * If a move is requested that would take the Piece off the edge of the board, it would simply return
     * without doing anything.
     * @param moveDirection the direction it has to be moved
     * @param numberOfSteps the number of spaces it would be moved
     * @return the new point which is moved
     */
    public Point move ( String moveDirection, int numberOfSteps ) {
        int xVar = getXPosition ();
        int yVar = getXPosition ();
        if ( moveDirection.equalsIgnoreCase ( "right" ) && xVar == 7 ||
                moveDirection.equalsIgnoreCase ( "left" ) && xVar == 0 ||
                moveDirection.equalsIgnoreCase ( "up" ) && yVar == 0 ||
                moveDirection.equalsIgnoreCase ( "down" ) && yVar ==7 ) {
            return null;
        }
        else {
            if ( moveDirection.equalsIgnoreCase ( "right" ) ) {
                xVar = xVar + numberOfSteps;
            }
            if ( moveDirection.equalsIgnoreCase ( "left" ) ) {
                xVar = xVar - numberOfSteps;
            }
            if ( moveDirection.equalsIgnoreCase ( "up" ) ) {
                yVar = yVar - numberOfSteps;
            }
            if ( moveDirection.equalsIgnoreCase ( "down" ) ) {
                yVar = yVar + numberOfSteps;
            }
        }
       return new Point (   xVar, yVar );
    }
    public String toString () {
        return getName ()+getColour ()+"FF";
    }
}