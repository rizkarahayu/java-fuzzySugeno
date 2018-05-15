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
public class TinggiBadan {
    public static double tinggi;
    public static double titik[] = {0,115,120,140,145,160,165,180,185};
    
    public void setTinggi(double tinggi){
        TinggiBadan.tinggi = tinggi;
    }
    
    public double getTinggi(){
        return tinggi;
    }
    
    public static double sangatpendek(){
        if((tinggi>=titik[0])&&(tinggi<=titik[1])){
            return 1;
            
        }
        else if((tinggi>titik[1])&&(tinggi<titik[2])){
            return ((titik[2]-tinggi)/(titik[2]-titik[1]));
        }
        else{
            return 0;
        }
    }
    
    public static double pendek(){
        if((tinggi>=titik[2])&&(tinggi<=titik[3])){
            return 1;
        }
        else if((tinggi>titik[1])&&(tinggi<titik[2])){
            return ((tinggi-titik[1])/(titik[2]-titik[1]));
        }
        else if((tinggi>titik[3])&&(tinggi<titik[4])){
            return ((titik[4]-tinggi)/(titik[4]-titik[3]));
        }
        else{
            return 0;
            
        }
    }
    
    public static double sedang(){
        if((tinggi>=titik[4])&&(tinggi<=titik[5])){
            return 1;
        }
        else if((tinggi>titik[3])&&(tinggi<titik[4])){
            return ((tinggi-titik[3])/(titik[4]-titik[3]));
        }
        else if((tinggi>titik[5])&&(tinggi<titik[6])){
            return ((titik[6]-tinggi)/(titik[6]-titik[5]));
        }
        else{
            return 0;   
        }
    }
    
    public static double tinggi(){
        if((tinggi>=titik[6])&&(tinggi<=titik[7])){
            return 1;
        }
        else if((tinggi>titik[5])&&(tinggi<titik[6])){
            return ((tinggi-titik[5])/(titik[6]-titik[5]));
        }
        else if((tinggi>titik[7])&&(tinggi<titik[8])){
            return ((titik[8]-tinggi)/(titik[8]-titik[7]));
        }
        else{
           return 0;
           
        }   
    }
    public static double sangattinggi(){
        if((tinggi>=titik[8])){
            return 1;
        }
        else if((tinggi>titik[7])&&(tinggi<titik[8])){
            return ((tinggi-titik[7])/(titik[8]-titik[7]));
        }
        else{
            return 0;
            
        }   
    }   
}
