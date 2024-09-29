package kz.vassilyev.spring.factory_method;

public interface Button {
    String render();
    void onClick();
    default String defaultMethod() {
        return "Default Method Working!!!";
    }
}
