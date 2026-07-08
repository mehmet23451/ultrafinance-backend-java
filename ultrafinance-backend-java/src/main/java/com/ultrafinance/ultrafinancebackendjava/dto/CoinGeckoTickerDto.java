package com.ultrafinance.ultrafinancebackendjava.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CoinGeckoTickerDto {
    private String id;
    private String symbol;
    private String name;
    @JsonProperty("current_price")
    private double currentPrice;
    @JsonProperty("price_change_percentage_24h")
    private double priceChangePercentage24h;
    @JsonProperty("image")
    private String imageUrl;
}
