package com.gmail.stepan1983;

public class CatBreed {

    @Save
    private String breedName;
    @Save
    private int averageWeight;

    public CatBreed(String breedName, int averageWeight) {
        this.breedName = breedName;
        this.averageWeight = averageWeight;
    }

    public CatBreed() {
    }

    public String getBreedName() {
        return breedName;
    }

    public void setBreedName(String breedName) {
        this.breedName = breedName;
    }

    public int getAverageWeight() {
        return averageWeight;
    }

    public void setAverageWeight(int averageWeight) {
        this.averageWeight = averageWeight;
    }

    @Override
    public String toString() {
        return "CatBreed{" +
                "breedName='" + breedName + '\'' +
                ", averageWeight=" + averageWeight +
                '}';
    }
}
