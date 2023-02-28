package hu.nive.ujratervezes.softwaredevcompany;

public abstract class Worker {
    protected int experience;
    protected boolean isBored;

    public Worker(int experience) {
        this.experience = experience;
        isBored = false;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public boolean isBored() {
        return isBored;
    }

    public void setBored(boolean bored) {
        isBored = bored;
    }

    public void doWork(boolean isBoring){
        if(!isBored){
            work(isBoring);
        }
    }

    private void work(boolean isBoring) {
        if(isBoring){
            experience++;
            isBored = true;
        }else {
            experience += 2;
        }
    }
}
