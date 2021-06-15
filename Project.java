class Project {
    private String name;
    private String description;
    public Project() {
    }
    public Project(String name){
        this.name = name;
    }
    public Project(String name, String description){
        this.name = name;
        this.description = description;
    }
    public String getElevatorName(){
        return name;
    }
    public void setElevatorName(String name){
        this.name = name;
    }
    public String getElevatorPitch() {
        return description;
    }
    public void setElevatorPitch(String description){
        this.description = description;
    }

    public void elevatorPitch(){
        System.out.println("Project 1 - Name: " + this.name + ", Description: " + this.description);
    }
}
