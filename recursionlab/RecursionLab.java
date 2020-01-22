package recursionlab;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author Benjamin Haedt
 */
public class RecursionLab {

    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        System.out.println("This program only takes 12x12 mazes");
        System.out.println("Current position in the maze is marked by a O");
        FileReader file = new FileReader("input.txt");                                  //reads in a file
        Scanner sc = new Scanner(file);
        int column = 0;
        int row = 0;
        String[][] maze = new String[12][12];                                           //turns the file into a 12x12 maze
        while (sc.hasNext()){
            maze[column][row] = sc.next();
            column++;
            if (column  == 12){
                column = 0;
                row++;
            }
        }
        printMaze(maze);
        String start = findStart(maze);                                                 //finds the start of the maze to determine starting coordinates
        //System.out.println(start);
        String[] parts = start.split("-");                                              // part of finding the start, takes the string and parts it out so we can turn the string value into integer values
        int colStart = Integer.parseInt(parts[0]);
        int rowStart = Integer.parseInt(parts[1]);
        int hCol = 1337;
        int hRow = 1337;
        System.out.println("Starting location: " + colStart + " " + rowStart);
        if (colStart == 0){                                                         //if else statements determine where the right hand placement will be
            hCol = 0;
            hRow = rowStart + 1;
        }
        else if (colStart == 11){
            hCol = 11;
            hRow = rowStart - 1;
        }
        else if (rowStart == 0){
            hCol = colStart - 1;
            hRow = 0;
        }
        else if (rowStart == 11){
            hCol = colStart + 1;
            hRow = 11;
        }
        if ((hCol == 1337) || (hRow == 1337)){                                      //just extra error checking, if our hand row and column have not been initialized then program will terminate
            System.out.println("Key variables could not be initialized, please try again");
            System.exit(1);
        }
        boolean win = recursiveAlgorithm(maze, colStart, rowStart, hCol, hRow);                 //calls our recursiveAlgorithm to run through the maze
        if (win == true){                                                                   //win conditions, should be unnessesary with how this is programmed, the recursive algorithm can only be exited after successful recursive loop
            System.out.println("'A WINNER IS YOU'");
        }
        else{
            System.out.println("'NOT THIS GAME'");
        }
    }
    
    
    public static boolean recursiveAlgorithm(String[][]maze, int col, int row, int hCol, int hRow){ //recursive algorithm to traverse through the maze
        String contRec;
        boolean win = false;
        Scanner console = new Scanner(System.in);
        contRec = console.nextLine();
        if(hRow > row){                                                                             //eastbound directions
                if((".".equals(maze[hCol][hRow])) || ("X".equals(maze[hCol][hRow]))){               //turn right if '.' detected
                    maze[hCol][hRow] = "O";
                    System.out.println("TURNED RIGHT FACING EAST");
                    maze[col][row] = "X";
                    row = hRow;
                    col = hCol;
                    hCol--; 
                }
                else if((".".equals(maze[col+1][row])) || ("X".equals(maze[col+1][row]))){          //continue eastbound if cant turn right
                    maze[col][row] = "X";
                    System.out.println("IN FACING EAST");
                    maze[col+1][row] = "O";
                    col++;
                    hCol++;
                }   

                else if((".".equals(maze[col][row-1])) || ("X".equals(maze[col][row-1]))){          //turn left if cant go forward, then rearange right hand coordinates and bearing
                    maze[col][row] = "X";
                    maze[col][row-1] = "O";
                    hCol++;
                    hRow-=2;
                    row--;
                }
                else if("F".equals(maze[col+1][row])){                                              //win if next block in the eastbound direction is 'F'
                    maze[col][row]="X";
                    win = true;
                }
                else if("X".equals(maze[col-1][row])){                                              //if all other options exhausted, turn around and track backwards until new path discovered
                    maze[col-1][row] = "O";
                    maze[col][row] = "X";
                    col--;
                    hRow-=2;
                    hCol--;
                }
        }
        else if(hRow < row){                                                                       //the same as eastbound, except westbound part
                if((".".equals(maze[hCol][hRow])) || ("X".equals(maze[hCol][hRow]))){
                    maze[hCol][hRow] = "O";
                    System.out.println("TURNED RIGHT FACING WEST");
                    maze[col][row] = "X";
                    row = hRow;
                    col = hCol;
                    hCol++; 
                }
                else if((".".equals(maze[col-1][row])) || ("X".equals(maze[col-1][row]))){
                    maze[col][row] = "X";
                    System.out.println("IN FACING WEST");
                    maze[col-1][row] = "O";
                    col--;
                    hCol--;
                }   

                else if((".".equals(maze[col][row+1])) || ("X".equals(maze[col][row+1]))){
                    maze[col][row] = "X";
                    maze[col][row+1] = "O";
                    hCol--;
                    hRow+=2;
                    row++;
                }
                else if("F".equals(maze[col-1][row])){
                    maze[col][row]="X";
                    win = true;
                }
                else if("X".equals(maze[col+1][row])){
                    maze[col+1][row] = "O";
                    maze[col][row] = "X";
                    col++;
                    hRow+=2;
                    hCol++;
                }
        }
        
        else if (hCol > col){                                                                           //the same as eastbound, except northbound part
                if((".".equals(maze[hCol][hRow])) || ("X".equals(maze[hCol][hRow]))){
                    maze[hCol][hRow] = "O";
                    System.out.println("TURNED RIGHT WAS FACING NORTH");
                    maze[col][row] = "X";
                    row = hRow;
                    col = hCol;
                    hRow++;
                }
                else if((".".equals(maze[col][row-1])) || ("X".equals(maze[col][row-1]))){
                    maze[col][row] = "X";
                    System.out.println("IN FACING NORTH");
                    maze[col][row-1] = "O";
                    row--;
                    hRow--;
                }   

                else if((".".equals(maze[col-1][row])) || ("X".equals(maze[col-1][row]))){
                    maze[col][row] = "X";
                    maze[col-1][row] = "O";
                    col--;
                    hRow--;
                    hCol-=2;
                }
                else if("F".equals(maze[col][row-1])){
                    maze[col][row]="X";
                    win = true;
                }
                else if("X".equals(maze[col][row+1])){
                    maze[col][row] = "O";
                    row++;
                    hCol-=2;
                    hRow--;
                }
        }
        else if (hCol < col){                                                                       //the same as eastbound, except southbound part
                if((".".equals(maze[hCol][hRow])) || ("X".equals(maze[hCol][hRow]))){
                    maze[hCol][hRow] = "O";
                    System.out.println("TURNED RIGHT WAS FACING SOUTH");
                    maze[col][row] = "X";
                    row = hRow;
                    col = hCol;
                    hRow--;
                }
                else if((".".equals(maze[col][row+1]))|| ("X".equals(maze[col][row+1]))){
                    maze[col][row] = "X";
                    System.out.println("IN FACING SOUTH");
                    maze[col][row+1] = "O";
                    row++;
                    hRow++;
                }   

                else if((".".equals(maze[col+1][row])) || ("X".equals(maze[col+1][row]))){
                    maze[col][row] = "X";
                    maze[col+1][row] = "O";
                    col++;
                    hRow++;
                    hCol+=2;
                }
                else if("F".equals(maze[col][row-1])){
                    maze[col][row]="X";
                    win = true;
                }
                else if("X".equals(maze[col][row+1])){
                    maze[col][row] = "O";
                    row--;
                    hCol+=2;
                    hRow++;
                }
        }

       else{                                                                                    //if all paths failed, error will print, indicating an error in algorithm or maze
            System.out.println("ERROR");
        }
        printMaze(maze);                                    
        if (win != true){                                                                       //our call to recursivly run through the maze using the same directions
           recursiveAlgorithm(maze,col,row,hCol,hRow); 
        }
        return true;
    }
    
    public static void printMaze(String[][]maze){                                                //prints the current maze path
        int column = 0;
        int row = 0;
        for (int i = 144; i >0; i--){
            System.out.print(maze[column][row]);
            column++; 
            System.out.print(" ");
            if (column  == 12){
                System.out.println();
                column = 0;
                row++;
            }       
        }  
    }
    
    public static String findStart(String[][]maze){                                             //finds the start of the maze, note that the start cannot be in a corner
        String startChar = ".";
        String position = null;
//        if(maze[0][2].equals(startChar))
//            position =  "found start";
        for(int i = 11; i >0; i--){
            if (maze[0][i].equals(startChar)){
                position = "0-" + Integer.toString(i);
                break;
            }
            if (maze[11][i].equals(startChar)){
                position = "11-" + Integer.toString(i);
                break;
            }
            if(maze[i][0].equals(startChar)){
                position = Integer.toString(i) + "-0";
                break;
            }
                
            if(maze[i][11].equals(startChar)){
                position = Integer.toString(i) + "-11";
                break;
            }
        }
        if((position == null) || (position == "11-11") || (position == "0-0") || (position == "0-11") || (position == "11-0")){     //if start has not or cannot be found program will end
            System.out.println("Start Cannot be found or is in an invalid position");
            System.exit(1);
        }
        return position;
    }
}     
        
//        int count = 0;
//
//        char maze2[][] = new char[12][25];
//
//        column = 0;
//        row = 0;
//        int test = 0;
//        while (sc.hasNext()){
//            maze2[row][column] = sc.next().charAt(test);
//            row++;
//            if (row  == 25){
//                row = 0;
//                column++;
//            }
//            test++;
//        }
//        column = 0;
//        row = 0;
//        for (int i = 300; i >0; i--){
//            System.out.print(maze2[row][column]);
//            row++;
//            if (row  == 25){
//                System.out.println();
//                row = 0;
//                column++;
//            }
//            
//    }        
        //System.out.println(System.getProperty("user.dir"));
//        try(File file = new File()){
//            String line = br.readLine();
//            int lineNum = 0;
//            while(line!=null) {
//                lineNum++;
//                String[]
//            }
//     
//        }
//        catch(IOException e){                                                  //part of our try catch, if try cant open the file, it will throw this error
//            System.out.println("Exception");
//        }

