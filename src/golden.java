/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author puput
 */
public class golden extends anjing{
    String ID, namahewan, keterangan, jenis;
 
    public void ID(){
        ID="132";
    }
    public void namahewan(){
        namahewan="Golden";     
    }
    public void keterangan(){
        keterangan="Merupakan anjing intelijen yang serba guna";
    }
    public void jenis(){
        jenis="Anjing";
    }
    public void cetakdata(){
        System.out.println("ID = "+ID);
        System.out.println("Nama Hewan = "+namahewan);
        System.out.println("Keterangan = "+keterangan);
        System.out.println("Jenis = "+jenis);
    }
}
