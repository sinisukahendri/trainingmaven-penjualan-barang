package jual.barang.service;

import java.util.List;
import jual.barang.domain.DetailPenjualan;


public interface DetailPenjualanService {
    
    public void saveDetailPenjualan(DetailPenjualan detpen);
    
    public void deleteDetailPenjualan(DetailPenjualan detpen);
    
    public List<DetailPenjualan> findAllDetailPenjualan();
    
    public DetailPenjualan findDetailPenjualanById(Integer id);
    
    public DetailPenjualan findDetailPenjualanByKodeBarang(String kodeBarang);
    
    public DetailPenjualan findDetailPenjualanByIdPenjualan(Integer id);
    
}
