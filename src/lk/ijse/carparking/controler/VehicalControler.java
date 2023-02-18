/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lk.ijse.carparking.controler;

import lk.ijse.carparking.vehicalinterface.BicycleFrame;
import lk.ijse.carparking.vehicalinterface.BusFrame;
import lk.ijse.carparking.vehicalinterface.CarFrame;
import lk.ijse.carparking.vehicalinterface.VanFrame;

/**
 *
 * @author Evolution CS
 */
public class VehicalControler {
   private BusFrame busFrame;
   private VanFrame vanFrame;
   private BicycleFrame byciFrame;
   private CarFrame carFrame;
    
   public void setbusFrame(BusFrame busFrame){
   this.busFrame=busFrame;
   busFrame.setVisible(true);
   
   }
   public void setVanFrame(VanFrame vanFrame){
   this.vanFrame=vanFrame;
   vanFrame.setVisible(true);
   
   }
   public void setBicycleframe(BicycleFrame byciFrame){
   this.byciFrame=byciFrame;
   byciFrame.setVisible(true);
   }
   
   public void setcarFrame(CarFrame car){
   this.carFrame=car;
          carFrame.setVisible(true);
       
   }
   public void setMemmber(int count,int x){
       System.out.println("member selected");
       if(x==2){
       carFrame.setCarCount(count);
       }
       else if(x==1){
       busFrame.setBusCount(count);
       }
       else if(x==3){
       vanFrame.setVanCount(count);
       }
       else if(x==4){
       byciFrame.setBicycleCount(count);
       }
       
   }
}
