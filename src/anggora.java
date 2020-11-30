/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author puput
 */
public class anggora extends kucing{
   String ID, namahewan, keterangan, jenis;
 
    public void ID(){
        ID="121";
    }
    public void namahewan(){
        namahewan="Anggora";     
    }
    public void keterangan(){
        keterangan="Memiliki bulu selembut sutera";
    }
    public void jenis(){
        jenis="Kucing";
    }
    public void cetakdata(){
        System.out.println("ID = "+ID);
        System.out.println("Nama Hewan = "+namahewan);
        System.out.println("Keterangan = "+keterangan);
        System.out.println("Jenis = "+jenis);
    }
}
