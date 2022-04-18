//operator overloading
/* Create a class called Money with a double amount and a string currency (like USD and EUR). Implement a Plus Method That checks the currency are the same  and, if so, returns a new Money instance with the sum of the amounts and the correct
currency. Write a similar minus method.
Write a MoneyTest class in Groovy that uses + and - and verifies that they work
properly*/

class Money {
    private String Currency;
    private double Amount;

    Money(String Currency, double Amount) {
        this.Currency = Currency
        this.Amount =Amount
    }

    def plus(Money other) {
        if(Currency=="INR")
        return new Money(this.Currency + ", " + other.Currency, this.Amount + other.Amount)
    }

    @Override
    public String toString() {
        return "Money{" +
                "Currency='" +Currency + '\'' +
                ", Amount=" + Amount +
                '}';
    }
}

def Money1 = new Money("INR", 500)
def Money2 = new Money("INR", 350)
def Money3 = Money1 + Money2
println Money3



class MoneyMin {
    private String Currency;
    private double Amount;

    MoneyMin(String Currency, double Amount) {
        this.Currency = Currency
        this.Amount =Amount
    }

    def minus(MoneyMin other) {
        if(Currency=="INR")
        return new MoneyMin(this.Currency + ", " + other.Currency, this.Amount - other.Amount)
    }

    @Override
    public String toString() {
        return "MoneyMin{" +
                "Currency='" +Currency + '\'' +
                ", Amount=" + Amount +
                '}';
    }
}

def MoneyMin1 = new MoneyMin("INR", 500)
def MoneyMin2 = new MoneyMin("INR", 350)
def MoneyMin3 = MoneyMin1 - MoneyMin2
println MoneyMin3
