public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name,double salary,int workHours,int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
    }

    public double tax(){
        double tax =0;
        if(salary<1000){
            System.out.println("vergi : 0" );
        }
         if(salary>=1000){
            tax = (salary*3/100);
        }
         return tax;
    }

    public double bonus(){
        double b=0;
        if(workHours>40){
             b=(workHours-40)*30;

        }
        return b;
    }

    public void raiseSalary(){
        if((2021-hireYear)<10){
            double c = salary*5/100;
            double newSalary1 = c + salary;
            System.out.println("Yeni Maaşınız : " + newSalary1);
        }
        if(9<(2021-hireYear) && (2021-hireYear)<20){
            double d = salary*10/100;
            double newSalary2 = d + salary;
            System.out.println("Yeni Maaşınız : " + newSalary2);
        }
        if((2021-hireYear)>19){
            double e = salary*15/100;
            double newSalary3 = e + salary;
            System.out.println("Yeni Maaşınız : " + newSalary3);
        }
    }

    public void printInfo(){
        System.out.println("Adı : " + name );
        System.out.println("Maaş : " + salary );
        System.out.println("Haftalık Saat : " + workHours );
        System.out.println("Başlangıç Yılı : " + hireYear );
        System.out.println("Verginiz :" +tax());
        System.out.println("Bonus : " + bonus());
        System.out.println("Vergisiz Bonuslu Maaş : " +(salary - tax() + bonus()));

    }

}
