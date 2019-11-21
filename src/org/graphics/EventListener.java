package org.graphics;

import java.util.Random;

import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLEventListener;

/**
*@author Pujan
*
*Created on Nov 21, 2019
*/
public class EventListener implements GLEventListener{

	public static GL2 gl = null;
	
	@Override
	public void display(GLAutoDrawable drawable) {
		gl = drawable.getGL().getGL2();  
		
		gl.glClear(GL2.GL_COLOR_BUFFER_BIT);
		
		Graphics.setColor(0, 1, 0, 1);
		Graphics.fillRect(0, 0, 1, 1);
		
	}

	@Override
	public void dispose(GLAutoDrawable drawable) {
		
	}

	@Override
	public void init(GLAutoDrawable drawable) {
		GL2 gl = drawable.getGL().getGL2();  
		
		gl.glClearColor(0, 0, 0, 1);	
	}

	@Override
	public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {
		GL2 gl = drawable.getGL().getGL2();
		gl.glMatrixMode(GL2.GL_PROJECTION);
		gl.glLoadIdentity();
		
		float unitsTall = Renderer.getWindowHeight() / (Renderer.getWindowWidth()/Renderer.unitsWide);
		
		gl.glOrtho(- Renderer.unitsWide/2, Renderer.unitsWide/2, -unitsTall/2, unitsTall/2 , -1, 1);
		gl.glMatrixMode(GL2.GL_MODELVIEW);
	}

}
