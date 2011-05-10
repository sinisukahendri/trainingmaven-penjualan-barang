package jual.barang.service.impl;

import java.util.List;
import jual.barang.domain.Barang;
import jual.barang.service.BarangService;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("barangService")
@Transactional(readOnly=true)
public class BarangServiceImpl implements BarangService {
    
    @Autowired
    private SessionFactory sessionFactory;
    private String hqlSelectByKode = "from Barang b where b.kodeBarang = :kd";
    private String hqlSelectAll = "from Barang";
    
    @Override
    @Transactional(readOnly=false)
    public void saveBarang(Barang barang) {
        sessionFactory.getCurrentSession().saveOrUpdate(barang);
    }

    @Override
    @Transactional(readOnly=false)
    public void deleteBarang(Barang barang) {
        sessionFactory.getCurrentSession().delete(barang);
    }

    @Override
    public Barang findBarangByKode(String kode) {
        return (Barang) sessionFactory.getCurrentSession()
                .createQuery(hqlSelectByKode).setParameter("kd", kode)
                .uniqueResult();
    }

    @Override
    public List<Barang> findAllBarang() {
        return sessionFactory.getCurrentSession().createQuery(hqlSelectAll).list();
    }
    
}
