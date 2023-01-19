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
    int width = getWidth();
    int height = getHeight();
    int barWidth = (width - 200) / 5;
    int maxBarHeight = height - 150;
    int x = 50;
    String[] grades = {"A", "B", "C", "D", "F"};
    int[] gradeCounts = getGradeCounts(data);
    g.setColor(Color.BLACK);
    g.drawString("HistoMap", width/2 - 50, 20);
    g.drawRect(50, 50, width - 100, height - 100);
    g.drawString("Grade", 25, 40);
    g.drawString("Count", width - 50, height/2 + 10);
    g.drawLine(50, height - 50, width - 50, height - 50);
    g.drawLine(50, height - 50, 50, 50);
    for (int i = 0; i < grades.length; i++) {
        int barHeight = (int) (gradeCounts[i] / 10.0 * maxBarHeight);
        g.setColor(getBarFillColor(grades[i]));
        g.fillRect(x, height - barHeight - 75, barWidth, barHeight);
        g.setColor(getBarBorderColor(grades[i]));
        g.drawRect(x, height - barHeight - 75, barWidth, barHeight);
        g.setColor(Color.BLACK);
        g.drawString(grades[i] + " (" + gradeCounts[i] + ")", x + barWidth / 2 - 10, height - barHeight - 80);
        x += barWidth + 25;
    }
    //line
    g.setColor(Color.BLUE);
    int xn = 40;
    int y = height - 75;
    for (int i = 0; i < grades.length; i++) {
        int newX = xn + barWidth + 25;
        int newY = height - 75 - (int)(gradeCounts[i] / 10.0 * maxBarHeight);
        g.drawLine(xn, y, newX, newY);
        g.drawOval(newX - 5, newY - 5, 10, 10);
     xn = newX;
     y = newY;

    }
    g.setColor(Color.RED);
    g.drawString("Y Axis Values", 20, 20);
    for (int i = 0; i < 10; i++) {
        g.drawString(Integer.toString(i), 15, height - 75 - (i * (int)(maxBarHeight / 10.0)));
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
    return gradeCounts;
}

}