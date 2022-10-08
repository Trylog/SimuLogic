package Graphics;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame implements ActionListener {

	JButton button1, button2, button3;

	public Menu(){

		this.setTitle("SimuLogic");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		this.setSize(400, 500);
		this.setVisible(true);


	}




	@Override
	public void actionPerformed(ActionEvent e) {

	}
}
