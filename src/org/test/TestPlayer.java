package org.test;


import org.engine.GameLoop;
import org.graphics.Animation;
import org.graphics.Renderer;
import org.input.KeyInput;
import org.input.MouseInput;
import org.resource.ImageResource;
import org.world.GameObject;

import com.jogamp.newt.event.KeyEvent;

/**
*@author Pujan
*
*Created on Nov 22, 2019
*/
public class TestPlayer extends GameObject {

	public float runSpeed = 2.0f;
	
	public TestPlayer() {
		animations = new Animation[2];
		animations[0] = new Animation();
		animations[1] = new Animation();
		animations[0].frames = new ImageResource[20];
		animations[0].fps = 50;
		
		animations[1].frames = new ImageResource[20];
		animations[1].fps = 50;
		
		graphicsRotation = -90;
		
		for(int i = 0; i<animations[0].frames.length; i++) {
			animations[0].frames[i] = new ImageResource("/res/rifle/idle/survivor-idle_rifle_" + String.valueOf(i) + ".png");
		}
		
		for(int i = 0; i<animations[1].frames.length; i++) {
			animations[1].frames[i] = new ImageResource("/res/rifle/move/survivor-move_rifle_" + String.valueOf(i) + ".png");
		}
	}
	
	public void update() {
		float xInput = 0;
		float yInput = 0;
		
		if(KeyInput.getKey(KeyEvent.VK_A)) {
			xInput --;
		}
		
		if(KeyInput.getKey(KeyEvent.VK_D)) {
			xInput ++;
		}
		if(KeyInput.getKey(KeyEvent.VK_W)) {
			yInput ++;
		}
		if(KeyInput.getKey(KeyEvent.VK_S)) {
			yInput --;
		}
		
		if(xInput != 0 || yInput != 0) {
			currentAnimation = 1;
		}else {
			currentAnimation = 0;
		}
		
		x += xInput * runSpeed * GameLoop.updateDelta();
		y += yInput * runSpeed * GameLoop.updateDelta();
		
		rotation = (float) Math.toDegrees(Math.atan2(MouseInput.getWorldX()-x, MouseInput.getWorldY()-y));
		
		Renderer.cameraX = x;
		Renderer.cameraY = y;
	}
	
}
