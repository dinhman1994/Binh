import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class RacingPanel extends JPanel {
    GameManager manager = new GameManager(); //khai báo để gọi init game bên dưới
    boolean[] flag = new boolean[256];
    public RacingPanel() {

        setBackground(Color.BLACK); // truyền bản vẽ vào và cho là màu đen.
        manager.initGame(); //vẽ initGame.
        setFocusable(true);
        addKeyListener(listener); // xử lý nghe key từ người dùng.

        Thread t = new Thread(run); // đạn chạy
        t.start();
    }

    @Override
        protected void paintComponent(Graphics g) { //phương thức để vẽ giao diện đồ họa.
        Graphics2D g2d = (Graphics2D) g; //tạo graphic2D.
        super.paintComponent(g2d);
        manager.draw(g2d);
    }
    Runnable run = new Runnable() { // chạy song song.
        @Override
        public void run() {
         while(true) {
             if(flag[KeyEvent.VK_LEFT]){
                 manager.playerMove(KeyEvent.VK_LEFT);
             }
             if(flag[KeyEvent.VK_RIGHT]){
                 manager.playerMove(KeyEvent.VK_RIGHT);
             }
             if(flag[KeyEvent.VK_UP]){
                 manager.playerMove(KeyEvent.VK_UP);
             }
             if(flag[KeyEvent.VK_DOWN]){
                 manager.playerMove(KeyEvent.VK_DOWN);
             }
             if(flag[KeyEvent.VK_SPACE]){
                 manager.playerFire();
             }
             manager.AI();
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

    KeyListener listener = new KeyListener() { // nghe sự kiện từ bàn phím khi nhấn lâu. ( gỡ dòng đầu, tự động ra code )
        @Override
        public void keyTyped(KeyEvent e) {

        }

        @Override
        public void keyPressed(KeyEvent e) {
            flag[e.getKeyCode()] = true;
        }

        @Override
        public void keyReleased(KeyEvent e) {
            flag[e.getKeyCode()] = false;
        }
    };
}
