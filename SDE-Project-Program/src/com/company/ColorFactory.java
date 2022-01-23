package com.company;

import com.company.ColorVariants.Blue;
import com.company.ColorVariants.FrenchRacingBlue;
import com.company.ColorVariants.Green;
import com.company.ColorVariants.Red;

public class ColorFactory {
    public Color getColor(String colorType) {
        if (colorType == null) {
            return null;
        }
        if (colorType.equalsIgnoreCase("BLUE")) {
            return new Blue();
        } else if (colorType.equalsIgnoreCase("RED")) {
            return new Red();
        } else if (colorType.equalsIgnoreCase("GREEN")) {
            return new Green();
        } else if (colorType.equalsIgnoreCase("FRENCH RACING BLUE")) {
            return new FrenchRacingBlue();
        }
        return null;
    }
}
