package org.graphics;

import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLEventListener;

/**
*@author Pujan
*
*Created on Nov 21, 2019
*/
public class EventListener implements GLEventListener{

	@Override
	public void display(GLAutoDrawable drawable) {
		GL2 gl = drawable.getGL().getGL2();  
		
		gl.glClear(GL2.GL_COLOR_BUFFER_BIT);
		
		gl.glColor3f(0, 0, 1);
			gl.glBegin(GL2.GL_QUADS);
			gl.glVertex2f(-0.5f, -0.5f);
			gl.glVertex2f(0.5f, -0.5f);
			gl.glVertex2f(0.5f, 0.5f);
			gl.glVertex2f(-0.5f, 0.5f);
		gl.glEnd();	
		
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
		gl.glOrtho(-320,320, -180, 180, -1, 1);
		gl.glMatrixMode(GL2.GL_MODELVIEW);
	}

}
