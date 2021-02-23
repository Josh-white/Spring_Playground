package com.example.demo;


import org.springframework.http.converter.json.GsonBuilderUtils;

public class Calculate {
    private String operation = "add";
    private Integer x;
    private Integer y;


    public void setOperation(String operation){
        this.operation = operation;
    }

    public void setX(String x){
        this.x = Integer.parseInt(x);
    }

    public void setY(String y){
        this.y = Integer.parseInt(y);
    }

    public String getOperation(){
        return operation;
    }

    public Integer getX(){
        return x;
    }

    public Integer getY(){
        return y;
    }

    public String doDivide() {
        return String.format("%s / %s = %s",x , y, (x / y));
    }

    public String doSubtract() {
        return String.format("%s - %s = %s", x, y, (x - y));
    }

    public String doMultiply() {
        return String.format("%s * %s = %s", x, y, (x * y));
    }

    @Override
    public String toString() {
        return "Calculate{" +
                "operation='" + operation + '\'' +
                ", x=" + x +
                ", y=" + y +
                '}';
    }

    public String doAdd() {
        return String.format("%s + %s = %s", x, y, (x + y));
        // return "This is a test";
    }
}
