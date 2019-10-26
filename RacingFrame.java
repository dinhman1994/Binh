import javax.swing.*;
import java.awt.*;

public class RacingFrame extends JFrame {

    public static final int W = 600;
    public static final int H = 800;

    public RacingFrame() throws HeadlessException {
        setSize(W, H); //tao kick thuoc cho frame.
        setTitle("Racing"); // xét tiêu đề cho khung.
        setLocationRelativeTo(null); // đưa màn hình ra giữa
        setResizable(false); //không cho thay đổi kích thước.

        RacingPanel panel = new RacingPanel(); //tạo panel cho khung tranh
        add(panel); //add thằng panel vào tranh
    }

    public static void main(String[] args) {
        RacingFrame frame = new RacingFrame(); //tao frame
        frame.setVisible(true); // hiển thị cửa sổ window trắng.
    }
}
