package kz.vassilyev.spring.factory_method;

public abstract class Dialog {

    public String render() {
        return "render Dialog";
    }

    abstract Button createButton();

}
