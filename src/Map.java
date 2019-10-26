import java.awt.*;

public class Map {
    int x;
    int y;
    Image image=ImageLoader.getImage("map2moi.png");

    public Map(int x, int y) {
        this.x = x;
        this.y = y;
    }
    void draw(Graphics2D g2d){
        g2d.drawImage(image, x, y, null);
    } //vẽ ảnh

}
