package edu.handong.csee.java.lab07.numbers;

public class RandomNumberGenerator {
    private int firstNumber;
    private int secondNumber;
    private int randomNumber;

    public int getFirstNumber() {
        return this.firstNumber;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public int getSecondNumber() {
        return this.secondNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public void setRandomNumber(int randomNumber) {
        this.randomNumber = randomNumber;
    }

    public RandomNumberGenerator(int a,int b)
    {
        firstNumber = a;
        secondNumber = b;
    }

    public void generateRandomNumber()
    {      
        int temp;

        if(firstNumber > secondNumber)
        {
            temp = firstNumber;
            firstNumber = secondNumber;
            secondNumber = temp;
        }
            
        randomNumber = (int) (Math.random()*(secondNumber-firstNumber+1) + firstNumber);
    }

    public int getRandomNumber()
    {
        return randomNumber;
    }


    public static void main(String[] args) {
        RandomNumberGenerator t = new RandomNumberGenerator(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
        t.generateRandomNumber();
        System.out.println(t.getRandomNumber());
    }
}
