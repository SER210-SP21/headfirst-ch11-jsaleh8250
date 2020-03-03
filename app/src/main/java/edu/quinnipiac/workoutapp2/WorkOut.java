package edu.quinnipiac.workoutapp2;

public class WorkOut {

    private String name;
    private String description;


    public static final WorkOut[] workouts = {

            new WorkOut("The Limb Loosener",
                    "5 Handstand push-ups\n10 1-legged squats\n15 Pull-ups"),
            new WorkOut("Core Agony",
                    "100 Pull-ups\n100 Push-ups\n100 Sit-ups\n100 Squats"),
            new WorkOut("The Wimp Special",
                    "5 Pull-ups\n10 Push-ups\n15 Squats"),
            new WorkOut("Strength and Length",
                    "500 meter run\n21 x 1.5 pood kettleball swing\n21 x pull-ups")
    };


    private WorkOut(String name, String description) {
        this.name = name;
        this.description = description;
    }
    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }
    public String toString() {
        return this.name;
    }
}