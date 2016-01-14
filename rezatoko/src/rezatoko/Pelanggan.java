/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rezatoko;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Reza
 */
@Entity
@Table(name = "pelanggan", catalog = "sepatu", schema = "")
@NamedQueries({
    @NamedQuery(name = "Pelanggan.findAll", query = "SELECT p FROM Pelanggan p"),
    @NamedQuery(name = "Pelanggan.findByIdPelanggan", query = "SELECT p FROM Pelanggan p WHERE p.idPelanggan = :idPelanggan"),
    @NamedQuery(name = "Pelanggan.findByNamaPelanggan", query = "SELECT p FROM Pelanggan p WHERE p.namaPelanggan = :namaPelanggan"),
    @NamedQuery(name = "Pelanggan.findByAlamat", query = "SELECT p FROM Pelanggan p WHERE p.alamat = :alamat"),
    @NamedQuery(name = "Pelanggan.findByNoTelp", query = "SELECT p FROM Pelanggan p WHERE p.noTelp = :noTelp")})
public class Pelanggan implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_pelanggan")
    private String idPelanggan;
    @Basic(optional = false)
    @Column(name = "nama_pelanggan")
    private String namaPelanggan;
    @Basic(optional = false)
    @Column(name = "alamat")
    private String alamat;
    @Basic(optional = false)
    @Column(name = "no_telp")
    private String noTelp;

    public Pelanggan() {
    }

    public Pelanggan(String idPelanggan) {
        this.idPelanggan = idPelanggan;
    }

    public Pelanggan(String idPelanggan, String namaPelanggan, String alamat, String noTelp) {
        this.idPelanggan = idPelanggan;
        this.namaPelanggan = namaPelanggan;
        this.alamat = alamat;
        this.noTelp = noTelp;
    }

    public String getIdPelanggan() {
        return idPelanggan;
    }

    public void setIdPelanggan(String idPelanggan) {
        String oldIdPelanggan = this.idPelanggan;
        this.idPelanggan = idPelanggan;
        changeSupport.firePropertyChange("idPelanggan", oldIdPelanggan, idPelanggan);
    }

    public String getNamaPelanggan() {
        return namaPelanggan;
    }

    public void setNamaPelanggan(String namaPelanggan) {
        String oldNamaPelanggan = this.namaPelanggan;
        this.namaPelanggan = namaPelanggan;
        changeSupport.firePropertyChange("namaPelanggan", oldNamaPelanggan, namaPelanggan);
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        String oldAlamat = this.alamat;
        this.alamat = alamat;
        changeSupport.firePropertyChange("alamat", oldAlamat, alamat);
    }

    public String getNoTelp() {
        return noTelp;
    }

    public void setNoTelp(String noTelp) {
        String oldNoTelp = this.noTelp;
        this.noTelp = noTelp;
        changeSupport.firePropertyChange("noTelp", oldNoTelp, noTelp);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPelanggan != null ? idPelanggan.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pelanggan)) {
            return false;
        }
        Pelanggan other = (Pelanggan) object;
        if ((this.idPelanggan == null && other.idPelanggan != null) || (this.idPelanggan != null && !this.idPelanggan.equals(other.idPelanggan))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "rezatoko.Pelanggan[ idPelanggan=" + idPelanggan + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
