package 스레드;

import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

public class MultiProgressBarEx extends JPanel implements ActionListener {
	private JProgressBar bar1, bar2;
	private JButton startBtn;
	private int max = 500000000;
	
	public MultiProgressBarEx() {
		setLayout(new GridLayout(2,2));
		
		startBtn=new JButton("Start");
		startBtn.addActionListener(this);
				
		bar1 = new JProgressBar(0, max);
		bar2 = new JProgressBar(0, max);
		bar1.setValue(2000);
		bar1.setStringPainted(true);
		bar2.setValue(0);
		bar2.setStringPainted(true);
		
		add(startBtn);	add(bar1);
		add(new Label(""));	add(bar2);
		
		setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		startBtn.setEnabled(false);
		int current =0, current2 =0;
		while( current <= max ) {//5억보다 작은동안 반복해서 프로그래스바를 이동
			current += Math.random()*100;
			current2 += Math.random()*100;
			bar1.setValue(current);
			bar2.setValue(current2);
		}
		startBtn.setEnabled(true);
	}
	
	
}
