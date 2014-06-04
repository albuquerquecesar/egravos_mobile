package br.com.eagravos.mobile.modelos;
// Generated 02/06/2014 08:44:54 by Hibernate Tools 3.6.0

import br.com.eagravos.mobile.interfaces.IModel;




/**
 * InstituicaoTb generated by hbm2java
 */
public class InstituicaoTb  extends IModel<InstituicaoTb> implements java.io.Serializable {


     private Integer id;
     private Cidades cidades;
     private String codigo;
     private String nome;
     private String endereco;
     private String numero;
     private String cep;
     private String bairro;
     private String cidade;
     private String estado;
     private String cnpj;
     private String inscricao;
     private String esfera;
     private String telefone01;
     private String telefone02;
     private String fax;
     private String responsavel;
     private String celularResp;

    public InstituicaoTb() {
    }

	
    public InstituicaoTb(Cidades cidades, String codigo) {
        this.cidades = cidades;
        this.codigo = codigo;
    }
    public InstituicaoTb(Cidades cidades, String codigo, String nome, String endereco, String numero, String cep, String bairro, String cidade, String estado, String cnpj, String inscricao, String esfera, String telefone01, String telefone02, String fax, String responsavel, String celularResp) {
       this.cidades = cidades;
       this.codigo = codigo;
       this.nome = nome;
       this.endereco = endereco;
       this.numero = numero;
       this.cep = cep;
       this.bairro = bairro;
       this.cidade = cidade;
       this.estado = estado;
       this.cnpj = cnpj;
       this.inscricao = inscricao;
       this.esfera = esfera;
       this.telefone01 = telefone01;
       this.telefone02 = telefone02;
       this.fax = fax;
       this.responsavel = responsavel;
       this.celularResp = celularResp;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Cidades getCidades() {
        return this.cidades;
    }
    
    public void setCidades(Cidades cidades) {
        this.cidades = cidades;
    }
    public String getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereco() {
        return this.endereco;
    }
    
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getNumero() {
        return this.numero;
    }
    
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public String getCep() {
        return this.cep;
    }
    
    public void setCep(String cep) {
        this.cep = cep;
    }
    public String getBairro() {
        return this.bairro;
    }
    
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public String getCidade() {
        return this.cidade;
    }
    
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public String getEstado() {
        return this.estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getCnpj() {
        return this.cnpj;
    }
    
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public String getInscricao() {
        return this.inscricao;
    }
    
    public void setInscricao(String inscricao) {
        this.inscricao = inscricao;
    }
    public String getEsfera() {
        return this.esfera;
    }
    
    public void setEsfera(String esfera) {
        this.esfera = esfera;
    }
    public String getTelefone01() {
        return this.telefone01;
    }
    
    public void setTelefone01(String telefone01) {
        this.telefone01 = telefone01;
    }
    public String getTelefone02() {
        return this.telefone02;
    }
    
    public void setTelefone02(String telefone02) {
        this.telefone02 = telefone02;
    }
    public String getFax() {
        return this.fax;
    }
    
    public void setFax(String fax) {
        this.fax = fax;
    }
    public String getResponsavel() {
        return this.responsavel;
    }
    
    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }
    public String getCelularResp() {
        return this.celularResp;
    }
    
    public void setCelularResp(String celularResp) {
        this.celularResp = celularResp;
    }

    @Override
    public void copyAttributesOf(InstituicaoTb copy) {
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


