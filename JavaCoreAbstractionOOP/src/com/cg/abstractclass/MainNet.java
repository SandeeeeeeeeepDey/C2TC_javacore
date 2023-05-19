// Driver and concrete class of Robot abstract class.
package com.cg.abstractclass;

public class MainNet extends Robot {

	public static void main(String[] args) {
		MainNet m=new MainNet();

	}

	@Override
	public void walkF() {
		if(command.equals("walk")) {
			System.out.println("Walking forward in default speed.");
			System.out.println("------------------------------------------------");
			System.out.println("Type in your next command");
			System.out.println("------------------------------------------------");
		}
		
	}

	@Override
	public void permissionToBoot() {
		System.out.println("Type `WAKEUP` to boot the Robot.");
		System.out.println("------------------------------------------------");
	}

	@Override
	public void boot() {
		System.out.println("Booting System...");
		System.out.println("Connecting to mainNet...");
		System.out.println("Commands available in the system till now are:");
		System.out.println("`WALK`- Walk forward");
		System.out.println("`LEFT`- Walk left");
		System.out.println("`RIGHT`- Walk right");
		System.out.println("`BACK`- Walk backward");
		System.out.println("`STOP`- Stop walking");
		System.out.println("`CHILL`- Takes a chill pill");
		System.out.println("`SLEEP`- Shut Down");
		System.out.println("------------------------------------------------");
		System.out.println("System is ready. Your wish is my command");
		
	}

	@Override
	public void walkB() {
		if(command.equals("back")) {
			System.out.println("Walking backwards in default speed.");
			System.out.println("------------------------------------------------");
			System.out.println("Type in your next command");
			System.out.println("------------------------------------------------");
		}
		
	}

	@Override
	public void walkL() {
		if(command.equals("left")) {
			System.out.println("Walking to my left in default speed.");
			System.out.println("------------------------------------------------");
			System.out.println("Type in your next command");
			System.out.println("------------------------------------------------");
		}
		
	}

	@Override
	public void walkR() {
		if(command.equals("right")) {
			System.out.println("Walking to my right in default speed.");
			System.out.println("------------------------------------------------");
			System.out.println("Type in your next command");
			System.out.println("------------------------------------------------");
		}
		
	}

	@Override
	public void stop() {
		if(command.equals("stop")) {
			System.out.println("Stopped Walking.");
			System.out.println("------------------------------------------------");
			System.out.println("Type in your next command");
			System.out.println("------------------------------------------------");
		}
		
	}

	@Override
	public void chill() {
		if(command.equals("chill")) {
			int ran=(int) (Math.random()*10);
			switch(ran) {
			case 0: System.out.println("Playing Violin"); break;
			case 1: System.out.println("Downloading Books");break;
			case 2: System.out.println("Laughing at my jokes");break;
			case 3: System.out.println("Oiling my Ball Bearings");break;
			case 4: System.out.println("Making a companion Pet Bot");break;
			case 5: System.out.println("Recharging...");break;
			case 6: System.out.println("Observing...");break;
			case 7:	System.out.println("Studying on Keanu Reeves");break;
			case 8: System.out.println("Listening to Electronic Dance Music");break;
			case 9: System.out.println("Thinking of jokes to crack on my Master");break;
			}
			System.out.println("------------------------------------------------");
			System.out.println("Type in your next command");
			System.out.println("------------------------------------------------");
		}
		
	}

	@Override
	public void sleep() {
		System.out.println("Robot going to sleep...zzZZZ");
		System.out.println("------------------------------------------------");
		
	}

	@Override
	public void garbage() {
		if(!command.equals("walk") && !command.equals("chill") && !command.equals("stop") && !command.equals("right")&& !command.equals("back") && !command.equals("left")) {
			System.out.println("I'm Sorry I didn't get you.");
			System.out.println("------------------------------------------------");
			System.out.println("Type a command from the given list bellow-");
			System.out.println("`WALK`- Walk forward");
			System.out.println("`LEFT`- Walk left");
			System.out.println("`RIGHT`- Walk right");
			System.out.println("`BACK`- Walk backward");
			System.out.println("`STOP`- Stop walking");
			System.out.println("`CHILL`- Takes a chill pill");
			System.out.println("`SLEEP`- Shut Down");
			System.out.println("------------------------------------------------");
		}
		
	}

}
