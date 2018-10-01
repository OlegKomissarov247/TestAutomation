package by.bsu.komissarov.lab1.logic;

public class GenerationNumbersInRange {

        public static int generateRandomIntegerInRange(int min, int max) {
            max -= min;
            return (int)((Math.random() * ++max) + min);
        }
}
