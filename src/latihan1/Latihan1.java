/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan1;

/**
 *
 * @author WINDOWS 10
 */
public class Latihan1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("===== Latihan Soal 1 =====");
        System.out.println();

        int n, x, y, Un, Sn;
        n = 10; // jumlah perulangan
        x = 3; // suku pertama
        y = 5; // selisih 2 suku berurutan
        Un = 0;
        Sn = 0;
        for (int i = 1; i <= n; i++) { // perulangan

            Un = x;
            x += y; // menghitung nilai suku ke-n
            System.out.println("Nilai suku ke-" + i + " adalah = " + Un); // menampilkan nilai suku ke-n

            Sn += Un;

        }

        System.out.println();
        System.out.println("===========================");
        System.out.println();
        System.out.println("Jumlah deret aritmatika yang terdiri dari " + n + " suku adalah " + Sn);
        System.out.println();
    }
    
}
