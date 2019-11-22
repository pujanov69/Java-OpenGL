package org.input;

import org.graphics.Renderer;

import com.jogamp.newt.event.MouseEvent;
import com.jogamp.newt.event.MouseListener;

/**
*@author Pujan
*
*Created on Nov 21, 2019
*/
public class MouseInput implements MouseListener {

	private static int x = 0;
	private static int y = 0;
	
	public static int getX() {
		return x;
	}
	
	public static int getY() {
		return y;
	}
	
	public static float getWorldX() {
		return (Renderer.unitsWide / Renderer.getWindowWidth() * x - Renderer.unitsWide / 2) + Renderer.cameraX;
	}
	
	public static float getWorldY() {
		float unitsTall = Renderer.unitsWide * (float)((float)Renderer.getWindowHeight()/(float)Renderer.getWindowWidth());
		return -(unitsTall / Renderer.getWindowHeight() * y - unitsTall / 2) + Renderer.cameraY;
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		x = e.getX();
		y = e.getY();
	}

	@Override
	public void mousePressed(MouseEvent e) {
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		
	}

	@Override
	public void mouseWheelMoved(MouseEvent e) {
		
	}

}
