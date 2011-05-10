package jual.barang.service;

import java.util.Date;
import java.util.List;
import jual.barang.domain.Penjualan;


public interface PenjualanService {
    
    public void savePenjualan(Penjualan penju);
    
    public void deletePenjualan(Penjualan penju);
    
    public List<Penjualan> findAllPenjualan();
    
    public Penjualan findPenjualanById(Integer id);
    
    public List<Penjualan> findPenjualanByKonsumen(String konsumen);
    
    public List<Penjualan> findPenjualanByTanggal(Date tanggal);
    
}
