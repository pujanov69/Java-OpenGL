package org.test;


import org.engine.GameLoop;
import org.graphics.Animation;
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
		animations = new Animation[1];
		animations[0] = new Animation();
		animations[0].frames = new ImageResource[1];
		animations[0].frames[0] = new ImageResource("/res/aliengreen.png");
		//animations[0].frames[1] = new ImageResource("/res/image_2.jpg");
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
		
		x += xInput * runSpeed * GameLoop.updateDelta();
		y += yInput * runSpeed * GameLoop.updateDelta();
		
		rotation = (float) Math.toDegrees(Math.atan2(MouseInput.getWorldX()-x, MouseInput.getWorldY()-y));	
	}
	
}
