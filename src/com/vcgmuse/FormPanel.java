package com.vcgmuse;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
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


    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.weightx = 1;
    gridBagConstraints.weighty = 1;
    gridBagConstraints.fill = GridBagConstraints.NONE;




  }
}
