package br.com.eagravos.mobile.modelos;
// Generated 02/06/2014 08:44:54 by Hibernate Tools 3.6.0

import br.com.eagravos.mobile.interfaces.IModel;




/**
 * NaturezaDoAcidente generated by hbm2java
 */
public class NaturezaDoAcidente  extends IModel<NaturezaDoAcidente> implements java.io.Serializable {


     private Integer id;
     private String codigo;
     private String naturezaDoAcidente;

    public NaturezaDoAcidente() {
    }

    public NaturezaDoAcidente(String codigo, String naturezaDoAcidente) {
       this.codigo = codigo;
       this.naturezaDoAcidente = naturezaDoAcidente;
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
    public String getNaturezaDoAcidente() {
        return this.naturezaDoAcidente;
    }
    
    public void setNaturezaDoAcidente(String naturezaDoAcidente) {
        this.naturezaDoAcidente = naturezaDoAcidente;
    }

    @Override
    public void copyAttributesOf(NaturezaDoAcidente copy) {
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


