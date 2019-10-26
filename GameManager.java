import java.awt.*;
import java.util.ArrayList;

public class GameManager { //là đối tượng quản lý toàn bộ nhân vật game.
    PlayerCar player; // đưa player vào manager
    ArrayList<Bullet> bullets; //đưa đạn vào manager
    void initGame(){ // khởi tạo ô tô
        player = new PlayerCar(200, 200);
        bullets = new ArrayList<>();
    }
    void draw(Graphics2D g2d){ //vẽ toàn bộ nhân vật game ở đây.
        player.draw(g2d); //vẽ player
        for (Bullet b: bullets){ // vẽ đạn
            b.draw(g2d);
        }
    }
    void playerMove(int orient){ //di chuyển
        player.orient = orient;
        player.move();
    }
    void playerFire(){
        player.fire(bullets);
    }
    void AI(){
        for( int i = bullets.size() - 1; i >= 0; i-- ){ //xóa đạn, xóa phần tử phải duyệt ngược
            boolean delete = bullets.get(i).move();
            if(delete){
                bullets.remove(i); // xóa đạn ở vị trí i.
            }
        }
    }
}
