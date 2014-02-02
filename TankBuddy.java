
public class TankBuddy {
int x;
int y;
int direction;
String name;
Bullet myBullet;

public TankBuddy(String name) {
	this.name = name;
	this.x = Zen.readInt(name + "x");
	this.y = Zen.readInt(name + "y");
	this.direction = Zen.readInt(name + "d");
}

public void move() {
	this.x = Zen.readInt(name + "x");
	this.y = Zen.readInt(name + "y");
	this.direction = Zen.readInt(name + "d");
	
}
public void draw() {
	Zen.drawText(name, x-10, y-15);
	Zen.setColor(0, 0, 155);
	if (direction == 0 || direction == 2)
		Zen.fillRect(x-10, y-15, 20, 30);
	else
		Zen.fillRect(x-15, y-10, 30, 20);
	Zen.setColor(0,0,0);
	if(direction ==0 || direction ==2)
		Zen.fillRect(x-2, y-(2-direction)*10, 4, 20);
	if(direction ==1 || direction ==3)
		Zen.fillRect(x-(direction-1)*10, y-2, 20,4);
		
	}
}

