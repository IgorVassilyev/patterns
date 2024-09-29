package kz.vassilyev.spring.factory_method;

public class WindowsButton implements Button{
    @Override
    public String render() {
        return "Windows Button";
    }

    @Override
    public void onClick() {
        System.out.println("Нажата Windows кнопка!!!");
    }
}
