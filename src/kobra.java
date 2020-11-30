/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author puput
 */
public class kobra extends ular{
    String ID, namahewan, keterangan, jenis;
 
    public void ID(){
        ID = "211" ;
    }
    public void namahewan(){
        namahewan = "Kobra";
    }
    public void keterangan(){
        keterangan = "Merupakan hewan yang sangat membahayakan";
    }
    public void jenis(){
        jenis = "reptil";
    }
    public void cetakdata(){
        System.out.println("ID = "+ID);
        System.out.println("Nama Hewan = "+namahewan);
        System.out.println("Keterangan = "+keterangan);
        System.out.println("Jenis = "+jenis);
    }
}
