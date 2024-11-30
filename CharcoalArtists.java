/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.artstreamfinal;

/**
 *
 * @author Owner
 */
import javax.swing.*;
import java.awt.*;
import static java.awt.Component.CENTER_ALIGNMENT;
import java.awt.event.*;

public class CharcoalArtists extends DigitalArtists {

    protected JButton[] viewProfileCharcoal= new JButton[4];
    public CharcoalArtists()
    {
       label.setText("Charcoal Artists");
       String[] charcoalArtists = 
        {
            "Kashiefoun Kou",
            "Kafoi NakU",
            "Booringue Ayttie",
            "Miguel Duane"
        };       
        contents.removeAll();
        for (int i = 0; i < grids.length; ++i) 
        {
            
            profileLabels[i].setText(charcoalArtists[i]);            
            profileLabels[i].setVerticalTextPosition(SwingConstants.BOTTOM);
            profileLabels[i].setHorizontalTextPosition(SwingConstants.CENTER);

            // Update each grid
            grids[i] = new JPanel();
            grids[i].setLayout(new BorderLayout());
            grids[i].setBackground(Color.decode("#303765"));
            grids[i].add(profileLabels[i], BorderLayout.CENTER);

            // Create a new "View Profile" button
            viewProfileCharcoal[i] = new JButton("VIEW PROFILE");
            viewProfileCharcoal[i].addActionListener(this);
            viewProfileCharcoal[i].setBackground(Color.decode("#17224d"));
            viewProfileCharcoal[i].setForeground(Color.WHITE);
            viewProfileCharcoal[i].setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

            grids[i].setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
            grids[i].add(viewProfileCharcoal[i], BorderLayout.SOUTH);

            // Add the grid to the contents panel
            contents.add(grids[i]);
        }

        // Refresh the UI to display changes
        contents.revalidate();
        contents.repaint();

        // Set the visibility of the window
        setVisible(true);
        
        
        
        
       
    }
    
    
    @Override 
    public void actionPerformed(ActionEvent e)
    {
       Object source = e.getSource();
       
       if(source == acceptedButton)
       {
           
       }else if(source == pendingButton)
       {
           
       }else if(source == profileButton)
       {
           int choice = JOptionPane.showConfirmDialog(null,"Are you sure you want to log out?", "Confirm Log-Out",JOptionPane.YES_NO_OPTION);
           
           if(choice == JOptionPane.YES_OPTION)
           {
               new FirstFrame();           
               setVisible(false);
           }   
       }else if(source == viewProfileCharcoal[0])
       {
           
           setVisible(false);
       }else if(source == viewProfileCharcoal[1])
       {
           
           setVisible(false);
           
       }else if(source == viewProfileCharcoal[2])
       {
          
           setVisible(false);
       }else
       {
           
           setVisible(false);
       }
       
       
    }
    
    
    
    
}