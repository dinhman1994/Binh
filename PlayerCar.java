import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class PlayerCar {
    int x;
    int y;
    Image im = ImageLoader.getImage("Car.png");
    int hp; // khởi tạo máu
    int speed = 1; //khởi tạo tốc độ
    int score; //điểm
    int orient; //hướng : lên xuống trái phải.

    public PlayerCar(int x, int y) { //constructer x,y.
        this.x = x;
        this.y = y;
    }
    void draw(Graphics2D g2d){
        g2d.drawImage(im, x, y, null);
    } //vẽ ảnh

    void move(){ //di chuyển
        switch(orient) {
            case KeyEvent.VK_LEFT:
                x-=speed;
                break;
            case KeyEvent.VK_RIGHT:
                x+=speed;
                break;
            case KeyEvent.VK_UP:
                y-=speed;
                break;
            case KeyEvent.VK_DOWN:
                y+=speed;
                break;
        }
    }

    long t;
    void fire(ArrayList<Bullet> arr){
        long T = System.currentTimeMillis();
        if(T - t<=500){ // quản lý thời gian bắn.
            return ;
        }
        t=T;

        int xB = x + im.getWidth(null) / 2;
        Bullet b  = new Bullet(xB, y);// khởi tạo đạn b
        arr.add(b); //thêm v vào mảng.
    }
}
