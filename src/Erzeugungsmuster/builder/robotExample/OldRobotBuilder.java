package Erzeugungsmuster.builder.robotExample;

public class OldRobotBuilder implements RobotBuilder {

    private OldRobot oldRobotEntity;

    OldRobotBuilder(){

        this.oldRobotEntity = new OldRobot();
    }

    @Override
    public void buildRobotHead() {

        this.oldRobotEntity.setRobotHead("Tin Head");

    }


    @Override
    public void buildRobotTorso() {

        this.oldRobotEntity.setRobotTorso("Tin Torso");
    }

    @Override
    public OldRobot getOldRobotEntity() {

        return this.oldRobotEntity;
    }
}
