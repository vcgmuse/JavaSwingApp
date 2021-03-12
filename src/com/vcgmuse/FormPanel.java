package com.vcgmuse;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class FormPanel extends JPanel {
  private JLabel nameLabel;
  private JLabel occupationLabel;
  private JTextField nameField;
  private JTextField occupationField;
  private JButton okButton;


  public FormPanel(){
    nameLabel = new JLabel("Name: ");
    occupationLabel = new JLabel("Occupation: ");

    nameField = new JTextField(10);
    occupationField = new JTextField(10);

    okButton = new JButton("OK");

    Dimension dimension = getPreferredSize();
    dimension.width = 250;
    setPreferredSize(dimension);

    Border innerBorder = BorderFactory.createTitledBorder("Add Person");
    Border outerBorder = BorderFactory.createEmptyBorder(5, 5, 5, 5);
    setBorder(BorderFactory.createCompoundBorder(outerBorder, innerBorder));

    setLayout(new GridBagLayout());

    GridBagConstraints gridBagConstraints = new GridBagConstraints();

    //What is the ratio between the weightx and the cells that it control
    //The following code is very important to have filled. Without if there are undesired effects.
    // .fill tells the program to take up all the space within a cell.

    // The three following properties are best set before adding components to the gridBadConstraints
    gridBagConstraints.fill = GridBagConstraints.NONE;

    // First Row
    gridBagConstraints.weightx = 1;
    gridBagConstraints.weighty = 0.1;
    // Coordinates x[0] and y[0]
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = GridBagConstraints.LINE_END;
    gridBagConstraints.insets = new Insets(0,0,0,5);
    add(nameLabel, gridBagConstraints);

    // Coordinates x[1] and y[0]
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = GridBagConstraints.LINE_START;
    gridBagConstraints.insets = new Insets(0,0,0,0);
    add(nameField, gridBagConstraints);

    // Second Row
    gridBagConstraints.weightx = 1;
    gridBagConstraints.weighty = 0.1;
    // Coordinates x[0] and y[1]
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.anchor = GridBagConstraints.LINE_END;
    gridBagConstraints.insets = new Insets(0,0,0,5);
    add(occupationLabel, gridBagConstraints);

    // Coordinate x[1] and y[1]
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.anchor = GridBagConstraints.LINE_START;
    gridBagConstraints.insets = new Insets(0,0,0,0);
    add(occupationField, gridBagConstraints);

    // Third Row
    gridBagConstraints.weightx = 1;
    gridBagConstraints.weighty = 1.0;
    gridBagConstraints.anchor = GridBagConstraints.FIRST_LINE_START;
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.insets = new Insets(0,0,0,0);
    add(okButton, gridBagConstraints);






  }
}
