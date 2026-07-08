package com.ultrafinance.ultrafinancebackendjava.service;

import com.ultrafinance.ultrafinancebackendjava.dto.CoinGeckoTickerDto;
import com.ultrafinance.ultrafinancebackendjava.entity.CryptoCurrency;
import com.ultrafinance.ultrafinancebackendjava.repository.CryptoCurrencyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CryptoService {
    private final CryptoCurrencyRepository cryptoCurrencyRepository;

    public void fetchAndSaveCryptoPrices(){
        String url= "https://api.coingecko.com/api/v3/coins/markets?vs_currency=usd&ids=bitcoin,ethereum,solana";
        RestTemplate restTemplate= new RestTemplate();
        CoinGeckoTickerDto[] responseArray= restTemplate.getForObject(url, CoinGeckoTickerDto[].class);
        if (responseArray!=null){
            List<CryptoCurrency> cryptoCurrencies= new ArrayList<>();
            for (CoinGeckoTickerDto dto : responseArray){
                CryptoCurrency cryptoCurrency= new CryptoCurrency();
                cryptoCurrency.setId(dto.getId());
                cryptoCurrency.setName(dto.getName());
                cryptoCurrency.setSymbol(dto.getSymbol());
                cryptoCurrency.setCurrentPrice(dto.getCurrentPrice());
                cryptoCurrency.setPriceChangePercentage24h(dto.getPriceChangePercentage24h());
                cryptoCurrency.setImageUrl(dto.getImageUrl());
                cryptoCurrencies.add(cryptoCurrency);
            }
            cryptoCurrencyRepository.saveAll(cryptoCurrencies);
        }
    }
}
