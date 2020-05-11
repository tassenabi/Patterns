package Erzeugungsmuster.builder.robotExample;

public class RobotEngineer {

    private RobotBuilder robotBuilder;

    public RobotEngineer(RobotBuilder robotBuilder){

        this.robotBuilder = robotBuilder;

    }

    public OldRobot getRobot(){

        return this.robotBuilder.getOldRobotEntity();
    }

    public void makeBot(){

        this.robotBuilder.buildRobotHead();
        this.robotBuilder.buildRobotTorso();
    }

}
