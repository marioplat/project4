package Main;

import javax.swing.JOptionPane;

public class MathGenerator {

	//instance variables
    static int correct = 0; 
    static int num = 1;
    static int questions = 0; 
    
    /*
     * This method sets up the main parts of the game. It will open up the main menu and will ask the player how 
     * many questions they would like to answer (if the player types in anything other than a number, it will force them to re-do).
     * This method also sets up a and b, which are different parameters that can be any number. The player will also be asked to
     * either add, subtract, multiply, or divide random numbers.
     */
    public static void main(String args[]){
        try {
        questions = Integer.parseInt(JOptionPane.showInputDialog("Welcome to the Arithmetic Problem Generator! How many questions would you like to answer?"));
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Come on dude you're getting things wrong already and you're not even on the actual quiz... Come back when you can TYPE A FREAKING NUMBER.");
        }
        int a = 0;
        int b = 0;
        int type = 0; 
        
    for(int i = 0; i < questions; i++) {
        a = (int) (Math.random() * 10);
        b = (int) (Math.random() * 10);
        type = (int) (Math.random() * 4);
        
        if(type == 0) {
            add(a, b); 
        }
        else if(type == 1) {
            sub(a, b);
        }
        else if(type == 2) {
            mult(a, b);
        }
        else {
            div(a, b);
        }
        num++; 
    }
    JOptionPane.showMessageDialog(null, "You got " + correct + " / " + questions + " questions correct!");
    
}
    /*
     * This method sets up adding questions. If the player answers correctly, they will gain a point 
     * and will move on the next question. If the player is incorrect, they wont earn the point and
     * will simply move on to the next question.
     */
    private static void add(int a, int b) {
        int answer = a + b;
        String q = JOptionPane.showInputDialog("Question " + num + ": " + a + " + " + b);
        try {
        if(q.equalsIgnoreCase("exit")) {
            questions = num;
        }
        else if(Integer.parseInt(q) == answer) {
            JOptionPane.showMessageDialog(null, "Ding ding ding!! You are correct!");
            correct++;
        }
        else {    
        JOptionPane.showMessageDialog(null, "You are wrong...");
        }
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, "You are wrong...");
        }
    }
    /*
     * This method sets up subtracting questions. If the player answers correctly, they will gain a point 
     * and will move on the next question. If the player is incorrect, they wont earn the point and
     * will simply move on to the next question.
     */
    private static void sub(int a, int b) {
        while(b > a) {
            b = (int) (Math.random() * 10);
            a = (int) (Math.random() * 10);
        }
        int answer = a - b; 
        String q = JOptionPane.showInputDialog("question " + num + ": " + a + " - " + b);
        try {
        if(q.equalsIgnoreCase("exit")) {
            questions = num;
        }
        else if(Integer.parseInt(q) == answer) {
            JOptionPane.showMessageDialog(null, "Ding ding ding!! You are correct!");
            correct++;
        }
        else {
        JOptionPane.showMessageDialog(null, "You are wrong...");
        }
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, "You are wrong...");
        }
    }
    /*
     * This method sets up multiplying questions. If the player answers correctly, they will gain a point 
     * and will move on the next question. If the player is incorrect, they wont earn the point and
     * will simply move on to the next question.
     */
    private static void mult(int a, int b) {
        int answer = a * b; 
        String q = JOptionPane.showInputDialog("question " + num + ": " + a + " * " + b);
        try {
        if(q.equalsIgnoreCase("exit")) {
            questions = num;
        }
        else if(Integer.parseInt(q) == answer) {
            JOptionPane.showMessageDialog(null, "Ding ding ding!! You are correct!");
            correct++;
        }
        else {    
        JOptionPane.showMessageDialog(null, "You are wrong...");
        }
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, "You are wrong...");
        }
    }
    /*
     * This method sets up dividing questions. If the player answers correctly, they will gain a point 
     * and will move on the next question. If the player is incorrect, they wont earn the point and
     * will simply move on to the next question.
     */
    private static void div(int a, int b) {
        while(b == 0) {
            b = (int) (Math.random() * 10);
        }
        int answer = a*b / b;
        String q = JOptionPane.showInputDialog("question " + num + ": " + a*b + " / " + b);
        try {
        if(q.equalsIgnoreCase("exit")) {
            questions = num;
        }
        else if(Integer.parseInt(q) == answer) {
            JOptionPane.showMessageDialog(null, "Ding ding ding!! You are correct!");
            correct++;
        }
        else {    
        JOptionPane.showMessageDialog(null, "You are wrong...");
        }
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, "You are wrong...");
        }
    }
}
