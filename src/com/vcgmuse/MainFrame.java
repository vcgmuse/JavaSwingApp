package com.vcgmuse;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class MainFrame extends JFrame {
  private TextPanel textPanel;
  private JButton button;
  private ToolBar toolBar;

  public MainFrame(){
    super("Hello World!");
    setLayout(new BorderLayout());

    textPanel = new TextPanel();
    button = new JButton("Click Me");
    toolBar = new ToolBar();

    button.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        textPanel.appendText("Hello\n");
      }
    });

    add(textPanel, BorderLayout.CENTER);
    add(button, BorderLayout.SOUTH);
    add(toolBar, BorderLayout.NORTH);

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(600,500);
    setVisible(true);
  }
}
