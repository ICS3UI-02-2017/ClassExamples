/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examples;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;

/**
 *
 * @author lamon
 */
public class ForLoops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        City kw = new City();
        RobotSE karel = 
                new RobotSE(kw, 1,1, Direction.EAST);
        
        // counted while loop
        int numberOfMoves = 5;
        // if there are still moves to do
        while(numberOfMoves > 0){
            karel.move();
            numberOfMoves = numberOfMoves - 1;
        }
        
        karel.turnAround();
        
        // counting the other way
        numberOfMoves = 0;
        while(numberOfMoves < 5){
            karel.move();
            numberOfMoves = numberOfMoves + 1;
        }
        
        karel.turnAround();
        // use a for loop to move
        for(int count = 0; count < 5; count++){
            karel.move();
        }
        
        
       int x = 10;
       x = x + 5; // adds 5
       x += 5; // adds 5
       
       x -= 10; // subtract 10 shortcut
       x = x - 10;
       
       x *= 2; // multiply by 2
       x = x * 2;
       
       x /= 4;
       x = x / 4;
       
       // modulus  or  modulo
       int remainder = 5 % 2 ;
       int quotient = 5 / 2;
        
        
        if(karel.frontIsClear()){
            if(karel.canPickThing()){
                karel.move();
            }
        }
        
        // both must be true to perform the action
        if(karel.frontIsClear() && karel.canPickThing()){
            
        }
        
        // only one needs to be true
        if(karel.frontIsClear() || karel.canPickThing()){
            
        }
        
        
        
    }
    
}
