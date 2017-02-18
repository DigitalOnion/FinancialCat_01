package com.luiscorp.financialcat_01;

public class DataRecord {
    String symbol;

    public DataRecord() { }

    public DataRecord(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
}
