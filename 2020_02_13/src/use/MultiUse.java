package use;

import javax.swing.JFrame;

import ������.Multi;
import ������.MultiProgressBarEx;

public class MultiUse {
	public static void main(String[] args) {
		JFrame.setDefaultLookAndFeelDecorated(true);//frame instance ����� ���� �־���� 
		JFrame frame = new JFrame("MultiThreadTest");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(new Multi());
		frame.pack();
		frame.setVisible(true);
	}
}
