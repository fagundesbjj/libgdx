package com.deploy.ligbdx;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class GameRoot implements ApplicationListener {
	
	private BitmapFont currentFont;
	private Texture currentTexture;
	private Texture currentRock;
	private SpriteBatch currentBatch;
	
	@Override
	public void create() {
		Texture.setEnforcePotImages(false);
		currentBatch = new SpriteBatch();
		currentTexture = new Texture("wall.png");
		currentRock = new Texture("rock.png");
		currentFont = new BitmapFont();

	}

	@Override
	public void dispose() {

		currentBatch.dispose();
		currentTexture.dispose();
		currentRock.dispose();
		currentFont.dispose();

	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub

	}

	@Override
	public void render() {
		
		currentBatch.begin();
		currentBatch.draw(currentTexture, 0, 0);
		currentBatch.draw(currentRock, 200, 200);
		currentFont.draw(currentBatch, "FPS:" + Gdx.graphics.getFramesPerSecond(), 20, 20);
		currentBatch.end();
		

	}

	@Override
	public void resize(int arg0, int arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub

	}

}
