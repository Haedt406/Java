/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author Togusa
 */
public class Engineering {
    double area;
    double pi = 3.14;
    int width;
    int height;
    int change;
    
    public Engineering(int width){
        this.width = width;
    }
    public Engineering(int width, int height){
        this.width = width;
        this.height = height;
    }
    public double Circle()
    {
        //System.out.println(this.width);
        if (this.height != 0 || this.width <0){
            System.out.println("Error");
            return 0;
        } 
        else{
            area = pi*this.width*this.width;
            System.out.println(area);
            return area;
        }
//        area = pi*this.width*this.width;
//        if (area < 0){
//            System.out.println("Error");
//           
//        }
//        else {
//           System.out.println(area); 
//        }
//        
//        return area;
    }

    public double Rectangle(){
        area = this.width * this.height;
        if (area < 0){
            System.out.println("Error");
        }
          else {
           System.out.println(area); 
        }
        
        return area;
    }
    public void changelength(int change){
        
        this.change = change;
        this.width = this.width + this.change;
    }
     
    
}
