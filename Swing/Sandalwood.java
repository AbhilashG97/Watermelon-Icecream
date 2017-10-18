public class Sandalwood extends JFrame {

    final JTextField tf;
    JFrame j;
    JFrame onClick;

    public Sandalwood() {
        JButton button = new JButton("Click Me !");
        tf = new JTextField();
        tf.setBounds(50, 50, 150, 20);
        button.setBounds(130, 100, 100, 40);
        add(button);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onClick = new JFrame("Hello world");
                onClick.add(tf);
                tf.setText("Hello !");
                onClick.setSize(400, 400);
                onClick.setLayout(null);
                onClick.setVisible(true);
            }
        });
        setSize(400, 500);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Sandalwood();
    }
}