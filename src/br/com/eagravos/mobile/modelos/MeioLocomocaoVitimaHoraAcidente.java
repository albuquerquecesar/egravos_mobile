package br.com.eagravos.mobile.modelos;
// Generated 02/06/2014 08:44:54 by Hibernate Tools 3.6.0

import br.com.eagravos.mobile.interfaces.IModel;




/**
 * MeioLocomocaoVitimaHoraAcidente generated by hbm2java
 */
public class MeioLocomocaoVitimaHoraAcidente  extends IModel<MeioLocomocaoVitimaHoraAcidente> implements java.io.Serializable {


     private Integer id;
     private String codigo;
     private String meioLocomocaoVitimaHoraAcidente;

    public MeioLocomocaoVitimaHoraAcidente() {
    }

    public MeioLocomocaoVitimaHoraAcidente(String codigo, String meioLocomocaoVitimaHoraAcidente) {
       this.codigo = codigo;
       this.meioLocomocaoVitimaHoraAcidente = meioLocomocaoVitimaHoraAcidente;
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
    public String getMeioLocomocaoVitimaHoraAcidente() {
        return this.meioLocomocaoVitimaHoraAcidente;
    }
    
    public void setMeioLocomocaoVitimaHoraAcidente(String meioLocomocaoVitimaHoraAcidente) {
        this.meioLocomocaoVitimaHoraAcidente = meioLocomocaoVitimaHoraAcidente;
    }

    @Override
    public void copyAttributesOf(MeioLocomocaoVitimaHoraAcidente copy) {
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


