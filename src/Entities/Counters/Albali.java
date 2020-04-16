package Entities.Counters;

import GFX.Assets;
import ludogame.Handler;

import java.awt.*;

public class Albali extends Counter {
    //zbija wszystkie ktore minie podczas trwania umiejetnosci;

    private static final int ULT_LOAD=40;


    public Albali(Handler handler, float x, float y,int counterNr) {
        super(handler,x, y,counterNr, Assets.counter[0]);
    }

    @Override
    public int getUltLoad() {
        return ULT_LOAD;
    }

    @Override
    public void renderPick(Graphics g) {

    }

    @Override
    public void tick() {

    }

    @Override
    public void render(Graphics g) {

    }
}
