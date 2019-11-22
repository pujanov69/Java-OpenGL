package org.world;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
*@author Pujan
*
*Created on Nov 22, 2019
*/
public class World {
	
	private static ConcurrentLinkedQueue<Tile> tiles = new ConcurrentLinkedQueue<Tile>();
	
	
	private static ArrayList<GameObject> gameObjects = new ArrayList<GameObject>();

	public static void update() {
		//Go through all objects and update them
		for(GameObject go : gameObjects) {
			go.update();
		}
	}
	
	public static void render() {
		//Render all Tiles
		for(Tile tile: tiles) {
			tile.render();
		}
		
		//Render all objects
		for(GameObject go: gameObjects) {
			go.render();
		}
	}
	
	public static void addObject(GameObject go) {
		gameObjects.add(go);
	}
	
	public static void addTile(Tile tile) {
		tiles.offer(tile);
	}
}
