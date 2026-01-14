package org.example;

public class Task {
    private int id;
    private String name;
    private int priority;
    private double hoursNeeded;
    private Boolean isFixed;
    private String startTime;
    private int dayIndex;
    private int deadlineDays;
    private String category;

    public Task(){}

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getPriority() { return priority; }
    public void setPriority(int priority) { this.priority = priority; }

    public double getHoursNeeded() { return hoursNeeded; }
    public void setHoursNeeded(double hoursNeeded) { this.hoursNeeded = hoursNeeded; }

    public boolean isIsFixed() { return isFixed; }
    public void setIsFixed(boolean isFixed) { this.isFixed = isFixed; }

    public String getStartTime() { return startTime; }
    public void setStartTime(String startTime) { this.startTime = startTime; }

    public int getDayIndex() { return dayIndex; }
    public void setDayIndex(int dayIndex) { this.dayIndex = dayIndex; }

    public int getDeadlineDays() { return deadlineDays; }
    public void setDeadlineDays(int deadlineDays) { this.deadlineDays = deadlineDays; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }
}
