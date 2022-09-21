package adventofcode.jelle;

import java.util.List;

import adventofcode.jelle.tools.LineReader;

public class Day1 {
    public int star_one() {
        return star_one(LineReader.readLinesForDay(1));
    }

    public int star_one(List<String> lines) {

        var moves = lines.get(0).split(", ");
        var walker = new Day1Walker();

        for(var move : moves) {
            var rotation = move.charAt(0);
            var steps = Character.getNumericValue(move.charAt(1));
            walker.rotate(rotation);
            walker.move(steps);
        }

        return walker.getDistanceFromStart();
    }

    private class Day1Walker {
        private int positionVertical = 0;
        private int positionHorizontal = 0;

        // start facing north
        private double direction = 0d;

        public int getDistanceFromStart(){
            return Math.abs(positionHorizontal) + Math.abs(positionVertical);
        }

        private long[] getComponents() {
            long[] result = { Math.round(Math.cos(direction)), Math.round(Math.sin(direction)) };
            return result;
        }

        void move(int steps) {
            var directionVector = getComponents();
            positionVertical += directionVector[0] * steps;
            positionVertical += directionVector[1] * steps;
        }

        void rotate(char rotateTo) {
            switch (rotateTo) {
                case 'R':
                    direction += Math.PI / 2.0d;
                    break;

                case 'L':
                    direction -= Math.PI / 2.0d;
                    break;
            }
        }

    }

}
