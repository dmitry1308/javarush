package ru.schepin.calculator1.commands;


import ru.schepin.calculator1.CalculatorContext;
import ru.schepin.calculator1.Command;

import java.util.List;

public class SqrtCommand implements Command {
    @Override
    public void execute(List<String> arguments, CalculatorContext context) {
//        if (context.isEmpty()) {
//            System.out.println("Стек пустой");
//        } else {
//            context.push((float) Math.sqrt(context.pop()));
//        }
        float value = context.pop();
        float result = (float) Math.sqrt(value);
        context.push(result);
    }
}
