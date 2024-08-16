
package ue.victoriauniversityresidentmanager;

public class LectureRoom {
  
    private int students;
    private boolean[] lights;

    public LectureRoom() {
        this.students = 0;
        this.lights = new boolean[3]; // Represents three lights, all initially off.
    }

    public void addStudents(int number) {
        for (int i = 0; i < number; i++) {
            this.students++;
        }
        System.out.println(number + " students added. Total students: " + this.students);
    }

    public void removeStudents(int number) {
        if (number > this.students) {
            this.students = 0;
        } else {
            for (int i = 0; i < number; i++) {
                this.students--;
            }
        }
        System.out.println(number + " students removed. Total students: " + this.students);
    }

    public void turnOnLight(int lightNumber) {
        if (lightNumber >= 1 && lightNumber <= 3) {
            this.lights[lightNumber - 1] = true;
            System.out.println("Light " + lightNumber + " is now ON.");
        } else {
            System.out.println("Invalid light number. Please enter 1, 2, or 3.");
        }
    }

    public void turnOffLight(int lightNumber) {
        if (lightNumber >= 1 && lightNumber <= 3) {
            this.lights[lightNumber - 1] = false;
            System.out.println("Light " + lightNumber + " is now OFF.");
        } else {
            System.out.println("Invalid light number. Please enter 1, 2, or 3.");
        }
    }

    public void showStatus() {
        System.out.println("Current number of students: " + this.students);
        for (int i = 0; i < this.lights.length; i++) {
            System.out.println("Light " + (i + 1) + ": " + (this.lights[i] ? "ON" : "OFF"));

    
}
    }
}
