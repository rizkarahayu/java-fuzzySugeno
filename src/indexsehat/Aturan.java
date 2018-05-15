/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package indexsehat; 
import variabel.TinggiBadan;
import variabel.BeratBadan;
import java.util.Scanner;


/**
 *
 * @author Rizka RS
 */
public class Aturan {
    public static String index;
    public static double max = 0;
    public static double [] u_status = new double[25];
    public static String[] h_status = {
                                       "Sangat Sehat", "Sehat", "Agak Sehat", "Tidak Sehat", "Tidak Sehat",
                                       "Sehat", "Sangat Sehat", "Sehat", "Agak Sehat", "Tidak Sehat",
                                       "Agak Sehat", "Sangat Sehat", "Sangat Sehat", "Agak Sehat", "Tidak Sehat",
                                       "Tidak Sehat", "Sehat", "Sangat Sehat", "Sehat", "Tidak Sehat",
                                       "Tidak Sehat", "Agak Sehat", "Sangat Sehat", "Sehat", "Agak Sehat"
                                      };
    public static void hitung_a(){
        u_status[0] = Math.min(TinggiBadan.sangatpendek(),BeratBadan.sangatkurus());
        u_status[1] = Math.min(TinggiBadan.sangatpendek(),BeratBadan.kurus());
        u_status[2] = Math.min(TinggiBadan.sangatpendek(),BeratBadan.biasa());
        u_status[3] = Math.min(TinggiBadan.sangatpendek(),BeratBadan.berat());
        u_status[4] = Math.min(TinggiBadan.sangatpendek(),BeratBadan.sangatberat());
        u_status[5] = Math.min(TinggiBadan.pendek(),BeratBadan.sangatkurus());
        u_status[6] = Math.min(TinggiBadan.pendek(),BeratBadan.kurus());
        u_status[7] = Math.min(TinggiBadan.pendek(),BeratBadan.biasa());
        u_status[8] = Math.min(TinggiBadan.pendek(),BeratBadan.berat());
        u_status[9] = Math.min(TinggiBadan.pendek(),BeratBadan.sangatberat());
        u_status[10] = Math.min(TinggiBadan.sedang(),BeratBadan.sangatkurus());
        u_status[11] = Math.min(TinggiBadan.sedang(),BeratBadan.kurus());
        u_status[12] = Math.min(TinggiBadan.sedang(),BeratBadan.biasa());
        u_status[13] = Math.min(TinggiBadan.sedang(),BeratBadan.berat());
        u_status[14] = Math.min(TinggiBadan.sedang(),BeratBadan.sangatberat());
        u_status[15] = Math.min(TinggiBadan.tinggi(),BeratBadan.sangatkurus());
        u_status[16] = Math.min(TinggiBadan.tinggi(),BeratBadan.kurus());
        u_status[17] = Math.min(TinggiBadan.tinggi(),BeratBadan.biasa());
        u_status[18] = Math.min(TinggiBadan.tinggi(),BeratBadan.berat());
        u_status[19] = Math.min(TinggiBadan.tinggi(),BeratBadan.sangatberat());
        u_status[20] = Math.min(TinggiBadan.sangattinggi(),BeratBadan.sangatkurus());
        u_status[21] = Math.min(TinggiBadan.sangattinggi(),BeratBadan.kurus());
        u_status[22] = Math.min(TinggiBadan.sangattinggi(),BeratBadan.biasa());
        u_status[23] = Math.min(TinggiBadan.sangattinggi(),BeratBadan.berat());
        u_status[24] = Math.min(TinggiBadan.sangattinggi(),BeratBadan.sangatkurus());     
    }
    
    public static double bobot(){
        for(int i=0;i<25;i++){
            if(max < u_status[i]){
                max = u_status[i];
                index = h_status[i];
            } 
        }
        return max;
    }
}
