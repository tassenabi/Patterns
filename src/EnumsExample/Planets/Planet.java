package EnumsExample.Planets;

public enum Planet {

    MERRKUR(3.302e+23, 2.439e6),
    VENUS(4.869e+24,6.052e6),
    ERDE(5.975e+24, 6.378e6),
    MARS(6.419e+23, 3.393e6),
    JUPITER(1.899e+27, 7.149e7),
    SATURN(5.685e26, 6.027e7),
    URANUS(8.683e+25, 2.556e7),
    NEPTUN(1.024e+26, 2.477e7);

    private final double mass;
    private final double radius;
    private final double surfaceGravity;

    //Universelle Gravitationskonstante in m^3/kgs^2
    private static final double G = 6.67300E-11;

    Planet(double mass, double radius){
        this.mass = mass;
        this.radius = radius;
        surfaceGravity = G * mass /(radius * radius);
    }

    public double mass(){ return this.mass;}
    public double radius(){ return this.radius;}
    public double surfaceGravity(){ return this.surfaceGravity;}

    public double surfaceWeight(double mass){
        return mass * surfaceGravity; //F = ma
    }

    public static void main(String[] args) {
        //Edit Configurations beim Start
        double earthWeight = Double.parseDouble(args[0]);
        double mass = earthWeight / Planet.ERDE.surfaceGravity();

        System.out.println(earthWeight + " kg sind auf: ");
        for(Planet p : Planet.values()){
            System.out.println(p + " " + p.surfaceWeight(mass) +" kg");
        }
    }

}
