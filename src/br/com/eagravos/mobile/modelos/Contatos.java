package br.com.eagravos.mobile.modelos;
// Generated 02/06/2014 08:44:54 by Hibernate Tools 3.6.0


import br.com.eagravos.mobile.interfaces.IModel;
import java.util.HashSet;
import java.util.Set;
import net.sf.oval.constraint.NotBlank;
import net.sf.oval.constraint.NotEmpty;
import net.sf.oval.constraint.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Contatos generated by hbm2java
 */
public class Contatos  extends IModel<Contatos> implements java.io.Serializable {

    
  
	
	public Contatos(JSONObject json) throws JSONException{
		if(json != null){
			this.nome=json.getString("nome");
			this.email=json.getString("email");
			this.senha=json.getString("senha");
		}
	}
	
    
    
    

     @NotEmpty
     @NotBlank
     private Integer id;
     
     @NotBlank
     @NotNull
     private String nome;
     
     @NotEmpty
     @NotBlank    
     private int cboId;
     
     @NotEmpty
     @NotBlank     
     private int unidadeId;
     
     @NotEmpty
     @NotBlank      
     private int departamentoId;
     
     @NotEmpty
     @NotBlank      
     private int setorId;
     
     private String telefoneDdd;
     private String telefoneNumero;
     private String ramal;
     private String celular;
     
     @NotEmpty
     @NotBlank     
     private int municipioId;
     
     @NotEmpty
     @NotBlank      
     private int regionalId;
     
     @NotEmpty
     @NotBlank      
     private int estadoId;
     
     @NotEmpty
     @NotBlank     
     private int status2;
     
     @NotBlank
     @NotNull     
     private String email;
     
     @NotBlank
     @NotNull     
     private String senha;
     
     private Set usuarioses = new HashSet(0);
     
     
     

    public Contatos() {
    }

	
    public Contatos(String nome, int cboId, int unidadeId, int departamentoId, int setorId, int municipioId, int regionalId, int estadoId, int status2, String email, String senha) {
        this.nome = nome;
        this.cboId = cboId;
        this.unidadeId = unidadeId;
        this.departamentoId = departamentoId;
        this.setorId = setorId;
        this.municipioId = municipioId;
        this.regionalId = regionalId;
        this.estadoId = estadoId;
        this.status2 = status2;
        this.email = email;
        this.senha = senha;
    }
    
    
    public Contatos(String nome, int cboId, int unidadeId, int departamentoId, int setorId, String telefoneDdd, String telefoneNumero, String ramal, String celular, int municipioId, int regionalId, int estadoId, int status2, String email, String senha, Set usuarioses) {
       this.nome = nome;
       this.cboId = cboId;
       this.unidadeId = unidadeId;
       this.departamentoId = departamentoId;
       this.setorId = setorId;
       this.telefoneDdd = telefoneDdd;
       this.telefoneNumero = telefoneNumero;
       this.ramal = ramal;
       this.celular = celular;
       this.municipioId = municipioId;
       this.regionalId = regionalId;
       this.estadoId = estadoId;
       this.status2 = status2;
       this.email = email;
       this.senha = senha;
       this.usuarioses = usuarioses;
    }
   
    
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getCboId() {
        return this.cboId;
    }
    
    public void setCboId(int cboId) {
        this.cboId = cboId;
    }
    public int getUnidadeId() {
        return this.unidadeId;
    }
    
    public void setUnidadeId(int unidadeId) {
        this.unidadeId = unidadeId;
    }
    public int getDepartamentoId() {
        return this.departamentoId;
    }
    
    public void setDepartamentoId(int departamentoId) {
        this.departamentoId = departamentoId;
    }
    public int getSetorId() {
        return this.setorId;
    }
    
    public void setSetorId(int setorId) {
        this.setorId = setorId;
    }
    public String getTelefoneDdd() {
        return this.telefoneDdd;
    }
    
    public void setTelefoneDdd(String telefoneDdd) {
        this.telefoneDdd = telefoneDdd;
    }
    public String getTelefoneNumero() {
        return this.telefoneNumero;
    }
    
    public void setTelefoneNumero(String telefoneNumero) {
        this.telefoneNumero = telefoneNumero;
    }
    public String getRamal() {
        return this.ramal;
    }
    
    public void setRamal(String ramal) {
        this.ramal = ramal;
    }
    public String getCelular() {
        return this.celular;
    }
    
    public void setCelular(String celular) {
        this.celular = celular;
    }
    public int getMunicipioId() {
        return this.municipioId;
    }
    
    public void setMunicipioId(int municipioId) {
        this.municipioId = municipioId;
    }
    public int getRegionalId() {
        return this.regionalId;
    }
    
    public void setRegionalId(int regionalId) {
        this.regionalId = regionalId;
    }
    public int getEstadoId() {
        return this.estadoId;
    }
    
    public void setEstadoId(int estadoId) {
        this.estadoId = estadoId;
    }
    public int getStatus2() {
        return this.status2;
    }
    
    public void setStatus2(int status2) {
        this.status2 = status2;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getSenha() {
        return this.senha;
    }
    
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public Set getUsuarioses() {
        return this.usuarioses;
    }
    
    public void setUsuarioses(Set usuarioses) {
        this.usuarioses = usuarioses;
    }

    @Override
    public void copyAttributesOf(Contatos copy) {
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


