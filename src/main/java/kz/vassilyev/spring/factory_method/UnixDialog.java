package kz.vassilyev.spring.factory_method;

public class UnixDialog extends Dialog{
    @Override
    public Button createButton() {
        return new UnixButton();
    }
}
