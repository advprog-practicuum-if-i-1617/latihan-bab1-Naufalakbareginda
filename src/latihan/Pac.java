/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pac;

/**
 *
 * @author Eginda
 */
public class Pac {

    public int step;
    public String objek;
    public int score;
    public int x;
    public int y;
    
    
    public void jumStep(){
        step -= 1;
        System.out.println("Step left : " + step);
    }
    public void move(char c){
        if(c == 'w'){
            x -=1;
            y += 0;
            objek = "v";
        }
        if(c == 's'){
            x +=1;
            y += 0;
            objek = "^";
        }
        if(c == 'd'){
            y +=1;
            x +=0;
            objek = "<";
        }
        if(c == 'a'){
            y -=1;
            x +=0;
            objek = ">";
        }
    }
    public void undoAct(char c){
        if(c == 'w'){
            x +=1;
            y += 0;
            objek = "v";
        }
        if(c == 's'){
            x -=1;
            y += 0;
            objek = "^";
        }
        if(c == 'd'){
            y -=1;
            x +=0;
            objek = "<";
        }
        if(c == 'a'){
            y +=1;
            x +=0;
            objek = ">";
        }
    }
    public void makan(){
        score += 1;
    }
    public void showScore(){
        System.out.println("Score : " + score);
    }
}
    
    

