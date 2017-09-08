import java.lang.*;
import java.io.*;
import java.net.*;
import java.util.Random;
import java.util.ArrayList;

class Segment{
	private Point a;
	private Point b;
	
	public Segment(){
		a = new Point(0,0);
		b = new Point(0,0);
	}
	
	public Segment(Point a1, Point b1){
		a = new Point(a1.getX(), a1.getY());
		b = new Point(b1.getX(), b1.getY());		
	}
	
	public Segment (int x1, int y1, int x2, int y2){
		a = new Point(x1,y1);
		b = new Point(x2,y2);
	}
	
	public double longueur(){
		int d1 = Math.abs(a.getX()-b.getX());
		int d2 = Math.abs(a.getY()-b.getY());
		double c = Math.pow(d1,2) + Math.pow(d2,2);
		double l = Math.sqrt(c);
		return l;
	}
	
	public String toString(){
		return "("+a.getX()+","+a.getY()+") - ("+b.getX()+","+b.getY()+")";
    }
}
