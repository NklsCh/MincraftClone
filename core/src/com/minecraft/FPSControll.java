package com.minecraft;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.graphics.g3d.utils.FirstPersonCameraController;

public class FPSControll extends FirstPersonCameraController{

	public FPSControll(Camera camera) {
		super(camera);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public boolean mouseMoved(int screenX, int screenY) {
		// TODO Auto-generated method stub
		touchDragged(screenX, screenY, 0);
		return super.mouseMoved(screenX, screenY);
	}
	
	@Override
	public boolean keyDown(int keycode) {
		// TODO Auto-generated method stub
		if(keycode == Keys.ESCAPE) {
			Gdx.app.exit();
		}
		return super.keyDown(keycode);
	}
}
