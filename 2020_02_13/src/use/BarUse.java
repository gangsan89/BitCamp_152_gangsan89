package use;

import javax.swing.JFrame;

import 스레드.MultiProgressBarEx;

public class BarUse {
	public static void main(String[] args) {
		JFrame.setDefaultLookAndFeelDecorated(true);//frame instance 만들기 전에 넣어야함 
		JFrame frame = new JFrame("MultiThreadTest");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(new MultiProgressBarEx());
		frame.pack();
		frame.setVisible(true);
	}
}
