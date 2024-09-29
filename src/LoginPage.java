import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.awt.event.ActionEvent;

public class LoginPage implements ActionListener {

    HashMap<String, String> logininfo = new HashMap<String, String>();

    JFrame frame = new JFrame();
    JButton loginButton = new JButton("Login");
    JButton resetButton = new JButton("Reset");
    JTextField userIDField = new JTextField();
    JPasswordField userPasswordField = new JPasswordField();
    JLabel userIDlabel = new JLabel("userID:");
    JLabel userPasswordlabel = new JLabel("password:");
    JLabel messageLabel = new JLabel();

    LoginPage(HashMap<String, String> Llogininfo) {
        logininfo = Llogininfo;

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        loginButton.setBounds(50, 130, 100, 25);
        loginButton.setFocusable(false);
        resetButton.setBounds(150, 130, 100, 25);
        resetButton.setFocusable(false);

        userIDlabel.setBounds(50, 25, 75, 25);
        userIDField.setBounds(50, 50, 200, 25);

        userPasswordlabel.setBounds(50, 75, 75, 25);
        userPasswordField.setBounds(50, 100, 200, 25);
        messageLabel.setBounds(125, 150, 250, 35);
        messageLabel.setFont(new Font(null, Font.BOLD, 25));

        loginButton.addActionListener(this);
        resetButton.addActionListener(this);

        frame.add(loginButton);
        frame.add(resetButton);
        frame.add(userIDField);
        frame.add(userPasswordField);
        frame.add(userIDlabel);
        frame.add(userPasswordlabel);
        frame.add(messageLabel);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == resetButton) {
            userIDField.setText("");
            userPasswordField.setText("");
        }
        if (e.getSource() == loginButton) {
            String userID = userIDField.getText();
            String password = String.valueOf(userPasswordField.getPassword());

            if (logininfo.containsKey(userID)) {
                if (logininfo.get(userID).equals(password)) {
                    messageLabel.setText("Login successful");
                    messageLabel.setForeground(Color.green);
                    WelcomePage welcomePage = new WelcomePage(userID);
                    frame.dispose();
                } else {
                    messageLabel.setText("Invalid password");
                    messageLabel.setForeground(Color.red);
                }
            } else {
                messageLabel.setForeground(Color.red);
                messageLabel.setText((userID.equals("") == true) ? "Put userID" : "Invalid userID");
            }
        }
    }
}
