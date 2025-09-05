# Board-Game

A Java-based board game engine built on an **8 × 8 grid**.  
Each square on the board can either hold a `Piece` (such as a player token, chess piece, checker, etc.) or remain empty.  
The system is designed to be flexible, so any location can contain any type of `Piece` as the game progresses.

---

## Features

- **8 × 8 Board**: A classic grid representation of board games.
- **Dynamic Pieces**: Any square can hold any type of `Piece`, allowing versatile gameplay.
- **Extensible Design**: Easily add new `Piece` subclasses (e.g., `Pawn`, `King`, `Checker`).
- **Object-Oriented**: Encapsulated design with `Board`, `Piece`, and related classes.
- **Customizable Rules**: Adapt the framework to simulate different board games.

---

## Project Structure

src/
├── Board.java # Represents the 8x8 game board
├── Piece.java # Abstract class or interface for all game pieces
├── <GamePiece>.java # Example subclasses (e.g., Pawn, Rook, Checker)
└── Main.java # Entry point to run the game

---

## Getting Started

### Prerequisites
- Java 17+ (recommended)
- [Maven](https://maven.apache.org/) or any Java build tool (optional)

### Clone the Repository
```bash
git clone https://github.com/Sachit-Chawla/Board-Game.git
cd Board-Game
Compile & Run
javac src/*.java
java src/Main
Or, if using Maven:
mvn clean compile
mvn exec:java -Dexec.mainClass="Main"
Example Usage
Here’s a simplified snippet of how the board and pieces might be used:
Board board = new Board();

// Place a piece on the board
Piece pawn = new Pawn("White");
board.placePiece(pawn, 1, 0);

// Move a piece
board.movePiece(1, 0, 2, 0);

// Print the board
System.out.println(board);
Roadmap
 Add rules for specific games (Chess, Checkers, etc.)
 Implement turn management
 Create AI opponent logic
 Add GUI for visual play
