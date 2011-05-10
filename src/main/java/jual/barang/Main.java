package jual.barang;

import java.math.BigDecimal;
import jual.barang.domain.Barang;
import jual.barang.service.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
    
    private static ApplicationContext appCtx;
    private static BarangService bars;
    
    public static void main(String[] args) {
        String file = "jual/barang/**/applicationContext.xml";
        appCtx = new ClassPathXmlApplicationContext("classpath*:"+file);
        bars = (BarangService) appCtx.getBean("barangService");
        
        Barang bar = new Barang();
        bar.setKodeBarang("BA001");
        bar.setNamaBarang("Barang Satu");
        bar.setUnitPrice(new BigDecimal(20000));
        
        bars.saveBarang(bar);
        
    }
}
