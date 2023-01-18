package com.example.telefoanele;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.*;

public class HelloController implements Initializable {

    @FXML
    private Button AddMobil;
    @FXML
    private Button AddFix;
    @FXML
    private Button AddPublic;
    @FXML
    private Button ShowMobil;
    @FXML
    private Button ShowFix;
    @FXML
    private Button ShowPublic;

    List<TelefonMobil> listaTelMobile = new ArrayList<TelefonMobil>();

    List<TelefonFix> listaTelFixe = new ArrayList<TelefonFix>();

    List<TelefonPublic> listaTelPublice = new ArrayList<TelefonPublic>();

    List<String> sistemeDeOperare = Arrays.asList("Android", "IOS", "Windows Mobile");

    List<String> modeleTelefon = Arrays.asList("Samsung", "Nokia", "iPHONE", "Huwaei", "Motorola", "HTC", "OCB");
    List<String> culoriTelefoane = Arrays.asList("negru", "roz", "albastru", "turcuaz", "alb", "gri", "maro", "verde", "galben", "portocaliu");
    List<String> dimensiuniTelefon = Arrays.asList("1 inch", "2 inch", "3 inch");
    List<String> sanatateBaterie = Arrays.asList("buna", "proasta");
    List<String> procesoareTelefon = Arrays.asList("Intel Core", "Bionic hH", "Bionic Hands", "Picior de metal", "AMRadeiOn");

    @FXML
    private ListView<TelefonMobil> Id1;
    @FXML
    private ListView<TelefonFix> Id2;
    @FXML
    private ListView<TelefonPublic> Id3;

    @FXML
    public void OnAddTelMobil(){
        Random random = new Random();

        TelefonMobil tel = new TelefonMobil();
        tel.calitateFoto = random.nextInt(50);
        tel.pret = random.nextInt(1000, 5000);
        tel.sistemDeOperare = sistemeDeOperare.get(random.nextInt(0, sistemeDeOperare.size()));
        tel.model = modeleTelefon.get(random.nextInt(0, modeleTelefon.size()));
        tel.setCuloareTelefon(culoriTelefoane.get(random.nextInt(0, culoriTelefoane.size())));
        tel.setDimensiuniTelefon(dimensiuniTelefon.get(random.nextInt(0, dimensiuniTelefon.size())));
        tel.setProcesorTelefon(procesoareTelefon.get(random.nextInt(0, procesoareTelefon.size())));
        tel.setSanatateBaterie(sanatateBaterie.get(random.nextInt(0, sanatateBaterie.size())));

        addTelMobil(listaTelMobile, tel);
        Id1.getItems().setAll(listaTelMobile);

        try {
            FileOutputStream fos1 = new FileOutputStream("telMobile.txt");
            for (TelefonMobil i : listaTelMobile) {
                byte[] bytes = i.toString().getBytes();
                fos1.write(bytes);
            }
            fos1.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void OnAddTelFix(){
        Random random = new Random();

        TelefonFix tel = new TelefonFix();
        tel.calitateFoto = random.nextInt(50);
        tel.pret = random.nextInt(1000, 5000);
        tel.sistemDeOperare = sistemeDeOperare.get(random.nextInt(0, sistemeDeOperare.size()));
        tel.model = modeleTelefon.get(random.nextInt(0, modeleTelefon.size()));
        tel.setCuloareTelefon(culoriTelefoane.get(random.nextInt(0, culoriTelefoane.size())));
        tel.setRazaDeActiune(random.nextInt(0, 20));

        addTelFix(listaTelFixe, tel);
        Id2.getItems().setAll(listaTelFixe);

        try {
            FileOutputStream fos1 = new FileOutputStream("telFixe.txt");
            for (TelefonFix i : listaTelFixe) {
                byte[] bytes = i.toString().getBytes();
                fos1.write(bytes);
            }
            fos1.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void OnAddTelPublic(){
        Random random = new Random();

        TelefonPublic tel = new TelefonPublic();
        tel.calitateFoto = random.nextInt(50);
        tel.pret = random.nextInt(1000, 5000);
        tel.sistemDeOperare = sistemeDeOperare.get(random.nextInt(0, sistemeDeOperare.size()));
        tel.model = modeleTelefon.get(random.nextInt(0, modeleTelefon.size()));
        tel.setCuloareTelefon(culoriTelefoane.get(random.nextInt(0, culoriTelefoane.size())));
        tel.setDimensiuneaCabinei(random.nextInt(0, 5));
        tel.setDimensiuniTelefon(dimensiuniTelefon.get(random.nextInt(0, dimensiuniTelefon.size())));
        tel.setSanatateBaterie(sanatateBaterie.get(random.nextInt(0, sanatateBaterie.size())));

        addTelPublic(listaTelPublice, tel);
        Id3.getItems().setAll(listaTelPublice);

        try {
            FileOutputStream fos1 = new FileOutputStream("telPublice.txt");
            for (TelefonPublic i : listaTelPublice) {
                byte[] bytes = i.toString().getBytes();
                fos1.write(bytes);
            }
            fos1.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void onShowMobilList(){
        Id1.setVisible(true);
    }
    @FXML
    public void onShowFixList(){
        Id2.setVisible(true);
    }
    @FXML
    public void onShowPublicList(){
        Id3.setVisible(true);
    }
    public void addTelMobil(List<TelefonMobil> listaTelMobil, TelefonMobil tel){
        listaTelMobil.add(tel);

    }
    public void addTelFix(List<TelefonFix> listaTelFixe, TelefonFix tel){
        listaTelFixe.add(tel);

    }
    public void addTelPublic(List<TelefonPublic> listaTelPublice, TelefonPublic tel) {
        listaTelPublice.add(tel);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Id3.setVisible(false);
        Id2.setVisible(false);
        Id1.setVisible(false);
    }

    public List<TelefonMobil> getListaTelMobile() {
        return listaTelMobile;
    }

    public List<TelefonFix> getListaTelFixe() {
        return listaTelFixe;
    }

    public List<TelefonPublic> getListaTelPublice() {
        return listaTelPublice;
    }
}