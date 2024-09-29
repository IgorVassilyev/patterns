package kz.vassilyev.spring.factory_method;

public class UnixButton implements Button{
    @Override
    public String render() {
        return "UNIX Button";
    }

    @Override
    public void onClick() {
        System.out.println("Нажата Unix кнопка!!!");
    }

    @Override
    public String defaultMethod() {
        return "Default Method in Unix Working!!!";
    }
}
