import java.util.Scanner;

public class streamingTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Total Number of videos");
        int totalVids = sc.nextInt();
        System.out.println("What video are you in?");
        int vid = sc.nextInt();

        int diff = totalVids - vid;
        int totalTime = 0;

        for(int i = 0; i<diff;i++){
            System.out.print("Enter Time: ");
            int time=sc.nextInt();
            totalTime+=time;
        }

        while (true) {
            System.out.print("Enter speed: ");
            int speed = sc.nextInt();

            System.out.println(totalTime/speed+" units of time left");
        }
    }
}
