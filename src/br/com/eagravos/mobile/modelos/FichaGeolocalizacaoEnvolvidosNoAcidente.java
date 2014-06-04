package br.com.eagravos.mobile.modelos;
// Generated 02/06/2014 08:44:54 by Hibernate Tools 3.6.0

import br.com.eagravos.mobile.interfaces.IModel;




/**
 * FichaGeolocalizacaoEnvolvidosNoAcidente generated by hbm2java
 */
public class FichaGeolocalizacaoEnvolvidosNoAcidente  extends IModel<FichaGeolocalizacaoEnvolvidosNoAcidente> implements java.io.Serializable {


     private Integer id;
     private String tipoDoEnvolvido;
     private String nomeDoEnvolvido;
     private String placa;
     private String proprietarioVeiculo;
     private String condutorDoVeiculo;
     private String idAparelhoNotificador;
     private int fichaAcidenteIdAcidentadoId;

    public FichaGeolocalizacaoEnvolvidosNoAcidente() {
    }

    public FichaGeolocalizacaoEnvolvidosNoAcidente(String tipoDoEnvolvido, String nomeDoEnvolvido, String placa, String proprietarioVeiculo, String condutorDoVeiculo, String idAparelhoNotificador, int fichaAcidenteIdAcidentadoId) {
       this.tipoDoEnvolvido = tipoDoEnvolvido;
       this.nomeDoEnvolvido = nomeDoEnvolvido;
       this.placa = placa;
       this.proprietarioVeiculo = proprietarioVeiculo;
       this.condutorDoVeiculo = condutorDoVeiculo;
       this.idAparelhoNotificador = idAparelhoNotificador;
       this.fichaAcidenteIdAcidentadoId = fichaAcidenteIdAcidentadoId;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getTipoDoEnvolvido() {
        return this.tipoDoEnvolvido;
    }
    
    public void setTipoDoEnvolvido(String tipoDoEnvolvido) {
        this.tipoDoEnvolvido = tipoDoEnvolvido;
    }
    public String getNomeDoEnvolvido() {
        return this.nomeDoEnvolvido;
    }
    
    public void setNomeDoEnvolvido(String nomeDoEnvolvido) {
        this.nomeDoEnvolvido = nomeDoEnvolvido;
    }
    public String getPlaca() {
        return this.placa;
    }
    
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getProprietarioVeiculo() {
        return this.proprietarioVeiculo;
    }
    
    public void setProprietarioVeiculo(String proprietarioVeiculo) {
        this.proprietarioVeiculo = proprietarioVeiculo;
    }
    public String getCondutorDoVeiculo() {
        return this.condutorDoVeiculo;
    }
    
    public void setCondutorDoVeiculo(String condutorDoVeiculo) {
        this.condutorDoVeiculo = condutorDoVeiculo;
    }
    public String getIdAparelhoNotificador() {
        return this.idAparelhoNotificador;
    }
    
    public void setIdAparelhoNotificador(String idAparelhoNotificador) {
        this.idAparelhoNotificador = idAparelhoNotificador;
    }
    public int getFichaAcidenteIdAcidentadoId() {
        return this.fichaAcidenteIdAcidentadoId;
    }
    
    public void setFichaAcidenteIdAcidentadoId(int fichaAcidenteIdAcidentadoId) {
        this.fichaAcidenteIdAcidentadoId = fichaAcidenteIdAcidentadoId;
    }

    @Override
    public void copyAttributesOf(FichaGeolocalizacaoEnvolvidosNoAcidente copy) {
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

