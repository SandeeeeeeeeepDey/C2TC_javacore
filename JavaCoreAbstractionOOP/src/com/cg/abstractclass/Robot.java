package com.cg.abstractclass;
import java.util.*;

public abstract class Robot {
	String command;
	String power;
	public Robot() {
		Scanner sc= new Scanner(System.in);
		this.permissionToBoot();
		this.power=sc.next().toLowerCase();
		if(power.equals("wakeup")){
			this.boot();
			do{
				
				this.command= sc.next().toLowerCase();
				this.walkF();
				this.walkB();
				this.walkL();
				this.walkR();
				this.stop();
				this.chill();
				this.garbage();
			}
			while(!command.equals("sleep") );
		}
		this.sleep();
		
	}
	public abstract void permissionToBoot();
	public abstract void boot();
	public abstract void walkF();
	public abstract void walkB();
	public abstract void walkL();
	public abstract void walkR();
	public abstract void stop();
	public abstract void chill();
	public abstract void sleep();
	public abstract void garbage();
	
}
