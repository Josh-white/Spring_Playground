package com.example.demo;


import org.springframework.http.converter.json.GsonBuilderUtils;

import java.util.Map;

public class Calculate {
    private String operation = "add";
    private Integer x;
    private Integer y;
    private String[] n;

    public String multiSum() {
        StringBuilder returnString = new StringBuilder();
        int answer = 0;
        // System.out.println("made it to multiSum in calculate");
        for(int i = 0; i < n.length - 1; i++){
            returnString.append(n[i]).append(" + ");

            answer += Integer.parseInt(n[i]);
        }
        returnString.append(n[n.length-1]);
        answer += Integer.parseInt(n[n.length-1]);
        // System.out.println(answer);
        return String.format("%s = %s", returnString.toString(), answer);
    }


    public void setOperation(String operation){
        this.operation = operation;
    }

    public void setX(String x){
        this.x = Integer.parseInt(x);
    }

    public void setY(String y){
        this.y = Integer.parseInt(y);
    }

    public void setN(String[] n) {
        this.n = n;
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
