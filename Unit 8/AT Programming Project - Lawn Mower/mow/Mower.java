package mow;

public class Mower {

    private int rowPos = 1;
    private int colPos = 1;
    private int direction; // 0 = up  1 = right  2 = down  3 = left
    public int checkBrick; // 0 = no brink in front  1 = BRICK IN FRONT

    public int getRow() {
        return rowPos;
    }

    public int getCol() {
        return colPos;
    }

    
    public void setPos(int newRow, int newCol) { 
        rowPos = newRow;
        colPos = newCol;
    }

    public int getDir() {
        return direction;
    }

    public void setDir(int newDir) {
        direction = newDir;
    }

    public void turnRght() {
        direction = direction +1;
        if (direction > 3) {
            direction = 0;
        }
    }

    public void turnLeft() {
        direction = direction -1;
        if (direction < 0) {
            direction = 3;
        }
    }

    public void moveFoward() {
        
        if (direction == 0) {
            setPos(rowPos-1, colPos);
        }
        if (direction == 1) {
            setPos(rowPos, colPos+1);
        }
        if (direction == 2) {
            setPos(rowPos+1, colPos);
        }
        if (direction == 3) {
            setPos(rowPos, colPos-1);
        }

    }

    public void mow(Yard yard) {
        yard.mow(rowPos, colPos, ' ');
    }


    public void sense(Yard yard) {
        
        if (direction == 0) {
            if (yard.getValue(rowPos-1,colPos) == 'R' || yard.getValue(rowPos-1,colPos) == ' ') {
                checkBrick = 1;
            } else {
                checkBrick = 0;
            }
        }
        if (direction == 1) {
            if (yard.getValue(rowPos,colPos+1) == 'R' || yard.getValue(rowPos,colPos+1) == ' ') {
                checkBrick = 1;
            } else {
                checkBrick = 0;
            }
        }
        if (direction == 2) {
            if (yard.getValue(rowPos+1,colPos) == 'R' || yard.getValue(rowPos+1,colPos) == ' ') {
                checkBrick = 1;
            } else {
                checkBrick = 0;
            }
        }
        if (direction == 3) {
            if (yard.getValue(rowPos,colPos-1) == 'R' || yard.getValue(rowPos,colPos-1) == ' ') {
                checkBrick = 1;
            } else {
                checkBrick = 0;
            }

        }
    }





}
