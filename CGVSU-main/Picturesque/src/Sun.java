import java.awt.*;

public class Sun {
    private int x;
    private int y;
    private int width;
    private int height;
    private Color color;

    public Sun(final int x, final int y, final int width, final int height, final Color color) {
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

    public int getY() {
        return this.y;
    }

    public Color getColor() {
        return this.color;
    }

    void draw(final Graphics gr) {
        gr.setColor(this.color);
        gr.fillOval(this.x, this.y, this.width, this.height);
        gr.setColor(Color.black);
        gr.drawOval(this.x, this.y, this.width, this.height);
        if (this.y <= 180) {
            gr.setColor(Color.yellow);
            gr.fillOval(this.x, this.y, this.width, this.height);
            gr.setColor(Color.black);
            gr.drawOval(this.x, this.y, this.width, this.height);
        }
    }
}
