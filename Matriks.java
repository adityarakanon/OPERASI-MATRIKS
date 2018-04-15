
package matriks;
/* AZMIARDHY ZULKIFLI FARMADIANSYAH(17523225)
   ADITYA RAKA PRADANA (17523223)
*/
import java.util.*;
public class Matriks {
    Scanner sc =new Scanner(System.in);
    public void Play() {
            int x;
            do {
            DisplayMenu();
            x=Menu();
            Proses(x);
            } while (x != 0);
        
        }
    public int Menu(){
        System.out.println(" pilih angka 0-5");
            int pilihan;
            pilihan = sc.nextInt();
            return pilihan;
    }
    
    public void Proses (int p){
        if (p==1) {
        Penjumlahan();
        }
        else if(p==2){
        Pengurangan();
        }
        else if(p==3){
        Perkalian();
        }
        else if(p==4){
        Transpose();
        }
        else if(p==5){
        PerkalianSkalar();
        }
        else {
        System.out.println("TERIMAKASIH");
        }
    }
    public void DisplayMenu(){
        System.out.println("SILAHKAN PILIH OPERASI MATRIKS");
        System.out.println("1.penjumlahan");
        System.out.println("2.pengurangan");
        System.out.println("3.perkalian");
        System.out.println("4.transpose");
        System.out.println("5.perkalian skalar");
        System.out.println("0.keluar");
    }
    
    public void Penjumlahan(){
            System.out.println("#MATRIKS PEJUMLAHAN#");
            System.out.println("Matriks 1");
            System.out.println("masukkan baris");
        int q =sc.nextInt();
            System.out.println("masukkan kolom");
        int w =sc.nextInt();
            System.out.println("masukkan matriksnya");
        int matriksp1[][]= new int[q][w];
            for (int i=0;i<q;i++) {
            for (int j=0;j<w;j++) {
            matriksp1 [i][j] = sc.nextInt();
        }
            }
            System.out.println("Matriks 2");
            System.out.println("masukkan baris");
        int d =sc.nextInt();
            System.out.println("masukkan kolom");
        int c =sc.nextInt();
            System.out.println("masukkan matriksnya");
        int matriksp2[][]= new int[d][c];
            for (int i=0;i<d;i++) {
            for (int j=0; j<c;j++) {
            matriksp2[i][j] = sc.nextInt();
            }
            }
            System.out.println("hasilnya adalah ");
            for (int i=0; i<matriksp1.length;i++){
            for (int j=0; j<matriksp2.length;j++){
            int penjumlahan = matriksp1[i][j] + matriksp2[i][j];
                
            
                System.out.print(penjumlahan + " ");
            }
                System.out.println();
            }
    }
            
        public void Pengurangan(){
        System.out.println("#MATRIKS PENGURANGAN#");
        System.out.println("Matriks 1 ");
        System.out.println("masukkan baris");
        int e =sc.nextInt();
        System.out.println("masukkan kolom");
        int r =sc.nextInt();
        System.out.println("masukkan matriksnya");
        int matriksp3[][]= new int[e][r];
        for (int i=0;i<e;i++) {
        for (int j=0;j<r;j++) {
            matriksp3 [i][j] = sc.nextInt();
        }
            }
        System.out.println("Matriks 2");
        System.out.println("masukkan baris");
        int t =sc.nextInt();
        System.out.println("masukkan kolom");
        int y =sc.nextInt();
        System.out.println("masukkan matriksnya");
        int matriksp4[][]= new int[t][y];
        for (int i=0;i<t;i++) {
        for (int j=0; j<y;j++) {
            matriksp4[i][j] = sc.nextInt();
        }
        }
            System.out.println("hasilnya adalah");
            for (int i=0; i<matriksp3.length;i++){
            for (int j=0; j<matriksp4.length;j++){
            int pengurangan = matriksp3[i][j] - matriksp4[i][j];
          
               
            System.out.print(pengurangan + " ");
            }
            System.out.println();
            }
        }
        
        public void Perkalian(){
        int a,b,c,d;
        System.out.println("#MATRIKS PENGURANGAN#");        
        System.out.println("matriks harus memliki ordo yang sama.");
        System.out.println("Masukkan matriks pertama : ");
        System.out.print("jumlah Baris  : ");
        a = sc.nextInt();
        System.out.print("jumlah Kolom : ");
        b = sc.nextInt();
        System.out.println("Masukkan matriks kedua : ");
        System.out.print("jumlah Baris  : ");
        c = sc.nextInt();
        System.out.print("jumlah Kolom  : ");
        d = sc.nextInt();
        int matriksp5[][] = new int[a][b];
        System.out.println("Masukkan angka matriks pertama : ");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                matriksp5[i][j] = sc.nextInt();
            }
        }
        int matriksp6[][] = new int[c][d];
        System.out.println("Masukkan angka matriks kedua : ");
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < d; j++) {
                matriksp6[i][j] = sc.nextInt();
            }
        }     
        int hasil[][] = new int[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < d; j++) {
                int x = 0;
                for (int k = 0; k < c; k++) {
                    x += matriksp5[i][k] * matriksp6[k][j];
                }
                hasil[i][j] = x;
            }
        }
        System.out.println("");
        System.out.println("hasil perkalian matriks adalah :");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < d; j++) {
                System.out.print(hasil[i][j] + " ");
            }
            System.out.println("");
        }
        }
        
        public void Transpose(){
        System.out.println("#MATRIKS TRANSPOSE#");        
        int baris,kolom;
        System.out.println("masukkan jumlah baris X kolom ");
        System.out.print("Baris : ");
        baris = sc.nextInt();
        System.out.print("Kolom : ");
        kolom = sc.nextInt();

        int matriksp8[][] = new int[baris][kolom];
        System.out.println("Masukkan matriks : ");
        for (int i=0; i<baris; i++) {
            for (int j=0; j<kolom; j++) {
                matriksp8[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matriks yang ditulis :");
        for (int i=0; i<baris; i++) {
            for (int j=0; j<kolom; j++) {
                System.out.print(matriksp8[i][j] + " ");
            }
            System.out.println("");
        }

        int matriksTranspose[][] = new int[kolom][baris];
        for (int i=0; i<kolom; i++) {
            for (int j=0; j<baris; j++) {
                matriksTranspose[i][j] = matriksp8[j][i];
            }
        }
        System.out.println("Matriks transpose :");
        for (int i=0; i<kolom; i++){
            for (int j=0; j<baris; j++){
                System.out.print(matriksTranspose[i][j]+" ");
            }
            System.out.println("");
        }
        }
        
        public void PerkalianSkalar(){
            System.out.println("#MATRIKS PERKALIAN SKALAR#");
            int x , n , m;
            System.out.println("masukkan angka perkalian");
            x= sc.nextInt();
            System.out.println("masukkan berapa baris matriks");
            m= sc.nextInt();
            System.out.println("masukkan berapa kolom matriks");
            n =sc.nextInt();
        
        int matriksp9[][] = new int [n][m];
        System.out.println("Masukkan angka matriks pertama : ");
        for (int i=0; i<n; i++){
            for (int j=0 ;j<m ;j++){
            matriksp9[i][j] =sc.nextInt();
            }
        }
        System.out.println("Matriks perkalian skalar :");
        for (int i=0;i<n;i++){
            for (int j=0; j<m; j++){
               int skalar = x * matriksp9[i][j];
            System.out.print(skalar+" ");
            }
            System.out.println("");
           
        }
            
        }
        
         public static void main(String [] args){
            Matriks m = new Matriks();
            m.Play();
        
        
        }
    }

        
