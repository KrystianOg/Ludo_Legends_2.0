package entities;

import entities.counters.Counter;
import entities.ui.Tile;
import GFXandEffects.Assets;
import players.PositionOnMap;
import ludogame.Handler;

import java.awt.*;

public class Board extends Entity {

    private final Tile[][] map=new Tile[9][];

    public Board(Handler handler, float x, float y, int width, int height) {
        super(handler,x, y, width, height);

        setMap();

    }

    @Override
    public void tick() {

    }

    @Override
    public void render(Graphics g) {
        g.drawImage(Assets.map,0,0,null);
    }

    public Tile getTile(PositionOnMap pos){
        return map[pos.arr][pos.tile];
    }

    private void setMap(){

        int x=50, y=50;

        map[0]=new Tile[52];

        map[0][0]=new Tile(handler,x*8,y*1,true);
        map[0][1]=new Tile(handler,x*8,y*2,false);
        map[0][2]=new Tile(handler,x*8,y*3,true);
        map[0][3]=new Tile(handler,x*8,y*4,true);
        map[0][4]=new Tile(handler,x*8,y*5,true);
        map[0][5]=new Tile(handler,x*8,y*6,true);
        map[0][6]=new Tile(handler,x*9,y*7,true);
        map[0][7]=new Tile(handler,x*10,y*7,true);
        map[0][8]=new Tile(handler,x*11,y*7,true);
        map[0][9]=new Tile(handler,x*12,y*7,false);
        map[0][10]=new Tile(handler,x*13,y*7,true);
        map[0][11]=new Tile(handler,x*14,y*7,true);
        map[0][12]=new Tile(handler,x*14,y*8,true);
        map[0][13]=new Tile(handler,x*14,y*9,true);
        map[0][14]=new Tile(handler,x*13,y*9,false);
        map[0][15]=new Tile(handler,x*12,y*9,true);
        map[0][16]=new Tile(handler,x*11,y*9,true);
        map[0][17]=new Tile(handler,x*10,y*9,true);
        map[0][18]=new Tile(handler,x*9,y*9,true);
        map[0][19]=new Tile(handler,x*8,y*10,true);
        map[0][20]=new Tile(handler,x*8,y*11,true);
        map[0][21]=new Tile(handler,x*8,y*12,true);
        map[0][22]=new Tile(handler,x*8,y*13,false);
        map[0][23]=new Tile(handler,x*8,y*14,true);
        map[0][24]=new Tile(handler,x*8,y*15,true);
        map[0][25]=new Tile(handler,x*7,y*15,true);
        map[0][26]=new Tile(handler,x*6,y*15,true);
        map[0][27]=new Tile(handler,x*6,y*14,false);
        map[0][28]=new Tile(handler,x*6,y*13,true);
        map[0][29]=new Tile(handler,x*6,y*12,true);
        map[0][30]=new Tile(handler,x*6,y*11,true);
        map[0][31]=new Tile(handler,x*6,y*10,true);
        map[0][32]=new Tile(handler,x*5,y*9,true);
        map[0][33]=new Tile(handler,x*4,y*9,true);
        map[0][34]=new Tile(handler,x*3,y*9,true);
        map[0][35]=new Tile(handler,x*2,y*9,false);
        map[0][36]=new Tile(handler,x*1,y*9,true);
        map[0][37]=new Tile(handler,x*0,y*9,true);
        map[0][38]=new Tile(handler,x*0,y*8,true);
        map[0][39]=new Tile(handler,x*0,y*7,true);
        map[0][40]=new Tile(handler,x*1,y*7,false);
        map[0][41]=new Tile(handler,x*2,y*7,true);
        map[0][42]=new Tile(handler,x*3,y*7,true);
        map[0][43]=new Tile(handler,x*4,y*7,true);
        map[0][44]=new Tile(handler,x*5,y*7,true);
        map[0][45]=new Tile(handler,x*6,y*6,true);
        map[0][46]=new Tile(handler,x*6,y*5,true);
        map[0][47]=new Tile(handler,x*6,y*4,true);
        map[0][48]=new Tile(handler,x*6,y*3,false);
        map[0][49]=new Tile(handler,x*6,y*2,true);
        map[0][50]=new Tile(handler,x*6,y*1,true);
        map[0][51]=new Tile(handler,x*7,y*1,true);

        map[1]=new Tile[6];
        map[1][0]=new Tile(handler,x*7,y*2,false);
        map[1][1]=new Tile(handler,x*7,y*3,false);
        map[1][2]=new Tile(handler,x*7,y*4,false);
        map[1][3]=new Tile(handler,x*7,y*5,false);
        map[1][4]=new Tile(handler,x*7,y*6,false);
        map[1][5]=new Tile(handler,x*7,y*7+5,false);

        map[2]=new Tile[6];
        map[2][0]=new Tile(handler,x*13,y*8,false);
        map[2][1]=new Tile(handler,x*12,y*8,false);
        map[2][2]=new Tile(handler,x*11,y*8,false);
        map[2][3]=new Tile(handler,x*10,y*8,false);
        map[2][4]=new Tile(handler,x*9,y*8,false);
        map[2][5]=new Tile(handler,x*8-5,y*8,false);

        map[3]=new Tile[6];
        map[3][0]=new Tile(handler,x*7,y*14,false);
        map[3][1]=new Tile(handler,x*7,y*13,false);
        map[3][2]=new Tile(handler,x*7,y*12,false);
        map[3][3]=new Tile(handler,x*7,y*11,false);
        map[3][4]=new Tile(handler,x*7,y*10,false);
        map[3][5]=new Tile(handler,x*7,y*9-5,false);

        map[4]=new Tile[6];
        map[4][0]=new Tile(handler,x*1,y*8,false);
        map[4][1]=new Tile(handler,x*2,y*8,false);
        map[4][2]=new Tile(handler,x*3,y*8,false);
        map[4][3]=new Tile(handler,x*4,y*8,false);
        map[4][4]=new Tile(handler,x*5,y*8,false);
        map[4][5]=new Tile(handler,x*6+5,y*8,false);
    }

    public void setCounterOnTile(PositionOnMap pos,Counter counter){
        map[pos.arr][pos.tile].setCounterOnTile(counter);
    }

    public void removeCounterFromTile(PositionOnMap pos, Counter counter){
        map[pos.arr][pos.tile].removeCounterFromTile(counter);
    }

}

