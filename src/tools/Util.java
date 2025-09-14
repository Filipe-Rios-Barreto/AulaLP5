/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tools;

import java.util.Date;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author u1845853
 */
public class Util {
    public static void habilitar(boolean valor, JComponent ... componentes) {
        for (int i = 0; i < componentes.length; i++) {
            componentes[i].setEnabled(valor);           
        }
    }
    public static void limpar(JComponent ... componentes) {
        for (int i = 0; i < componentes.length; i++) {
            if (componentes[i] instanceof JTextField) {
                ((JTextField) componentes[i]).setText("");
            }
            if (componentes[i] instanceof JFormattedTextField) {
                ((JFormattedTextField) componentes[i]).setText("");
            }
            if (componentes[i] instanceof JComboBox) {
                ((JComboBox) componentes[i]).setSelectedIndex(-1);
            }
            if (componentes[i] instanceof JCheckBox) {
                ((JCheckBox) componentes[i]).setSelected(false);
            }
        }
    }
    
    public static void mensagem(String cad) {
        JOptionPane.showMessageDialog(null, cad);
    }
    
    public static boolean perguntar (String cad) {
    int Opcao = JOptionPane.showConfirmDialog(null, cad, cad, JOptionPane.YES_NO_OPTION);
    return true;
    }
    
    public static int strToInt(String cad) {
        return Integer.parseInt(cad);
    }
    
    public static String intToStr(String num) {
        return String.valueOf(num);
    }
    
    public static double strToDouble(String num) {
        return Double.parseDouble(num);
    }
    
    public static Date strToDate(String cad) {
        return null;
    }
    
    public static String dateToStr(Date data) {
        return null;
    }
    
    public static String doubleToString(double num) {
        return String.valueOf(num);
    }
}

// primeiro commit - Pacotes tools e view. Util.java finalizado.
//segundo commit - Tela principal e Telas dos cadastros finalizados
//terceiro commit - Telas de cadastros usando o Util.java