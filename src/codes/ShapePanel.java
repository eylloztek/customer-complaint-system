/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codes;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Lenovo
 */
public class ShapePanel extends JPanel{
    public ShapePanel(){
        this.setPreferredSize(new Dimension(900, 400));
        
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paint(g);
        int[] xPoints1 = {55, 67, 109, 73, 83, 55, 27, 37, 1, 43};
        int[] yPoints1 = {40, 76, 76, 94, 136, 112, 136, 94, 76, 76};
        g.setColor(Color.BLACK);
        g.drawPolygon(xPoints1, yPoints1, 10);
        int[] xPoints2 = {95, 107, 149, 113, 123, 95, 67, 77, 41, 83};
        int[] yPoints2 = {40, 76, 76, 94, 136, 112, 136, 94, 76, 76};
        g.setColor(Color.BLACK);
        g.drawPolygon(xPoints2, yPoints2, 10);
        int[] xPoints3 = {135, 147, 189, 153, 163, 135, 107, 117, 81, 123};
        int[] yPoints3 = {40, 76, 76, 94, 136, 112, 136, 94, 76, 76};
        g.setColor(Color.BLACK);
        g.drawPolygon(xPoints3, yPoints3, 10);
        int[] xPoints4 = {175, 187, 229, 193, 203, 175, 147, 157, 121, 163};
        int[] yPoints4 = {40, 76, 76, 94, 136, 112, 136, 94, 76, 76};
        g.setColor(Color.BLACK);
        g.drawPolygon(xPoints4, yPoints4, 10);
        int[] xPoints5 = {215, 227, 269, 233, 243, 215, 187, 197, 161, 203};
        int[] yPoints5 = {40, 76, 76, 94, 136, 112, 136, 94, 76, 76};
        g.setColor(Color.BLACK);
        g.drawPolygon(xPoints5, yPoints5, 10);
    }
    
    
}
