package com.company;

import com.company.ColorVariants.Blue;
import com.company.ColorVariants.Green;
import com.company.ColorVariants.Red;

public class ColorFactory {
    public Color getColor(String carType) {
        if (colorType == null) {
            return null;
        }
        if (carType.equalsIgnoreCase("BLUE")) {
            return new Blue();
        } else if (carType.equalsIgnoreCase("RED")) {
            return new Red();
        } else if (carType.equalsIgnoreCase("GREEN")) {
            return new Green();
        } else if (carType.equalsIgnoreCase("FRENCH RACING BLUE")) {
            return new FrechRacingBlue();
        }
        return null;
    }
}