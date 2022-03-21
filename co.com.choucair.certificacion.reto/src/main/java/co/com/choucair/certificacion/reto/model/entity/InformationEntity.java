package co.com.choucair.certificacion.reto.model.entity;

import co.com.choucair.certificacion.reto.model.Information;

import java.util.List;

public class InformationEntity {

    public static Information info = new Information();

    public static Information getInformation(){
        return info;
    }

    public static void setInformation(List<String> Information){
        info.setFirst_name(Information.get(0));
        info.setLast_name(Information.get(1));
        info.setAddress(Information.get(2));
        info.setEmail_address(Information.get(3));
        info.setPhone(Information.get(4));
        info.setGender(Information.get(5));
        info.setHobbies(Information.get(6));
        info.setLanguages(Information.get(7));
        info.setSkills(Information.get(8));
        info.setCountry(Information.get(9));
        info.setSelect_country(Information.get(10));
        info.setYear(Information.get(11));
        info.setMonth(Information.get(12));
        info.setDay(Information.get(13));
        info.setPassword(Information.get(14));
        info.setConfirm_password(Information.get(15));
    }
}
