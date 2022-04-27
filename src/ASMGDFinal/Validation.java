package ASMGDFinal;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Validation {
    public static boolean isEmpty(JTextField txtField, String msg){
        String txtValue = txtField.getText().trim();
        if(txtValue.length() == 0){
            JOptionPane.showMessageDialog(null , msg);
            txtField.setBackground(Color.yellow);
            txtField.requestFocus(true);
            return true;
        }
        txtField.setBackground(Color.white);
        return false;
    }
    
    public static boolean isNotEmail(JTextField txtField, String msg){
        String txtValue = txtField.getText().trim();
        String patternEmail = "^[a-zA-Z]\\w{2,}@\\w{2,}(\\.\\w{2,3}){1,2}$";
        if(!txtValue.matches(patternEmail)){
            JOptionPane.showMessageDialog(null , msg);
            txtField.setBackground(Color.yellow);
            txtField.requestFocus(true);
            return false;
        }
        txtField.setBackground(Color.white);
        return true;
    }
    
    public static boolean isNumber(JTextField txtField, String msg){
        String txtValue = txtField.getText().trim();
        String patternNumber = "^\\s*(?=.*[1-9])\\d*(?:\\.\\d{1,2})?\\s*$";
        if(!txtValue.matches(patternNumber)){
            JOptionPane.showMessageDialog(null , msg);
            txtField.setBackground(Color.yellow);
            txtField.requestFocus(true);
            return false;
        }
        txtField.setBackground(Color.white);
        return true;
    }
    
    public static boolean isBetween16And25(JTextField txtField, String msg){
        int so = Integer.parseInt(txtField.getText());
        if(so<16 || so>55){
            JOptionPane.showMessageDialog(null , msg);
            txtField.setBackground(Color.yellow);
            txtField.requestFocus(true);
            return false;
        }
        txtField.setBackground(Color.white);
        return true;
    }
    
    public static boolean isGreaterThan5Mili(JTextField txtField, String msg){
        Double so = Double.parseDouble(txtField.getText());
        if(so<5000000){
            JOptionPane.showMessageDialog(null , msg);
            txtField.setBackground(Color.yellow);
            txtField.requestFocus(true);
            return false;
        }
        txtField.setBackground(Color.white);
        return true;
    }
}
