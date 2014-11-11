/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fenêtregraphique;
import java.awt.event.*;
import javax.swing.JButton;


/**
 *
 * @author Amiri
 */
public abstract class Controller implements ActionListener {
    private View view;
    private Model model;
    public JButton bQuitter = new JButton("Quitter");
    public JButton bRAZ = new JButton("RAZ");
    public JButton bINC = new JButton("INC");
    
   
public Controller(View view,Model model)  {
    this.view=view;
    this.model=model;
    
}  

public void actionPerformed(ActionEvent ev){
    
    if (ev.getSource()==bQuitter){
        System.exit(1);
    }
    else if (ev.getSource()==bRAZ){
       model.raz(); 
    }
    else if (ev.getSource()==bINC){
        model.incrementer();
        
    }
}
}
