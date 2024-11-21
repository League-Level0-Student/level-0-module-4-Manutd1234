package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class doubletestscores {
public static void main(String[] args) {
String scores = JOptionPane.showInputDialog("What is your test score");	
double scoresInt = Double.parseDouble(scores);
double total = 0.00 + scoresInt;
JOptionPane.showMessageDialog(null, "Wow! You must have studied hard for that test!" + String.format("%.02f", total));


	JOptionPane.showMessageDialog(null, "Study harder next time");
}
}


