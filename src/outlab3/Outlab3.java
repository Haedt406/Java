package outlab3;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Benjamin Haedt
 */
public class Outlab3 {                                                          //i left in a lot of code that i used for testing double circular linked lists

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {

        Outlab3 outlab3 = new Outlab3();                                         //creates a instance of outlab3
       
    }


Outlab3()throws IOException {
int input;
System.out.println("Enter 1 to read from input.txt or 0 to quit");              //my menu system, gota have interactive menus
System.out.println("You know me, I like my menu's");
Scanner console = new Scanner(System.in);
input = console.nextInt();
switch (input){
case 1:
        PrintWriter linkedListFile = new PrintWriter(new FileWriter(new File("LinkedListProgram.txt")), true);  //creates a file or modifying existing one
        linkedListFile.println("Program 4");
        linkedListFile.println("---------");
        linkedListFile.println();
        linkedListFile.close();
        try(BufferedReader br = new BufferedReader(new FileReader("input.txt"))){   //tries to open input.txt to read the data from it
                for(String line; (line = br.readLine()) != null;){                  //splits the file line by line
                    String[] info = line.split(" ");                              //puts the line from the file into a string array
                    int N = Integer.parseInt(info[0]);                              //takes the first input in the string array and sets it as our N value
                    int k = Integer.parseInt(info[1]);                              //takes the second input in the string array and sets it as our k value
                    int m = Integer.parseInt(info[2]);                              //takes the three input in the string array and sets it as our m value
                    if(N == 0 && k == 0 && m == 0){                                   //if all the values of the line are 0 then it ends the program              
                        PrintWriter finishEdit = new PrintWriter(new FileWriter("LinkedListProgram.txt", true));
                         finishEdit.println("End of Program 4");
                         finishEdit.close();
                        return;
                    }
                    PoliticsList list = new PoliticsList(N, k, m);                  //creates a new instance of the politicslist class with our values from the input.txt file
                    list.addPolitics();                                             //creates the circular linked list with the size of the N value
                    list.candidateSelector();                                        //uses our k and m values to decide who is chosen in our double circular linked list
                }
     
        }catch(IOException e){                                                  //part of our try catch, if try cant open the file, it will throw this error
            System.out.println("Exception");
        }
         
case 0:
    break;
}
}
}
// Outlab3() throws IOException{
//        Scanner console = new Scanner(System.in);
//        Scanner inFile;
//        int x;
//        int y = 1;
//        PoliticsList list = new PoliticsList();
//        System.out.println("Enter 1 to play with the double circular linked list, or 2 to work with file input and output");
//        y = console.nextInt();
//        switch (y){
//            case 1:
//                 while (y != 0){
//                System.out.println("enter 1 to create node, 2 to print list, 3 to get data from last element, 4 to get size, 8 to get data from first element, 0 to exit");
//                System.out.println("enter 5 to create a linked list with x number of nodes, 6 will count clockwise and remove the node, 7 will count counter clockwise and remove the node");
//                y = console.nextInt();
//            if (y == 1){
//                System.out.println("create a new node with (int) value");
//                x = console.nextInt();
//                Node node = new Node(x);
//                list.add(node);
//            }
//            if (y == 2){
//                list.print();
//            }
//            if (y ==3){
//                System.out.println(list.last());
//            }
//            if (y ==4){
//                System.out.println(list.size());
//            }
//            if (y ==5){
//                System.out.println("enter how many nodes to be created");
//                x = console.nextInt();
//                for (int i = 0; i < x; i++){
//                 Node node = new Node(i+1);
//                list.add(node);
//                }
//            }
//            if (y == 6){
//                System.out.println("enter what node will start from the first candidate and move clockwise around then delete that node");
//                x = console.nextInt();
//                //list.setFirst();
//                list.kSelector(x);
//            }    
//        
//                 if (y == 7){
//                System.out.println("enter what node will start from the first candidate and move counter clockwise around then delete that node");
//                x = console.nextInt();
//                //list.setFirst();
//                list.mSelector(x);
//                 }
//            if (y ==3){
//                System.out.println(list.first());
//            }
//        }
//            case 2:
//            
//            
//            
//          
//        }
//        }
//} 
// 
// 	
//			if(count==0) N=num; count++
//			else ==1 j=num; count++
//			else ==2 k=num; count=0
			
//        
//            System.out.println(num);
//            if (num !=0){
//                fout.write(num + " ");
//            }
//            else{
//                break;
//            }
//            }
//                
//                
//                
//            }
            //Scanner question= new Scanner(System.in);
//           Scanner fin; 
//            FileOut fout;
//            //String input = question.next();
//        //System.out.println(fileName);
//        File file = new File("C:\\Users\\Togusa\\Documents\\NetBeansProjects\\Outlab3\\input.txt");
//        try{
//            fin = new Scanner(new File("C:\\Users\\Togusa\\Documents\\NetBeansProjects\\Outlab3\\input.txt"));
//        }
//        catch(IOException e)
//        {
//            System.err.println(e);
//        }
//                System.out.println("Here22");
//                System.out.println(fin.nextInt());
//        fout = new FileOut("output.txt");
//        int count=0;
//        while(fin.hasNext()){
//            String num = fin.next();
//            fout.write(num);
//			
////			if(count==0) N=num; count++
////			else ==1 j=num; count++
////			else ==2 k=num; count=0
////			
//        
////            System.out.println(num);
////            if (num !=0){
////                fout.write(num + " ");
////            }
////            else{
////                break;
////            }
//            }
//    }
                

// public void fileInOut(){
//     
// }
            
            
            
//            String myPolitics;
//            switch (y) {
//                case 1:{
//                    System.out.println("enter the file to read from");
//                    String fileToOpen = question.nextLine();
//                    File file = new File(fileToOpen);
//                    
//                try {
//                    Scanner sc = new Scanner(file);
//                    while (sc.hasNextLine()){
//                       myPolitics = sc.nextLine();
//                    }
//                    //System.out.println(myPoltics);
//                } catch (FileNotFoundException ex) {
//                    Logger.getLogger(Outlab3.class.getName()).log(Level.SEVERE, null, ex);
//                }
//                }
//            }

//    public class FileOpenReadWrite {
//
//    Scanner fin;
//    FileOut fout;
//    
//    FileOpenReadWrite(){
//        //System.out.println(fileName);
//        File file = new File("C:\\Users\\Togusa\\Documents\\NetBeansProjects\\Outlab3\\input.txt");
//        
//        
//        try{
//            fin = new Scanner(new File("C:\\Users\\Togusa\\Documents\\NetBeansProjects\\Outlab3\\input.txt"));
//        }catch(IOException e)
//        {
//            System.err.println(e);
//        }
//                System.out.println("Here22");
//        fout = new FileOut("output.txt");
//        int count=0;
//        while(fin.hasNext()){
//            String num = fin.next();
//            fout.write(num);
//			
////			if(count==0) N=num; count++
////			else ==1 j=num; count++
////			else ==2 k=num; count=0
////			
//        
////            System.out.println(num);
////            if (num !=0){
////                fout.write(num + " ");
////            }
////            else{
////                break;
////            }
//            }
//    }
    

                
            
//            
//            while(inFile.hasNext()){
//            int num = inFile.nextInt();
//            System.out.println(num);
//            }
//            
////            for( int i = 0; i < inFile.length(); i++){
////                System.out.println(file.charAt(i));
////            }
//                
//                    break;
//                }
//                case 0:
//                    System.exit(0);
//    }
//    
//}
      


        
