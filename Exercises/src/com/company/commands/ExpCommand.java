package com.company.commands;

import com.company.CalculatorStack;
import com.company.Command;
import com.company.annotations.In;
import com.company.annotations.InType;

import java.util.List;

public class ExpCommand implements Command {
    @In(type = InType.STACK)
    private CalculatorStack stack;

    @Override
    public void execute(List<String> arguments) {
        float value = stack.pop();
        float result = (float) Math.exp(value);
        stack.push(result);
    }
}
