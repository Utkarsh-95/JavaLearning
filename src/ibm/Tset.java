package ibm;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.stream.Stream;

/**
 *
 * @author Utkarsh Pratap Singh
 */
enum Direction {
    NORTH,
    NORTHEAST,
    EAST,
    SOUTHEAST,
    SOUTH,
    SOUTHWEST,
    WEST,
    NORTHWEST
}

public class Tset {

    public static void main(String[] args) {

        Stream.of(Direction.values()).forEach(System.out::println);

//        for (int x = 0; x < Direction.length; x++) {
//            System.out.println(Direction[x]);
//        }
//        Direction.toList().forEach(
//        ...);
        for (Direction dir : Direction.values()) { // do what you want 
            System.out.println(dir);
        }
    }
}
