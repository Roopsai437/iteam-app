package com.dxctraining.ui;

import com.dxctraining.entities.Iteam;
import com.dxctraining.exceptions.IteamNotFoundException;
import com.dxctraining.exceptions.InvalidArgumentException;
import com.dxctraining.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Ui {
    @Autowired
    private Service service;


    @PostConstruct
    public void runUi(){
        try {
        	Iteam iteam1 = new Iteam("pen", );
        	Iteam iteam2 = new Iteam("book");
        	iteam1 = service.save(iteam1);
        	iteam2 = service.save(iteam2);

            int id1 = iteam1.getId();
            Iteam fetched = service.findIteamById(id1);
            System.out.println("fetcehd iteam =" + fetched.getName() );
        }catch (IteamNotFoundException e){
            e.printStackTrace();
        }

        catch (InvalidArgumentException e){
            e.printStackTrace();
        }
    }



}
