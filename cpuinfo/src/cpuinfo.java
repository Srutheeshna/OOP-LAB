import java.util.Scanner;
public class cpuinfo {
    float price;
    cpuinfo(){
        price=0;
    }
    public void cinput(){
        Scanner reader=new Scanner(System.in);
        System.out.print("Enter the price of cpu: ");
        price=reader.nextFloat();
    }
}
class processor extends cpuinfo{
    String manufacturer;
    int cores;
    processor(){
        manufacturer=" ";
        cores=0;
    }
    public void pinput(){
        Scanner reader=new Scanner(System.in);
        System.out.print("Enter the number of cores: ");
        cores=reader.nextInt();
        System.out.print("Enter the manufacturer: ");
        manufacturer=reader.next();
    }
}
class RAM extends processor{
    String manuf;
    int memory;
    RAM(){
        manuf=" ";
        memory=0;
    }
    public void rinput(){
        Scanner reader=new Scanner(System.in);
        System.out.print("Enter the memory: ");
        memory=reader.nextInt();
        System.out.print("Enter the manufacturer: ");
        manuf=reader.next();
    }
    public static void main(String[] args) {
    RAM r=new RAM();
    r.cinput();
    r.pinput();
    r.rinput();
    System.out.println("\nDETAILS: ");
    System.out.println("Price of CPU: "+r.price);
    System.out.println("Number of cores: "+r.cores);
    System.out.println("Manufacturer of processor: "+r.manufacturer);
    System.out.println("RAM Memory: "+r.memory);
    System.out.println("RAM Manufacturer: "+r.manuf);
    }
}