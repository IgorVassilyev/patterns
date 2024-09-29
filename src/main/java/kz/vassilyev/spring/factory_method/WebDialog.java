package kz.vassilyev.spring.factory_method;

public class WebDialog extends Dialog{
    @Override
    public Button createButton() {
        return new HTMLButton();
    }
}
