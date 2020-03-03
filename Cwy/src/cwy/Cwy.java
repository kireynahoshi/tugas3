/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cwy;

/**
 *
 * @author ASUS
 */
public class Cwy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("hitung balok");

                try {
                    System.out.println("sisi a :");double sisia = a.nextDouble();
                    System.out.println("sisi b :");double sisib = a.nextDouble();
                    System.out.println("sisi c :");double sisic = a.nextDouble();
                    Hitung hitung = new Hitung();
                    double hasila = hitung.volume(sisia, sisib, sisic);
                    double hasilb = hitung.luasp(sisia, sisib, sisic);
                     System.out.println("Volume = "+hasila);
                    System.out.println("Luas Permukaan = "+hasilb);
                    }
             }

    private static class a {

        private static double nextDouble() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public a() {
        }
    }
    }