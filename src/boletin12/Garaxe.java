/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin12;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author io
 */
public class Garaxe {
    private int numeroCoches;
    private String matricula;

    public Garaxe() {
    }

    public Garaxe(int numeroCoches, String matricula) {
        this.numeroCoches = numeroCoches;
        this.matricula = matricula;
    }

    public int getNumeroCoches() {
        return numeroCoches;
    }

    public void setNumeroCoches(int numeroCoches) {
        this.numeroCoches = numeroCoches;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public void verSitio(){
        int plazas= 5;
        if(plazas<=5){
            matricula= JOptionPane.showInputDialog(null,"Teclee nª matricula", "PLAZAS DISPOÑIBLES",JOptionPane.INFORMATION_MESSAGE);
            }else{
            JOptionPane.showInputDialog(null,"WARNING","COMPLETO",JOptionPane.WARNING_MESSAGE);
        }
    }
          public void pago(){
              Scanner sc= new Scanner(System.in);
              System.out.println("Cuanto tiempo ha estado en el aparcamiento");
               int tiempo=sc.nextInt();
              float precio=0;
             
              if   (tiempo<=3){
                  precio=1.5f;
              }else{
                  precio=1.5f+(tiempo*0.2f);
              }
                  System.out.println("Tiene que pagar "+precio+" euros");
                  System.out.println("Teclee a cantidade bonificada");
                  float cartosRecibidos=sc.nextFloat();
                  
              System.out.println("FACTURA"+"\nA SUA MATRÍCULA É"+matricula+"\nTIEMPO"+tiempo+"\nPRECIO"+precio+"\nCARTOS RECIBIDOS"+cartosRecibidos+"\nCARTOS DEVOLTOS"+(precio-cartosRecibidos));
          }
              
    
              
          }  
        
    
    
    
    
    
    
    
