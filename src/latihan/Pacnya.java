/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacnya;
import java.util.Scanner;
/**
 *
 * @author Eginda
 */
public class Pacnya {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[][] array = new String[][]{
        {"#","#","#","#","#","#","#","#","#","#"},
        {"#","<"," "," "," ","@"," "," "," ","#"},
        {"#","#"," "," "," "," ","#","#","#","#"},
        {"#"," "," "," "," "," "," "," "," ","#"},
        {"#","#"," ","@","@"," ","#"," "," ","#"},
        {"#"," "," "," "," "," ","#","#","#","#"},
        {"#"," "," "," "," "," ","@","#"," ","#"},
        {"#"," ","#","#"," "," "," ","@"," ","#"},
        {"#"," "," ","#","#"," "," "," "," ","#"},
        {"#","#","#","#","#","#","#","#","#","#"}};
        Pac game = new Pac();
        int b, k;
        b = game.x= 1;
        k = game.y = 1;
        
        boolean t = true;
        game.step = 20;
        game.score = 0;
        do{
        for(int i=0; i<10; i++){
            for(int j=0; j<10; j++){
                System.out.print(array[i][j]);
            }
            System.out.println("");
        }
        game.jumStep();
        game.showScore();
        System.out.print("Move : (w,a,s,d q for Quit > ");
        char a = scan.next().charAt(0);
        if(a == 'q'){
            t = false;
        }
        
        game.move(a);
        if(array[game.x][game.y] == " "){
            array[b][k] = " "; 
            b = game.x;
            k = game.y;
            array[game.x][game.y] = game.objek;
        }
        else if(array[game.x][game.y] == "@"){
            array[b][k] = " "; 
            b = game.x;
            k = game.y;
             array[game.x][game.y] = game.objek;
             game.makan();
        }
        else if(array[game.x][game.y] == "#"){
            game.undoAct(a);
            array[game.x][game.y] = game.objek;
                    
        }
        if(game.step == 0 && game.score!=5){
            for(int i=0; i<10; i++){
            for(int j=0; j<10; j++){
                System.out.print(array[i][j]);
            }
            System.out.println("");
        }
            System.out.println("KALAH");
            t = false;
        }
        else if(game.score == 5){
            for(int i=0; i<10; i++){
            for(int j=0; j<10; j++){
                System.out.print(array[i][j]);
            }
            System.out.println("");
        }
            System.out.println("MENANG");
            t = false;
        }
      }while(t);
    }
    }
    

