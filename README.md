
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
 ![Screenshot 2025-01-20 at 3.35.29 PM.png](../../../../var/folders/q1/j8fms90j1558_ccpz7y1g8vm0000gn/T/TemporaryItems/NSIRD_screencaptureui_CnurUx/Screenshot%202025-01-20%20at%203.35.29%E2%80%AFPM.png)
   
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
4. ![Screenshot 2025-01-20 at 8.50.49 PM.png](../../../../var/folders/q1/j8fms90j1558_ccpz7y1g8vm0000gn/T/TemporaryItems/NSIRD_screencaptureui_0vcHU6/Screenshot%202025-01-20%20at%208.50.49%E2%80%AFPM.png)
   <br>

4. I/P - Queen , G2
   <br>
   O/P - G3, G4 , G5 , G6, G7, G8 , H3 , F3 , E4 , D5 , C6 , B7 , A8, F2 ,E2 , D2, C2 ,B2 ,A2,H2,F1,G1,H1
   <br>
   
   ![Screenshot 2025-01-20 at 8.50.25 PM.png](../../../../var/folders/q1/j8fms90j1558_ccpz7y1g8vm0000gn/T/TemporaryItems/NSIRD_screencaptureui_0BYIuM/Screenshot%202025-01-20%20at%208.50.25%E2%80%AFPM.png)
   <br>
