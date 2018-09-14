/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author USER
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //PERCABANGAN
       
       //char gender;
        //gender = 'f';
       //if (gender == 'L'|| gender == 'l'||gender == 'M'|| gender == 'm'){
         //  System.out.println("Laki - Laki");
       //}
       //else if (gender=='P'||gender == 'p'||gender == 'F'|| gender == 'f'){
          // System.out.println("Perempuan");
       //}
       //else{
          // System.out.println("Maaf Gender Tidak Valid");
       //}
       
       //int usia = 22;
       //String paras = "Tampan";
       //if(usia >= 21 && paras == "Tampan"){
         //  System.out.println("Saya Mau Menikah");
       //}
       //else {
         //  System.out.println("Saya Tidak Mau Menikah");
       //}
       
       int NilaiAndroid = 66;
       String Wajah = "Tampan";
       String Sifat = "Pengertian dan Bertanggung Jawab";
       String Asal = "Malang";
       char nilaiandroidhuruf;
       
       System.out.println("Apakah Mau Dinikahi ? ");
       
       if (NilaiAndroid >= 85 ){
           nilaiandroidhuruf = 'A';
       }
       else if (NilaiAndroid >= 75){
           nilaiandroidhuruf = 'B';
       }
       else if (NilaiAndroid >= 65){
           nilaiandroidhuruf = 'C';
       }
       else if (NilaiAndroid >= 55){
           nilaiandroidhuruf = 'D';
       }
       else {
           nilaiandroidhuruf = 'E';
       }
       
       
       if (nilaiandroidhuruf == 'A' && Wajah == "Tampan" && Sifat == "Pengertian dan Bertanggung Jawab" && Asal == "Malang"){
           System.out.println("Saya Mau Banget Dinikahi");;
       }
       else if ((nilaiandroidhuruf == 'A'||nilaiandroidhuruf == 'C') && Wajah == "Tampan" && Sifat == "Pengertian dan Bertanggung Jawab" && Asal == "Malang"){
           System.out.println("Boleh Lah....");
       }
       else if (Asal == "Malang"){
           System.out.println("Saya Pikir - Pikir Dulu....");
       }
       else {
           System.out.println("NO.");
       
       }
    }
    
}
