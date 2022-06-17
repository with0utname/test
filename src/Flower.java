import java.awt.*;

import java.awt.event.*;

import java.awt.geom.*;

import java.applet.*;

public class Flower extends Applet {
    public static void main(String[] args) {
//        Graphics g = new Graphics2D() {
//        }
    }

    public void paint(Graphics g) {

        Graphics2D g_2d = (Graphics2D) g;

//花叶两边的曲线:

        QuadCurve2D curve_1 = new QuadCurve2D.Double(200, 200, 150, 160, 200, 100);

        CubicCurve2D curve_2 = new CubicCurve2D.Double(200, 200, 260, 145, 190, 120, 200, 100);

//花叶中的纹线:

        Line2D line = new Line2D.Double(200, 200, 200, 110);

        QuadCurve2D leaf_line1 = new QuadCurve2D.Double(200, 180, 195, 175, 190, 170);

        QuadCurve2D leaf_line2 = new QuadCurve2D.Double(200, 180, 210, 175, 220, 170);

        QuadCurve2D leaf_line3 = new QuadCurve2D.Double(200, 160, 195, 155, 190, 150);

        QuadCurve2D leaf_line4 = new QuadCurve2D.Double(200, 160, 214, 155, 220, 150);

//利用旋转来绘制花朵:

        AffineTransform trans = new AffineTransform();

        for (int i = 0; i < 6; i++) {

            trans.rotate(60 * Math.PI / 180, 200, 200);

            g_2d.setTransform(trans);

            GradientPaint gradient_1 = new GradientPaint(200, 200, Color.green, 200, 100, Color.yellow);

            g_2d.setPaint(gradient_1);

            g_2d.fill(curve_1);

            GradientPaint gradient_2 = new GradientPaint(200, 145, Color.green, 260, 145, Color.red, true);

            g_2d.setPaint(gradient_2);

            g_2d.fill(curve_2);

            Color c3 = new Color(0, 200, 0);
            g_2d.setColor(c3);

            g_2d.draw(line);

            g_2d.draw(leaf_line1);
            g_2d.draw(leaf_line2);

            g_2d.draw(leaf_line3);
            g_2d.draw(leaf_line4);

        }

//花瓣中间的花蕾曲线:

        QuadCurve2D center_curve_1 = new QuadCurve2D.Double(200, 200, 190, 185, 200, 180);

        AffineTransform trans_1 = new AffineTransform();

        for (int i = 0; i < 12; i++) {

            trans_1.rotate(30 * Math.PI / 180, 200, 200);

            g_2d.setTransform(trans_1);

            GradientPaint gradient_3 = new GradientPaint(200, 200, Color.red, 200, 180, Color.yellow);

            g_2d.setPaint(gradient_3);

            g_2d.fill(center_curve_1);

        }

//再绘制一个0.4倍的花朵:

        AffineTransform trans_2 = new AffineTransform();

        trans_2.scale(0.4, 0.4);

        for (int i = 0; i < 6; i++) {

            trans_2.rotate(60 * Math.PI / 180, 200, 200);

            g_2d.setTransform(trans_2);
            g_2d.setColor(Color.pink);

            g_2d.fill(curve_1);

            g_2d.setColor(Color.green);

            g_2d.fill(curve_2);

        }

    }

}
