package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextArea;
import java.awt.SystemColor;
import javax.swing.UIManager;
import java.awt.Component;
import java.awt.Rectangle;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AboutDialog extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextArea taAbout;
	private JButton btnOK;

	/**
	 * Constructor
	 */
	public AboutDialog() {
		initializeComponents();
		setVisible(true);
	}

	// Initialize the components

	private void initializeComponents() {
		setBounds(new Rectangle(0, 27, 100, 100));
		setBounds(100, 100, 352, 176);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		
		setModal(true);
		setTitle("About");
		setIconImage(Toolkit.getDefaultToolkit().getImage(AboutDialog.class.getResource("/resources/many_watermelon_512.png")));
		
		taAbout = new JTextArea();
		taAbout.setAlignmentX(Component.CENTER_ALIGNMENT);
		taAbout.setAlignmentY(Component.CENTER_ALIGNMENT);
		taAbout.setText("Author: Abhilash G\nRelease: 26 August 2018\nVersion: 1.0");
		taAbout.setBackground(UIManager.getColor("ToolBar.floatingBackground"));
		taAbout.setEditable(false);
		
		
		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel.setHorizontalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(taAbout, GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_contentPanel.setVerticalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addGap(25)
					.addComponent(taAbout, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(25, Short.MAX_VALUE))
		);
		contentPanel.setLayout(gl_contentPanel);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				btnOK = new JButton("OK");
				btnOK.addActionListener((event) -> {
					// close the About dialog when the OK Button is pressed
					dispose();
				});
				buttonPane.add(btnOK);
				getRootPane().setDefaultButton(btnOK);
			}
		}
	}

	
}
