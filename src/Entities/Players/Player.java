package Entities.Players;
import Entities.Counters.Counter;

import java.awt.*;
import java.awt.image.BufferedImage;

public abstract class Player {

    protected Counter[] counter;

    protected int currentlyinbase;

    protected int points=0;

    protected boolean isinbase;
    protected int starting_pos;
    protected int ending_pos;

    BufferedImage ccolor;

    protected boolean clicked;
    protected int counterNr=-1;

    public Player(int starting_pos,int ending_pos,BufferedImage ccolor){
        this.starting_pos=starting_pos;
        this.ending_pos=ending_pos;
        counter=new Counter[4];

        this.isinbase=true;
        this.ccolor=ccolor;


        currentlyinbase=4;

    }

    public void setCounters(Counter c1,Counter c2,Counter c3,Counter c4){
        this.counter[0]=c1;
        this.counter[1]=c2;
        this.counter[2]=c3;
        this.counter[3]=c4;

    }

    public boolean isIsinbase() {
        return isinbase;
    }

    public void setIsinbase(boolean isinbase) {
        this.isinbase = isinbase;
    }


    public int getStarting_pos() {
        return starting_pos;
    }

    public abstract void tick();

    public abstract void render(Graphics g);

    public void move() {

    }

    public void setClicked(boolean clicked){
        this.clicked=clicked;
    }

    public void resetCounterNr(){
        this.counterNr=-1;
    }

    public void setPoints(int points){
        this.points+=points;
    }

    public int getPoints(){
        return this.points;
    }
}