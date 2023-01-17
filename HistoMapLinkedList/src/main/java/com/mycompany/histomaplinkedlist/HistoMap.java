/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.histomaplinkedlist;

/**
 *
 * @author kondraty_946191
 */
public class HistoMap {
    private HistoNode head;

    public HistoMap() {
        head = new HistoNode('F', 0, null);
        head = new HistoNode('D', 0, head);
        head = new HistoNode('C', 0, head);
        head = new HistoNode('B', 0, head);
        head = new HistoNode('A', 0, head);
    }

    public void put(int grade) {
        char letter = getLetterGrade(grade);
        HistoNode current = head;
        while (current != null) {
            if (current.getLetter() == letter) {
                current.setLetterCount(current.getLetterCount() + 1);
                return;
            }
            current = current.getNext();
        }
    }

    public int get(char letterGrade) {
        HistoNode current = head;
        while (current != null) {
            if (current.getLetter() == letterGrade) {
                return current.getLetterCount();
            }
            current = current.getNext();
        }
        return 0;
    }

    private char getLetterGrade(int grade) {
        if (grade >= 90) {
            return 'A';
        } else if (grade >= 80) {
            return 'B';
        } else if (grade >= 70) {
            return 'C';
        } else if (grade >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
}
