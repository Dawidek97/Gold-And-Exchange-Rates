package pl.nbp.npb;

import java.util.ArrayList;
import java.util.List;

public class CurrencyModel {
    List<ExchangeRate> rates = new ArrayList<>();

    public List<ExchangeRate> getRates() {
        return rates;
    }

    public void setRates(List<ExchangeRate> rates) {
        this.rates = rates;
    }

    public static class ExchangeRate {
        private Double bid;
        private Double ask;

        public Double getBid() {
            return bid;
        }

        public void setBid(Double bid) {
            this.bid = bid;
        }

        public Double getAsk() {
            return ask;
        }

        public void setAsk(Double ask) {
            this.ask = ask;
        }

        @Override
        public String toString() {
            return "ExchangeRate " +
                    "bid = " + bid +
                    ", ask = " + ask;
        }
    }

}
