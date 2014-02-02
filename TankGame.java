
public class TankGame {

	public static void main(String[] args) {
		Zen.connect("techlabtanks");
		Zen.create(500,500);
		Zen.fillRect(0, 0, 500, 500);
		Tank me = new Tank(250, 250);
		me.draw();
		Zen.sleep(3000);
		TankBuddy ryan = new TankBuddy("ryan");
		TankBuddy jayee = new TankBuddy("Jayee");
		TankBuddy jasper = new TankBuddy("jasper");
		TankBuddy isaac = new TankBuddy("isaac");
		TankBuddy jui = new TankBuddy("jui");
		TankBuddy keshav = new TankBuddy("keshav");
		
		while(true) {
			Zen.setColor(255, 255, 255);
			Zen.fillRect(0, 0, 500, 500);
			me.draw();
			me.move();
			ryan.draw();
			ryan.move();
			jayee.draw();
			jayee.move();
			jasper.draw();
			jasper.move();
			isaac.draw();
			isaac.move();
			jui.draw();
			jui.move();
			keshav.draw();
			keshav.move();
			
			Zen.flipBuffer();
			Zen.sleep(33);
		}
		
	}

}
