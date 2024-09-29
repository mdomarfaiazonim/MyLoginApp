import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class WelcomePage implements ActionListener {
    JFrame frame = new JFrame();
    JLabel welcomeLabel = new JLabel();
    JButton logoutButton = new JButton("Logout");

    WelcomePage(String userID) {
        welcomeLabel.setText("Welcome " + userID);
        welcomeLabel.setBounds(0, 0, 300, 35);
        welcomeLabel.setFont(new Font(null, Font.BOLD, 30));
        logoutButton.setBounds(100, 200, 200, 35);
        logoutButton.setFocusable(false);
        logoutButton.addActionListener(this);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.add(welcomeLabel);
        frame.add(logoutButton);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == logoutButton) {
            frame.dispose();
        }
    }
}
