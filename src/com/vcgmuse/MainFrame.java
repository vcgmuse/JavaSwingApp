package com.vcgmuse;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

//Left off at number 12


public class MainFrame extends JFrame {
  private TextPanel textPanel;
  private JButton button;
  private ToolBar toolBar;
  private FormPanel formPanel;

  public MainFrame(){
    super("Hello World!");
    setLayout(new BorderLayout());

    toolBar = new ToolBar();
    textPanel = new TextPanel();
    formPanel = new FormPanel();

    toolBar.setStringListener(new StringListener() {
      @Override
      public void textEmitted(String text) {
        textPanel.appendText(text);
      }
    });

    add(toolBar, BorderLayout.NORTH);
    add(formPanel, BorderLayout.WEST);
    add(textPanel, BorderLayout.CENTER);

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(600,500);
    setVisible(true);
  }
}
