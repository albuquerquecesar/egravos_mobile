package br.com.eagravos.mobile.modelos;
// Generated 02/06/2014 08:44:54 by Hibernate Tools 3.6.0


import br.com.eagravos.mobile.interfaces.IModel;
import java.util.Date;

/**
 * FichaAcidenteDadosDoAcidente generated by hbm2java
 */
public class FichaAcidenteDadosDoAcidente  extends IModel<FichaAcidenteDadosDoAcidente> implements java.io.Serializable {


     private int fichaAcidenteIdAcidentadoId;
     private Date dataAcidente;
     private Date horaAcidente;
     private String logradouroDoAcidente;
     private String logradouroNumero;
     private String bairro;
     private String pontoDeReferencia;
     private int tipoDeVitimaId;
     private int unidadeNotificadoraDoAcidenteId;
     private int acidenteRelacionadoAoTrabalhoId;
     private int outraParteEnvolvidaNoAcidenteId;
     private int meioLocomocaoVitimaHoraAcidenteId;
     private int meioDeLocomocaoVitimaId;
     private int zonaOcorrenciaId;
     private int naturezaDoAcidenteId;

    public FichaAcidenteDadosDoAcidente() {
    }

	
    public FichaAcidenteDadosDoAcidente(int fichaAcidenteIdAcidentadoId, Date dataAcidente, Date horaAcidente, int tipoDeVitimaId, int unidadeNotificadoraDoAcidenteId, int acidenteRelacionadoAoTrabalhoId, int outraParteEnvolvidaNoAcidenteId, int meioLocomocaoVitimaHoraAcidenteId, int meioDeLocomocaoVitimaId, int zonaOcorrenciaId, int naturezaDoAcidenteId) {
        this.fichaAcidenteIdAcidentadoId = fichaAcidenteIdAcidentadoId;
        this.dataAcidente = dataAcidente;
        this.horaAcidente = horaAcidente;
        this.tipoDeVitimaId = tipoDeVitimaId;
        this.unidadeNotificadoraDoAcidenteId = unidadeNotificadoraDoAcidenteId;
        this.acidenteRelacionadoAoTrabalhoId = acidenteRelacionadoAoTrabalhoId;
        this.outraParteEnvolvidaNoAcidenteId = outraParteEnvolvidaNoAcidenteId;
        this.meioLocomocaoVitimaHoraAcidenteId = meioLocomocaoVitimaHoraAcidenteId;
        this.meioDeLocomocaoVitimaId = meioDeLocomocaoVitimaId;
        this.zonaOcorrenciaId = zonaOcorrenciaId;
        this.naturezaDoAcidenteId = naturezaDoAcidenteId;
    }
    public FichaAcidenteDadosDoAcidente(int fichaAcidenteIdAcidentadoId, Date dataAcidente, Date horaAcidente, String logradouroDoAcidente, String logradouroNumero, String bairro, String pontoDeReferencia, int tipoDeVitimaId, int unidadeNotificadoraDoAcidenteId, int acidenteRelacionadoAoTrabalhoId, int outraParteEnvolvidaNoAcidenteId, int meioLocomocaoVitimaHoraAcidenteId, int meioDeLocomocaoVitimaId, int zonaOcorrenciaId, int naturezaDoAcidenteId) {
       this.fichaAcidenteIdAcidentadoId = fichaAcidenteIdAcidentadoId;
       this.dataAcidente = dataAcidente;
       this.horaAcidente = horaAcidente;
       this.logradouroDoAcidente = logradouroDoAcidente;
       this.logradouroNumero = logradouroNumero;
       this.bairro = bairro;
       this.pontoDeReferencia = pontoDeReferencia;
       this.tipoDeVitimaId = tipoDeVitimaId;
       this.unidadeNotificadoraDoAcidenteId = unidadeNotificadoraDoAcidenteId;
       this.acidenteRelacionadoAoTrabalhoId = acidenteRelacionadoAoTrabalhoId;
       this.outraParteEnvolvidaNoAcidenteId = outraParteEnvolvidaNoAcidenteId;
       this.meioLocomocaoVitimaHoraAcidenteId = meioLocomocaoVitimaHoraAcidenteId;
       this.meioDeLocomocaoVitimaId = meioDeLocomocaoVitimaId;
       this.zonaOcorrenciaId = zonaOcorrenciaId;
       this.naturezaDoAcidenteId = naturezaDoAcidenteId;
    }
   
    public int getFichaAcidenteIdAcidentadoId() {
        return this.fichaAcidenteIdAcidentadoId;
    }
    
    public void setFichaAcidenteIdAcidentadoId(int fichaAcidenteIdAcidentadoId) {
        this.fichaAcidenteIdAcidentadoId = fichaAcidenteIdAcidentadoId;
    }
    public Date getDataAcidente() {
        return this.dataAcidente;
    }
    
    public void setDataAcidente(Date dataAcidente) {
        this.dataAcidente = dataAcidente;
    }
    public Date getHoraAcidente() {
        return this.horaAcidente;
    }
    
    public void setHoraAcidente(Date horaAcidente) {
        this.horaAcidente = horaAcidente;
    }
    public String getLogradouroDoAcidente() {
        return this.logradouroDoAcidente;
    }
    
    public void setLogradouroDoAcidente(String logradouroDoAcidente) {
        this.logradouroDoAcidente = logradouroDoAcidente;
    }
    public String getLogradouroNumero() {
        return this.logradouroNumero;
    }
    
    public void setLogradouroNumero(String logradouroNumero) {
        this.logradouroNumero = logradouroNumero;
    }
    public String getBairro() {
        return this.bairro;
    }
    
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public String getPontoDeReferencia() {
        return this.pontoDeReferencia;
    }
    
    public void setPontoDeReferencia(String pontoDeReferencia) {
        this.pontoDeReferencia = pontoDeReferencia;
    }
    public int getTipoDeVitimaId() {
        return this.tipoDeVitimaId;
    }
    
    public void setTipoDeVitimaId(int tipoDeVitimaId) {
        this.tipoDeVitimaId = tipoDeVitimaId;
    }
    public int getUnidadeNotificadoraDoAcidenteId() {
        return this.unidadeNotificadoraDoAcidenteId;
    }
    
    public void setUnidadeNotificadoraDoAcidenteId(int unidadeNotificadoraDoAcidenteId) {
        this.unidadeNotificadoraDoAcidenteId = unidadeNotificadoraDoAcidenteId;
    }
    public int getAcidenteRelacionadoAoTrabalhoId() {
        return this.acidenteRelacionadoAoTrabalhoId;
    }
    
    public void setAcidenteRelacionadoAoTrabalhoId(int acidenteRelacionadoAoTrabalhoId) {
        this.acidenteRelacionadoAoTrabalhoId = acidenteRelacionadoAoTrabalhoId;
    }
    public int getOutraParteEnvolvidaNoAcidenteId() {
        return this.outraParteEnvolvidaNoAcidenteId;
    }
    
    public void setOutraParteEnvolvidaNoAcidenteId(int outraParteEnvolvidaNoAcidenteId) {
        this.outraParteEnvolvidaNoAcidenteId = outraParteEnvolvidaNoAcidenteId;
    }
    public int getMeioLocomocaoVitimaHoraAcidenteId() {
        return this.meioLocomocaoVitimaHoraAcidenteId;
    }
    
    public void setMeioLocomocaoVitimaHoraAcidenteId(int meioLocomocaoVitimaHoraAcidenteId) {
        this.meioLocomocaoVitimaHoraAcidenteId = meioLocomocaoVitimaHoraAcidenteId;
    }
    public int getMeioDeLocomocaoVitimaId() {
        return this.meioDeLocomocaoVitimaId;
    }
    
    public void setMeioDeLocomocaoVitimaId(int meioDeLocomocaoVitimaId) {
        this.meioDeLocomocaoVitimaId = meioDeLocomocaoVitimaId;
    }
    public int getZonaOcorrenciaId() {
        return this.zonaOcorrenciaId;
    }
    
    public void setZonaOcorrenciaId(int zonaOcorrenciaId) {
        this.zonaOcorrenciaId = zonaOcorrenciaId;
    }
    public int getNaturezaDoAcidenteId() {
        return this.naturezaDoAcidenteId;
    }
    
    public void setNaturezaDoAcidenteId(int naturezaDoAcidenteId) {
        this.naturezaDoAcidenteId = naturezaDoAcidenteId;
    }

    @Override
    public void copyAttributesOf(FichaAcidenteDadosDoAcidente copy) {
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


