import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DrawPanel extends JPanel implements ActionListener {

    private final int PANEL_WIDTH;
    private final int PANEL_HEIGHT;
    private final int TIMER_DELAY;
    private Timer timer;
    // private Timer timer2;
    private static int delta = 1;
    private static int delta2 = 5;
    // private static int deltay = 1;
    private static boolean deltaflag = true;
    private static boolean deltaflag2 = true;

    private int ticksFromStart = 0;
    // private int ticksFromStart2 = 0;

    // private Amogus amogus;
    private Sun sun;
    private Light light;
    private Light light2;
    private Light light3;
    private Light light4;
    private Light light5;
    private Light light6;
    private Light light7;
    private Cloud cloud;
    private Cloud cloud2;
    private Cloud cloud3;
    private Cloud cloud4;
    private Cloud cloud5;
    private Seagull seagull;
    private Seagull seagull2;
    private Seagull seagull3;
    private Fish fish;

    public DrawPanel(final int width, final int height, final int timerDelay) {
        this.PANEL_WIDTH = width;
        this.PANEL_HEIGHT = height;
        this.TIMER_DELAY = timerDelay;
        timer = new Timer(timerDelay, this);
        timer.start();
        // timer2 = new Timer(timerDelay, this);
        // timer2.start();

        // this.amogus = new Amogus(ticksFromStart, 200, 200, 260, Color.RED);
        this.sun = new Sun(250, 0, 250, 250, Color.red);
        this.light = new Light(0, 510, 0, 0, Color.white);
        this.light2 = new Light(0, 530, 0, 0, Color.white);
        this.light3 = new Light(0, 550, 0, 0, Color.white);
        this.light4 = new Light(0, 570, 0, 0, Color.white);
        this.light5 = new Light(0, 600, 0, 0, Color.white);
        this.light6 = new Light(0, 630, 0, 0, Color.white);
        this.light7 = new Light(0, 650, 0, 0, Color.white);
        this.cloud = new Cloud(0, 250, 0, 0, Color.white);
        this.cloud2 = new Cloud(0, 300, 0, 0, Color.white);
        this.cloud3 = new Cloud(0, 370, 0, 0, Color.white);
        this.cloud4 = new Cloud(0, 260, 0, 0, Color.white);
        this.cloud5 = new Cloud(0, 280, 0, 0, Color.white);
        this.seagull = new Seagull(600, 0, 0, 0, Color.white);
        this.seagull2 = new Seagull(630, 0, 0, 0, Color.white);
        this.seagull3 = new Seagull(660, 0, 0, 0, Color.white);
        this.fish = new Fish(0, 632, 0, 0, Color.BLUE);
    }

    @Override
    public void paint(final Graphics gr) {
        super.paint(gr);

        if (delta == 1) deltaflag = true;
        if (delta == 0) deltaflag = false;
        if (deltaflag) {
            delta -= 1;
        } else {
            delta += 1;
        }

        if (delta2 == 5) deltaflag2 = true;
        if (delta2 == 0) deltaflag2 = false;
        if (deltaflag2) {
            delta2 -= 1;
        } else {
            delta2 += 1;
        }
        // Graphics2D g = (Graphics2D) gr;

        //Scenery, sea and sky
        gr.setColor(Color.CYAN);
        gr.fillRect(0, 500, 800, 400);
        gr.setColor(Color.ORANGE);
        gr.fillRect(0, 0, 800, 500);
        gr.setColor(Color.WHITE);
        gr.fillRect(0, 500, 800, 3);
        gr.setColor(Color.black);
        gr.fillRect(56 + ticksFromStart, 498, 6, 3);
        gr.fillRect(570 - ticksFromStart, 498, 7, 5);
        gr.fillRect(136 - ticksFromStart, 498, 2, 6);
        gr.fillRect(370 + ticksFromStart, 498, 10, 3);

        //Board
        gr.setColor(Color.yellow);
        gr.fillRect(40 + delta, 600, 200, 60);
        gr.setColor(Color.black);
        gr.drawLine(40 + delta, 610, 240, 610);
        gr.drawRect(40 + delta, 600, 200, 60);
        gr.fillRect(30 + delta, 630, 35, 35);

        //Man
        gr.fillRect(160 + delta, 540, 30, 60);
        gr.fillOval(160 + delta, 503, 40, 40);
        gr.fillRect(180 + delta, 547, 30, 10);
        gr.fillRect(180 + delta, 558, 28, 10);

        //Hat
        gr.drawRect(160 + delta, 501, 45, 4);
        gr.drawOval(170 + delta, 498, 24, 4);
        gr.setColor(Color.lightGray);
        gr.fillRect(160 + delta, 501, 45, 4);
        gr.fillOval(170 + delta, 498, 24, 6);

        //Sun
        sun.setY(200 - ticksFromStart);
        sun.draw(gr);

        //Reflections
        light.setX(350 + delta);
        light.draw(gr);
        light.setX(360 + delta2);
        light.draw(gr);
        light.setX(370 + delta);
        light.draw(gr);
        light.setX(320 + delta2);
        light.draw(gr);
        light.setX(420 + delta);
        light.draw(gr);
        light.setX(400 + delta2);
        light.draw(gr);
        light.setX(300 + delta);
        light.draw(gr);
        light.setX(450 + delta2);
        light.draw(gr);

        light2.setX(350 + delta2);
        light2.draw(gr);
        light2.setX(330 + delta2);
        light2.draw(gr);
        light2.setX(375 + delta);
        light2.draw(gr);
        light2.setX(395 + delta2);
        light2.draw(gr);
        light2.setX(310 + delta);
        light2.draw(gr);

        light3.setX(300 + delta);
        light3.draw(gr);
        light3.setX(335 + delta);
        light3.draw(gr);
        light3.setX(370 + delta2);
        light3.draw(gr);
        light3.setX(355 + delta);
        light3.draw(gr);

        light4.setX(280 + delta2);
        light4.draw(gr);
        light4.setX(335 + delta2);
        light4.draw(gr);
        light4.setX(370 + delta);
        light4.draw(gr);

        light5.setX(335 + delta);
        light5.draw(gr);
        light5.setX(370 + delta);
        light5.draw(gr);
        light5.setX(400 + delta2);
        light5.draw(gr);

        light6.setX(355 + delta2);
        light6.draw(gr);
        light6.setX(370 + delta);
        light6.draw(gr);

        light7.setX(355 + delta);
        light7.draw(gr);

        //Rod
        gr.setColor(Color.black);
        gr.fillRect(200 + delta, 548, 7, 28);
        gr.drawLine(200, 554, 610, 620);
        gr.drawOval(606 + delta, 620, 13, 13);
        gr.setColor(Color.pink);
        gr.fillOval(606 + delta, 620, 13, 13);

        //Clouds
        cloud.setX(100 + delta2);
        cloud.draw(gr);

        cloud2.setX(150 + delta);
        cloud2.draw(gr);

        cloud3.setX(300 + delta2);
        cloud3.draw(gr);

        cloud4.setX(10 + delta);
        cloud4.draw(gr);

        cloud5.setX(400 + delta);
        cloud5.draw(gr);

        //Birds
        seagull.setY(100 + delta);
        seagull.draw(gr);

        seagull2.setY(120 + delta);
        seagull2.draw(gr);

        seagull3.setY(140 + delta2);
        seagull3.draw(gr);

        fish.setX(625 + delta);
        fish.draw(gr);


        //wave2.setX(360 + deltax);
        //wave2.draw(gr);

        /* wave3.setX(340 + deltax);
        wave3.draw(gr);
        wave3.setX(370 + deltax);
        wave3.draw(gr);

        wave4.setX(354 + deltax);
        wave4.draw(gr);
        wave4.setX(374 + deltax);
        wave4.draw(gr);

        wave5.setX(325 + deltax);
        wave5.draw(gr);

        wave6.setX(324 + deltax);
        wave6.draw(gr);

        wave7.setX(310 + deltax);
        wave7.draw(gr); */
        // wave2.draw(gr);


        // super.paint(gr);
        // amogus.setX(ticksFromStart);
        // amogus.draw(gr);
    }

    @Override
    public void actionPerformed(final ActionEvent e) {
        if (e.getSource() == timer) {
            repaint();
            ticksFromStart++;
        }
    }
}