package com.epam.task.first.creator;

public class StringValidator {

    public boolean validate(String line)
    {
        final String validSymbols = "0123456789 -,";

        boolean isValid = false;

        for (int index = 0; index<line.length(); index++) {

            char currentSymbol = line.charAt(index);

            if (validSymbols.contains(String.valueOf(currentSymbol))) {
                    isValid = true;
                } else {
                isValid = false;
                break;
            }

        }
        return isValid;

    }
}
