/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;

import java.util.HashMap;


public class PanelStatus extends javax.swing.JLayeredPane {


    private final HashMap<Integer, PanelStatus_Item> list = new HashMap<>();

    public PanelStatus() {
        initComponents();
    }

    public void addItem(int fileID, String fileName, String fileSize) {
        PanelStatus_Item item = new PanelStatus_Item();
        item.setFile(fileName, fileSize);
        list.put(fileID, item);
        this.add(item);
        this.repaint();
        this.revalidate();
    }

    public void updateStatus(int fileID, int values) {
        list.get(fileID).showStatus(values);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setOpaque(true);
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.Y_AXIS));
    }// </editor-fold>//GEN-END:initComponents



}
