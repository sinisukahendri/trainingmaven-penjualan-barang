package jual.barang.service.impl;

import java.util.Date;
import java.util.List;
import jual.barang.domain.Penjualan;
import jual.barang.service.PenjualanService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("penjualanService")
@Transactional(readOnly=true)
public class PenjualanServiceImpl implements PenjualanService {

    @Override
    @Transactional(readOnly=false)
    public void savePenjualan(Penjualan penju) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    @Transactional(readOnly=false)
    public void deletePenjualan(Penjualan penju) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Penjualan> findAllPenjualan() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Penjualan findPenjualanById(Integer id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Penjualan> findPenjualanByKonsumen(String konsumen) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Penjualan> findPenjualanByTanggal(Date tanggal) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
