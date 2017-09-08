import java.io.*;
import java.net.*;
import java.util.Random;
import java.util.ArrayList;

class Point{
	private int x;
	private int y;
		
	public Point(){
		x = 0;
		y = 0;
	}
		
	public Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
	
	public void setX(int x){
		this.x = x;
    }	
	
	public void setY(int y){
		this.y = y;
	}
	
	public String toString(){
		return "("+x+","+y+")";
  }
}
