import javax.swing.*;
import java.awt.*;

public class GameFrame extends JFrame {

    public static final int W = 650;
    public static final int H = 480;

    public GameFrame() throws HeadlessException {
        setSize(W, H); //tao kick thuoc cho frame.
        setTitle("Racing"); // xét tiêu đề cho khung.
        setLocationRelativeTo(null); // đưa màn hình ra giữa
        setResizable(false); //không cho thay đổi kích thước.

        GameStage panel = new GameStage(); //tạo panel cho khung tranh
        add(panel); //add thằng panel vào tranh
    }

    public static void main(String[] args) {
        GameFrame frame = new GameFrame(); //tao frame
        frame.setVisible(true); // hiển thị cửa sổ window trắng.
    }
}
