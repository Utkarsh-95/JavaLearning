/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetproblem;

/**
 *
 * @author Utkarsh Pratap Singh
 */

class Point { 
	protected int x, y; 

	public Point(int _x, int _y) 
	{ 
		x = _x; 
		y = _y; 
	} 

    Point() {
    }
} 

public class MaintSinppet { 
	public static void main(String args[]) 
	{ 
		Point p = new Point(); 
		System.out.println("x = " + p.x + ", y = " + p.y); 
	} 
} 
