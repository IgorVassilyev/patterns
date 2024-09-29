package kz.vassilyev.spring.factory_method;

public class HTMLButton implements Button {
    @Override
    public String render() {
        return "<div>Hello World!!!<div/>";
    }

    @Override
    public void onClick() {
        System.out.println("Нажата HTML кнопка!!!");
    }
}
