package org.test;

import org.graphics.Graphics;
import org.world.GameObject;

/**
*@author Pujan
*
*Created on Nov 22, 2019
*/
public class TestPlayer extends GameObject {

	public void update() {
		x += 0.1f;
	}
	
	public void render() {
		Graphics.fillRect(x, y, width, height);
	}
}
