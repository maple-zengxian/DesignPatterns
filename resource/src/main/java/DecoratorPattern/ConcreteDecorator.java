package DecoratorPattern;/** * 具体装饰者角色 */public class ConcreteDecorator extends Decorator{    public ConcreteDecorator(Component component) {        super(component);    }    @Override    public void operation(){        super.operation();        this.addFunction();    }    private void addFunction(){        System.out.println("这是新增方法!");    }}