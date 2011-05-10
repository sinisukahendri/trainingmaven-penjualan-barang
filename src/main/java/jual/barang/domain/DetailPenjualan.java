package jual.barang.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="t_detail_penjualan")
public class DetailPenjualan implements Serializable {
    
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="id_detail_penjualan")
    private Integer idDetailPenjualan;
    
    @Column(name="kode_barang")
    @ManyToOne
    private Barang barang;
    
    @Column(name="id_penjualan")
    @ManyToOne
    private Penjualan penjualan;
    
    @Column(name="quantity")
    private Integer quantity;
    
    @Column(name="harga")
    private BigDecimal harga;
    
/* --------------------------------------------------------- */

    public Barang getBarang() {
        return barang;
    }

    public void setBarang(Barang barang) {
        this.barang = barang;
    }

    public BigDecimal getHarga() {
        return harga;
    }

    public void setHarga(BigDecimal harga) {
        this.harga = harga;
    }

    public Integer getIdDetailPenjualan() {
        return idDetailPenjualan;
    }

    public void setIdDetailPenjualan(Integer idDetailPenjualan) {
        this.idDetailPenjualan = idDetailPenjualan;
    }

    public Penjualan getPenjualan() {
        return penjualan;
    }

    public void setPenjualan(Penjualan penjualan) {
        this.penjualan = penjualan;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
