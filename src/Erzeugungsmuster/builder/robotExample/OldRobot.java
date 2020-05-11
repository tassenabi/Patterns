package Erzeugungsmuster.builder.robotExample;

public class OldRobot implements IRobot {

    private String robotHead;
    private String robotTorso;

    @Override
    public void setRobotHead(String head) {

        robotHead = head;
    }

    @Override
    public void setRobotTorso(String torso) {

        robotTorso = torso;
    }

    public String getRobotHead(){

        return this.robotHead;
    }

    public String getRobotTorso(){

        return this.robotTorso;
    }
}
