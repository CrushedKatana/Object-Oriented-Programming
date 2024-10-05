package Week5.EX2;

import Week5.EX1.ClassA;

public class ClassB extends Week5.EX2.ClassA {
    public int z;

    public void setZ(int z){
        this.z = z;
    }

    public void getNilaiZ(){
        System.out.println("nilai Z: "+ z);
    }

    public void getJumlah (){
        System.out.println("jumblah: "+ (x+y+z) );
    }
}
