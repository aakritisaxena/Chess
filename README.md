
This project simulates the movement of chess pieces on an n x n chessboard. 
It allows you to dynamically create different chess pieces and calculate their possible moves based on the rules of chess.

**Pieces Supported :** 
1. King - moves one square in any direction
2. Queen - moves horizonatally, vertically or diagonally
3. Pawn - Moves only one square ahead.

**Project Structure**

    src/main/java/game
    ├── chessPiece
    │   ├── King.java
    │   ├── Queen.java
    │   ├── Piece.java
    |   ├── Pawn.java
    ├── createPiece
    │   ├── CreateKing.java
    │   ├── CreateQueen.java
    │   ├── PieceFactory.java
    │   ├── PieceCreation.java
    │   ├── CreatePawn.java
    ├── util
    │   ├── Coordinates.java
    │   ├── ColumnNames.java
    ├── exception
    │   ├── MoveNotPossibleException.java
    │   ├── PositionNotPossibleException.java
        Game.java

**How To Run**

1. Clone the repository
  https://github.com/aakritisaxena/Chess.git
2. Build the code in any compiler and run

**Expected Inputs**
1. Enter the piece type on the console when prompted (Pawn/King/Queen)
2. Enter the valid position of the piece on the chess board.(A1-A8,H1-H8)
3. If valid position is not entered, the project gives the exception as PositionNotPossible.


**Util Functionalities**
1. ColumnNames - 
   When returning the Output, i want to give output in the Chess Notations Format. 
   In this class I have created a mapping of the columns to corresponding character.
2. PossibleDirections - 
   For any given square there are possible 8 directions in which it can move. 
   These 8 directions are defined in this class
   <BR>
    <img width="443" alt="Screenshot 2025-01-21 at 9 30 40 AM" src="https://github.com/user-attachments/assets/b51072d9-34f1-4501-8e1f-a6f36b927f6f" />
    <BR>

   
**Sample Input and Outputs**

1. I/P - Pawn , G2
   <br>
   O/P - G3
   <br>
   <img width="746" alt="Screenshot 2025-01-20 at 3 07 19 PM" src="https://github.com/user-attachments/assets/aa6dbd35-376e-4dbe-b875-35f06f227a70" />
   <br>

2. I/P - Pawn , H8 (here, the movement is not possible so the O/P is an exception)
   <br>
   O/P - Exception - Move Not Possible
   <br>
   <img width="1204" alt="Screenshot 2025-01-20 at 3 08 52 PM" src="https://github.com/user-attachments/assets/dfeba0fd-6f8b-4343-931b-88f0adad83a8" />
   <br>
 
3. I/P - King , G2 (All 8 Possible movements are possible)
   <br>
   O/P - G3 , H3 , F3 , F2 , H2 , F1 , G1 , H1
   <br>
    <img width="452" alt="Screenshot 2025-01-20 at 11 26 32 PM" src="https://github.com/user-attachments/assets/e00ed8d3-7f35-450a-994c-9eb1b065716c" />
   <br>

4. I/P - Queen , G2
   <br>
   O/P - G3, G4 , G5 , G6, G7, G8 , H3 , F3 , E4 , D5 , C6 , B7 , A8, F2 ,E2 , D2, C2 ,B2 ,A2,H2,F1,G1,H1
   <br>
    <img width="815" alt="Screenshot 2025-01-20 at 11 27 07 PM" src="https://github.com/user-attachments/assets/e06ac34d-a4f7-4b04-8ddf-bb162939d506" />
   <br>
