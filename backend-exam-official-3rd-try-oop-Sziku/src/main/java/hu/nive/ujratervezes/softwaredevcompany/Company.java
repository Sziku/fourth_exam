package hu.nive.ujratervezes.softwaredevcompany;

import java.util.List;

public class Company {

    List<Worker> workers;

    public Company(List<Worker> workers) {
        this.workers = workers;
        //workers.get(0).experience++;
    }

    public int companyExperience(){
        /*int sum = 0;
        for (Worker worker : workers){
            sum += worker.getExperience();
        }
        return sum;*/

        return workers.stream().mapToInt(Worker::getExperience).sum();
    }
}
