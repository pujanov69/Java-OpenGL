package org.engine;

import org.graphics.Renderer;
import org.test.TestPlayer;
import org.world.World;
import org.world.tiles.GrassTile;

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
		
		for(int x=0;x<10;x++) {
			for(int y=0;y<10;y++) {
				GrassTile tile = new GrassTile();
				tile.x = tile.width * x;
				tile.y = tile.height * y;
				World.addTile(tile);
			}
		}
		World.addTile(new GrassTile());
		World.addObject(new TestPlayer());
	}

}
