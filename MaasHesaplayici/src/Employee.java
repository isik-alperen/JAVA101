public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;

    Employee(String isim, int maas, int calismaSaati, int girisYili){
        this.name=isim;
        this.salary=maas;
        this.workHours=calismaSaati;
        this.hireYear= girisYili;
    }
    public int tax(int maas){
        maas=this.salary;
        if(maas>1000){
            int a;
            a=(maas*3/100);
            return a;

        }
        return 0;

    }
    public int bonus(int saat){
        saat=this.workHours;
        if(saat>40){
            return ((saat-40)*30);
        }
        return 0;
    }
    public int raiseSalary(int yil){
        yil = this.hireYear;
        if((2021-yil)<10){
            return this.salary*5/100;
        }
        if((2021-yil>10) && (2021 -yil<20) ){
            return this.salary*10/100;
        }
        return this.salary*15/100;

    }
    public void tString(){
        int a;
        a= tax(this.salary);
        System.out.println("Adi: "+this.name+"\nCalisma Saati: "+this.workHours+"\nBaslangic yili: "+this.hireYear+"\nMaas: "+this.salary);
        System.out.println("Vergi: "+this.tax(this.salary)+"\nBonus: "+this.bonus(this.workHours)+"\nMaas Artisi: "+this.raiseSalary(this.hireYear));
        System.out.println("Vergi ve Bonuslar ile maas: "+((this.salary)+this.bonus(this.workHours)+this.raiseSalary(this.hireYear)-a));
    }

}
