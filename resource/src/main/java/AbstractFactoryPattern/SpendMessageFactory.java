package AbstractFactoryPattern;public class SpendMessageFactory implements Provider {    public Spender produce() {        return new SpendMassage();    }}