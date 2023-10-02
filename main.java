import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.*;

class Main
{
    public static void main(String[] args) {
        PhoneDialer pd = new PhoneDialer();
    }
}

class PhoneDialer implements ActionListener
{
    private JButton zero;
    private JButton one;
    private JButton two;
    private JButton three;
    private JButton four;
    private JButton five;
    private JButton six;
    private JButton seven;
    private JButton eight;
    private JButton nine; 
    
    private JButton dashsymbol;
    private JButton dial;
    
    private String phonenumber = "";
    
    public PhoneDialer()
    {
        JFrame frame = new JFrame("Dialer");
        frame.setSize(200, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Content Pane
        JPanel contentPane = (JPanel)frame.getContentPane();
        contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS)); 
        Border myBorder = BorderFactory.createEmptyBorder(10,10,10,10);
        contentPane.setBorder(myBorder);

        // Top Label
        JPanel topLabel = new JPanel();
        topLabel.setLayout(new FlowLayout());
        JLabel myLabel = new JLabel("Enter the number to dial:");
        topLabel.add(myLabel);

        // Containing Grid
        JPanel grid = new JPanel();
        grid.setLayout(new GridLayout(4,3,5,5));
        grid.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));

        // Initialize Buttons
        zero = new JButton("0", null);
        one = new JButton("1", null);
        two = new JButton("2", null);
        three = new JButton("3", null);
        four = new JButton("4", null);
        five = new JButton("5", null);
        six = new JButton("6", null);
        seven = new JButton("7", null);
        eight = new JButton("8", null);
        nine = new JButton("9", null);
        dashsymbol = new JButton("-", null);

        grid.add(one);
        grid.add(two);
        grid.add(three);
        grid.add(four);
        grid.add(five);
        grid.add(six);
        grid.add(seven);
        grid.add(eight);
        grid.add(nine);
        grid.add(dashsymbol);
        grid.add(zero);

        one.addActionListener(this);
        two.addActionListener(this);
        three.addActionListener(this);
        four.addActionListener(this);
        five.addActionListener(this);
        six.addActionListener(this);
        seven.addActionListener(this);
        eight.addActionListener(this);
        nine.addActionListener(this);
        zero.addActionListener(this);
        dashsymbol.addActionListener(this);
        

        contentPane.add(topLabel);
        contentPane.add(grid);

        dial = new JButton("Dial Number");
        contentPane.add(dial);
        dial.setAlignmentX(Component.CENTER_ALIGNMENT);
        dial.addActionListener(this);
        

        frame.setVisible(true);
    }
    public void actionPerformed(ActionEvent event)
    {
        Object control = event.getSource();
        if (control == dial)
        {
            JOptionPane.showMessageDialog(null,phonenumber);
            phonenumber = "";
        }
        else if (control == zero)
        {
            phonenumber += "0";
        }
        else if (control == one)
        {
            phonenumber += "1";
        }
        else if (control == two)
        {
            phonenumber += "2";
        }
        else if (control == three)
        {
            phonenumber += "3";
        }
        else if (control == four)
        {
            phonenumber += "4";
        }
        else if (control == five)
        {
            phonenumber += "5";
        }
        else if (control == six)
        {
            phonenumber += "6";
        }
        else if (control == seven)
        {
            phonenumber += "7";
        }
        else if (control == eight)
        {
            phonenumber += "8";
        }
        else if (control == nine)
        {
            phonenumber += "9";
        }
        else if (control == dashsymbol)
        {
            phonenumber += "-";
        }
        
    }
}