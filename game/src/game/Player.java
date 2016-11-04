/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.awt.Point;
import java.util.List;

/**
 *
 * @author fabi
 */
public class Player extends GameObject {
    
    private int hp;
    private int score;
    
    private int startX = 0;
    private int startY = 0;
    
    public Player(int hp, List<Point> block) {
        super();
        setHp(hp);
        setX(startX);
        setY(startY);
    }
    
    //TODO
    public void move(char dir) {
        int x = getX();
        int y = getY();
        Point point = new Point(getX(), getY());
        Point target;
        
    }

    private boolean canMove() {
        return false;
    }
    
    /**
     * @return the hp
     */
    public int getHp() {
        return hp;
    }

    /**
     * @param hp the hp to set
     */
    public void setHp(int hp) {
        this.hp = hp;
    }
    
}
