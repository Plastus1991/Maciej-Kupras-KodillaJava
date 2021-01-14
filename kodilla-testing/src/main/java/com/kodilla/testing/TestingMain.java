package com.kodilla.testing;
import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.Calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        System.out.println("Pierwszy test jednostkowy:");

        Calculator calculator = new Calculator();
        int resultAdd = calculator.add(5, 40);
        int resultSub = calculator.subtract(33, 44);

        if (resultAdd == 45 && resultSub == -11) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!!");
        }

    }
}

