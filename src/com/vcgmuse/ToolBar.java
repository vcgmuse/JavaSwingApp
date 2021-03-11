package com.vcgmuse;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;

public class ToolBar extends JPanel implements ActionListener {
  private JButton helloButton;
  private JButton goodbyeButton;
  private StringListener textListener;


  public ToolBar(){
    setBorder(BorderFactory.createEtchedBorder());

    helloButton = new JButton("Hello");
    goodbyeButton = new JButton("GoodBye");

    setLayout(new FlowLayout(FlowLayout.LEFT));

    add(helloButton);
    add(goodbyeButton);

    helloButton.addActionListener(this);
    goodbyeButton.addActionListener(this);



  }
  public void setStringListener(StringListener listener){
    this.textListener = listener;
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    JButton clicked = (JButton) e.getSource();
    if (clicked==helloButton){
      if (textListener != null){
        textListener.textEmitted("Hello\n");
      }

    } else if(clicked == goodbyeButton){
      //textPanel.appendText("Goodbye\n"){
      if (textListener != null){
        textListener.textEmitted("Goodbye\n");
      }
    }

  }
}
