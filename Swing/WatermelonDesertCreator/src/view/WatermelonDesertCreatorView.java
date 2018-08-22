package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Toolkit;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JSpinner;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JScrollBar;
import java.awt.ScrollPane;
import javax.swing.JSeparator;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.border.EtchedBorder;

public class WatermelonDesertCreatorView extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private final ButtonGroup btgServing = new ButtonGroup();
	private final ButtonGroup btgAddOns = new ButtonGroup();
	private JButton btnCreateDesert;
	private JRadioButton rdbtnSmallServing;
	private JRadioButton rdbtnMediumServing;
	private JRadioButton rdbtnLargeServing;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WatermelonDesertCreatorView frame = new WatermelonDesertCreatorView();
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
	public WatermelonDesertCreatorView() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(WatermelonDesertCreatorView.class.getResource("/resources/many_watermelon_512.png")));
		setTitle("Watermelon Desert Creator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblDesertName = new JLabel("Desert Name:");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JLabel lblServing = new JLabel("Serving:");
		
		rdbtnSmallServing = new JRadioButton("Small");
		btgServing.add(rdbtnSmallServing);
		
		rdbtnMediumServing = new JRadioButton("Medium");
		rdbtnMediumServing.setSelected(true);
		btgServing.add(rdbtnMediumServing);
		
		rdbtnLargeServing = new JRadioButton("Large");
		btgServing.add(rdbtnLargeServing);
		
		JLabel lblNewLabel = new JLabel("Other fruits:");
		
		JLabel lblNewLabel_1 = new JLabel("Add Ons:");
		
		JCheckBox chckbxCream = new JCheckBox("Cream");
		btgAddOns.add(chckbxCream);
		
		JCheckBox chckbxHoney = new JCheckBox("Honey");
		btgAddOns.add(chckbxHoney);
		
		JCheckBox chckbxLime = new JCheckBox("Lime");
		btgAddOns.add(chckbxLime);
		
		JLabel lblNewLabel_2 = new JLabel("Recipe:");
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		
		JLabel lblNuts = new JLabel("Nuts:");
		
		JComboBox cbxNuts = new JComboBox();
		
		JComboBox cbxFruits = new JComboBox();
		
		btnCreateDesert = new JButton("Create Desert");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblNewLabel)
								.addComponent(lblDesertName)
								.addComponent(lblServing))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(textField, GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(rdbtnSmallServing)
										.addComponent(cbxFruits, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addGap(18)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
										.addComponent(rdbtnMediumServing)
										.addComponent(lblNuts))
									.addGap(18)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(cbxNuts, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(rdbtnLargeServing)))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(48)
							.addComponent(lblNewLabel_1)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_contentPane.createSequentialGroup()
								.addComponent(chckbxCream)
								.addGap(18)
								.addComponent(chckbxHoney)
								.addGap(18)
								.addComponent(chckbxLime)))
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addGap(57)
							.addComponent(lblNewLabel_2)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE))
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addContainerGap(294, Short.MAX_VALUE)
							.addComponent(btnCreateDesert)))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblDesertName)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(rdbtnSmallServing)
							.addComponent(rdbtnMediumServing)
							.addComponent(rdbtnLargeServing))
						.addComponent(lblServing))
					.addGap(9)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblNewLabel)
							.addComponent(cbxFruits, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblNuts)
						.addComponent(cbxNuts, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(chckbxCream)
						.addComponent(chckbxHoney)
						.addComponent(chckbxLime))
					.addGap(14)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_2)
						.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE))
					.addGap(22)
					.addComponent(btnCreateDesert)
					.addContainerGap())
		);
		
		JTextArea taRecipe = new JTextArea();
		scrollPane.setViewportView(taRecipe);
		contentPane.setLayout(gl_contentPane);
	}
}
