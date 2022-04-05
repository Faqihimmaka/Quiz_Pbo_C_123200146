
package kuis_pbo_c_123200146;

import Acara.lombaAnimasi;

public class seleksiAnimasi implements lombaAnimasi{
    double a,k,anim,s;
    String keterangan;
    double hasil;
    
    public seleksiAnimasi(double Alur, double Konten, double Kreatifanimasi, double Sinema) {
        this.a = Alur;
        this.k = Konten;
        this.anim = Kreatifanimasi;
        this.s = Sinema;
    }
    
     @Override
    public double Alur() {
        a = a*0.15;
        return a;
    }

    @Override
    public double Konten() {
        k = k*0.35;
        return k;
    }

    @Override
    public double Kreatif() {
        anim = anim*0.35;
        return anim;
    }

    @Override
    public double Sinema() {
        s = s*0.15;
        return s;
    }

    @Override
    public double hasil() {
        hasil = Alur()+Konten()+Kreatif()+Sinema();
        return hasil;
    }   
    
 
}
