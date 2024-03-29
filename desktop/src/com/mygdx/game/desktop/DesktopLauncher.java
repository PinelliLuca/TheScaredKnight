package com.mygdx.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.mygdx.game.MyGdxGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		//default fullscreen
		config.width = MyGdxGame.V_WIDTH;
		config.height = MyGdxGame.V_HEIGHT;
		config.fullscreen = true;

		new LwjglApplication(new MyGdxGame(), config);
	}
}
