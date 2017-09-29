/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import views.*;
import models.*;
import controllers.*;
public class Main {

   
    public static void main(String[] args) {
        ModelEdades model_edades= new ModelEdades ();
        ViewEdades view_edades= new ViewEdades();
        ControllerEdades controller_edades = new ControllerEdades(model_edades,view_edades);
    }
    
}
