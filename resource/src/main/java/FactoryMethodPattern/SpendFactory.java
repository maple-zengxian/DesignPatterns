package FactoryMethodPattern;import com.sun.org.apache.regexp.internal.RE;public class SpendFactory {    public Spender product(String type){        if ("message".equals(type))            return new SpendMassage();        else if ("mail".equals(type))            return new SpendEmail();        else            return null;    }}