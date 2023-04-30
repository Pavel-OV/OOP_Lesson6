package solid;

import java.io.Console;

import solid.srp.models.Order;
import solid.srp.models.views.ConsoleInput;

public class Main {
    public static void main(String[] args) {
        ConsoleInput input = new ConsoleInput();
        System.out.println("Введите заказ:");
        Order order = input.inputFromConsole();
        JasonSaver saver =new JasonSaver();
       
        saver.saveToJson(order);
    }
}
