package ua.univer.lesson04;

public enum Season {
    Winter("зима"), Spring(""), Summer(""), Autumn("");


    private String name;

    Season(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
