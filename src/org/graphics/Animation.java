package org.graphics;

import org.resource.ImageResource;

/**
*@author Pujan
*
*Created on Nov 22, 2019
*/
public class Animation {

	//The frames of animation
	public ImageResource[] frames;
	
	//The current frame of animation
	private int currentFrame = 0;
	
	//The fps
	public int fps = 1;
	private long lastFrameTime = 0;
	
	//should we loop
	public boolean loop = true;
	
	public void play() {
		long currentTime = System.nanoTime();
		
		if(currentTime > lastFrameTime + 1000000000/fps) {
			currentFrame ++;
			
			if(currentFrame >= frames.length) {
				if(loop) {
					currentFrame = 0;
				}else {
					currentFrame --;
				}
			}
			
			lastFrameTime = currentTime;
		}
	}
	
	public ImageResource getImage() {
		return frames[currentFrame];
	}
}
