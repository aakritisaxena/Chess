
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

**Sample Input and Outputs**

1. I/P - Pawn , G2
   O/P - G3
   <img width="746" alt="Screenshot 2025-01-20 at 3 07 19 PM" src="https://github.com/user-attachments/assets/aa6dbd35-376e-4dbe-b875-35f06f227a70" />


2. I/P - Pawn , H8 (here, the movement is not possible so the O/P is an exception)
   O/P - Exception - Move Not Possible
   <img width="1204" alt="Screenshot 2025-01-20 at 3 08 52 PM" src="https://github.com/user-attachments/assets/dfeba0fd-6f8b-4343-931b-88f0adad83a8" />
  
 
3. I/P - King , G2 (All 8 Possible movements are possible)
   O/P - G3 , H3 , F3 , F2 , H2 , F1 , G1 , H1
   <img width="701" alt="Screenshot 2025-01-20 at 3 10 35 PM" src="https://github.com/user-attachments/assets/223ee80a-f30b-406e-95c7-430fe814d8d5" />


4. I/P - Queen , G2
   O/P - G3, G4 , G5 , G6, G7, G8 , H3 , F3 , E4 , D5 , C6 , B7 , A8, F2 ,E2 , D2, C2 ,B2 ,A2,H2,F1,G1,H1
   <img width="599" alt="Screenshot 2025-01-20 at 3 11 17 PM" src="https://github.com/user-attachments/assets/4f8a4d38-be2e-4004-ae2e-6f98e6d7b0a0" />
