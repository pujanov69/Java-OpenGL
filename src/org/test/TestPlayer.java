package org.test;

import org.graphics.Animation;
import org.resource.ImageResource;
import org.world.GameObject;

/**
*@author Pujan
*
*Created on Nov 22, 2019
*/
public class TestPlayer extends GameObject {

	public TestPlayer() {
		animations = new Animation[1];
		animations[0] = new Animation();
		animations[0].frames = new ImageResource[2];
		animations[0].frames[0] = new ImageResource("/res/image_1.jpg");
		animations[0].frames[1] = new ImageResource("/res/image_2.jpg");
	}
	
	public void update() {
//		x += 0.1f;
	}
	
}
