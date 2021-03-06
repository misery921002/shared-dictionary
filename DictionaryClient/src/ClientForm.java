
import java.awt.Color;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class ClientForm extends javax.swing.JFrame {
    //socket used to connect server
    public Socket s=null;
    //input stream
    public DataInputStream in=null;
    //output stream
    public DataOutputStream out=null;
    /**
     * Creates new form ClientForm
     * @param ip
     * @param port
     */
    public ClientForm(String ip,String port) {
        initComponents();
        try{
            s=new Socket(ip, Integer.parseInt(port));  
            in=new DataInputStream(s.getInputStream());
            out=new DataOutputStream(s.getOutputStream());
            
        }catch (Exception e){
	   JOptionPane.showMessageDialog(null,  "Connect server failed!","Error", JOptionPane.ERROR_MESSAGE);
	}
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTFword = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTFmeaning = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DictionaryClient");

        jTFword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFwordActionPerformed(evt);
            }
        });

        btnAdd.setText("Add The Word");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete The Word");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnSearch.setText("Search The Work");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jLabel1.setText("Word");

        jLabel2.setText("Meaning");

        jTFmeaning.setColumns(20);
        jTFmeaning.setRows(5);
        jTFmeaning.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTFmeaningFocusGained(evt);
            }
        });
        jScrollPane1.setViewportView(jTFmeaning);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAdd)
                    .addComponent(btnDelete)
                    .addComponent(btnSearch)
                    .addComponent(jTFword, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTFword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDelete)
                        .addGap(18, 18, 18)
                        .addComponent(btnSearch)))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        //add word
        this.addWord(this.jTFword.getText(), this.jTFmeaning.getText());
            
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        //search word
        this.searchWord(this.jTFword.getText());
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        //delete word
        this.deleteWord(this.jTFword.getText());
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void jTFmeaningFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFmeaningFocusGained
        //set the color of the text
        this.jTFmeaning.setForeground(Color.black);
    }//GEN-LAST:event_jTFmeaningFocusGained

    private void jTFwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFwordActionPerformed
    /**
     * This method is used to add word to the dictionary.
     * @param word
     * @param meaning
     */
    public String addWord(String word,String meaning)
    {
        //verify the data
        if(this.jTFword.getText().indexOf("#")>0||this.jTFmeaning.getText().indexOf("#")>0)
        {
            JOptionPane.showMessageDialog(null, "Error", "Please do not include the character #!", JOptionPane.ERROR_MESSAGE);
            return "Error";
        }else if(this.jTFword.getText().equals(""))
        {
            this.showMessage("Please enter Word.", "error");
            return "Error";
        }else if(this.jTFmeaning.getText().equals(""))
        {
            this.showMessage("Please enter Meaning", "error");
            return "Error";
        }
        String message="add#";
        try {
            //Send a request to the server
            this.out.writeUTF(message+this.jTFword.getText()+"#"+this.jTFmeaning.getText());
            //Get the server response information
            String reply=in.readUTF();
            if(reply.split("#")[0].equals("error"))
            {
                //show the information on the textarea
                this.showMessage(reply.split("#")[1],"error");
            }else{
                //show the information on the textarea
                this.showMessage("Word added successfully.","success");
            }
        } catch (IOException ex) {
            //show the information on the popbox
            JOptionPane.showMessageDialog(null, "Error", "Connect server failed!", JOptionPane.ERROR_MESSAGE);
        }
        return "Success";
    }
    /**
     * This method is used to delete word to the dictionary.
     * @param word
     */
    public String deleteWord(String word)
    {
        //verify the data
        if(this.jTFword.getText().indexOf("#")>0||this.jTFmeaning.getText().indexOf("#")>0)
        {
            JOptionPane.showMessageDialog(null, "Error", "Please do not include the character #!", JOptionPane.ERROR_MESSAGE);
            return "Error";
        }else if(this.jTFword.getText().equals(""))
        {
            this.showMessage("Please enter Word.", "error");
            return "Error";
        }
        String message="delete#";
        try {
            //send message to the server
            this.out.writeUTF(message+this.jTFword.getText());
            //get the respones from server
            String reply=in.readUTF();
            if(reply.split("#")[0].equals("error"))
            {
                this.showMessage(reply.split("#")[1],"error");
            }else{
                this.showMessage("Word delete successfully.","success");
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error", "Connect server failed!", JOptionPane.ERROR_MESSAGE);
        }
        return "Success";
    }
    /**
     * This method is used to search word to the dictionary.
     * @param word
     */
    public String searchWord(String word)
    {
        if(this.jTFword.getText().indexOf("#")>0||this.jTFmeaning.getText().indexOf("#")>0)
        {
            JOptionPane.showMessageDialog(null, "Error", "Please do not include the character #!", JOptionPane.ERROR_MESSAGE);
            return "Error";
        }else if(this.jTFword.getText().equals(""))
        {
            this.showMessage("Please enter Word.", "error");
            return "Error";
        }
        String message="search#";
        try {
            //send message to the server
            this.out.writeUTF(message+this.jTFword.getText());
            //get the respones from server
            String reply=in.readUTF();
            if(reply.split("#")[0].equals("error"))
            {
                this.showMessage(reply.split("#")[1],"error");
            }else{
                this.showMessage(word+" means: "+reply.split("#")[1],"meaning");
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error", "Connect server failed!", JOptionPane.ERROR_MESSAGE);
        }
        return "Success";
    }
    /**
     * This method is used to show message on the text area.
     * @param mess
     * @param type
     */
    public void showMessage(String mess,String type)
    {
        this.jTFmeaning.setText(mess);
        switch(type)
        {
            case "error":
                 this.jTFmeaning.setForeground(Color.red);
                 break;
            case "success":
                this.jTFmeaning.setForeground(Color.green);
                break;
            case "meaning":
                this.jTFmeaning.setForeground(Color.black);
                break;
        }
       
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTFmeaning;
    private javax.swing.JTextField jTFword;
    // End of variables declaration//GEN-END:variables
}
