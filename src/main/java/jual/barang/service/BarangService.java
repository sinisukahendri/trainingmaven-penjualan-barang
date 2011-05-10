package jual.barang.service;

import java.util.List;
import jual.barang.domain.Barang;


public interface BarangService {
    
    public void saveBarang(Barang barang);
    
    public void deleteBarang(Barang barang);
    
    public Barang findBarangByKode(String kode);
    
    public List<Barang> findAllBarang();
    
}
