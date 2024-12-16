/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soft_all;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author Marcilio
 */
@Entity
@Table(name = "ENTRADAS", catalog = "", schema = "BDSOFTALL")
@NamedQueries({
    @NamedQuery(name = "Entradas_1.findAll", query = "SELECT e FROM Entradas_1 e")
    , @NamedQuery(name = "Entradas_1.findById", query = "SELECT e FROM Entradas_1 e WHERE e.id = :id")
    , @NamedQuery(name = "Entradas_1.findByDataDeOperacao", query = "SELECT e FROM Entradas_1 e WHERE e.dataDeOperacao = :dataDeOperacao")
    , @NamedQuery(name = "Entradas_1.findByValor", query = "SELECT e FROM Entradas_1 e WHERE e.valor = :valor")})
public class Entradas_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "DATA_DE_OPERACAO")
    @Temporal(TemporalType.DATE)
    private Date dataDeOperacao;
    @Basic(optional = false)
    @Lob
    @Column(name = "CEDENTE_SACADO")
    private String cedenteSacado;
    @Lob
    @Column(name = "REFERENTE")
    private String referente;
    @Lob
    @Column(name = "OBSERVACOES")
    private String observacoes;
    @Basic(optional = false)
    @Column(name = "VALOR")
    private double valor;

    public Entradas_1() {
    }

    public Entradas_1(Integer id) {
        this.id = id;
    }

    public Entradas_1(Integer id, String cedenteSacado, double valor) {
        this.id = id;
        this.cedenteSacado = cedenteSacado;
        this.valor = valor;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public Date getDataDeOperacao() {
        return dataDeOperacao;
    }

    public void setDataDeOperacao(Date dataDeOperacao) {
        Date oldDataDeOperacao = this.dataDeOperacao;
        this.dataDeOperacao = dataDeOperacao;
        changeSupport.firePropertyChange("dataDeOperacao", oldDataDeOperacao, dataDeOperacao);
    }

    public String getCedenteSacado() {
        return cedenteSacado;
    }

    public void setCedenteSacado(String cedenteSacado) {
        String oldCedenteSacado = this.cedenteSacado;
        this.cedenteSacado = cedenteSacado;
        changeSupport.firePropertyChange("cedenteSacado", oldCedenteSacado, cedenteSacado);
    }

    public String getReferente() {
        return referente;
    }

    public void setReferente(String referente) {
        String oldReferente = this.referente;
        this.referente = referente;
        changeSupport.firePropertyChange("referente", oldReferente, referente);
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        String oldObservacoes = this.observacoes;
        this.observacoes = observacoes;
        changeSupport.firePropertyChange("observacoes", oldObservacoes, observacoes);
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        double oldValor = this.valor;
        this.valor = valor;
        changeSupport.firePropertyChange("valor", oldValor, valor);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Entradas_1)) {
            return false;
        }
        Entradas_1 other = (Entradas_1) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "soft_all.Entradas_1[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
