
import java.util.ArrayList;
import javax.swing.ButtonGroup;

/**
     * Class Name: GUI
     * Class Author: Tyler Hockett
     * **************************
     * Purpose of the Class
     * ineract with the user to load
     * words into the binarytree
     * **************************
     * Date: 10/1/2017 USA
     * **************************
     * Date Changed:10/3/2017
     * 10/7/2017
     * **************************
     * Look At This!
     * I was having trouble adding the 
     * objects to the list..It was giving me
     * a number format issue for my integer values.
     * And when i initilize the StoreItems, I parse
     * the text from the boxes into the inposition in the 
     * constructors...I input 50 and it throws an exception.
     * IF i am doing something incorrectly please let me know
     * on line 344
     * **************************
     */
public class Gui extends javax.swing.JFrame {

    ArrayList<StoreItem> list=new ArrayList<StoreItem>();
    StoreItem book;
    StoreItem movie;
    StoreItem painting;
    public Gui() {
        initComponents();
        groupButtons();
        lblWidth.setVisible(false);
        lblHeight.setVisible(false);
        txtWidth.setVisible(false);
        txtHeight.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.ButtonGroup();
        radBook = new javax.swing.JRadioButton();
        radMovie = new javax.swing.JRadioButton();
        radPainting = new javax.swing.JRadioButton();
        txtTitle = new javax.swing.JTextField();
        txtAuthor = new javax.swing.JTextField();
        txtDate = new javax.swing.JTextField();
        txtType = new javax.swing.JTextField();
        txtAsking = new javax.swing.JTextField();
        txtWidth = new javax.swing.JTextField();
        txtHeight = new javax.swing.JTextField();
        txtPurchase = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblType = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblHeight = new javax.swing.JLabel();
        lblWidth = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        lblWarning = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAItems = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        btnGetAll = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        radBook.setSelected(true);
        radBook.setText("Book");
        radBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radBookActionPerformed(evt);
            }
        });

        radMovie.setText("Movie");
        radMovie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radMovieActionPerformed(evt);
            }
        });

        radPainting.setText("Painting");
        radPainting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radPaintingActionPerformed(evt);
            }
        });

        jLabel1.setText("Title:");

        jLabel2.setText("Date Acquired: (MM/dd/yyyy)");

        jLabel3.setText("Author:");

        lblType.setText("Genre:");

        jLabel4.setText("Purchased for:");

        jLabel5.setText("Asking:");

        lblHeight.setText("Height:");

        lblWidth.setText("Width:");

        btnAdd.setText("Add to Inventory");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnRemove.setText("Sold Item");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        btnSearch.setText("Search (Title)");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        txtAItems.setColumns(20);
        txtAItems.setRows(5);
        jScrollPane1.setViewportView(txtAItems);

        jLabel6.setText("Inventory:");

        btnGetAll.setText("Get All Items");
        btnGetAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetAllActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(radBook)
                                .addGap(89, 89, 89)
                                .addComponent(radMovie)
                                .addGap(86, 86, 86)
                                .addComponent(radPainting))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(txtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(44, 44, 44)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(txtAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtAsking, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addGap(77, 77, 77)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtPurchase)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtHeight)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(lblHeight)
                                                .addGap(92, 92, 92)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblWidth)
                                            .addComponent(txtWidth, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(42, 42, 42)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtDate))
                                        .addGap(53, 53, 53)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblType)
                                            .addComponent(txtType, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(68, 68, 68)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnSearch)
                                                .addGap(53, 53, 53)
                                                .addComponent(btnGetAll))))))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnAdd)
                        .addGap(30, 30, 30)
                        .addComponent(btnRemove))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(lblWarning))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 707, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radBook)
                    .addComponent(radMovie)
                    .addComponent(radPainting))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblType)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAsking, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPurchase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHeight)
                    .addComponent(lblWidth))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtWidth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnRemove)
                    .addComponent(btnSearch)
                    .addComponent(btnGetAll))
                .addGap(51, 51, 51)
                .addComponent(lblWarning)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                .addGap(41, 41, 41))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 /**
     * Method Name: radBookActionPerformed
     * Method Author: Tyler Hockett
     * **************************
     * Purpose of the method
     * adjusts the visible lables and 
     * textboxes as nessecary
     * **************************
     * Date: 10/3/2017 USA
     * **************************
     *
     */
    private void radBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radBookActionPerformed
        lblWidth.setVisible(false);
        lblHeight.setVisible(false);
        txtWidth.setVisible(false);
        txtHeight.setVisible(false);
        lblType.setText("Genre:");
    }//GEN-LAST:event_radBookActionPerformed
 /**
     * Method Name: radMovieActionPerformed
     * Method Author: Tyler Hockett
     * **************************
     * Purpose of the method
     * adjusts the visible lables and 
     * textboxes as nessecary
     * **************************
     * Date: 10/3/2017 USA
     * **************************
     *
     */
    private void radMovieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radMovieActionPerformed
        lblWidth.setVisible(false);
        lblHeight.setVisible(false);
        txtWidth.setVisible(false);
        txtHeight.setVisible(false);
        lblType.setText("Director:");
    }//GEN-LAST:event_radMovieActionPerformed
 /**
     * Method Name: radPaintingActionPerformed
     * Method Author: Tyler Hockett
     * **************************
     * Purpose of the method
     * adjusts the visible lables and 
     * textboxes as nessecary
     * **************************
     * Date: 10/3/2017 USA
     * **************************
     *
     */
    private void radPaintingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radPaintingActionPerformed
        lblWidth.setVisible(true);
        lblHeight.setVisible(true);
        txtWidth.setVisible(true);
        txtHeight.setVisible(true);
        lblType.setText("Media:");
    }//GEN-LAST:event_radPaintingActionPerformed
 /**
     * Method Name: radAddActionPerformed
     * Method Author: Tyler Hockett
     * **************************
     * Purpose of the method
     *add a object to the list depeding
     * on what radio button is selected.
     * **************************
     * Date: 10/3/2017 USA
     * **************************
     * this is the section I am having conversion errors in
     */
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        try
        {
             if(radBook.isSelected())
            {
                book = new Book(txtTitle.getText(), txtAuthor.getText(), txtDate.getText(),Integer.parseInt(txtAsking.getText()), Integer.parseInt(txtPurchase.getText()),txtType.getText());
                list.add(book);
            }
             else if(radMovie.isSelected())
            {
                movie = new Movie(txtTitle.getText(), txtAuthor.getText(), txtDate.getText(),Integer.parseInt(txtAsking.getText()), Integer.parseInt(txtPurchase.getText()),txtType.getText());
                list.add(movie);
            }
            else if(radPainting.isSelected())
            {
                painting = new Painting(txtTitle.getText(), txtAuthor.getText(), txtDate.getText(),Integer.parseInt(txtAsking.getText()), Integer.parseInt(txtPurchase.getText()),Integer.parseInt(txtHeight.getText()),Integer.parseInt(txtWidth.getText()),txtType.getText());
                list.add(painting);
            }
        }
        catch(Exception e)
        {
          lblWarning.setText("Couldn't add that item. Please make sure all categories are correct.");
        }
       
    }//GEN-LAST:event_btnAddActionPerformed
 /**
     * Method Name: radRemoveActionPerformed
     * Method Author: Tyler Hockett
     * **************************
     * Purpose of the method
     * Takes an item away from the count depending on what it is
     * **************************
     * Date: 10/3/2017 USA
     * **************************
     *
     */
    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        
        int found=-1;
        found=findPosition(txtTitle.getText());
        if(found==-1)
        {
            lblWarning.setText("There is not an Item with that title.");
        }else
        {
            
            StoreItem temp=list.get(found);
            
            temp.remove();
            if(temp instanceof Book)
                {
                   ((Book)temp).remove();
                }
                 else if(temp instanceof Movie)
                {
                    ((Movie)temp).remove();
                }
                else
                {
                    ((Painting)temp).remove();
                }
            }
    }//GEN-LAST:event_btnRemoveActionPerformed
 /**
     * Method Name: radSearchActionPerformed
     * Method Author: Tyler Hockett
     * **************************
     * Purpose of the method
     * Finds if an item of given title exsists if so
     * it will fill out all the other options so you can 
     * edit add or sell
     * **************************
     * Date: 10/3/2017 USA
     * **************************
     *
     */
    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        int found=-1;
        found=findPosition(txtTitle.getText());
        if(found==-1)
        {
            lblWarning.setText("There is not an Item with that title.");
        }else
        {
            StoreItem temp=list.get(found);
            txtTitle.setText(temp.getTitle());
            txtAuthor.setText(temp.getAuthor());
            txtDate.setText(temp.getDateAcquired());
            txtAsking.setText(temp.getAskingPrice());
            txtPurchase.setText(temp.getPurchasePrice());
            if(temp instanceof Book)
            {
                radBook.setSelected(true);
                txtType.setText(((Book) temp).getGenre());
            }else if (temp instanceof Movie)
            {
                radMovie.setSelected(true);
                txtType.setText(((Movie) temp).getDirector());
            }else
            {
                radPainting.setSelected(true);
                txtType.setText(((Painting) temp).getMedia());
            }
        }
    }//GEN-LAST:event_btnSearchActionPerformed
 /**
     * Method Name: radGetAllActionPerformed
     * Method Author: Tyler Hockett
     * **************************
     * Purpose of the method
     * Prints the list of Objects to the
     * text area
     * **************************
     * Date: 10/7/2017 USA
     * **************************
     *
     */
    private void btnGetAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetAllActionPerformed
    String answer="";
        for (int i=0;i <list.size();i++)
    {
        StoreItem temp=list.get(i);
        answer="Item number:\t\t\t\t"+(i+1);
        txtAItems.append(answer);
         if(temp instanceof Book)
            {
               answer=((Book)temp).printableString();
            }
             else if(temp instanceof Movie)
            {
                answer=((Movie)temp).printableString();
            }
            else
            {
                answer=((Painting)temp).printableString();
            }
         txtAItems.append(answer);
        
    }
    }//GEN-LAST:event_btnGetAllActionPerformed
     /**
     * Method Name: findPosition
     * Method Author: Tyler Hockett
     * **************************
     * Purpose of the method
     * finds the index position for the list
     * when searching
     * **************************
     * Date: 10/3/2017 USA
     * **************************
     *
     */
    private int findPosition(String title)
    {
        int position=-1;
        for(int i=0;i<list.size();i++)
        {
            StoreItem temp=list.get(i);
            if(temp.title==title)
            {
                position=i;
                break;
            }
        }
        return position;
    }
 /**
     * Method Name: groupButtons
     * Method Author: Tyler Hockett
     * **************************
     * Purpose of the method
     * adds the radio buttons to the same group
     * **************************
     * Date: 10/3/2017 USA
     * **************************
     *
     */
    private void groupButtons()
    {
        bg=new ButtonGroup();
        bg.add(radBook);
        bg.add(radMovie);
        bg.add(radPainting);
    }
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bg;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnGetAll;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblHeight;
    private javax.swing.JLabel lblType;
    private javax.swing.JLabel lblWarning;
    private javax.swing.JLabel lblWidth;
    private javax.swing.JRadioButton radBook;
    private javax.swing.JRadioButton radMovie;
    private javax.swing.JRadioButton radPainting;
    private javax.swing.JTextArea txtAItems;
    private javax.swing.JTextField txtAsking;
    private javax.swing.JTextField txtAuthor;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtHeight;
    private javax.swing.JTextField txtPurchase;
    private javax.swing.JTextField txtTitle;
    private javax.swing.JTextField txtType;
    private javax.swing.JTextField txtWidth;
    // End of variables declaration//GEN-END:variables
}
