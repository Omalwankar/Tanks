import java.awt.event.KeyEvent;


public class Tank {
int x;
int y;
int direction = 0;
Bullet b;
String name;

public Tank(int x, int y) {
	this.x = x;
	this.y = y;
}

public void move() {
	if(Zen.isKeyPressed('w')){
		direction = 0;
		y = y-5;
	}
	if(Zen.isKeyPressed('a')) {
		direction = 3;
		x = x-5;
	}
	if(Zen.isKeyPressed('s')) {
		direction = 2;
		y = y+5;
	}
	if(Zen.isKeyPressed('d')){
		direction = 1;
		x = x+5;
	}
	if(Zen.isVirtualKeyPressed(KeyEvent.VK_SPACE) && b != null) {
		b = new Bullet(x, y, direction);
	}
	Zen.write("ojasx", x);
	Zen.write("ojasy", y);
	Zen.write("ojasd", direction);
	if(b != null) {
	b.move();
	}
	
}
public void draw() {
	if(b != null) {
		b.move();
	}
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

