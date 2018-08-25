package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.WindowConstants;

import java.awt.Toolkit;
import java.util.ArrayList;

import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.border.EtchedBorder;

import model.WatermelonDesert;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WatermelonDesertCreatorView extends JFrame {

	private JPanel contentPane;
	private JTextField txtDesertName;
	private final ButtonGroup btgServing = new ButtonGroup();
	private JButton btnCreateDessert;
	private JRadioButton rdbtnSmallServing;
	private JRadioButton rdbtnMediumServing;
	private JRadioButton rdbtnLargeServing;
	private JComboBox cbxFruits;
	private JComboBox cbxNuts;
	private JCheckBox chckbxCream;
	private JCheckBox chckbxHoney;
	private JCheckBox chckbxLime;
	private JTextArea taRecipe;
	private JMenuBar menuBar;
	private JMenu mnFile;
	private JMenu mnHelp;
	private JMenuItem mntmExit;
	private JMenuItem mntmAbout;
	private ArrayList<JCheckBox> checkBoxList;
	private JButton btnNewDessert;
	private JButton btnDone;
	
	/**
	 * Constructor
	 */
	public WatermelonDesertCreatorView() {
		initializeComponents();
		checkBoxList = new ArrayList<>();
	}


	// Initialize the components of the JFrame
	private void initializeComponents() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(WatermelonDesertCreatorView.class.getResource("/resources/many_watermelon_512.png")));
		setTitle("Watermelon Desert Creator");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setBounds(100, 100, 603, 300);

		menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		mnFile = new JMenu("File");
		menuBar.add(mnFile);

		mntmExit = new JMenuItem("Exit");

		mntmExit.setIcon(new ImageIcon(WatermelonDesertCreatorView.class.getResource("/resources/exit18dp.png")));
		mnFile.add(mntmExit);

		mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);

		mntmAbout = new JMenuItem("About");
		mnHelp.add(mntmAbout);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JLabel lblDessertName = new JLabel("Dessert Name:");

		txtDesertName = new JTextField();
		txtDesertName.setColumns(10);

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

		chckbxCream = new JCheckBox("Cream");

		chckbxHoney = new JCheckBox("Honey");

		chckbxLime = new JCheckBox("Lime");

		JLabel lblRecipe = new JLabel("Recipe:");

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));

		JLabel lblNuts = new JLabel("Nuts:");

		cbxNuts = new JComboBox(WatermelonDesert.nuts);

		cbxFruits = new JComboBox(WatermelonDesert.otherFruits);

		btnCreateDessert = new JButton("Create Dessert");
		
		btnNewDessert = new JButton("New Dessert");
		btnNewDessert.setEnabled(false);
		
		btnDone = new JButton("Done");
		btnDone.setEnabled(false);
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblDessertName)
								.addComponent(lblServing)
								.addComponent(lblNewLabel))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(txtDesertName, GroupLayout.DEFAULT_SIZE, 446, Short.MAX_VALUE)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(cbxFruits, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
											.addGap(60)
											.addComponent(lblNuts)
											.addGap(18))
										.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
											.addComponent(rdbtnSmallServing)
											.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
											.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
												.addComponent(chckbxHoney)
												.addComponent(rdbtnMediumServing))
											.addGap(30)))
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(cbxNuts, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(rdbtnLargeServing)
										.addComponent(chckbxLime)))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(57)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblNewLabel_1)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(chckbxCream))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblRecipe)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
											.addGap(0, 0, Short.MAX_VALUE)
											.addComponent(btnCreateDessert)
											.addGap(61)
											.addComponent(btnNewDessert)
											.addGap(55)
											.addComponent(btnDone))
										.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE))))))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblDessertName)
						.addComponent(txtDesertName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(rdbtnSmallServing)
							.addComponent(rdbtnLargeServing)
							.addComponent(rdbtnMediumServing))
						.addComponent(lblServing))
					.addGap(9)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(cbxFruits, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel))
							.addComponent(cbxNuts, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblNuts))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(chckbxCream)
						.addComponent(chckbxLime)
						.addComponent(chckbxHoney))
					.addGap(19)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblRecipe)
						.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnDone)
						.addComponent(btnCreateDessert)
						.addComponent(btnNewDessert))
					.addContainerGap())
		);

		taRecipe = new JTextArea();
		scrollPane.setViewportView(taRecipe);
		contentPane.setLayout(gl_contentPane);
	}

	// Getters and Setters

	public JTextField getTxtDesertName() {
		return txtDesertName;
	}


	public ButtonGroup getBtgServing() {
		return btgServing;
	}


	public JButton getBtnCreateDessert() {
		return btnCreateDessert;
	}


	public JRadioButton getRdbtnSmallServing() {
		return rdbtnSmallServing;
	}


	public JRadioButton getRdbtnMediumServing() {
		return rdbtnMediumServing;
	}


	public JRadioButton getRdbtnLargeServing() {
		return rdbtnLargeServing;
	}


	public JComboBox getCbxFruits() {
		return cbxFruits;
	}


	public JComboBox getCbxNuts() {
		return cbxNuts;
	}


	public JCheckBox getChckbxCream() {
		return chckbxCream;
	}


	public JCheckBox getChckbxHoney() {
		return chckbxHoney;
	}


	public JCheckBox getChckbxLime() {
		return chckbxLime;
	}


	public JTextArea getTaRecipe() {
		return taRecipe;
	}


	public JMenu getMnFile() {
		return mnFile;
	}


	public JMenu getMnHelp() {
		return mnHelp;
	}


	public JMenuItem getMntmExit() {
		return mntmExit;
	}


	public JMenuItem getMntmAbout() {
		return mntmAbout;
	}
	
	
	public JButton getBtnNewDessert() {
		return btnNewDessert;
	}

	public JButton getBtnDone() {
		return btnDone;
	}

	public ArrayList<JCheckBox> getCheckBoxList() {
		checkBoxList.add(chckbxCream);
		checkBoxList.add(chckbxHoney);
		checkBoxList.add(chckbxLime);
		return checkBoxList;
	}
}
