package br.com.eagravos.mobile.modelos;
// Generated 02/06/2014 08:44:54 by Hibernate Tools 3.6.0

import br.com.eagravos.mobile.interfaces.IModel;




/**
 * UsoCintoSeguranca generated by hbm2java
 */
public class UsoCintoSeguranca  extends IModel<UsoCintoSeguranca> implements java.io.Serializable {


     private Integer id;
     private String codigo;
     private String usoCintoSeguranca;

    public UsoCintoSeguranca() {
    }

    public UsoCintoSeguranca(String codigo, String usoCintoSeguranca) {
       this.codigo = codigo;
       this.usoCintoSeguranca = usoCintoSeguranca;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getUsoCintoSeguranca() {
        return this.usoCintoSeguranca;
    }
    
    public void setUsoCintoSeguranca(String usoCintoSeguranca) {
        this.usoCintoSeguranca = usoCintoSeguranca;
    }

    @Override
    public void copyAttributesOf(UsoCintoSeguranca copy) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void unsetAttributes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void cleanStringWithNull() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String label() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }




}


