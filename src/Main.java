package src;

public class Main {

        public static void main(String[] args) {
            String[] programs = new String[3];
            programs[0] = "Program_2.txt";
            programs[1] = "Program_1.txt";
            programs[2] = "Program_3.txt";

            int arrivalTime[] = new int[3];
            arrivalTime[0] = 4;
            arrivalTime[1] = 1;
            arrivalTime[2] = 6;

            int timeSlice = 4;

            OperatingSystem operatingSystem = OperatingSystem.getInstance();
            operatingSystem.init(programs, arrivalTime, timeSlice);
            operatingSystem.runOS();
        }
}
