package PrototypePattern;/** * java实现原型模式相对简单 * java 提供 clone() 对象复制方法 * 实现 Cloneable 接口 * */public class PrototypePattern implements Cloneable{    public PrototypePattern(){        System.out.println("原型模式创建成功!");    }    @Override    protected Object clone() throws CloneNotSupportedException {        System.out.println("原生模式对象拷贝!");        return super.clone();    }}