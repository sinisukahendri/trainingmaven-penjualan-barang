package jual.barang.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;

@Entity
@Table(name="t_penjualan")
public class Penjualan implements Serializable {
    
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="id_penjualan")
    private Integer idPenjualan;
    
    @Column(name="nama_konsumen")
    private String namaKonsumen;
    
    @Column(name="tanggal_penjualan")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date tanggalPenjualan;
    
    @Column(name="total_transaksi")
    private BigDecimal totalTransaksi;
    
    @Column(name="list_detail_penjualan")
    @OneToMany
    private List<DetailPenjualan> listDetailPenjualan;

/* --------------------------------------------------------- */
    
    public Integer getIdPenjualan() {
        return idPenjualan;
    }

    public void setIdPenjualan(Integer idPenjualan) {
        this.idPenjualan = idPenjualan;
    }

    public String getNamaKonsumen() {
        return namaKonsumen;
    }

    public void setNamaKonsumen(String namaKonsumen) {
        this.namaKonsumen = namaKonsumen;
    }

    public Date getTanggalPenjualan() {
        return tanggalPenjualan;
    }

    public void setTanggalPenjualan(Date tanggalPenjualan) {
        this.tanggalPenjualan = tanggalPenjualan;
    }

    public BigDecimal getTotalTransaksi() {
        return totalTransaksi;
    }

    public void setTotalTransaksi(BigDecimal totalTransaksi) {
        this.totalTransaksi = totalTransaksi;
    }
    
    public List<DetailPenjualan> getListDetailPenjualan() {
        return listDetailPenjualan;
    }

    public void setListDetailPenjualan(List<DetailPenjualan> listDetailPenjualan) {
        this.listDetailPenjualan = listDetailPenjualan;
    }
    
}
