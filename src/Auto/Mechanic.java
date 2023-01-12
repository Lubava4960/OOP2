package Auto;

public  class Mechanic<T extends Transport > {
    private String name;
    private String LastName;
    private String company;
    private String workAuto;

    public Mechanic(String name, String lastName, String company, String workAuto) {
        if (name == null) {
            this.name = "defoult";
        } else {
            this.name = name;
        }
        if (lastName == null) {
            this.LastName = "defoult";
        } else {
            this.LastName = lastName;
        }
        if (company == null) {
            this.company = "defoult";
        } else {
            this.company = company;
        }
        if (workAuto == null) {
            this.workAuto = "defoult";
        } else {
            this.workAuto = workAuto;
        }

    }
        public String toString () {
            return "Механик{" +
                    "Имя - " + name + '\'' +
                    ", Фамилия - " + LastName + '\'' +
                    ", Компания - " + company + '\'' +
                    " Авто с которым работает механик - "+ workAuto + '\'' +
                    '}';
        }

    public void MaintenanceAuto() {
        System.out.println("Принять авто  сервис, провести диагнотику двигателя. ");
    }

    public void RepairAuto() {

        System.out.println(" Починить авто. ");
    }
    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {

        LastName = lastName;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getWorkAuto() {
        return workAuto;
    }

    public void setWorkAuto(String workAuto) {
        this.workAuto = workAuto;
    }
}