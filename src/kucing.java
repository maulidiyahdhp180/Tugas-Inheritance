/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author puput
 */
public class kucing extends mamalia{
    String ID, namahewan, keterangan, jenis;
 
    public void ID(){
        ID="120";
    }
    public void namahewan(){
        namahewan="Kucing";     
    }
    public void keterangan(){
        keterangan="Merupakan hewan berkaki empat yang pemalas";
    }
    public void jenis(){
        jenis="Mamalia";
    }
    public void cetakdata(){
        System.out.println("ID = "+ID);
        System.out.println("Nama Hewan = "+namahewan);
        System.out.println("Keterangan = "+keterangan);
        System.out.println("Jenis = "+jenis);
    }
}
