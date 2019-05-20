import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Check check = new Check();

        System.out.println("Podaj  współrzedną X punktu ");
        int coordinateX = input.nextInt();
        System.out.println("Podaj współrzędną Y punktu");
        int coordinateY = input.nextInt();
        input.close();
        Check check = new Check();
        System.out.println(check.quarter(coordinateX,coordinateY));

    }

    }


