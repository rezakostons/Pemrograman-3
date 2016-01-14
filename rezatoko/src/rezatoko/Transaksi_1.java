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
@Table(name = "transaksi", catalog = "sepatu", schema = "")
@NamedQueries({
    @NamedQuery(name = "Transaksi_1.findAll", query = "SELECT t FROM Transaksi_1 t"),
    @NamedQuery(name = "Transaksi_1.findByIdBarang", query = "SELECT t FROM Transaksi_1 t WHERE t.idBarang = :idBarang"),
    @NamedQuery(name = "Transaksi_1.findByNamaBarang", query = "SELECT t FROM Transaksi_1 t WHERE t.namaBarang = :namaBarang"),
    @NamedQuery(name = "Transaksi_1.findByUkuran", query = "SELECT t FROM Transaksi_1 t WHERE t.ukuran = :ukuran"),
    @NamedQuery(name = "Transaksi_1.findByHargaBarang", query = "SELECT t FROM Transaksi_1 t WHERE t.hargaBarang = :hargaBarang"),
    @NamedQuery(name = "Transaksi_1.findByJumlah", query = "SELECT t FROM Transaksi_1 t WHERE t.jumlah = :jumlah"),
    @NamedQuery(name = "Transaksi_1.findByTotal", query = "SELECT t FROM Transaksi_1 t WHERE t.total = :total")})
public class Transaksi_1 implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_barang")
    private String idBarang;
    @Basic(optional = false)
    @Column(name = "nama_barang")
    private String namaBarang;
    @Basic(optional = false)
    @Column(name = "ukuran")
    private String ukuran;
    @Basic(optional = false)
    @Column(name = "harga_barang")
    private String hargaBarang;
    @Basic(optional = false)
    @Column(name = "jumlah")
    private String jumlah;
    @Basic(optional = false)
    @Column(name = "total")
    private String total;

    public Transaksi_1() {
    }

    public Transaksi_1(String idBarang) {
        this.idBarang = idBarang;
    }

    public Transaksi_1(String idBarang, String namaBarang, String ukuran, String hargaBarang, String jumlah, String total) {
        this.idBarang = idBarang;
        this.namaBarang = namaBarang;
        this.ukuran = ukuran;
        this.hargaBarang = hargaBarang;
        this.jumlah = jumlah;
        this.total = total;
    }

    public String getIdBarang() {
        return idBarang;
    }

    public void setIdBarang(String idBarang) {
        String oldIdBarang = this.idBarang;
        this.idBarang = idBarang;
        changeSupport.firePropertyChange("idBarang", oldIdBarang, idBarang);
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        String oldNamaBarang = this.namaBarang;
        this.namaBarang = namaBarang;
        changeSupport.firePropertyChange("namaBarang", oldNamaBarang, namaBarang);
    }

    public String getUkuran() {
        return ukuran;
    }

    public void setUkuran(String ukuran) {
        String oldUkuran = this.ukuran;
        this.ukuran = ukuran;
        changeSupport.firePropertyChange("ukuran", oldUkuran, ukuran);
    }

    public String getHargaBarang() {
        return hargaBarang;
    }

    public void setHargaBarang(String hargaBarang) {
        String oldHargaBarang = this.hargaBarang;
        this.hargaBarang = hargaBarang;
        changeSupport.firePropertyChange("hargaBarang", oldHargaBarang, hargaBarang);
    }

    public String getJumlah() {
        return jumlah;
    }

    public void setJumlah(String jumlah) {
        String oldJumlah = this.jumlah;
        this.jumlah = jumlah;
        changeSupport.firePropertyChange("jumlah", oldJumlah, jumlah);
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        String oldTotal = this.total;
        this.total = total;
        changeSupport.firePropertyChange("total", oldTotal, total);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idBarang != null ? idBarang.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Transaksi_1)) {
            return false;
        }
        Transaksi_1 other = (Transaksi_1) object;
        if ((this.idBarang == null && other.idBarang != null) || (this.idBarang != null && !this.idBarang.equals(other.idBarang))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "rezatoko.Transaksi_1[ idBarang=" + idBarang + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
