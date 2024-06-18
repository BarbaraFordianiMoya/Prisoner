//Section 7, Lesson 6 Starter for Exercise 2 - Slide 16

public class Prisoner_Student_7_6 {
    //Fields 
    private String name;
    private double height;
    private int sentence;
    private Cell cell;
    private int bookingNumber;
    private static int prisonerCount;
    public static final int MPC = 100;
    
    //Constructor
    public Prisoner_Student_7_6(String name, double height, int sentence, Cell cell){
 	this.name = name;
 	this.height = height;
 	this.sentence = sentence;
        this.cell = cell;
    }

    Prisoner_Student_7_6(String bubba, double d, int i, Cell_Student_7_6 cellA1) {
        throw new UnsupportedOperationException("Not supported yet.");
                }
    //Methods
    public void think(){
        System.out.println("I'll have my revenge.");
    }
    public void display(){
        System.out.println("Name: " +getName());
        System.out.println("Height: " +getHeight() +"m");
        System.out.println("Sentence: " +getSentence() +" yrs");
        System.out.println("Cell: " +getCell().getName());
    }
    
    //Getters
    public String getName() {
        return name;
    }
    public double getHeight() {
        return height;
    }
    public int getSentence() {
        return sentence;
    }
    public Cell getCell() {
        return cell;
    }
    //Setters
    public void setName(String name) {
        this.name = name;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public void setSentence(int sentence) {
        this.sentence = sentence;
    }
    public void setCell(Cell cell) {
        this.cell = cell;
    }

    private static class Cell {

        public Cell() {
        }

        private String getName() {
            throw new UnsupportedOperationException("Not supported yet."); 
        }
    }
}
