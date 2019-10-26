import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GameStage extends JPanel
{
    boolean[] flag=new boolean[256];
    GameField gameField=new GameField();
    public GameStage()
    {
        setBackground(Color.BLACK); // truyền bản vẽ vào và cho là màu đen.
        //manager.initGame(); //vẽ initGame.
        setFocusable(true);
        // xử lý nghe key từ người dùng.
        gameField.initGame();
        Thread t = new Thread(run); // đạn chạy
        t.start();
    }
    @Override
    protected void paintComponent(Graphics g) { //phương thức để vẽ giao diện đồ họa.
        Graphics2D g2d = (Graphics2D) g; //tạo graphic2D.
        super.paintComponent(g2d);
        gameField.draw(g2d);
    }
    Runnable run = new Runnable() { // chạy song song.
        @Override
        public void run() {
            while(true) {

                repaint();
                try {
                    Thread.sleep(7);
                }
                catch (InterruptedException e ){
                    e.printStackTrace();
                }
            }
        }
    };
}


