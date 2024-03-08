package mow;

public class Mower {

    private int rowPos = 1;
    private int colPos = 1;
    private int lastRow;
    private int lastCol;
    private int direction = 1; // 0 = up  1 = right  2 = down  3 = left
    public int checkFront; // 0 = no brink in front  1 = BRICK/BLANK IN FRONT
    public int checkRight; // 0 = no brink in front  1 = BRICK/BLANK IN RIGHT
    public int checkLeft; // 0 = no brink in front  1 = BRICK/BLANK IN LEFT

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

        lastRow = rowPos;
        lastCol = colPos;
        
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

    /* 
    public void setMower() {

        if (mower.getDir()==0) {
            lawnArray[mower.getRow()][mower.getCol()] = '^';
        }
        if (mower.getDir()==1) {
            lawnArray[mower.getRow()][mower.getCol()] = '>';
        }
        if (mower.getDir()==2) {
            lawnArray[mower.getRow()][mower.getCol()] = 'v';
        }
        if (mower.getDir()==3) {
            lawnArray[mower.getRow()][mower.getCol()] = '<';
        }

    }

    */

    public void mow(Yard yard) {
        //yard.mow(rowPos, colPos, ' ');

        if (direction == 0) {
            yard.mow(rowPos, colPos, '^');
        }
        if (direction == 1) {  
            yard.mow(rowPos, colPos, '>');
        }
        if (direction == 2) {
            yard.mow(rowPos, colPos, 'v');
        }
        if (direction == 3) {
            yard.mow(rowPos, colPos, '<');
        }

        // set last position to blank
        yard.mow(lastRow, lastCol, ' ');
        

    }

    public void initialize(Yard yard, int height, int width) {
        //yard.mow(rowPos, colPos, ' ');

        //random corner
        double randomNumber = Math.random();
        int randomNumberInRange = (int) (randomNumber * 4) + 1;

        if(randomNumberInRange == 1)
        rowPos =1; colPos =1;
        if(randomNumberInRange == 2)
        rowPos = 1; colPos = width-2;
        if(randomNumberInRange == 3)
        rowPos = height-2; colPos = 1;
        if(randomNumberInRange == 4)
        rowPos = height-2; colPos = width-2;

        //randm direction
        double randomNumber2 = Math.random();
        int randomNumberInRange2 = (int) (randomNumber2 * 4) + 1;

        if(randomNumberInRange2 == 1)
        setDir(0);
        if(randomNumberInRange2 == 2)
        setDir(1);
        if(randomNumberInRange2 == 3)
        setDir(2);
        if(randomNumberInRange2 == 4)
        setDir(3);

        if (direction == 0) {
            yard.mow(rowPos, colPos, '^');
        }
        if (direction == 1) {  
            yard.mow(rowPos, colPos, '>');
        }
        if (direction == 2) {
            yard.mow(rowPos, colPos, 'v');
        }
        if (direction == 3) {
            yard.mow(rowPos, colPos, '<');
        }

        
        

    }


    public void sense(Yard yard) {
        
        if (direction == 0) {
            if (yard.getValue(rowPos-1,colPos) == 'R' || yard.getValue(rowPos-1,colPos) == ' ') {
                checkFront = 1;
            } else {
                checkFront = 0;
            }
            if (yard.getValue(rowPos,colPos+1) == 'R' || yard.getValue(rowPos,colPos+1) == ' ') {
                checkRight = 1;
            } else {
                checkRight = 0;
            }
            if (yard.getValue(rowPos,colPos-1) == 'R' || yard.getValue(rowPos,colPos-1) == ' ') {
                checkLeft = 1;
            } else {
                checkLeft = 0;
            }
        }
        if (direction == 1) {
            if (yard.getValue(rowPos,colPos+1) == 'R' || yard.getValue(rowPos,colPos+1) == ' ') {
                checkFront = 1;
            } else {
                checkFront = 0;
            }
            if (yard.getValue(rowPos+1,colPos) == 'R' || yard.getValue(rowPos+1,colPos) == ' ') {
                checkRight = 1;
            } else {
                checkRight = 0;
            }
            if (yard.getValue(rowPos-1,colPos) == 'R' || yard.getValue(rowPos-1,colPos) == ' ') {
                checkLeft = 1;
            } else {
                checkLeft = 0;
            }
        }
        if (direction == 2) {
            if (yard.getValue(rowPos+1,colPos) == 'R' || yard.getValue(rowPos+1,colPos) == ' ') {
                checkFront = 1;
            } else {
                checkFront = 0;
            }
            if (yard.getValue(rowPos,colPos-1) == 'R' || yard.getValue(rowPos,colPos-1) == ' ') {
                checkRight = 1;
            } else {
                checkRight = 0;
            }
            if (yard.getValue(rowPos,colPos+1) == 'R' || yard.getValue(rowPos,colPos+1) == ' ') {
                checkLeft = 1;
            } else {
                checkLeft = 0;
            }
        }
        if (direction == 3) {
            if (yard.getValue(rowPos,colPos-1) == 'R' || yard.getValue(rowPos,colPos-1) == ' ') {
                checkFront = 1;
            } else {
                checkFront = 0;
            }
            if (yard.getValue(rowPos-1,colPos) == 'R' || yard.getValue(rowPos-1,colPos) == ' ') {
                checkRight = 1;
            } else {
                checkRight = 0;
            }
            if (yard.getValue(rowPos+1,colPos) == 'R' || yard.getValue(rowPos+1,colPos) == ' ') {
                checkLeft = 1;
            } else {
                checkLeft = 0;
            }
        }
    }





}
