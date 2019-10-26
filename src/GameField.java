import java.awt.*;
import java.util.ArrayList;

public class GameField { //là đối tượng quản lý toàn bộ nhân vật game.
    Map map1; // đưa player vào manager

    void initGame()
    {
        map1=new Map(0,0);
    }
    void draw(Graphics2D g2d){ //vẽ toàn bộ nhân vật game ở đây.
        map1.draw(g2d);
    }


}
