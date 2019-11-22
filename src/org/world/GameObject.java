package org.world;

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
	public float height = 1;
	
	//rotation 
	public float rotation = 0;
	
	public void update() {
		//Implement in subclass
	}
	
	public void render() {
		//Implement in subclass
	}
	
}
