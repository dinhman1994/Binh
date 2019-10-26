import java.awt.*;

public class Bullet {
    int x;
    int y;
    int speed = 2;
    Image im = ImageLoader.getImage("bullet.png");

    public Bullet(int x, int y) {
        this.x = x;
        this.y = y;
    }
    void draw(Graphics2D g2d) { g2d.drawImage(im,x,y,null);} //vẽ đạn
    boolean move(){
        y -= speed;
        return y <= 0; // đạn ra ngoài thì xóa.
    }
}
