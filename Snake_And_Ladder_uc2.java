package day4;

public class Snake_And_Ladder_uc2 {
    static final int START_POSITION = 0;

    public static void main(String[] args) {

        System.out.println("Welcome to Snake and ladder Game");

        int dice = (int) (Math.random()*10)%6+1;
        System.out.println("Dice rolled value: "+dice);

    }
}
