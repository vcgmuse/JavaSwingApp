package com.vcgmuse;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

public class ToolBar extends JPanel {
  private JButton helloButton;
  private JButton goodbyeButton;

  public ToolBar(){
    helloButton = new JButton("Hello");
    goodbyeButton = new JButton("GoodBye");

    setLayout(new FlowLayout(FlowLayout.LEFT));

    add(helloButton);
    add(goodbyeButton);

  }
}
