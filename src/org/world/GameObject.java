package org.world;

import org.graphics.Animation;
import org.graphics.Graphics;

/**
*@author Pujan
*
*Created on Nov 22, 2019
*/
public class GameObject {

	//position of the object
	public float x = 0;
	public float y = 0;
	
	//size of the object
	public float width = 1;
	public float height = 1 ;
	
	//rotation 
	public float rotation = 0;
	
	//Rotation offset of the renderer
	public float graphicsRotation = 0;
	
	//animations
	public Animation[] animations;
	public int currentAnimation = 0;
	
	public void update() {
		//Implement in subclass
	}
	
	public void render() {
		if(animations == null || animations[currentAnimation] == null) {
				return;
		}
		animations[currentAnimation].play();
		Graphics.setRotation(rotation + graphicsRotation);
		Graphics.drawImage(animations[currentAnimation].getImage(), x, y, width, height);
		Graphics.setRotation(0);
	}
	
}
