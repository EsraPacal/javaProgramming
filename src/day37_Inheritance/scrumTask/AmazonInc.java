package day37_Inheritance.scrumTask;

public class AmazonInc {

    public static void main(String[] args) {

        String company = "Amazon Inc";

        ProductOwner po = new ProductOwner("Enes",25,'M',52,150000,company);

        BusinessAnalyst ba= new BusinessAnalyst("Cihad",30,'F',65,160000,company);

        ScrumMaster sm = new ScrumMaster("Sena",32,'F',95,140000,company);

        Tester tester1 = new Tester("Esra",24,'F',"QA",789,120000,company);
        Tester tester2= new Tester("Sevil",29,'F',"SDET",875,130000,company);
        Tester tester3= new Tester("Onur",39,'M',"SDET",875,125000,company);
        Tester tester4= new Tester("Samet",28,'M',"QA",875,110000,company);

        Tester[] testers = {tester1,tester2,tester3,tester4};

        Developer developer1 = new Developer("Aaron",35,'M',"Java Developer",10,135000,company);


        ScrumTeam scrumTeam = new ScrumTeam(po,ba,sm);
        scrumTeam.addDeveloper(developer1);
        scrumTeam.addTesters(testers);

        System.out.println(scrumTeam);

        System.out.println("----------------------------------------------------");

        for(Tester tester : scrumTeam.testers){
            System.out.println(tester.name+ " : "+tester.salary);
        }

        System.out.println("-----------------------------------------------------");

        for (Developer developer : scrumTeam.developers){
            System.out.println(developer.name+" : "+developer.salary);
        }


    }
}
