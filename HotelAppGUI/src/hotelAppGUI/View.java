/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelAppGUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author Raymond Li
 */
public class View extends JFrame implements Observer 
{
    //JPanel for Welcome sign
    private JPanel welcomePanel = new JPanel();
    private JLabel welcomeLabel = new JLabel("Welcome to Hotel Booking System", SwingConstants.CENTER);

    //Guest Information 
    private JPanel guestInfoPanel = new JPanel();
    private JLabel guestInformationLabel = new JLabel("Guest Information" , SwingConstants.CENTER); 
    private JLabel nameLabel = new JLabel("Full Name:");
    private JLabel ageLabel = new JLabel("Age:");
    private JLabel emailAddressLabel = new JLabel("Email Address");
    public JTextField nameTextField = new JTextField(10);
    public JTextField ageTextField = new JTextField(10);
    public JTextField emailAddressTextField = new JTextField(20);

    //RoomType
    private JPanel roomtypePanel = new JPanel();
    private JLabel roomtypeLabel = new JLabel("Select a Room Type");
    public JLabel singleRoomLabel = new JLabel("1. Singles Room");
    public JLabel doubleRoomLabel  = new JLabel("2. Double Room");
    public JLabel queenRoomLabel  = new JLabel("3. Queen Room");
    public JLabel kingRoomLabel  = new JLabel("4. King Room");
    public JTextField roomInputTextField = new JTextField(2);

    //Date
    private final JPanel datePanel = new JPanel();
    private final JLabel dateLabel = new JLabel("Please select check in & cbeck out dates \n(dd-MM-yyyy)" , SwingConstants.CENTER);
    private final JLabel checkInLabel = new JLabel("Check In:");
    private final JLabel checkOutLabel = new JLabel("Check Out:");
    public JTextField checkOutTextField = new JTextField(20);
    public JTextField checkInTextField = new JTextField(20);
    
    //Repeat Booking
    private final JPanel repeatPanel = new JPanel();
    private JLabel repeatLabel = new JLabel("Would you like to book another room?" , SwingConstants.CENTER);
    
    //Display results
    private JPanel displayResultPanel = new JPanel();
    private JLabel finalMessage;
    public JTextArea table = new JTextArea();
    private String ReservedRoomString = "";
    
    //Commit Buttons
    private final JPanel commitPanel = new JPanel();
    public JButton startButton = new JButton("Start");
    public JButton submitButton = new JButton("Submit Information");
    public JButton quitButton = new JButton("Quit");
    public JButton selectRoomButton = new JButton("Select Room");
    public JButton selectDateButton = new JButton("Select Date");
    public JButton exitButton = new JButton("Exit");
    public JButton yesButton = new JButton("Yes");
    public JButton noButton = new JButton("No");
    
    //Font size
    private final Font titles;
    private final Font labels;
    private final Font normalWritting;
    
    //Welcome sign
    public View() 
    {
        //Adjusting appearance
        this.titles = new Font("Helvetica", Font.BOLD, 20);
        this.labels = new Font("Helvetica", Font.BOLD, 11);
        this.normalWritting = new Font("Helvetica", Font.PLAIN,11);
        welcomeLabel.setFont(titles);
        welcomePanel.add(welcomeLabel);
        
        //Layout
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 220);
        this.setLocationRelativeTo(null);

        //Adding into panel
        this.commitPanel.add(startButton);
        this.commitPanel.add(quitButton);
        this.add(commitPanel, BorderLayout.SOUTH);
        this.add(welcomePanel, BorderLayout.NORTH);
        this.setVisible(true);
    }

    //Guest information
    public void guestInfomation() 
    {
        //Adjusting appearance
        guestInformationLabel.setFont(titles);
        nameLabel.setFont(labels);
        ageLabel.setFont(labels);
        emailAddressLabel.setFont(labels);
        nameTextField.setFont(normalWritting);
        ageTextField.setFont(normalWritting);
        emailAddressTextField.setFont(normalWritting);
        
        //Commit Panel
        commitPanel.removeAll();
        commitPanel.add(submitButton);
        commitPanel.add(quitButton);
        
        //Guest Information panel
        guestInfoPanel.add(nameLabel);
        guestInfoPanel.add(nameTextField);
        guestInfoPanel.add(ageLabel);
        guestInfoPanel.add(ageTextField);
        guestInfoPanel.add(emailAddressLabel);
        guestInfoPanel.add(emailAddressTextField);
        guestInfoPanel.setLayout(new BoxLayout(guestInfoPanel,BoxLayout.Y_AXIS));

        //Adding to panel
        this.getContentPane().removeAll();
        this.add(guestInfoPanel, BorderLayout.CENTER);
        this.add(commitPanel, BorderLayout.SOUTH);
        this.add(guestInformationLabel,  BorderLayout.NORTH);
        this.revalidate();
        this.repaint();
    }
    
    //Roomtype
    public void roomType()
    {
        //Adjusting appearance
        roomtypeLabel.setFont(titles);
        singleRoomLabel.setFont(labels);
        doubleRoomLabel.setFont(labels);
        queenRoomLabel.setFont(labels);
        kingRoomLabel.setFont(labels);
        roomInputTextField.setFont(normalWritting);
        
        //Commit Panel
        commitPanel.removeAll();
        commitPanel.add(selectRoomButton);
        commitPanel.add(quitButton);

        //Adding the room types into the panel
        roomtypePanel.add(roomtypeLabel);
        roomtypePanel.add(singleRoomLabel);
        roomtypePanel.add(doubleRoomLabel);
        roomtypePanel.add(queenRoomLabel);
        roomtypePanel.add(kingRoomLabel);
        roomtypePanel.setLayout(new BoxLayout(roomtypePanel,BoxLayout.Y_AXIS));        
        
        //Adding to panel
        this.getContentPane().removeAll();
        this.add(roomtypePanel , BorderLayout.NORTH);
        this.add(commitPanel, BorderLayout.SOUTH);
        this.add(roomInputTextField, BorderLayout.CENTER);
        this.revalidate();
        this.repaint();
    }

    //Choosing reservation dates
    public void dates()
    {
        //Adjusting appearance
        dateLabel.setFont(titles);
        checkInLabel.setFont(labels);
        checkOutLabel.setFont(labels);
        checkInTextField.setFont(normalWritting);
        checkOutTextField.setFont(normalWritting);
        
        //Commit Panel
        commitPanel.removeAll();
        commitPanel.add(selectDateButton);
        commitPanel.add(quitButton);
        
        //Adding content to the center
        datePanel.add(checkInLabel);
        datePanel.add(checkInTextField);
        datePanel.add(checkOutLabel);
        datePanel.add(checkOutTextField);
        
        //Adding to panel
        this.getContentPane().removeAll();
        this.add(dateLabel, BorderLayout.NORTH);
        this.add(datePanel, BorderLayout.CENTER);
        roomtypePanel.setVisible(true);
        this.add(commitPanel, BorderLayout.SOUTH);
        this.revalidate();
        this.repaint();
    }
    
    //Repeat Booking
    public void repeat()
    {
        //Adjusting appearance
        repeatLabel.setFont(titles);
        
        //Commit panel
        repeatPanel.add(yesButton);
        repeatPanel.add(noButton);
        
        //Adding to panel
        this.getContentPane().removeAll();
        this.add(repeatLabel, BorderLayout.NORTH);
        roomtypePanel.setVisible(true);
        this.add(repeatPanel, BorderLayout.SOUTH);
        this.setBackground(Color.CYAN);
        this.revalidate();
        this.repaint();
    }
    
    //End menu
    public void displayResults()
    {
        //Adjuisting appearance
        table.setFont(normalWritting);
        
        //Commit panel
        displayResultPanel.add(exitButton);
        
        //Displaying final message
        finalMessage = new JLabel("Thank you for visiting, " + nameTextField.getText());
        
        //Displaying the list of reserved rooms
        ReservedRoomString = Model.BookRoomSring();
        table.append(ReservedRoomString);
        table.setEditable(false);
        
        //Adding to panel
        this.getContentPane().removeAll();
        this.add(table, BorderLayout.CENTER);
        this.add(finalMessage, BorderLayout.NORTH);
        this.add(displayResultPanel, BorderLayout.SOUTH);
        this.revalidate();
        this.repaint();
    }
    
    public void addActionListener(ActionListener listener)
    {
        //Commit
        this.startButton.addActionListener(listener);
        this.quitButton.addActionListener(listener);
        this.submitButton.addActionListener(listener);
        this.exitButton.addActionListener(listener);
        
        //Rooms
        this.selectRoomButton.addActionListener(listener);

        //Date
        this.selectDateButton.addActionListener(listener);
        
        //Repeat
        this.yesButton.addActionListener(listener);
        this.noButton.addActionListener(listener);
    }
    
    @Override
    public void update(Observable o, Object arg) 
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}