/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpackage;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import utility.Date;

/**
 *
 * @author cis101
 */
public class TestSceneController {

    @FXML
    private Label outputLabel;
    @FXML
    private ComboBox<String> classtypeComboBox;
    Date valentinesDay =new Date(14,02,23);
    Student asif = new Student(123, "Asif Ahmed", "Dhanmondi");
    
    
    @Override
    public void initialize (URL url,ResourceBundle rb) {
        classTypeComboBox.getItems().add ("Date");
        classTypeComboBox.getItems().add ("Student");
        classTypeComboBox.getItems().add ("Polygen");
        classTypeComboBox.getItems().add ("Graph","Tree");
       
                
    }
  

    @FXML
    private void testButtonOnClick(ActionEvent event) {
    if((classtypeComboBox.getValue().toString()).equals("Date"))outputLabel.setText(valentinesDay.toString());
    
    else if ((classtypeComboBox.getValue().toString()).equals("Student"))outputLabel.setText(asif.toString());
      
     
     
     
     
      
    }
    
}
