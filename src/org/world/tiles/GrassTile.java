package org.world.tiles;

import org.graphics.Animation;
import org.resource.ImageResource;
import org.world.Tile;

/**
*@author Pujan
*
*Created on Nov 23, 2019
*/
public class GrassTile extends Tile{
	
	public GrassTile() {
		animations = new Animation[1];
		animations[0] = new Animation();
		animations[0].frames = new ImageResource[1];
		animations[0].frames[0] = new ImageResource("/res/grass.jpg");
	}

}
