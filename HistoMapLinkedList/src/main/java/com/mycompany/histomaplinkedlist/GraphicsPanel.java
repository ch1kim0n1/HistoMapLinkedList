/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.histomaplinkedlist;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author skyla
 */
public class GraphicsPanel extends JPanel{
    
    private String data = "";
    
    public void processData (String data){
        this.data = data;
        
        // call repaint to call paint, update, and paintCOmponent method.
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        //draws a red box
        g.setColor(Color.RED);
        g.fillRect(30, 50, 50, 200);
        
        //draws a text
        g.setColor(Color.black);
        g.drawString("Red Box", 30, 270);
        
        //draws grades
        g.drawString(data, 30, 290);
    }
    
    
    
}
