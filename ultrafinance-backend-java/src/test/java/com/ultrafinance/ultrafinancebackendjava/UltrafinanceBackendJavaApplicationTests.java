package com.ultrafinance.ultrafinancebackendjava;

import com.ultrafinance.ultrafinancebackendjava.service.CryptoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes= UltrafinanceBackendJavaApplication.class)
@org.springframework.context.annotation.ComponentScan(basePackages = "com.ultrafinance.ultrafinancebackendjava")
class UltrafinanceBackendJavaApplicationTests {
    @Autowired
    private CryptoService cryptoService;
    @Test
    public void testCryptoService(){
        System.out.println("Kontrol başlatılıyor.");
        cryptoService.fetchAndSaveCryptoPrices();
        System.out.println("başarıyla tamamlandıç");
    }

}
