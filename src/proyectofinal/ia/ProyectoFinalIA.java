/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal.ia;

import static java.lang.Math.random;
import java.time.Clock;
import java.util.Random;
/**
 *
 * @author MAnuel
 */
public class ProyectoFinalIA {

    String MatrizPrincipal[][] = new String[16][16];
    String MatrizSolucion[][] = new String[16][16];
    int Tabu[] = new int[6];
    int fil = 16;
    int col = 16;
    Random random = new Random();
    int MejorSolucion = 1000;

    /**
     * @param args the command line arguments
     */
     public int GeneraNumeros() {
        //se usa para cargar los empleados de forma aleatorea
        int numero2 = (int) (random.nextDouble() * 15 + 2);
        return numero2;
    }

    public void CargarMatriz() {
        MatrizPrincipal[0][0] = "06";
        MatrizPrincipal[1][0] = "4";
        MatrizPrincipal[2][0] = "8";
        MatrizPrincipal[0][1] = "16";
        MatrizPrincipal[1][1] = "9";
        MatrizPrincipal[2][1] = "57";
        MatrizPrincipal[0][2] = "O2";
        MatrizPrincipal[1][2] = "40";
        MatrizPrincipal[2][2] = "34";
        MatrizPrincipal[0][3] = "O3";
        MatrizPrincipal[1][3] = "43";
        MatrizPrincipal[2][3] = "38";
        MatrizPrincipal[0][4] = "O4";
        MatrizPrincipal[1][4] = "22";
        MatrizPrincipal[2][4] = "28";
        MatrizPrincipal[0][5] = "O5";
        MatrizPrincipal[1][5] = "65";
        MatrizPrincipal[2][5] = "56";
        MatrizPrincipal[0][6] = "O6";
        MatrizPrincipal[1][6] = "75";
        MatrizPrincipal[2][6] = "42";
        MatrizPrincipal[0][7] = "O7";
        MatrizPrincipal[1][7] = "14";
        MatrizPrincipal[2][7] = "80";
        MatrizPrincipal[0][8] = "08";
        MatrizPrincipal[1][8] = "96";
        MatrizPrincipal[2][8] = "55";
        MatrizPrincipal[0][9] = "O9";
        MatrizPrincipal[1][9] = "80";
        MatrizPrincipal[2][9] = "26";
        MatrizPrincipal[0][10] = "O10";
        MatrizPrincipal[1][10] = "74";
        MatrizPrincipal[2][10] = "63";
        MatrizPrincipal[0][11] = "O11";
        MatrizPrincipal[1][11] = "32";
        MatrizPrincipal[2][11] = "44";
        MatrizPrincipal[0][12] = "O12";
        MatrizPrincipal[1][12] = "82";
        MatrizPrincipal[2][12] = "93";
        MatrizPrincipal[0][13] = "O13";
        MatrizPrincipal[1][13] = "19";
        MatrizPrincipal[2][13] = "76";
        MatrizPrincipal[0][14] = "O14";
        MatrizPrincipal[1][14] = "38";
        MatrizPrincipal[2][14] = "62";
        MatrizPrincipal[0][15] = "O15";
        MatrizPrincipal[1][15] = "35";
        MatrizPrincipal[2][15] = "76";

        MatrizPrincipal[3][0] = "M3";
        MatrizPrincipal[4][0] = "M4";
        MatrizPrincipal[5][0] = "M5";
        MatrizPrincipal[3][1] = "30";
        MatrizPrincipal[4][1] = "13";
        MatrizPrincipal[5][1] = "95";
        MatrizPrincipal[3][2] = "93";
        MatrizPrincipal[4][2] = "38";
        MatrizPrincipal[5][2] = "86";
        MatrizPrincipal[3][3] = "30";
        MatrizPrincipal[4][3] = "36";
        MatrizPrincipal[5][3] = "89";
        MatrizPrincipal[3][4] = "19";
        MatrizPrincipal[4][4] = "66";
        MatrizPrincipal[5][4] = "44";
        MatrizPrincipal[3][5] = "85";
        MatrizPrincipal[4][5] = "81";
        MatrizPrincipal[5][5] = "87";
        MatrizPrincipal[3][6] = "17";
        MatrizPrincipal[4][6] = "80";
        MatrizPrincipal[5][6] = "50";
        MatrizPrincipal[3][7] = "81";
        MatrizPrincipal[4][7] = "81";
        MatrizPrincipal[5][7] = "88";
        MatrizPrincipal[3][8] = "69";
        MatrizPrincipal[4][8] = "16";
        MatrizPrincipal[5][8] = "91";
        MatrizPrincipal[3][9] = "85";
        MatrizPrincipal[4][9] = "51";
        MatrizPrincipal[5][9] = "33";
        MatrizPrincipal[3][10] = "25";
        MatrizPrincipal[4][10] = "89";
        MatrizPrincipal[5][10] = "30";
        MatrizPrincipal[3][11] = "45";
        MatrizPrincipal[4][11] = "97";
        MatrizPrincipal[5][11] = "89";
        MatrizPrincipal[3][12] = "33";
        MatrizPrincipal[4][12] = "19";
        MatrizPrincipal[5][12] = "39";
        MatrizPrincipal[3][13] = "90";
        MatrizPrincipal[4][13] = "29";
        MatrizPrincipal[5][13] = "62";
        MatrizPrincipal[3][14] = "83";
        MatrizPrincipal[4][14] = "52";
        MatrizPrincipal[5][14] = "95";
        MatrizPrincipal[3][15] = "16";
        MatrizPrincipal[4][15] = "17";
        MatrizPrincipal[5][15] = "96";

        MatrizPrincipal[6][0] = "M6";
        MatrizPrincipal[7][0] = "M7";
        MatrizPrincipal[8][0] = "M8";
        MatrizPrincipal[6][1] = "88";
        MatrizPrincipal[7][1] = "81";
        MatrizPrincipal[8][1] = "14";
        MatrizPrincipal[6][2] = "81";
        MatrizPrincipal[7][2] = "32";
        MatrizPrincipal[8][2] = "37";
        MatrizPrincipal[6][3] = "68";
        MatrizPrincipal[7][3] = "23";
        MatrizPrincipal[8][3] = "29";
        MatrizPrincipal[6][4] = "84";
        MatrizPrincipal[7][4] = "20";
        MatrizPrincipal[8][4] = "68";
        MatrizPrincipal[6][5] = "38";
        MatrizPrincipal[7][5] = "16";
        MatrizPrincipal[8][5] = "92";
        MatrizPrincipal[6][6] = "22";
        MatrizPrincipal[7][6] = "92";
        MatrizPrincipal[8][6] = "54";
        MatrizPrincipal[6][7] = "94";
        MatrizPrincipal[7][7] = "14";
        MatrizPrincipal[8][7] = "21";
        MatrizPrincipal[6][8] = "61";
        MatrizPrincipal[7][8] = "87";
        MatrizPrincipal[8][8] = "11";
        MatrizPrincipal[6][9] = "94";
        MatrizPrincipal[7][9] = "10";
        MatrizPrincipal[8][9] = "30";
        MatrizPrincipal[6][10] = "18";
        MatrizPrincipal[7][10] = "75";
        MatrizPrincipal[8][10] = "29";
        MatrizPrincipal[6][11] = "75";
        MatrizPrincipal[7][11] = "55";
        MatrizPrincipal[8][11] = "88";
        MatrizPrincipal[6][12] = "15";
        MatrizPrincipal[7][12] = "35";
        MatrizPrincipal[8][12] = "99";
        MatrizPrincipal[6][13] = "38";
        MatrizPrincipal[7][13] = "36";
        MatrizPrincipal[8][13] = "97";
        MatrizPrincipal[6][14] = "48";
        MatrizPrincipal[7][14] = "64";
        MatrizPrincipal[8][14] = "57";
        MatrizPrincipal[6][15] = "66";
        MatrizPrincipal[7][15] = "39";
        MatrizPrincipal[8][15] = "42";

        MatrizPrincipal[9][0] = "M9";
        MatrizPrincipal[10][0] = "M10";
        MatrizPrincipal[11][0] = "M11";
        MatrizPrincipal[9][1] = "70";
        MatrizPrincipal[10][1] = "15";
        MatrizPrincipal[11][1] = "27";
        MatrizPrincipal[9][2] = "66";
        MatrizPrincipal[10][2] = "29";
        MatrizPrincipal[11][2] = "75";
        MatrizPrincipal[9][3] = "73";
        MatrizPrincipal[10][3] = "66";
        MatrizPrincipal[11][3] = "17";
        MatrizPrincipal[9][4] = "82";
        MatrizPrincipal[10][4] = "61";
        MatrizPrincipal[11][4] = "17";
        MatrizPrincipal[9][5] = "25";
        MatrizPrincipal[10][5] = "21";
        MatrizPrincipal[11][5] = "64";
        MatrizPrincipal[9][6] = "58";
        MatrizPrincipal[10][6] = "65";
        MatrizPrincipal[11][6] = "13";
        MatrizPrincipal[9][7] = "80";
        MatrizPrincipal[10][7] = "93";
        MatrizPrincipal[11][7] = "64";
        MatrizPrincipal[9][8] = "68";
        MatrizPrincipal[10][8] = "13";
        MatrizPrincipal[11][8] = "65";
        MatrizPrincipal[9][9] = "33";
        MatrizPrincipal[10][9] = "36";
        MatrizPrincipal[11][9] = "39";
        MatrizPrincipal[9][10] = "45";
        MatrizPrincipal[10][10] = "30";
        MatrizPrincipal[11][10] = "34";
        MatrizPrincipal[9][11] = "31";
        MatrizPrincipal[10][11] = "87";
        MatrizPrincipal[11][11] = "75";
        MatrizPrincipal[9][12] = "74";
        MatrizPrincipal[10][12] = "57";
        MatrizPrincipal[11][12] = "13";
        MatrizPrincipal[9][13] = "37";
        MatrizPrincipal[10][13] = "92";
        MatrizPrincipal[11][13] = "66";
        MatrizPrincipal[9][14] = "65";
        MatrizPrincipal[10][14] = "36";
        MatrizPrincipal[11][14] = "87";
        MatrizPrincipal[9][15] = "91";
        MatrizPrincipal[10][15] = "88";
        MatrizPrincipal[11][15] = "18";

        MatrizPrincipal[12][0] = "M12";
        MatrizPrincipal[13][0] = "M13";
        MatrizPrincipal[14][0] = "M14";
        MatrizPrincipal[12][1] = "92";
        MatrizPrincipal[13][1] = "44";
        MatrizPrincipal[14][1] = "44";
        MatrizPrincipal[12][2] = "60";
        MatrizPrincipal[13][2] = "71";
        MatrizPrincipal[14][2] = "17";
        MatrizPrincipal[12][3] = "35";
        MatrizPrincipal[13][3] = "79";
        MatrizPrincipal[14][3] = "28";
        MatrizPrincipal[12][4] = "43";
        MatrizPrincipal[13][4] = "99";
        MatrizPrincipal[14][4] = "30";
        MatrizPrincipal[12][5] = "27";
        MatrizPrincipal[13][5] = "18";
        MatrizPrincipal[14][5] = "52";
        MatrizPrincipal[12][6] = "92";
        MatrizPrincipal[13][6] = "93";
        MatrizPrincipal[14][6] = "88";
        MatrizPrincipal[12][7] = "85";
        MatrizPrincipal[13][7] = "72";
        MatrizPrincipal[14][7] = "56";
        MatrizPrincipal[12][8] = "19";
        MatrizPrincipal[13][8] = "38";
        MatrizPrincipal[14][8] = "83";
        MatrizPrincipal[12][9] = "93";
        MatrizPrincipal[13][9] = "69";
        MatrizPrincipal[14][9] = "13";
        MatrizPrincipal[12][10] = "43";
        MatrizPrincipal[13][10] = "12";
        MatrizPrincipal[14][10] = "88";
        MatrizPrincipal[12][11] = "63";
        MatrizPrincipal[13][11] = "52";
        MatrizPrincipal[14][11] = "43";
        MatrizPrincipal[12][12] = "46";
        MatrizPrincipal[13][12] = "61";
        MatrizPrincipal[14][12] = "23";
        MatrizPrincipal[12][13] = "85";
        MatrizPrincipal[13][13] = "16";
        MatrizPrincipal[14][13] = "67";
        MatrizPrincipal[12][14] = "21";
        MatrizPrincipal[13][14] = "67";
        MatrizPrincipal[14][14] = "54";
        MatrizPrincipal[12][15] = "97";
        MatrizPrincipal[13][15] = "44";
        MatrizPrincipal[14][15] = "60";

        MatrizPrincipal[15][0] = "M15";
        MatrizPrincipal[15][1] = "54";
        MatrizPrincipal[15][2] = "51";
        MatrizPrincipal[15][3] = "61";
        MatrizPrincipal[15][4] = "28";
        MatrizPrincipal[15][5] = "91";
        MatrizPrincipal[15][6] = "18";
        MatrizPrincipal[15][7] = "27";
        MatrizPrincipal[15][8] = "45";
        MatrizPrincipal[15][9] = "15";
        MatrizPrincipal[15][10] = "12";
        MatrizPrincipal[15][11] = "97";
        MatrizPrincipal[15][12] = "24";
        MatrizPrincipal[15][13] = "35";
        MatrizPrincipal[15][14] = "40";
        MatrizPrincipal[15][15] = "26";

    }

    public void cargar2(String A[][]) {
        for (int i = 0; i < fil; i++) {
            for (int j = 0; j < col; j++) {
                MatrizSolucion[i][j] = A[i][j];
            }
        }
    }

    public int Evaluar(String A[][]) {
        int PosibleMejor = 0;
        for (int i = 0; i < fil; i++) {
            for (int j = 0; j < col; j++) {
                if (i == j) {
                    PosibleMejor = PosibleMejor + Integer.parseInt(A[i][j]);
                }
            }
        }

        return PosibleMejor;
    }

    public void GeneraVecionos() {

        String aux;
        int f2=2;
        int iter = 0;
        for (int numeroiter = 0; numeroiter < 100; numeroiter++) {
            for (int f1 = 2; f1 < 17; f1++) {//fila  evaluada

               //fila evaluada               
                    for (int i = 0; i < 16; i++) {//evalua la fina cambia * la cambiante
                        if ((f1 - 1) != Tabu[0] ||(f2 - 1) != Tabu[1]
                         || (f1 - 1) != Tabu[2] || (f2 - 1) != Tabu[3]
                         || (f1 - 1) != Tabu[4] || (f2 - 1) != Tabu[5]) {
                            aux = MatrizPrincipal[f1 - 1][i];
                            MatrizPrincipal[f1 - 1][i] = MatrizPrincipal[f2 - 1][i];
                            MatrizPrincipal[f2 - 1][i] = aux;

                        }
                    }
                    if (iter == 3) {
                        Tabu[4] = Tabu[2];
                        Tabu[5] = Tabu[3];
                        Tabu[2] = Tabu[0];
                        Tabu[3] = Tabu[1];
                        Tabu[0] = (f1-1);
                        Tabu[1] = (f2-1);
                        iter = 0;
                    }
                   
                 System.err.println("numero iter  "+numeroiter+"  mejor solucion "+MejorSolucion+" solucion de la matriz actual  "+ Evaluar(MatrizPrincipal));
                    if (Evaluar(MatrizPrincipal) < MejorSolucion) {
                        cargar2(MatrizPrincipal);
                        MejorSolucion = Evaluar(MatrizPrincipal);
                        Tabu[4] = Tabu[2];
                        Tabu[5] = Tabu[3];
                        Tabu[2] = Tabu[0];
                        Tabu[3] = Tabu[1];
                        Tabu[0] = (f1-1);
                        Tabu[1] = (f2-1);
                       
                    } else {
                        for (int i = 0; i < 16; i++) {
                            aux = MatrizPrincipal[f2 - 1][i];
                            MatrizPrincipal[f2 - 1][i] = MatrizPrincipal[f1 - 1][i];
                            MatrizPrincipal[f1 - 1][i] = aux;
                        }
                    }
                    iter++;
                    
                        
                }
              /*   if((f2)==15){
                        f2=2;
                    }else
                        f2++;*/
           f2= GeneraNumeros();
            
    
        }

    }

    public void mostrarrMatriz(String f[][]) {
        String r = " matriz \n";
        for (int i = 0; i < fil; i++) {
            for (int j = 0; j < col; j++) {
                r = r + "[" + f[i][j] + "]";
            }
            r = r + "\n";
        }
        System.err.println("" + r);
    }

    public void ejecutar() {
        CargarMatriz();
        mostrarrMatriz(MatrizPrincipal);
        GeneraVecionos();
        mostrarrMatriz(MatrizSolucion);
        System.err.println(MejorSolucion);
    }

}
