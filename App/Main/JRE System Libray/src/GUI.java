
// It's about drive, it's about power
// We stay hungry, we devour
// Put in the work, put in the hours and take what's ours (ahoo)
// Black and Samoan in my veins
// My culture bangin' with Strange

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class GUI implements ActionListener{
  
  private static JLabel userLabel;
  private static JTextField userText;
  private static JLabel passwordLabel;
  private static JPasswordField passwordText;
  private static JButton button;
  private static JLabel success;
  
  
  
  public static void main(String[] args) {
    
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();

    frame.setSize(100, 100);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.add(panel);
    
    panel.setLayout(null);

   label = new JLabel("User");
    label.setBounds(10, 20, 80, 25);
    panel.add(label);

   userText = new JTextField(20);
    userText.setBounds(100, 20, 165, 25);
    panel.add(userText);

   passwordLabel = new JLabel("Password");
    passwordLabel.setBounds(10, 50, 80, 25);
    panel.add(passwordLabel);

   passwordText = new JPasswordField();
    passwordText.setBounds(100, 50, 165, 25);
    panel.add(passwordText)

   button = new JButton("Login");
    button.setBounds(10, 80, 80, 25);
    button.addActionListner(new GUI());
    panel.add(button)

   success = new JLabel("");
    success.setBounds(10, 110, 300, 25);
    panel.add(success);  
 
    frame.setVisable(true);

  }
  @Override
    public void actionPerformed(ActionEvent e) {
  System.out.printIn("Button was clicked")

  String user = userText.getText();
  String password = passwordText.getText();

  // Add users here

if(user.equals("Sillyangel3") && password.equals("Burgarking2131")) {
  success.setText("Login successful!")
}

  }

}
