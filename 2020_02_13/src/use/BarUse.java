package use;

import javax.swing.JFrame;

import ������.MultiProgressBarEx;

public class BarUse {
	public static void main(String[] args) {
		JFrame.setDefaultLookAndFeelDecorated(true);//frame instance ����� ���� �־���� 
		JFrame frame = new JFrame("MultiThreadTest");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(new MultiProgressBarEx());
		frame.pack();
		frame.setVisible(true);
	}
}
