package Opgaver.Opgave10;

import java.util.ArrayList;

public class BMI {
    private double height;
    private int weight;
    private String name;

    public BMI(String name, double height, int weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public double calculate(){
        double BMI = (double) weight/(height * height);
        return BMI;
    }

    public boolean isUnderWeight(){
        return calculate() < 18.5;
    }
    public boolean isOverWeight(){
        return calculate() > 25;
    }

    public boolean isNormalWeight(){
        return !isUnderWeight() && !isOverWeight();
    }
    public String getName(){
        return name;
    }

    public static void main(String[] args) {
        BMI bmiUnder = new BMI("BmiUnder",1.85, 50);
        BMI bmiNormal = new BMI("BmiNormal",1.85, 80);
        BMI bmiOver = new BMI("BmiOver",1.85, 180);
        ArrayList<BMI> bmis = new ArrayList<>();
        bmis.add(bmiUnder);
        bmis.add(bmiNormal);
        bmis.add(bmiOver);
        for (BMI bmi: bmis) {
            System.out.printf("%s: \n" +
                    "   is underweight: %s\n" +
                    "   is normalweight: %s\n" +
                    "   is overweight: %s\n",
                    bmi.getName(), bmi.isUnderWeight(), bmi.isNormalWeight(), bmi.isOverWeight());
        }
    }
}
