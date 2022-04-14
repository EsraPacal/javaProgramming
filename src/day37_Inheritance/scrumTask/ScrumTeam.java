package day37_Inheritance.scrumTask;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam{

    public ProductOwner PO;  // Product Owner data type(not String) == > Custom Class
    public BusinessAnalyst BA;
    public ScrumMaster SM;

    public ArrayList<Tester> testers = new ArrayList<>();
    public ArrayList<Developer> developers = new ArrayList<>();

    public ScrumTeam(ProductOwner PO, BusinessAnalyst BA, ScrumMaster SM) {
        this.PO = PO;
        this.BA = BA;
        this.SM = SM;

    }

    public void addTester(Tester tester){  // in the list of Tester, add one tester
        testers.add(tester);
    }

    public void addTesters(Tester[] testers){ // in the Arraylist of Tester add multiple testers
        this.testers.addAll(Arrays.asList(testers));
    }

    public void removeTester(int id){
        testers.removeIf(p-> p.id== id);
    }

    public void addDeveloper(Developer developer){
        developers.add(developer);
    }

    public void addTesters(Developer[] developers){ // testers is the same with the instance variable Arraylist
        this.developers.addAll(Arrays.asList(developers));  // so, we have to use this. keyword in order to separate both name from each other
       //               addAll() is a collection type ===> so , we pass the parameters with Arrays.asList()
    }
     public void removeDeveloper(int id){
        developers.removeIf(p-> p.id==id);
     }

    public String toString() {
        return "ScrumTeam{" +
                "PO= " + PO.name +
                ", BA= " + BA.name +
                ", SM= " + SM.name +
                ", number of testers= " + testers.size() +
                ", number of developers= " + developers.size() +
                '}';
    }
}
