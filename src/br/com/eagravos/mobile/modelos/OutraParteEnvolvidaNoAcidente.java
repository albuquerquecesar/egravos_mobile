package br.com.eagravos.mobile.modelos;
// Generated 02/06/2014 08:44:54 by Hibernate Tools 3.6.0

import br.com.eagravos.mobile.interfaces.IModel;




/**
 * OutraParteEnvolvidaNoAcidente generated by hbm2java
 */
public class OutraParteEnvolvidaNoAcidente  extends IModel<OutraParteEnvolvidaNoAcidente> implements java.io.Serializable {


     private Integer id;
     private String codigo;
     private String outraParteEnvolvidaNoAcidente;

    public OutraParteEnvolvidaNoAcidente() {
    }

    public OutraParteEnvolvidaNoAcidente(String codigo, String outraParteEnvolvidaNoAcidente) {
       this.codigo = codigo;
       this.outraParteEnvolvidaNoAcidente = outraParteEnvolvidaNoAcidente;
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
    public String getOutraParteEnvolvidaNoAcidente() {
        return this.outraParteEnvolvidaNoAcidente;
    }
    
    public void setOutraParteEnvolvidaNoAcidente(String outraParteEnvolvidaNoAcidente) {
        this.outraParteEnvolvidaNoAcidente = outraParteEnvolvidaNoAcidente;
    }

    @Override
    public void copyAttributesOf(OutraParteEnvolvidaNoAcidente copy) {
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


