/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emmastewartgui;

/**
 *
 * @author Emma
 */
public class frmWrktRun extends javax.swing.JPanel {

    /**
     * Creates new form frmWrktRun
     */
    public frmWrktRun() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTimer = new javax.swing.JLabel();
        pnlCurrentSet = new javax.swing.JPanel();
        lblSetType = new javax.swing.JLabel();
        lblCurrentReps = new javax.swing.JLabel();
        lblCurrentBy = new javax.swing.JLabel();
        lblCurrentNumberOfMeters = new javax.swing.JLabel();
        lblCurrentMeters = new javax.swing.JLabel();
        lblCurrentStrokeType = new javax.swing.JLabel();
        lblCurrentOn = new javax.swing.JLabel();
        lblCurrentSetTime = new javax.swing.JLabel();
        pnlComingUp = new javax.swing.JPanel();
        lblComingUp = new javax.swing.JLabel();
        lblCUReps = new javax.swing.JLabel();
        lblCUBy = new javax.swing.JLabel();
        lblCUNumberOfMeters = new javax.swing.JLabel();
        lblCUMeters = new javax.swing.JLabel();
        lblCUStrokeType = new javax.swing.JLabel();
        lblCUOn = new javax.swing.JLabel();
        lblCUSetTime = new javax.swing.JLabel();

        lblTimer.setText("00:00.00 ");

        lblSetType.setText("Mainset: ");

        lblCurrentReps.setText("#");

        lblCurrentBy.setText("x");

        lblCurrentNumberOfMeters.setText("#");

        lblCurrentMeters.setText("m");

        lblCurrentStrokeType.setText("FR");

        lblCurrentOn.setText("on");

        lblCurrentSetTime.setText("00:00");

        javax.swing.GroupLayout pnlCurrentSetLayout = new javax.swing.GroupLayout(pnlCurrentSet);
        pnlCurrentSet.setLayout(pnlCurrentSetLayout);
        pnlCurrentSetLayout.setHorizontalGroup(
            pnlCurrentSetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCurrentSetLayout.createSequentialGroup()
                .addGap(222, 222, 222)
                .addComponent(lblSetType)
                .addGap(18, 18, 18)
                .addComponent(lblCurrentReps, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCurrentBy, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCurrentNumberOfMeters, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCurrentMeters, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(lblCurrentStrokeType, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCurrentOn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCurrentSetTime, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(281, Short.MAX_VALUE))
        );
        pnlCurrentSetLayout.setVerticalGroup(
            pnlCurrentSetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCurrentSetLayout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addGroup(pnlCurrentSetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSetType, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCurrentReps)
                    .addComponent(lblCurrentBy)
                    .addComponent(lblCurrentNumberOfMeters)
                    .addComponent(lblCurrentMeters)
                    .addComponent(lblCurrentStrokeType)
                    .addComponent(lblCurrentOn)
                    .addComponent(lblCurrentSetTime))
                .addGap(42, 42, 42))
        );

        lblComingUp.setText("Coming up:");

        lblCUReps.setText("#");

        lblCUBy.setText("x");

        lblCUNumberOfMeters.setText("#");

        lblCUMeters.setText("m");

        lblCUStrokeType.setText("FR");

        lblCUOn.setText("on");

        lblCUSetTime.setText("00:00");

        javax.swing.GroupLayout pnlComingUpLayout = new javax.swing.GroupLayout(pnlComingUp);
        pnlComingUp.setLayout(pnlComingUpLayout);
        pnlComingUpLayout.setHorizontalGroup(
            pnlComingUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlComingUpLayout.createSequentialGroup()
                .addGap(222, 222, 222)
                .addComponent(lblComingUp)
                .addGap(18, 18, 18)
                .addComponent(lblCUReps, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCUBy, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCUNumberOfMeters, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCUMeters, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(lblCUStrokeType, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCUOn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCUSetTime, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(260, Short.MAX_VALUE))
        );
        pnlComingUpLayout.setVerticalGroup(
            pnlComingUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlComingUpLayout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addGroup(pnlComingUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCUReps)
                    .addComponent(lblCUBy)
                    .addComponent(lblCUNumberOfMeters)
                    .addComponent(lblCUMeters)
                    .addComponent(lblCUStrokeType)
                    .addComponent(lblCUOn)
                    .addComponent(lblCUSetTime)
                    .addComponent(lblComingUp, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblTimer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlCurrentSet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(pnlComingUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(lblTimer, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlCurrentSet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlComingUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblCUBy;
    private javax.swing.JLabel lblCUMeters;
    private javax.swing.JLabel lblCUNumberOfMeters;
    private javax.swing.JLabel lblCUOn;
    private javax.swing.JLabel lblCUReps;
    private javax.swing.JLabel lblCUSetTime;
    private javax.swing.JLabel lblCUStrokeType;
    private javax.swing.JLabel lblComingUp;
    private javax.swing.JLabel lblCurrentBy;
    private javax.swing.JLabel lblCurrentMeters;
    private javax.swing.JLabel lblCurrentNumberOfMeters;
    private javax.swing.JLabel lblCurrentOn;
    private javax.swing.JLabel lblCurrentReps;
    private javax.swing.JLabel lblCurrentSetTime;
    private javax.swing.JLabel lblCurrentStrokeType;
    private javax.swing.JLabel lblSetType;
    private javax.swing.JLabel lblTimer;
    private javax.swing.JPanel pnlComingUp;
    private javax.swing.JPanel pnlCurrentSet;
    // End of variables declaration//GEN-END:variables
}
