package jual.barang.service.impl;

import java.util.List;
import jual.barang.domain.DetailPenjualan;
import jual.barang.service.DetailPenjualanService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("detailPenjualanService")
@Transactional(readOnly=true)
public class DetailPenjualanServiceImpl implements DetailPenjualanService {

    @Override
    @Transactional(readOnly=false)
    public void saveDetailPenjualan(DetailPenjualan detpen) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    @Transactional(readOnly=false)
    public void deleteDetailPenjualan(DetailPenjualan detpen) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<DetailPenjualan> findAllDetailPenjualan() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public DetailPenjualan findDetailPenjualanById(Integer id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public DetailPenjualan findDetailPenjualanByKodeBarang(String kodeBarang) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public DetailPenjualan findDetailPenjualanByIdPenjualan(Integer id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
