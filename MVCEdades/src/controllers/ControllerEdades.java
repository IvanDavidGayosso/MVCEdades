/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;
import javax.swing.JOptionPane;
import views.*;
import models.*;       

public class ControllerEdades {
    ModelEdades model_edades;
    ViewEdades view_edades;
    
    public ControllerEdades(ModelEdades model_edades,ViewEdades view_edades){
        this.model_edades= model_edades;
        this.view_edades= view_edades;
        initView();
    }
    
    public void initView(){
       view_edades.jbtn_calcular.addActionListener(e -> jtbn_calcular_click());
        view_edades.setVisible(true);
    }
    
    public void jtbn_calcular_click(){
        model_edades.setEdad(Integer.parseInt(view_edades.jf_edad.getText()));
        model_edades.calcular();
        view_edades.jl_mensaje.setText(model_edades.getMensaje());
        JOptionPane.showMessageDialog(view_edades, model_edades.getMensaje());
        
    }
}
