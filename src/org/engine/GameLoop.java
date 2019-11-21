package org.engine;

import org.graphics.Renderer;

/**
*@author Pujan
*
*Created on Nov 22, 2019
*/
public class GameLoop {

	private static boolean running = false;
	
	private static int targetFPS = 60;
	private static int targetTime = 1000000000/ targetFPS;
	
	public static void start() {
		Thread thread = new Thread() {
			public void run() {
				running = true;
				while(running) {
					long startTime = System.nanoTime();
					// Poll Input
					
					// Update Game
					
					//Render Game
					Renderer.render();
					
					long timeTaken = System.nanoTime() - startTime;
					
					if(timeTaken < targetTime) {
						try {
							Thread.sleep((targetTime - timeTaken)/1000000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					
				}
			}
		};
		thread.setName("GameLoop");
		thread.start();
	}
}
