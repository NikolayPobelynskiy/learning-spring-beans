package org.example;

public class FirstBean {

    String constructorArg;

    String textField;

    public FirstBean(String arg) {
        constructorArg = arg;
    }

    public String getConstructorArg() {
        return constructorArg;
    }

    public String getTextField() {
        return textField;
    }

    public void setTextField(String textField) {
        this.textField = textField;
    }
}
