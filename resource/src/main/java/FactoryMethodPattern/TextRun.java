package FactoryMethodPattern;import org.junit.Test;public class TextRun {    /**     * 一个工厂     */    @Test    public void oneFactory(){        SpendFactory factory = new SpendFactory();        Spender message = factory.product("message");        message.spend();        Spender mail = factory.product("mail");        mail.spend();    }    /**     *     */    @Test    public void moreFactory(){        SpendFactory factory = new SpendFactory();        Spender mailSpender = factory.productMailSpender();        mailSpender.spend();        Spender messageSpender = factory.productMessageSpender();        messageSpender.spend();    }    @Test    public void staticFactory(){        Spender spendMail = SpendFactory.staticSpendMail();        spendMail.spend();        Spender spendMessage = SpendFactory.staticSpendMessage();        spendMessage.spend();    }}