
package kuis_pbo_c_123200146;

import Acara.lombaSurat;

public class seleksiSurat implements lombaSurat{
    double struktur,isi,KreatifSurat,bahasa;
    double hasil;
    public seleksiSurat(double struktur, double isi, double KreatifSurat, double bahasa) {
        this.struktur = struktur;
        this.isi = isi;
        this.KreatifSurat = KreatifSurat;
        this.bahasa = bahasa;
    }
    
    @Override
    public double struktur() {
        struktur = (struktur*10)/100;
        return struktur;
    }

    @Override
    public double isi() {
        isi = (isi*40)/100;
        return isi;
    }

    @Override
    public double kreatif() {
        KreatifSurat = (KreatifSurat*30)/100;
        return KreatifSurat;
    }

    @Override
    public double bahasa() {
        bahasa = (bahasa*20)/100;
        return bahasa;
    }

    public double hasil() {
        hasil = struktur() + isi() + kreatif() + bahasa();
        return hasil;
    }
    
}
