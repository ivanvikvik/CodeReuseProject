package by.itstep.vikvik.javalessons.lesson22.model.entity;

import java.util.Random;

public class Killer {
    public static void justDoIt(Human[] humans) {
        Random random = new Random();
        for (int i = 0; i < humans.length; i++) {
            if (humans[i].isAlive() && random.nextBoolean()) {
                humans[i].setAlive(false);
            }
        }
    }

    public static String view(Human[] humans) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < humans.length; i++) {
            builder.append(humans[i]).append("\n");
        }

        return builder + "";
    }
}
