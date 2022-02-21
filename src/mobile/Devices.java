/*
 * @autor Francisco Bañuelos.
 */
package trucos.mobile;

class Devices {
    String website;

    void setValues(String website){
        this.website = website;
    }
    void display(){
        System.out.println("Company :" + this.website);
    }
}
class DeviceMobile extends Devices {
    int no;
    String name, color, noSerial;
    float price;

    void setMobileValues(int no, String name, String color, String noSerial, float price){
        this.no = no;
        this.name = name;
        this.color = color;
        this.noSerial = noSerial;
        this.price = price;
    }
    void displayMobile(){
        System.out.println("no:"+this.no);
        System.out.println("name:"+this.name);
        System.out.println("color: "+this.color);
        System.out.println("Serial:"+this.noSerial);
        System.out.println("Serial:"+this.price);
    }
}
class Laptop extends Devices {
    int ram, hdd;
    String mark, color, noSerial, model, proccesor;
    float price;


    void setLaptopValues(int ram, int hdd, String mark, String color, String noSerial, String model, String proccesor, float price){
        this.ram = ram;
        this.hdd = hdd;
        this.mark = mark;
        this.model = model;
        this.color = color;
        this.noSerial = noSerial;
        this.proccesor = proccesor;
        this.price = price;
    }
    void displayLaptop(){
        System.out.println("ram:"+this.ram);
        System.out.println("hdd:"+this.hdd);
        System.out.println("color: "+this.color);
        System.out.println("Serial:"+this.noSerial);
        System.out.println("model: "+this.model);
        System.out.println("procesor:"+this.proccesor);
        System.out.println("price: "+this.price);
        System.out.println("mark: "+this.mark);

    }
}
class ElectronicDevmain{
    public static void main(String []args){

        DeviceMobile mobile = new DeviceMobile();
        mobile.setMobileValues(432,"Samsung","White","DJKKJS-49493D-JSJSH",7000);
        mobile.setValues("www.company.com");
        mobile.display();
        mobile.displayMobile();

        Laptop lap = new Laptop();
        lap.setLaptopValues(8,2,"Lenovo","Black","HSKFKFKD-283483-DJDJS-264","ThinkPad","intel CORE i5",20000);
        lap.displayLaptop();
    }
}

