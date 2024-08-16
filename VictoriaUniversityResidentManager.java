/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ue.victoriauniversityresidentmanager;

public class VictoriaUniversityResidentManager {

    public static void main(String[] args) {
      
         LectureRoom room = new LectureRoom();
        EasyReader reader = new EasyReader();

        while (true) {
            System.out.println("\nMain Menu:");
            System.out.println("W: Add students");
            System.out.println("X: Remove students");
            System.out.println("Y: Turn on a light");
            System.out.println("Z: Turn off a light");
            System.out.println("S: Show status");
            System.out.println("Q: Quit");

            String choice = reader.readString("Enter your choice: ");

            switch (choice) {
                case "W":
                    int addCount = reader.readInt("Enter the number of students to add: ");
                    room.addStudents(addCount);
                    break;
                case "X":
                    int removeCount = reader.readInt("Enter the number of students to remove: ");
                    room.removeStudents(removeCount);
                    break;
                case "Y":
                    int lightToTurnOn = reader.readInt("Enter the light number to turn on (1-3): ");
                    room.turnOnLight(lightToTurnOn);
                    break;
                case "Z":
                    int lightToTurnOff = reader.readInt("Enter the light number to turn off (1-3): ");
                    room.turnOffLight(lightToTurnOff);
                    break;
                case "S":
                    room.showStatus();
                    break;
                case "Q":
                    System.out.println("Exiting the program...");
                    return; // Quit the program
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
