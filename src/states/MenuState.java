package states;

import GFX.Assets;
import Entities.ui.Button;
import GFX.DynamicBackground;
import ludogame.Handler;

import java.awt.*;

public class MenuState extends State{

	private final Button game;
    private final Button settings;
    private final DynamicBackground dynamicBackground;

    public MenuState(Handler handler){
        super(handler);
        game=new Button(handler,(handler.getFrameWidth()-350)/2,500,350,90, Assets.big_button_template,Assets.game_button);
        settings=new Button(handler,(handler.getFrameWidth()-350)/2,600,350,90, Assets.big_button_template,Assets.settings_button);
        this.dynamicBackground=new DynamicBackground(handler,790);
    }


    @Override
    public void tick() {

        dynamicBackground.tick();

        if(this.game.getHitbox().contains(handler.getMouseClickX(),handler.getMouseClickY())) {
            handler.resetMousePOS();
            handler.getPrepState().init(this.dynamicBackground);
            setState(handler.getGame().prepstate);
        }
        else if(this.settings.getHitbox().contains(handler.getMouseClickX(),handler.getMouseClickY())) {
            handler.resetMousePOS();
            setState(handler.getGame().settingstate);
            handler.getSettingState().setDynamicBackground(this.dynamicBackground);
        }

    	game.tick();
    	settings.tick();
    }

    @Override
    public void render(Graphics g) {
    	g.setColor(Color.white);
        g.fillRect(0,0,handler.getFrameWidth(),handler.getFrameHeight());

        if(SettingState.DYNAMIC_BACKGROUND)
        dynamicBackground.render(g);

        g.drawImage(Assets.logo, 220, 25, 500, 500, null);

        game.render(g);
        settings.render(g);
    }
}
