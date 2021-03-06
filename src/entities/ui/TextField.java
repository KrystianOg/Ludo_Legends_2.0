package entities.ui;

import entities.Entity;
import GFXandEffects.Assets;
import GFXandEffects.Text;
import input.KeyboardManager;
import ludogame.Handler;

import java.awt.*;

public class TextField extends Entity{

    private static final int FIELD_WIDTH=240,FIELD_HEIGHT=40;
    private final String defaultNickname;
    private String nickname;
    private boolean isClicked;
    private final Rectangle hitbox;
    private final Color txtfColor;

    public TextField(Handler handler, float x, float y,Color txtfColor,String nickname) {
        super(handler, x, y, FIELD_WIDTH,FIELD_HEIGHT);
        this.defaultNickname=nickname;
        this.nickname=nickname;
        isClicked=false;
        this.txtfColor=txtfColor;
        hitbox=new Rectangle((int)x,(int)y,FIELD_WIDTH,FIELD_HEIGHT);
    }

    @Override
    public void tick() {

        if(isClicked){

            if(nickname==defaultNickname)
                nickname="";

            setChar();
            if(handler.getKeyboardManager().getDelete()&&nickname.length()>=1)
                nickname=KeyboardManager.deleteLastChar(nickname);
            handler.getKeyboardManager().resetKey();
        }
    }

    @Override
    public void render(Graphics g) {
        g.setColor(txtfColor);
        g.fillRect((int)x+7,(int)y+7,FIELD_WIDTH-14,FIELD_HEIGHT-14);
        g.drawImage(Assets.progressbar_f,(int)x,(int)y,width,height,null);

        if(nickname!=null)
        Text.drawString(g,nickname,(int)x+13,(int)y+28,false,Color.black,Assets.Ubuntu28);
    }

    public boolean contains(int MouseX,int MouseY){
        return this.hitbox.contains(MouseX,MouseY);
    }

    public void setY(int y){
        this.y=y;
        this.hitbox.y=y;
    }

    public void setClicked(boolean clicked){
        this.isClicked=clicked;
    }

    private void setChar() {
        if(nickname.length()<=14)
        nickname += handler.getKeyboardManager().getChar();
    }

    public String getNickname(){
        return nickname;
    }

    public void setNickname(String nickname){
        this.nickname=nickname;
    }

}
