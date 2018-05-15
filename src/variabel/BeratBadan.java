/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variabel;

/**
 *
 * @author Rizka RS
 */
public class BeratBadan {
    private static double berat;
    private static double titik[] =  {0,40,45,50,55,60,65,80,85};

    public void setBerat(double berat){
        BeratBadan.berat = berat;
    }
    public double getBerat(){
        return berat;
    }
    
    public static double sangatkurus(){
        if((berat>=titik[0])&&(berat<=titik[1])){
            return 1;
        }
        else if((berat>titik[1])&&(berat<titik[2])){
            return (titik[2]-berat)/(titik[2]-titik[1]);
        }
        else{
            return 0;
        }
    }
    
    public static double kurus(){
        if((berat>=titik[2])&&(berat<=titik[3])){
           return 0;
        }
        else if((berat>titik[1])&&(berat<titik[2])){
           return ((berat-titik[1])/(titik[2]-titik[1]));
           
        }
        else if((berat>titik[3])&&(berat<titik[4])){
            return ((titik[4]-berat)/(titik[4]-titik[3]));
        }
        else{
            return 0;
        }
    }
    
    public static double biasa(){
        if((berat>=titik[4])&&(berat<=titik[5])){
           return 1;
        }
        else if((berat>titik[3])&&(berat<titik[4])){
            return ((berat-titik[3])/(titik[4]-titik[3]));
        }
        else if((berat>titik[5])&&(berat<titik[6])){
            return ((titik[6]-berat)/(titik[6]-titik[5]));
         }
        else{
            return 0;
        }
    }
    
    public static double berat(){
        if((berat>=titik[6])&&(berat<=titik[7])){
            return 1;
        }
        else if((berat>titik[5])&&(berat<titik[6])){
            return ((berat-titik[5])/(titik[6]-titik[5]));
        }
        else if((berat>titik[7])&&(berat<titik[8])){
            return ((titik[8]-berat)/(titik[8]-titik[7]));
        }
        else{
            return 0;
        }   
    }
    public static double sangatberat(){
        if((berat>=titik[8])){
           return 1;
        }
        else if((berat>titik[7])&&(berat<titik[8])){
            return ((berat-titik[7])/(titik[8]-titik[7]));
        }
        else{
            return 0;
        }   
    }   
}
