
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


@SuppressWarnings("serial")
public class Bank extends JFrame {
	private JTextField item1;
	private JButton button1;
	private JButton button2;
	private JLabel loginMessage;
	private JPasswordField passwordField;
	public static List<Account> directory = new ArrayList<>();

	public Bank() {
		super("Banking Simulation");
		setLayout(new FlowLayout());

		loginMessage = new JLabel();
		loginMessage.setText("Choose a username (enter on the left) and a password (enter on the right)");
		loginMessage.setVisible(false);
		add(loginMessage);

		button1 = new JButton();
		button1.setText("Click here to register an account");
		//button1.setToolTipText("This is a button!");
		button1.setSize(200, 200);
		add(button1);

		button2 = new JButton();
		button2.setText("Click here to log in");
		//button2.setToolTipText("This is a button!");
		button2.setSize(200, 200);
		add(button2);

		item1 = new JTextField("(Username):                  ");
		item1.setVisible(false);
		add(item1);


		passwordField = new JPasswordField("mypass               ");
		passwordField.setVisible(false);
		add(passwordField);

		thehandler handler = new thehandler();
		item1.addActionListener(handler);
		passwordField.addActionListener(handler);

		button1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent event) {
				button1.setVisible(false);
				button2.setVisible(false);
				item1.setVisible(true);
				passwordField.setVisible(true);
				loginMessage.setVisible(true);

				item1.addActionListener(new ActionListener(){

					public void actionPerformed(ActionEvent ev){
						
					}
				});
			}

		});

		button2.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent event) {
				button1.setVisible(false);
				button2.setVisible(false);
				loginMessage.setText("Enter your username (on the left) and your password (on the right)");
				item1.setVisible(true);
				passwordField.setVisible(true);
				loginMessage.setVisible(true);
			}

		});

	}


	private class thehandler implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			String string = "";

			if(event.getSource() == item1) {
				string = String.format("field 1: %s", event.getActionCommand());
			}
			else if(event.getSource() == passwordField){
				string = String.format("password field is: %s", event.getActionCommand());
			}

			JOptionPane.showMessageDialog(null, string);
		}
	}

}
