package Teori_PBO;

import Teori_PBO.Cpu.Komputer;
import Teori_PBO.Cpu.Komputer.Harddisk;
import Teori_PBO.Cpu.Komputer.Harddisk.Motherboard;

public class Main {
    public static void main(String[] args) {
                // buat object CPU
        Cpu myKomputer = new Cpu(15000000, "Lenovo");

        Cpu.Processor i7 = myKomputer.new Processor(8, "Intel", "i7");

        Cpu.RAM rs32GB = myKomputer.new RAM(32, "Samsung");

        myKomputer.getCPUInfo();
        i7.getProcessorInfo();
        rs32GB.getInfoRAM();
        System.out.println();
       Cpu.Komputer Gaming = myKomputer.new Komputer("pc Gaming" , 1);
        Gaming.showInfo();
        Cpu.Komputer.Harddisk Sata = Gaming.new Harddisk("Harrdisk Sata",500,"GB",500000);
        Sata.GetInfoHardisk();
        System.out.println();
        Cpu.Komputer.Harddisk.Motherboard motherboard = Sata.new Motherboard("Micro-ATX (mATX)",5000000,"DDR4");
        motherboard.GetInfoMotherboard();
        System.out.println();
        Cpu.Komputer.Harddisk.Motherboard.PowerSupply PS = motherboard.new PowerSupply("ATX Power Supply", 500000);
        PS.GetInfoPowerSupply();
        System.out.println();
        Cpu.Komputer.Harddisk.Motherboard.PowerSupply.VGACard VGA = PS.new VGACard("Radeon RX Series", 400000);
        VGA.GetInfoVGA();
    }
}
