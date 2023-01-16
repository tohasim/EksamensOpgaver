package Opgaver.Opgave16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Random;

public class ExamQuestion {
    private int number;
    private String grade;

    public ExamQuestion(int number){
        this.number = number + 1;
    }

    public void setGrade() {
        String[] grades = {"A", "B", "C", "D", "E", "F"};
        Random random = new Random();
        this.grade = grades[random.nextInt(6)];
    }

    @Override
    public String toString(){
        return String.format("Spørgsmål #%d, grade: %s", number, grade);
    }
    //-------------------------//
    public static void main(String[] args) throws FileNotFoundException {
        File outputFile = new File("./src/Opgaver.Opgave16/output.txt");
        PrintStream output = new PrintStream(outputFile);
        ExamQuestion[] questions = new ExamQuestion[14];
        for(int i = 0; i < questions.length; i++){
            ExamQuestion question = new ExamQuestion(i);
            question.setGrade();
            questions[i] = question;
        }
        for (ExamQuestion question : questions) {
            output.println(question);
        }
    }
}
