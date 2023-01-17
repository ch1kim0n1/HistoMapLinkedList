/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.histomaplinkedlist;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class HistoMapLinkedList extends JPanel {
    private HistoMap histoMap;
    public HistoMapLinkedList(HistoMap histoMap) {
        this.histoMap = histoMap;
    }
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        // get the counts for each letter grade
        int aCount = histoMap.get('A');
        int bCount = histoMap.get('B');
        int cCount = histoMap.get('C');
        int dCount = histoMap.get('D');
        int fCount = histoMap.get('F');

        // draw the histogram using the counts
        int x = 20;
        int y = 20;
        int width = 20;
        int height = 20;
        g.setColor(Color.RED);
        g.fillRect(x, y, width * aCount, height);
        g.setColor(Color.BLUE);
        g.fillRect(x, y + height, width * bCount, height);
        g.setColor(Color.GREEN);
        g.fillRect(x, y + 2 * height, width * cCount, height);
        g.setColor(Color.YELLOW);
        g.fillRect(x, y + 3 * height, width * dCount, height);
        g.setColor(Color.BLACK);
        g.fillRect(x, y + 4 * height, width * fCount, height);

        // draw the labels
        g.setColor(Color.BLACK);
        g.drawString("A", x + width * aCount + 5, y + height - 5);
        g.drawString("B", x + width * bCount + 5, y + 2 * height - 5);
        g.drawString("C", x + width * cCount + 5, y + 3 * height - 5);
        g.drawString("D", x + width * dCount + 5, y + 4 * height - 5);
        g.drawString("F", x + width * fCount + 5, y + 5 * height - 5);
    }
}
