/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.histomaplinkedlist;

/**
 *
 * @author kondraty_946191
 */
public class HistoNode
{
    private char letter;
    private int letterCount;
    private HistoNode next;
    
    public HistoNode(char let, int cnt, HistoNode n){
        letter=let;
        letterCount=cnt;
        next=n;
    }
    
    public char getLetter(){
        return letter;
    }
    
    public int getLetterCount(){
        return letterCount;
    }
    
    public void setLetter(char let){
        letter=let;
    }
    
    public void setLetterCount(int cnt){
        letterCount=cnt;
    }
    
    public HistoNode getNext(){
        return next;
    }
}