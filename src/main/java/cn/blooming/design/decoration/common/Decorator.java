package cn.blooming.design.decoration.common;

public class Decorator extends Component {
    Component component;
    public Decorator() {
    }

    public void setComponent(Component component) {
        this.component = component;
    }
    @Override
    void operation() {
        component.operation();
    }
}
