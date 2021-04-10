/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelAppGUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Raymond Li
 */
public class Controller implements ActionListener
{
    public View view;
    public Model model;

    public Controller(View view, Model model) 
    {
        this.view = view;
        this.model = model;
        this.view.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        Object source = e.getActionCommand();

        //Start button on welcome sign
        if (source.equals("Start")) 
        {
            view.guestInfomation();
        }

        //Submitting guest information
        if (source.equals("Submit Information")) 
        {
            String fullName = "";
            String emailAddress = "";
            int age = 0;
            try
            {
                fullName = this.view.nameTextField.getText();
                emailAddress = this.view.emailAddressTextField.getText();
                age = Integer.parseInt(this.view.ageTextField.getText());
                //Check if the Guest information is valid
                if (model.validGuestInfo(fullName, age, emailAddress))
                {
                    view.roomType();
                }
            }
            catch (Exception ex) 
            {
                JOptionPane.showMessageDialog(null, "Error: Invalid input");
            }
        }

        //Choosing a room type
        if (source.equals("Select Room")) 
        {
            int input = Integer.parseInt(this.view.roomInputTextField.getText());
            if (model.BookRooms(model.list, input)) 
            {
                view.dates();
            }
        }

        //Choosing date
        if (source.equals("Select Date")) 
        {
            String checkInDate = "";
            String checkOutDate = "";
            try
            {
                checkInDate = this.view.checkInTextField.getText();
                checkOutDate = this.view.checkOutTextField.getText();
                //Check if the check in date is valid
                if (model.validCheckInDate(checkInDate)) 
                {
                    //Check if the check out date is valid
                    if (model.validCheckOutDate(checkInDate, checkOutDate)) 
                    {
                        //Add into the room database by using alter
                        view.repeat();
                    }
                }
            } 
            catch (Exception ex)
            {
                JOptionPane.showMessageDialog(null, "Error: Invalid input");
            }
        }

        //Yes button
        if (source.equals("Yes")) 
        {
            view.roomType();
        }

        //No button
        if (source.equals("No"))
        {
            view.displayResults();
        }

        //Quit button
        if (source.equals("Quit"))
        {
            view.displayResults();
        }

        //Exit button
        if (source.equals("Exit"))
        {
            System.exit(0);
        }
    }
}