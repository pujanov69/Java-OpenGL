package org.test;


import org.engine.GameLoop;
import org.graphics.Animation;
import org.input.KeyInput;
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
		animations[0].frames = new ImageResource[2];
		animations[0].frames[0] = new ImageResource("/res/image_1.jpg");
		animations[0].frames[1] = new ImageResource("/res/image_2.jpg");
	}
	
	public void update() {
		float xInput = 0;
		float yInput = 0;
		
		if(KeyInput.getKey(KeyEvent.VK_LEFT)) {
			xInput --;
		}
		
		if(KeyInput.getKey(KeyEvent.VK_RIGHT)) {
			xInput ++;
		}
		if(KeyInput.getKey(KeyEvent.VK_UP)) {
			yInput ++;
		}
		if(KeyInput.getKey(KeyEvent.VK_DOWN)) {
			yInput --;
		}
		
		x += xInput * runSpeed * GameLoop.updateDelta();
		y += yInput * runSpeed * GameLoop.updateDelta();
	}
	
}
