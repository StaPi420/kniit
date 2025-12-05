package org.kniit.lab9.task14;


public enum TrafficLight {
    RED("RED", 0),
    YELLOW("YELLOW", 1),
    GREEN("GREEN", 2);

    private final String title;
    private int curLight = 0;
    static final private TrafficLight[] lightOrder= {
        TrafficLight.RED,
        TrafficLight.YELLOW,
        TrafficLight.GREEN,
        TrafficLight.YELLOW
    };

    private TrafficLight(String title, int curLight){
        this.title = title;
        this.curLight = curLight;

    }

    static TrafficLight makeTrafficLight(String light){
        for (TrafficLight tl : values()) {
            if (tl.title.equals(light)) {
                return tl;
            }
        }
        throw new IllegalArgumentException("Invalid traffic light: " + light);
    }

    public String getNextLight(){
        curLight = (curLight == 3 ? 0 : ++curLight);
        return lightOrder[curLight].toString();
    }
}
