// Kerkimi i elementit ne matrice
import javax.swing.*;  

public class Search 
{
   public static void main(String[] args) {
      int n=3;
      int count=0;
      int [][] M = {
          {1,2,3},   //rreshtat duhet te jene me vlera rritese, gjithashtu edhe kolonat
          {2,3,4},
          {3,4,5}
         }; 
         
    /*  int [][] M =        {    {  1,  2,  3,  4,  5 },
                                 {  6,  7,  8,  9, 10 },
                                 { 11, 12, 13, 14, 15 },
                                 { 16, 17, 18, 19, 20 },
                                 { 21, 22, 23, 24, 25 }
                             };
   */
   //    nese deshirojme me Input Dialog..
   //    int[][] M = new int[n][n];
   //    for(int i=0;i<M.length; i++)
   //    {
   //       for(int j=0;j<M.length; j++)
   //       {
   //          M[i][j] = new Integer(JOptionPane.showInputDialog("Shtyp elementin m[" + i + "," + j + "] te matrices M" )).intValue();
   //       }
   //    }
   
      int x = new Integer(JOptionPane.showInputDialog("Shtyp numrin per kerkim ne matricen M")).intValue();
      boolean ugjet =false;
      while(!ugjet) {
         for(int i=0; i<M.length; i++) {
            for(int j=0; j<M[0].length; j++) {
               if(x == M[i][j]) {
                  x=M[i][j];
                  System.out.println("numri "+ x + " ndodhet ne poziten " + i + "," +j + " ne matricen M");
                  ugjet=true;
               }
            }
         }
         if(!ugjet) {
            System.out.println("Numri " + x + " nuk eshte ne matricen e dhene");
            System.exit(0);
         }
         //int y=1;
         //int count2=0;
         for(int i=1; i<M.length; i++) {
            for(int j=0; j<i; j++) {
               count=count+M[i][j];
               if(x<M[i][j]) {
                  x=M[i][j];
                  ugjet=true;
               }
            // else
            //    if(x>M[i][j])
            //    {
            //       count2=count2+M[i][j];
            //       x=M[i][j];
            //    }
            }
         }
      //          System.out.println("elementi max:"+ x);
      //          System.out.println("elementi min:"+ y);
      
         //numri i krahasimeve(count) eshte baraz me shumen e elementeve nen diagonale te matrices M
         System.out.println("Numri i krahasimeve per x<M[i][j]: " + count);
      
         //System.out.println("Numri i krahasimeve per x>M[i][j]:" + count2);
         Search p2= new Search();
         long startTime = System.nanoTime();
         //myCall(); 
         long stopTime = System.nanoTime();
         System.out.print("Koha e ekzekutimit :");
         System.out.println((stopTime - startTime)/1000.0 + " milsec");
      }
   }
}