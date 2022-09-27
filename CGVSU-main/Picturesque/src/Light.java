import java.awt.*;

public class Light {
    private int x;
    private int y;
    private int width;
    private int height;
    private Color color;

    public Light(final int x, final int y, final int width, final int height, final Color color) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    void draw(final Graphics gr) {
        gr.setColor(this.color);
        gr.fillRect(this.x, this.y, 30, 5);
        gr.fillRect(this.x + 5, this.y, 40, 5);
        gr.fillRect(this.x - 10, this.y, 40, 5);
        gr.fillRect(this.x, this.y + 15, 40, 5);
        gr.fillRect(this.x, this.y - 5, 40, 5);
        gr.fillRect(this.x, this.y + 5, 30, 5);
        gr.setColor(Color.red);
        gr.drawRect(this.x, this.y, 30, 5);

    }
}
