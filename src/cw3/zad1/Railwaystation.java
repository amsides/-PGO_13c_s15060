package cw3.zad1;

import cw2.exception.ValidationException;

import java.util.ArrayList;
import java.util.List;

public class Railwaystation {

    private String name;
    private int platformsNumber;
    private List<Train>TrainList=new ArrayList<>();


    public Railwaystation(String name) {
        this.name = name;
        this.platformsNumber = 3;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPlatformsNumber() {
        return platformsNumber;
    }

    public List<Train> getTrainList() {
        return TrainList;
    }

    public void setPlatformsNumber(int platformsNumber) {
        if(platformsNumber< 3){

            throw new RuntimeException("to ss");
        }

        this.platformsNumber = platformsNumber;
    }



    public void IncreseTrack(int track){

        platformsNumber+= track;
    }

    public void LunchTrain(String name ){
        if(TrainList.size()>platformsNumber){
            throw new ValidationException("To may trains");
        }
        TrainList.add(new Train(name));

    }


}
