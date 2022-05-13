package com.patterns.adapter.gameexample;

public class TestEnemyAttackers{

    public static void main(String[] args){

        EnemyTank mainBattleTank = new EnemyTank();

        EnemyRobot OlexTheRobot = new EnemyRobot();

        EnemyAttacker robotAdapter = new EnemyRobotAdapter(OlexTheRobot);

        System.out.println("The Robot");

        OlexTheRobot.reactToHuman("Moussa");
        OlexTheRobot.walkForward();
        OlexTheRobot.smashWithHands();
        System.out.println();

        System.out.println("The Enemy Tank");

        mainBattleTank.assignDriver("Thanh");
        mainBattleTank.driveForward();
        mainBattleTank.fireWeapon();
        System.out.println();

        System.out.println("The Robot with Adapter");

        robotAdapter.assignDriver("Faruq");
        robotAdapter.driveForward();
        robotAdapter.fireWeapon();

    }

}
