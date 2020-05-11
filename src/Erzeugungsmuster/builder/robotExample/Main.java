package Erzeugungsmuster.builder.robotExample;

public class Main {

    public static void main(String[] args) {

        RobotBuilder oldStyleRobot = new OldRobotBuilder();
        RobotEngineer robotEngineer = new RobotEngineer(oldStyleRobot);

        robotEngineer.makeBot();

        OldRobot firstOldRobotEntity = robotEngineer.getRobot();

        System.out.println(firstOldRobotEntity.getRobotHead());
    }
}
