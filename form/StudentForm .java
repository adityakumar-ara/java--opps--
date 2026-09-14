import javax.swing.*;

class StudentForm {
    public static void main(String[] args) {
        //for make window
        JFrame frame = new JFrame("Student Form");
        // for text
        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(50, 50, 100, 30);

        JTextField nameField = new JTextField();
        nameField.setBounds(150, 50, 200, 30);

        JLabel ageLabel = new JLabel("Age:");
        ageLabel.setBounds(50, 100, 100, 30);

        JTextField ageField = new JTextField();
        ageField.setBounds(150, 100, 200, 30);

        JButton button = new JButton("Submit");
        button.setBounds(150, 150, 100, 30);

        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(ageLabel);
        frame.add(ageField);
        frame.add(button);

        frame.setSize(450, 300);
        frame.setLayout(null);
        frame.setVisible(true);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        System.out.println(".(hjsdgfyjsrf)");
        }
}