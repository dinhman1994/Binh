import javax.swing.*;
import java.awt.*;

public class ImageLoader  {
    public static Image getImage(String name){ //tạo ra phương thức Image.
        ImageIcon icon = new ImageIcon(
                new ImageLoader().getClass()
                        .getResource("/Image/"+name)); //chọn hình ảnh vào chỗ name.
        return icon.getImage();
    }
}
