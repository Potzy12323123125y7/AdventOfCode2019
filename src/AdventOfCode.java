import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AdventOfCode {
    public static void main(String[] args) {
        Scanner in = null;
        try {
            in = new Scanner(new File("day1.txt"));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        int Modulemass = 0;
        int AllofModulemass = 0;
        int Fuel = 0;
        int AntalFuel = 0;
while (in.hasNext()) {
    Modulemass = in.nextInt();
    Modulemass = (Modulemass/3) - 2;
    Fuel = (Modulemass/3)-2;
    if (Fuel > 0) {
        Fuel = (Fuel/3) - 2;
        AntalFuel = (Fuel + AntalFuel);
    }
    else {
        break;
    }
    AllofModulemass = (Modulemass + AllofModulemass + AntalFuel);
System.out.println("The fuel required is " + AllofModulemass);
}

    }

    }
/*

public class AdventofCode {
    public static void main(String[] args) {
        Scanner in = null;
        try {
            in = new Scanner(new File("test.dat"));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
  */