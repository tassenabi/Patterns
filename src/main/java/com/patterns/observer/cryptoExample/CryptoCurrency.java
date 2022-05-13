package com.patterns.observer.cryptoExample;

import java.util.ArrayList;
import java.util.List;

public class CryptoCurrency implements Publisher{

    public String name;
    public double value;
    private List<Observer> observers = new ArrayList<>();

    public CryptoCurrency(String name) {
        this.name = name;
    }

    @Override
    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(double value) {
        for (Observer observer : observers) {
            observer.update(this.name, value);
        }
    }

    public void updateValue(double value) {
        this.value = value;
        notifyObservers(value);
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof CryptoCurrency)) return false;
        final CryptoCurrency other = (CryptoCurrency) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$name = this.name;
        final Object other$name = other.name;
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        if (Double.compare(this.value, other.value) != 0) return false;
        final Object this$observers = this.observers;
        final Object other$observers = other.observers;
        if (this$observers == null ? other$observers != null : !this$observers.equals(other$observers)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof CryptoCurrency;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $name = this.name;
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        final long $value = Double.doubleToLongBits(this.value);
        result = result * PRIME + (int) ($value >>> 32 ^ $value);
        final Object $observers = this.observers;
        result = result * PRIME + ($observers == null ? 43 : $observers.hashCode());
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new CryptoCurrency("bitcoin").hashCode());
        System.out.println(new CryptoCurrency("bitcoin").hashCode());
    }
}
