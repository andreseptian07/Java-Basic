package com.xirpldua.latihanbasic;

import com.xirpldua.latihanbasic.kendaraan.Kereta;
import com.xirpldua.latihanbasic.kendaraan.Mobil;
import com.xirpldua.latihanbasic.kendaraan.Motor;
import com.xirpldua.latihanbasic.music.Gitar;
import org.apache.commons.lang3.time.DateUtils;

import java.util.Date;

public class MainPackage {
    public static void main(String[] args) {
        System.out.println("ini adalah main package");
        Gitar.bunyi();

        Gitar.bunyi();

        Motor.jumlahBan();
        Mobil.jumlahBan();
        Kereta.jumlahBan();

        Date hariini = new Date();
        System.out.println("Hari ini : " + hariini);
        Date haribesok = DateUtils.addDays(hariini, 1);
        System.out.println("Hari Besok : " + haribesok);
    }
}
