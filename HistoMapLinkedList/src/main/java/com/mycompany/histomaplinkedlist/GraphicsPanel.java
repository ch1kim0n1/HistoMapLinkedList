/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.histomaplinkedlist;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
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
    int width = getWidth();
    int height = getHeight();
    int barWidth = (width - 300) / 5;
    int maxBarHeight = height - 150;
    int x = 100;
    String[] grades = {"A", "B", "C", "D", "F"};
    int[] gradeCounts = getGradeCounts(data);
    g.setColor(Color.BLACK);
    g.drawString("HistoMap", width/2 - 100, 20);
    g.drawRect(75, 75, width - 150, height - 150);  // increase the x and y coordinates by 25 pixels to account for the buffer space
    g.drawString("Grade", 25, 40);
    g.drawString("Count", width - 50, height/2 + 10);
    g.drawLine(75, height - 75, width - 75, height - 75);  // increase the x and y coordinates by 25 pixels to account for the buffer space
    g.drawLine(75, height - 75, 75, 75);  // increase the x and y coordinates by 25 pixels to account for the buffer space
    Graphics2D g2 = (Graphics2D) g;  // cast to Graphics2D
    
    int maxGradeCount = 0;
    for (int i = 0; i < gradeCounts.length; i++) {
        maxGradeCount = Math.max(maxGradeCount, gradeCounts[i]);
    }
    
    int yAxisMax = (maxGradeCount+1);  // round up to the next multiple of 8
    int yAxisInterval = yAxisMax / 8;  // 8 intervals on the y-axis
    
    g.drawString("Y Axis Values", 20, 20);
    for (int i = 0; i <= 10; i++) {
        g.setColor(Color.RED);
        g.drawString(Integer.toString(i * yAxisInterval), 15, height - 75 - (i * (int)(maxBarHeight / 10.0)));
        g.setColor(Color.gray);
        g.drawLine(75, height - 75 - (i * (int)(maxBarHeight / 10.0)), width - 75, height - 75 - (i * (int)(maxBarHeight / 10.0)));
    }
    
    for (int i = 0; i < grades.length; i++) {
        int barHeight = (int) (gradeCounts[i] / 10.0 * maxBarHeight);
        g.setColor(getBarFillColor(grades[i]));
        g2.setStroke(new BasicStroke(3)); //multiple 
        g.fillRect(x , height - barHeight - 75, barWidth, barHeight);
        g2.setStroke(new BasicStroke(3)); //multiply
        g.setColor(Color.BLACK);
        g.drawRect(x , height - barHeight - 75, barWidth, barHeight);
        g2.setStroke(new BasicStroke(3));  //
        g.drawString(grades[i] + " (" + gradeCounts[i] + ")", x + barWidth / 2 - 10, height - barHeight - 80);
        g.drawString(grades[i], x + barWidth / 2 - 10, height - 50);
        x += barWidth + 25;
    } 
    
    //blue line
    g.setColor(Color.BLUE);
    int xn = 40;
    int y = height - 60;
    for (int i = 0; i < grades.length; i++) {
        int newX = xn + barWidth + 35;
        int newY = height - 95 - (int)(gradeCounts[i] / 10.0 * maxBarHeight);
        g.drawLine(xn, y, newX, newY);
        g.drawOval(newX - 5, newY - 5, 10, 10);
     xn = newX;
     y = newY;

    }
}

private Color getBarFillColor(String grade) {
if (grade.equals("A") || grade.equals("B")) {
return Color.GREEN;
} else if (grade.equals("C")) {
return Color.YELLOW;
} else if (grade.equals("D")) {
return Color.ORANGE;
} else {
return Color.RED;
}
}

private Color getBarBorderColor(String grade) {
if (grade.equals("A")) {
return Color.GREEN;
} else if (grade.equals("B")) {
return Color.GREEN;
} else if (grade.equals("C")) {
return Color.YELLOW;
} else if (grade.equals("D")) {
return Color.ORANGE;
} else {
return Color.RED;
}
}

private int[] getGradeCounts(String gradesString) {
    int[] gradeCounts = new int[5];
    String[] grades = gradesString.split(" ");
    for (String grade : grades) {
        if (!grade.isEmpty()) {
            int score = Integer.parseInt(grade);
            if (score >= 90) {
                gradeCounts[0]++;
            } else if (score >= 80) {
                gradeCounts[1]++;
            } else if (score >= 70) {
                gradeCounts[2]++;
            } else if (score >= 60) {
                gradeCounts[3]++;
            } else {
                gradeCounts[4]++;
            }
        }
    }
    return gradeCounts;
}

}