package org.engine;

import org.graphics.Renderer;
import org.test.TestPlayer;
import org.world.World;

/**
*@author Pujan
*
*Created on Nov 22, 2019
*/
public class Main {

	public static void main(String[] args) {
		Renderer.init();
		GameLoop.start();
		
		//Test code
		World.addObject(new TestPlayer());
	}

}
