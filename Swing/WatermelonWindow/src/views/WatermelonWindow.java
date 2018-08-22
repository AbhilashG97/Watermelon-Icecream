package views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.WindowConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class WatermelonWindow extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JButton btnClickMe;
	private String userName;
	private JButton btnReset;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					WatermelonWindow frame = new WatermelonWindow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public WatermelonWindow() {
		setTitle("Watermelon World");
		setIconImage(Toolkit.getDefaultToolkit().getImage(WatermelonWindow.class.getResource("/resources/watermelon_512.png")));
		
		initalizeComponents();
		onClickMeButtonClicked();
		onResetButtonClicked();
	}



	private void initalizeComponents() {
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JLabel lblNewLabel = new JLabel("Name");

		textField = new JTextField();
		textField.setToolTipText("Name");
		textField.setColumns(10);

		btnClickMe = new JButton("Click Me ");
		
		btnReset = new JButton("Reset");

		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
					.addGap(30)
					.addComponent(lblNewLabel)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textField, GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
					.addGap(49))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(96)
					.addComponent(btnReset)
					.addGap(51)
					.addComponent(btnClickMe)
					.addContainerGap(81, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnClickMe)
						.addComponent(btnReset))
					.addContainerGap(198, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);

	}
	
	public String getUserName() {
		return userName;
	}
	
	
	
	public void setUserName(String userName) {
		this.userName = userName;
	}

	private void onClickMeButtonClicked() {
		btnClickMe.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(!textField.getText().equals("")) {
					setUserName(textField.getText());
					JOptionPane.showMessageDialog(null, "Hello, "+getUserName()+"\nWelcome to my Watermelon-y World!", "Watermelon World", JOptionPane.INFORMATION_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(null, "Please enter your name", "Alert", JOptionPane.WARNING_MESSAGE);
				}
			}
		});
	}
	
	private void onResetButtonClicked() {
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
			}
		});
	}

}
