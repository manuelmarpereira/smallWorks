/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auxiliar;

/**
 *
 * @author PC
 */
public class Estatisticas {
    
    private int iduser;
    private int totalOffersCreator;
    private double wintotalOffersCreator;
    private int totalOffersWorker;
    private double wintotalOffersWorker;
    private double diference;

    public int getIduser() {
        return iduser;
    }

    public int getTotalOffersCreator() {
        return totalOffersCreator;
    }

    public double getWintotalOffersCreator() {
        return wintotalOffersCreator;
    }

    public int getTotalOffersWorker() {
        return totalOffersWorker;
    }

    public double getWintotalOffersWorker() {
        return wintotalOffersWorker;
    }

    public double getDiference() {
        return diference;
    }

    public void setIduser(int iduser) {
        this.iduser = iduser;
    }

    public void setTotalOffersCreator(int totalOffersCreator) {
        this.totalOffersCreator = totalOffersCreator;
    }

    public void setWintotalOffersCreator(double wintotalOffersCreator) {
        this.wintotalOffersCreator = wintotalOffersCreator;
    }

    public void setTotalOffersWorker(int totalOffersWorker) {
        this.totalOffersWorker = totalOffersWorker;
    }

    public void setWintotalOffersWorker(double wintotalOffersWorker) {
        this.wintotalOffersWorker = wintotalOffersWorker;
    }

    public void setDiference(double diference) {
        this.diference = diference;
    }
    
    
}
