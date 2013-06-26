/*
 * HangManUI.java - - MAIN CLASS LOCATED HERE
 *
 * Created on Apr 21, 2012, 3:29:01 PM
 * @authors Ben McFerren & Brice Proctor
 * @description Hangman Game with GUI and Three Levels
 */

package hangman;

import java.util.ArrayList;
import java.util.Random;
import java.awt.event.ActionListener;


public class HangManUI extends javax.swing.JFrame {

    //logic variables
    String soFar;
    int wrong = 0;
    String THE_WORD;
    
    //create my global ActionListeners used below to prepare buttons for play
    ActionListener aListener  = new ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        aButtonActionPerformed(evt);
      }
    };
    ActionListener bListener = new ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        bButtonActionPerformed(evt);
      }
    };
    ActionListener cListener = new ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        cButtonActionPerformed(evt);
      }
    };
    ActionListener dListener = new ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        dButtonActionPerformed(evt);
      }
    };
    ActionListener eListener = new ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        eButtonActionPerformed(evt);
      }
    };
    ActionListener fListener = new ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        fButtonActionPerformed(evt);
      }
    };
    ActionListener gListener = new ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        gButtonActionPerformed(evt);
      }
    };
    ActionListener hListener = new ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        hButtonActionPerformed(evt);
      }
    };
    ActionListener iListener = new ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        iButtonActionPerformed(evt);
      }
    };
    ActionListener jListener = new ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButtonActionPerformed(evt);
      }
    };
    ActionListener kListener = new ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        kButtonActionPerformed(evt);
      }
    };
    ActionListener lListener = new ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        lButtonActionPerformed(evt);
      }
    };
    ActionListener mListener = new ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        mButtonActionPerformed(evt);
      }
    };
    ActionListener nListener = new ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        nButtonActionPerformed(evt);
      }
    };
    ActionListener oListener = new ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        oButtonActionPerformed(evt);
      }
    };
    ActionListener pListener = new ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        pButtonActionPerformed(evt);
      }
    };
    ActionListener qListener = new ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        qButtonActionPerformed(evt);
      }
    };
    ActionListener rListener = new ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        rButtonActionPerformed(evt);
      }
    };
    ActionListener sListener = new ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        sButtonActionPerformed(evt);
      }
    };
    ActionListener tListener = new ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        tButtonActionPerformed(evt);
      }
    };
    ActionListener uListener = new ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        uButtonActionPerformed(evt);
      }
    };
    ActionListener vListener = new ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        vButtonActionPerformed(evt);
      }
    };
    ActionListener wListener = new ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        wButtonActionPerformed(evt);
      }
    };
    ActionListener xListener = new ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        xButtonActionPerformed(evt);
      }
    };
    ActionListener yListener = new ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        yButtonActionPerformed(evt);
      }
    };
    ActionListener zListener = new ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        zButtonActionPerformed(evt);
      }
    };
    
    /** Creates new form HangManUI */
    public HangManUI() {
        
        //paint the default skin
        initComponents();
        
        //establish chooseLevelButtons buttons
        addLevelButtons();
        
        //add chooseLevelButtons to canvas
        gameBoardPanel.add(chooseLevelPanel);

    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        stage = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        gameBoardPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFocusable(false);
        setFocusableWindowState(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18));
        jLabel1.setText(" ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18));
        jLabel2.setText("Please Select a Level");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 36));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("Welcome to Hangman");
        jTextField1.setBorder(null);
        jTextField1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        stage.setBackground(new java.awt.Color(255, 255, 255));
        stage.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangman/0.png"))); // NOI18N

        javax.swing.GroupLayout stageLayout = new javax.swing.GroupLayout(stage);
        stage.setLayout(stageLayout);
        stageLayout.setHorizontalGroup(
            stageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, stageLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addContainerGap())
        );
        stageLayout.setVerticalGroup(
            stageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, stageLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addContainerGap())
        );

        gameBoardPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout gameBoardPanelLayout = new javax.swing.GroupLayout(gameBoardPanel);
        gameBoardPanel.setLayout(gameBoardPanelLayout);
        gameBoardPanelLayout.setHorizontalGroup(
            gameBoardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 614, Short.MAX_VALUE)
        );
        gameBoardPanelLayout.setVerticalGroup(
            gameBoardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 175, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(gameBoardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(275, 275, 275)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(237, 237, 237)
                        .addComponent(stage, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(53, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(119, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117))
            .addGroup(layout.createSequentialGroup()
                .addGap(303, 303, 303)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(307, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(11, 11, 11)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(stage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(gameBoardPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        jButton.setBackground(java.awt.Color.red);
        jButton.setEnabled(false);
        jButton.setForeground(java.awt.Color.gray);
        checkLetter('J');
        jTextField1.setText(soFar);
    }//GEN-LAST:event_jTextField1ActionPerformed

    
    
    //these method are invoked when the user clicks on on of the level buttons
    // they reset the variables, populate the new Word by accessing the HangmanWordPicker class
    // and repaint the canvas with a keyword
    
    private void difThreeButtonActionPerformed(java.awt.event.ActionEvent evt) {
        HangManWordPicker runner = new HangManWordPicker("PARAMETER", "ARGUMENT", "OVERLOAD",
                "OVERRIDE", "COMPUTER", "ALGORITHM", "STATEMENT");
        
        THE_WORD = runner.chooseIt();
        wrong = 0;
        soFar = THE_WORD.replaceAll(".", "-");
        jTextField1.setText("Please Select a Letter Below");
        jLabel1.setText("Word So Far");
        jLabel2.setText("Letters to Select From");
        gameBoardPanel.remove(chooseLevelPanel);
        addKeyboard();
        gameBoardPanel.add(keyboardPanel);
        toggleButtonsOff();
        resetButtons();
    }

    private void difTwoButtonActionPerformed(java.awt.event.ActionEvent evt) {
        HangManWordPicker runner = new HangManWordPicker("METHOD", "VARIABLE", "MEMORY",
                 "SWITCH", "LOGICAL", "PRIMITIVE", "INCREMENT");
        
        THE_WORD = runner.chooseIt();
        wrong = 0;
        soFar = THE_WORD.replaceAll(".", "-");
        jTextField1.setText("Please Select a Letter Below");
        jLabel1.setText("Word So Far");
        jLabel2.setText("Letters to Select From");
        gameBoardPanel.remove(chooseLevelPanel);
        addKeyboard();
        gameBoardPanel.add(keyboardPanel);
        toggleButtonsOff();
        resetButtons();
    }

    private void difOneButtonActionPerformed(java.awt.event.ActionEvent evt) {
        HangManWordPicker runner = new HangManWordPicker("JAVA", "ARRAY", "GUESS",
                "WHILE", "LOOP", "IF", "CLASS");
        
        THE_WORD = runner.chooseIt();
        wrong = 0;
        soFar = THE_WORD.replaceAll(".", "-");
        jTextField1.setText("Please Select a Letter Below");
        jLabel1.setText("Word So Far");
        jLabel2.setText("Letters to Select From");
        gameBoardPanel.remove(chooseLevelPanel);
        addKeyboard();
        gameBoardPanel.add(keyboardPanel);
        toggleButtonsOff();
        resetButtons();
    }
    

    //actions for letter buttons are defined here
    private void vButtonActionPerformed(java.awt.event.ActionEvent evt) {
        vButton.setEnabled(false);
        vButton.setForeground(java.awt.Color.gray);
        vButton.setBackground(java.awt.Color.red);
        checkLetter('V');
        jTextField1.setText(soFar);
    }

    private void bButtonActionPerformed(java.awt.event.ActionEvent evt) {
        bButton.setBackground(java.awt.Color.red);
        bButton.setEnabled(false);
        bButton.setForeground(java.awt.Color.gray);
        checkLetter('B');
        jTextField1.setText(soFar);
    }

    private void nButtonActionPerformed(java.awt.event.ActionEvent evt) {
        nButton.setBackground(java.awt.Color.red);
        nButton.setEnabled(false);
        nButton.setForeground(java.awt.Color.gray);
        checkLetter('N');
        jTextField1.setText(soFar);
    }

    private void qButtonActionPerformed(java.awt.event.ActionEvent evt) {
        qButton.setBackground(java.awt.Color.red);
        qButton.setEnabled(false);
        qButton.setForeground(java.awt.Color.gray);
        checkLetter('Q');
        jTextField1.setText(soFar);
    }

    private void xButtonActionPerformed(java.awt.event.ActionEvent evt) {
        xButton.setBackground(java.awt.Color.red);
        xButton.setEnabled(false);
        xButton.setForeground(java.awt.Color.gray);
        checkLetter('X');
        jTextField1.setText(soFar);
    }

    private void mButtonActionPerformed(java.awt.event.ActionEvent evt) {
        mButton.setBackground(java.awt.Color.red);
        mButton.setEnabled(false);
        mButton.setForeground(java.awt.Color.gray);
        checkLetter('M');
        jTextField1.setText(soFar);
    }

    private void aButtonActionPerformed(java.awt.event.ActionEvent evt) {
        aButton.setBackground(java.awt.Color.red);
        aButton.setEnabled(false);
        aButton.setForeground(java.awt.Color.gray);
        checkLetter('A');
        jTextField1.setText(soFar);
    }

    private void sButtonActionPerformed(java.awt.event.ActionEvent evt) {
        sButton.setBackground(java.awt.Color.red);
        sButton.setEnabled(false);
        sButton.setForeground(java.awt.Color.gray);
        checkLetter('S');
        jTextField1.setText(soFar);
    }

    private void dButtonActionPerformed(java.awt.event.ActionEvent evt) {
        dButton.setBackground(java.awt.Color.red);
        dButton.setEnabled(false);
        dButton.setForeground(java.awt.Color.gray);
        checkLetter('D');
        jTextField1.setText(soFar);
    }

    private void fButtonActionPerformed(java.awt.event.ActionEvent evt) {
        fButton.setBackground(java.awt.Color.red);
        fButton.setEnabled(false);
        fButton.setForeground(java.awt.Color.gray);
        checkLetter('F');
        jTextField1.setText(soFar);
    }

    private void gButtonActionPerformed(java.awt.event.ActionEvent evt) {
        gButton.setBackground(java.awt.Color.red);
        gButton.setEnabled(false);
        gButton.setForeground(java.awt.Color.gray);
        checkLetter('G');
        jTextField1.setText(soFar);
}

    private void hButtonActionPerformed(java.awt.event.ActionEvent evt) {
        hButton.setBackground(java.awt.Color.red);
        hButton.setEnabled(false);
        hButton.setForeground(java.awt.Color.gray);
        checkLetter('H');
        jTextField1.setText(soFar);
    }

    private void kButtonActionPerformed(java.awt.event.ActionEvent evt) {
        kButton.setBackground(java.awt.Color.red);
        kButton.setEnabled(false);
        kButton.setForeground(java.awt.Color.gray);
        checkLetter('K');
        jTextField1.setText(soFar);
    }

    private void jButtonActionPerformed(java.awt.event.ActionEvent evt) {
        jButton.setBackground(java.awt.Color.red);
        jButton.setEnabled(false);
        jButton.setForeground(java.awt.Color.gray);
        checkLetter('J');
        jTextField1.setText(soFar);
    }

    private void rButtonActionPerformed(java.awt.event.ActionEvent evt) {
        rButton.setBackground(java.awt.Color.red);
        rButton.setEnabled(false);
        rButton.setForeground(java.awt.Color.gray);
        checkLetter('R');
        jTextField1.setText(soFar);
    }

    private void wButtonActionPerformed(java.awt.event.ActionEvent evt) {
        wButton.setBackground(java.awt.Color.red);
        wButton.setEnabled(false);
        wButton.setForeground(java.awt.Color.gray);
        checkLetter('W');
        jTextField1.setText(soFar);
    }

    private void uButtonActionPerformed(java.awt.event.ActionEvent evt) {
        uButton.setBackground(java.awt.Color.red);
        uButton.setEnabled(false);
        uButton.setForeground(java.awt.Color.gray);
        checkLetter('U');
        jTextField1.setText(soFar);
    }

    private void eButtonActionPerformed(java.awt.event.ActionEvent evt) {
        eButton.setBackground(java.awt.Color.red);
        eButton.setEnabled(false);
        eButton.setForeground(java.awt.Color.gray);
        checkLetter('E');
        jTextField1.setText(soFar);
    }

    private void tButtonActionPerformed(java.awt.event.ActionEvent evt) {
        tButton.setBackground(java.awt.Color.red);
        tButton.setEnabled(false);
        tButton.setForeground(java.awt.Color.gray);
        checkLetter('T');
        jTextField1.setText(soFar);
    }

    private void cButtonActionPerformed(java.awt.event.ActionEvent evt) {
        cButton.setBackground(java.awt.Color.red);
        cButton.setEnabled(false);
        cButton.setForeground(java.awt.Color.gray);
        checkLetter('C');
        jTextField1.setText(soFar);
    }

    private void iButtonActionPerformed(java.awt.event.ActionEvent evt) {
        iButton.setBackground(java.awt.Color.red);
        iButton.setEnabled(false);
        iButton.setForeground(java.awt.Color.gray);
        checkLetter('I');
        jTextField1.setText(soFar);
    }

    private void pButtonActionPerformed(java.awt.event.ActionEvent evt) {
        pButton.setBackground(java.awt.Color.red);
        pButton.setEnabled(false);
        pButton.setForeground(java.awt.Color.gray);
        checkLetter('P');
        jTextField1.setText(soFar);
    }

    private void oButtonActionPerformed(java.awt.event.ActionEvent evt) {
        oButton.setBackground(java.awt.Color.red);
        oButton.setEnabled(false);
        oButton.setForeground(java.awt.Color.gray);
        checkLetter('O');
        jTextField1.setText(soFar);
    }

    private void yButtonActionPerformed(java.awt.event.ActionEvent evt) {
        yButton.setBackground(java.awt.Color.red);
        yButton.setEnabled(false);
        yButton.setForeground(java.awt.Color.gray);
        checkLetter('Y');
        jTextField1.setText(soFar);
    }

    private void zButtonActionPerformed(java.awt.event.ActionEvent evt) {
        zButton.setBackground(java.awt.Color.red);
        zButton.setEnabled(false);
        zButton.setForeground(java.awt.Color.gray);
        checkLetter('Z');
        jTextField1.setText(soFar);
    }

    private void lButtonActionPerformed(java.awt.event.ActionEvent evt) {
        lButton.setBackground(java.awt.Color.red);
        lButton.setEnabled(false);
        lButton.setForeground(java.awt.Color.gray);
        checkLetter('L');
        jTextField1.setText(soFar);
    }
    
    //this method trigger when the user is presented with the winner graphic
    // it offers the button and when clicked, repaints the default choose level page
    private void winButtonActionPerformed(java.awt.event.ActionEvent evt) {
        jLabel1.setText(" ");
        jLabel2.setText("Please Select a Level");
        jTextField1.setText("Welcome to Hangman");
        stage.remove(winButton);
        jLabel11 = new javax.swing.JLabel();
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangman/0.png"))); // NOI18N
        javax.swing.GroupLayout stageLayout = new javax.swing.GroupLayout(stage);
        stage.setLayout(stageLayout);    
        stageLayout.setHorizontalGroup(
            stageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, stageLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addContainerGap())
        );

        stageLayout.setVerticalGroup(
            stageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, stageLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addContainerGap())
        );
        stage.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        gameBoardPanel.remove(keyboardPanel);
        addLevelButtons();
        gameBoardPanel.add(chooseLevelPanel);
    }
    
    //this method trigger when the user is presented with the hung graphic
    // it offers the button and when clicked, repaints the default choose level page
    private void loseButtonActionPerformed(java.awt.event.ActionEvent evt) {
        jLabel1.setText(" ");
        jLabel2.setText("Please Select a Level");
        jTextField1.setText("Welcome to Hangman");
        stage.remove(loseButton);
        jLabel11 = new javax.swing.JLabel();
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangman/0.png"))); // NOI18N
        javax.swing.GroupLayout stageLayout = new javax.swing.GroupLayout(stage);
        stage.setLayout(stageLayout);    
        stageLayout.setHorizontalGroup(
            stageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, stageLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addContainerGap())
        );

        stageLayout.setVerticalGroup(
            stageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, stageLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addContainerGap())
        );
        stage.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        gameBoardPanel.remove(keyboardPanel);
        addLevelButtons();
        gameBoardPanel.add(chooseLevelPanel);
    }
    
    //this method runs the users guess by the secret word. if the letter guessed is
    // in the secret word, then it replaces the (indexed) hyphen in the soFar variable 
    // with the correct letter. If the letter is incorrect, it increases the amount of 
    // wrong answer that the user has been allotted
    public void checkLetter(char letter){
       
        if(THE_WORD.indexOf(letter) >= 0)
        {
            //update soFar to include the newly guess word
            for(int i = 0; i < THE_WORD.length(); ++i)
            {
                if(THE_WORD.charAt(i) == letter)
                {
                    StringBuffer sb = new StringBuffer(soFar);
                    sb.setCharAt(i, letter);
                    soFar = sb.toString();
                }
                //if the secret word has been completed, prompt the winner screen
                if(THE_WORD.equals(soFar))
                {
                    switch(wrong){
                        case 0:
                            stage.remove(jLabel11);
                            break;
                        case 1:
                            stage.remove(jLabel5);
                            break;
                        case 2:
                            stage.remove(jLabel6);
                            break;
                        case 3:
                            stage.remove(jLabel7);
                            break;
                        case 4:
                            stage.remove(jLabel8);
                            break;
                        case 5:
                            stage.remove(jLabel9);
                            break;
                        default:
                    }
                    javax.swing.GroupLayout stageLayout = new javax.swing.GroupLayout(stage);
                    
                    winButton = new javax.swing.JButton();
                    winButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangman/7.png"))); // NOI18N
                    winButton.setBorderPainted(false);
                    winButton.setContentAreaFilled(false);
                    winButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                    winButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                            winButtonActionPerformed(evt);
                        }
                    });
                    
                    stage.setLayout(stageLayout);    
                    stageLayout.setHorizontalGroup(
                        stageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, stageLayout.createSequentialGroup()
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(winButton)
                            .addContainerGap())
                    );

                    stageLayout.setVerticalGroup(
                        stageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, stageLayout.createSequentialGroup()
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(winButton)
                            .addContainerGap())
                    );
                                   
                    toggleButtonsOff();
                    stage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                }      
            }
        }
        else
        {
            ++wrong;
            drawPicture(wrong);
        }
    }
    
    //this method displays the correct hangman picture to let the user know how 
    //many incorrect answers he has
    public void drawPicture(int amountIncorrect){
        
            javax.swing.GroupLayout stageLayout = new javax.swing.GroupLayout(stage);
            
            switch(amountIncorrect){
                case 1:
                    stage.remove(jLabel11);
                    jLabel5 = new javax.swing.JLabel();
                    jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangman/1.png"))); // NOI18N
                    stage.setLayout(stageLayout);    
                    stageLayout.setHorizontalGroup(
                        stageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, stageLayout.createSequentialGroup()
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5)
                            .addContainerGap())
                    );

                    stageLayout.setVerticalGroup(
                        stageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, stageLayout.createSequentialGroup()
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5)
                            .addContainerGap())
                    );
                    break;
                case 2:
                    stage.remove(jLabel5);
                    jLabel6 = new javax.swing.JLabel();
                    jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangman/2.png"))); // NOI18N
                    stage.setLayout(stageLayout);    
                    stageLayout.setHorizontalGroup(
                        stageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, stageLayout.createSequentialGroup()
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6)
                            .addContainerGap())
                    );

                    stageLayout.setVerticalGroup(
                        stageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, stageLayout.createSequentialGroup()
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6)
                            .addContainerGap())
                    );
                    break;
                case 3:
                    stage.remove(jLabel6);
                    jLabel7 = new javax.swing.JLabel();
                    jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangman/3.png"))); // NOI18N
                    stage.setLayout(stageLayout);    
                    stageLayout.setHorizontalGroup(
                        stageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, stageLayout.createSequentialGroup()
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7)
                            .addContainerGap())
                    );

                    stageLayout.setVerticalGroup(
                        stageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, stageLayout.createSequentialGroup()
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7)
                            .addContainerGap())
                    );
                    break;
                case 4:
                    stage.remove(jLabel7);
                    jLabel8 = new javax.swing.JLabel();
                    jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangman/4.png"))); // NOI18N
                    stage.setLayout(stageLayout);    
                    stageLayout.setHorizontalGroup(
                        stageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, stageLayout.createSequentialGroup()
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8)
                            .addContainerGap())
                    );

                    stageLayout.setVerticalGroup(
                        stageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, stageLayout.createSequentialGroup()
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8)
                            .addContainerGap())
                    );
                    break;
                case 5:
                    stage.remove(jLabel8);
                    jLabel9 = new javax.swing.JLabel();
                    jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangman/5.png"))); // NOI18N
                    stage.setLayout(stageLayout);    
                    stageLayout.setHorizontalGroup(
                        stageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, stageLayout.createSequentialGroup()
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9)
                            .addContainerGap())
                    );

                    stageLayout.setVerticalGroup(
                        stageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, stageLayout.createSequentialGroup()
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9)
                            .addContainerGap())
                    );
                    break;
                case 6:
                    stage.remove(jLabel9);
                    loseButton = new javax.swing.JButton();
                    loseButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangman/6.png"))); // NOI18N
                    loseButton.setBorderPainted(false);
                    loseButton.setContentAreaFilled(false);
                    loseButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                    loseButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                            loseButtonActionPerformed(evt);
                        }
                    });
                    
                    stage.setLayout(stageLayout);    
                    stageLayout.setHorizontalGroup(
                        stageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, stageLayout.createSequentialGroup()
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(loseButton)
                            .addContainerGap())
                    );

                    stageLayout.setVerticalGroup(
                        stageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, stageLayout.createSequentialGroup()
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(loseButton)
                            .addContainerGap())
                    );          
                    toggleButtonsOff();
                    stage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                    break;
                default:
            }
    }
    
    //this method is invoked when the user clicks on one of the levels to play
    //it creates the keyboard and buttons
    public void addKeyboard(){
        
    //keyboard group with buttons defined
        gameBoardPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lButton.setFont(new java.awt.Font("Tahoma", 0, 18));
        lButton.setText("L");
        lButton.setBackground(java.awt.Color.gray);
        lButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        zButton.setFont(new java.awt.Font("Tahoma", 0, 18));
        zButton.setText("Z");
        zButton.setBackground(java.awt.Color.gray);
        zButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        yButton.setFont(new java.awt.Font("Tahoma", 0, 18));
        yButton.setText("Y");
        yButton.setBackground(java.awt.Color.gray);
        yButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        oButton.setFont(new java.awt.Font("Tahoma", 0, 18));
        oButton.setText("O");
        oButton.setBackground(java.awt.Color.gray);
        oButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        pButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pButton.setText("P");
        pButton.setBackground(java.awt.Color.gray);
        pButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        iButton.setFont(new java.awt.Font("Tahoma", 0, 18));
        iButton.setText("I");
        iButton.setBackground(java.awt.Color.gray);
        iButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        cButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cButton.setText("C");
        cButton.setBackground(java.awt.Color.gray);
        cButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        tButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tButton.setText("T");
        tButton.setBackground(java.awt.Color.gray);
        tButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        eButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        eButton.setText("E");
        eButton.setBackground(java.awt.Color.gray);
        eButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        uButton.setFont(new java.awt.Font("Tahoma", 0, 18));
        uButton.setText("U");
        uButton.setBackground(java.awt.Color.gray);
        uButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        wButton.setFont(new java.awt.Font("Tahoma", 0, 18));
        wButton.setText("W");
        wButton.setBackground(java.awt.Color.gray);
        wButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        rButton.setFont(new java.awt.Font("Tahoma", 0, 18));
        rButton.setText("R");
        rButton.setBackground(java.awt.Color.gray);
        rButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jButton.setFont(new java.awt.Font("Tahoma", 0, 18));
        jButton.setText("J");
        jButton.setBackground(java.awt.Color.gray);
        jButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        kButton.setFont(new java.awt.Font("Tahoma", 0, 18));
        kButton.setText("K");
        kButton.setBackground(java.awt.Color.gray);
        kButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        hButton.setFont(new java.awt.Font("Tahoma", 0, 18));
        hButton.setText("H");
        hButton.setBackground(java.awt.Color.gray);
        hButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        gButton.setFont(new java.awt.Font("Tahoma", 0, 18));
        gButton.setText("G");
        gButton.setBackground(java.awt.Color.gray);
        gButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        fButton.setFont(new java.awt.Font("Tahoma", 0, 18));
        fButton.setText("F");
        fButton.setBackground(java.awt.Color.gray);
        fButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        dButton.setFont(new java.awt.Font("Tahoma", 0, 18));
        dButton.setText("D");
        dButton.setBackground(java.awt.Color.gray);
        dButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        sButton.setFont(new java.awt.Font("Tahoma", 0, 18));
        sButton.setText("S");
        sButton.setBackground(java.awt.Color.gray);
        sButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        aButton.setFont(new java.awt.Font("Tahoma", 0, 18));
        aButton.setText("A");
        aButton.setBackground(java.awt.Color.gray);
        aButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        mButton.setFont(new java.awt.Font("Tahoma", 0, 18));
        mButton.setText("M");
        mButton.setBackground(java.awt.Color.gray);
        mButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        xButton.setFont(new java.awt.Font("Tahoma", 0, 18));
        xButton.setText("X");
        xButton.setBackground(java.awt.Color.gray);
        xButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        qButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        qButton.setText("Q");
        qButton.setBackground(java.awt.Color.gray);
        qButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        nButton.setFont(new java.awt.Font("Tahoma", 0, 18));
        nButton.setText("N");
        nButton.setBackground(java.awt.Color.gray);
        nButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        bButton.setFont(new java.awt.Font("Tahoma", 0, 18));
        bButton.setText("B");
        bButton.setBackground(java.awt.Color.gray);
        bButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        vButton.setFont(new java.awt.Font("Tahoma", 0, 18));
        vButton.setText("V");
        vButton.setBackground(java.awt.Color.gray);
        vButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout keyboardPanelLayout = new javax.swing.GroupLayout(keyboardPanel);
        keyboardPanel.setLayout(keyboardPanelLayout);
        keyboardPanelLayout.setHorizontalGroup(
            keyboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(keyboardPanelLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(keyboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, keyboardPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(aButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(keyboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(keyboardPanelLayout.createSequentialGroup()
                                .addComponent(zButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(xButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(vButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mButton))
                            .addGroup(keyboardPanelLayout.createSequentialGroup()
                                .addComponent(sButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(gButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(hButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(kButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lButton)))
                        .addGap(27, 27, 27))
                    .addGroup(keyboardPanelLayout.createSequentialGroup()
                        .addComponent(qButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(wButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(yButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(uButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(iButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(oButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pButton)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        keyboardPanelLayout.setVerticalGroup(
            keyboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, keyboardPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(keyboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(qButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(wButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(oButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(keyboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(keyboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(zButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(xButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout gameBoardPanelLayout = new javax.swing.GroupLayout(gameBoardPanel);
        gameBoardPanel.setLayout(gameBoardPanelLayout);
        gameBoardPanelLayout.setHorizontalGroup(
            gameBoardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gameBoardPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(keyboardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        gameBoardPanelLayout.setVerticalGroup(
            gameBoardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gameBoardPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(keyboardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }
    
    //this method is invoked when the user returns from a won(or lost) game
    // this method presents the user with the level buttns
    public void addLevelButtons(){
        
        gameBoardPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        
        difOneButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        difOneButton.setText("Difficulty Level One");
        difOneButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        difOneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                difOneButtonActionPerformed(evt);
            }
        });

        difTwoButton.setFont(new java.awt.Font("Tahoma", 1, 14));
        difTwoButton.setText("Difficulty Level Two");
        difTwoButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        difTwoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                difTwoButtonActionPerformed(evt);
            }
        });

        difThreeButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        difThreeButton.setText("Difficulty Level Three");
        difThreeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        difThreeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                difThreeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout chooseLevelPanelLayout = new javax.swing.GroupLayout(chooseLevelPanel);
        chooseLevelPanel.setLayout(chooseLevelPanelLayout);
        chooseLevelPanelLayout.setHorizontalGroup(
            chooseLevelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(chooseLevelPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(difOneButton, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(difTwoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(difThreeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        chooseLevelPanelLayout.setVerticalGroup(
            chooseLevelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(chooseLevelPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(chooseLevelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(difOneButton, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                    .addComponent(difTwoButton, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                    .addComponent(difThreeButton, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE))
                .addContainerGap())
        );
        
        javax.swing.GroupLayout gameBoardPanelLayout = new javax.swing.GroupLayout(gameBoardPanel);
        gameBoardPanel.setLayout(gameBoardPanelLayout);
        gameBoardPanelLayout.setHorizontalGroup(
            gameBoardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gameBoardPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(chooseLevelPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        gameBoardPanelLayout.setVerticalGroup(
            gameBoardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gameBoardPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chooseLevelPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }
    
    // this method is invoked when either the user gets the answer correct or 
    // the user reaches his limit of wrong answers
    public void toggleButtonsOff(){
        aButton.setEnabled(false);               
        bButton.setEnabled(false);               
        cButton.setEnabled(false);               
        dButton.setEnabled(false);               
        eButton.setEnabled(false);
        fButton.setEnabled(false);
        gButton.setEnabled(false);
        hButton.setEnabled(false);
        iButton.setEnabled(false);
        jButton.setEnabled(false);
        kButton.setEnabled(false);
        lButton.setEnabled(false);
        mButton.setEnabled(false);
        nButton.setEnabled(false);
        oButton.setEnabled(false);
        pButton.setEnabled(false);
        qButton.setEnabled(false);
        rButton.setEnabled(false);
        sButton.setEnabled(false);
        tButton.setEnabled(false);
        uButton.setEnabled(false);
        vButton.setEnabled(false);
        wButton.setEnabled(false);
        xButton.setEnabled(false);
        yButton.setEnabled(false);
        zButton.setEnabled(false);
        aButton.removeActionListener(aListener);
        bButton.removeActionListener(bListener);
        cButton.removeActionListener(cListener);
        dButton.removeActionListener(dListener);
        eButton.removeActionListener(eListener);
        fButton.removeActionListener(fListener);
        gButton.removeActionListener(gListener);
        hButton.removeActionListener(hListener);
        iButton.removeActionListener(iListener);
        jButton.removeActionListener(jListener);
        kButton.removeActionListener(kListener);
        lButton.removeActionListener(lListener);
        mButton.removeActionListener(mListener);
        nButton.removeActionListener(nListener);
        oButton.removeActionListener(oListener);
        pButton.removeActionListener(pListener);
        qButton.removeActionListener(qListener);
        rButton.removeActionListener(rListener);
        sButton.removeActionListener(sListener);
        tButton.removeActionListener(tListener);
        uButton.removeActionListener(uListener);
        vButton.removeActionListener(vListener);
        wButton.removeActionListener(wListener);
        xButton.removeActionListener(xListener);
        yButton.removeActionListener(yListener);
        zButton.removeActionListener(zListener);
    }
    
    //this method is invoked when the choose level buttons are clicked
    //it prepares all the letter buttons with a fresh slate
    public void resetButtons(){
        aButton.setEnabled(true);               
        bButton.setEnabled(true);               
        cButton.setEnabled(true);               
        dButton.setEnabled(true);               
        eButton.setEnabled(true);
        fButton.setEnabled(true);
        gButton.setEnabled(true);
        hButton.setEnabled(true);
        iButton.setEnabled(true);
        jButton.setEnabled(true);
        kButton.setEnabled(true);
        lButton.setEnabled(true);
        mButton.setEnabled(true);
        nButton.setEnabled(true);
        oButton.setEnabled(true);
        pButton.setEnabled(true);
        qButton.setEnabled(true);
        rButton.setEnabled(true);
        sButton.setEnabled(true);
        tButton.setEnabled(true);
        uButton.setEnabled(true);
        vButton.setEnabled(true);
        wButton.setEnabled(true);
        xButton.setEnabled(true);
        yButton.setEnabled(true);
        zButton.setEnabled(true);
        aButton.setForeground(java.awt.Color.black);              
        bButton.setForeground(java.awt.Color.black);              
        cButton.setForeground(java.awt.Color.black);              
        dButton.setForeground(java.awt.Color.black);             
        eButton.setForeground(java.awt.Color.black);
        fButton.setForeground(java.awt.Color.black);
        gButton.setForeground(java.awt.Color.black);
        hButton.setForeground(java.awt.Color.black);
        iButton.setForeground(java.awt.Color.black);
        jButton.setForeground(java.awt.Color.black);
        kButton.setForeground(java.awt.Color.black);
        lButton.setForeground(java.awt.Color.black);
        mButton.setForeground(java.awt.Color.black);
        nButton.setForeground(java.awt.Color.black);
        oButton.setForeground(java.awt.Color.black);
        pButton.setForeground(java.awt.Color.black);
        qButton.setForeground(java.awt.Color.black);
        rButton.setForeground(java.awt.Color.black);
        sButton.setForeground(java.awt.Color.black);
        tButton.setForeground(java.awt.Color.black);
        uButton.setForeground(java.awt.Color.black);
        vButton.setForeground(java.awt.Color.black);
        wButton.setForeground(java.awt.Color.black);
        xButton.setForeground(java.awt.Color.black);
        yButton.setForeground(java.awt.Color.black);
        zButton.setForeground(java.awt.Color.black);
        aButton.setBackground(java.awt.Color.gray);              
        bButton.setBackground(java.awt.Color.gray);             
        cButton.setBackground(java.awt.Color.gray);            
        dButton.setBackground(java.awt.Color.gray);            
        eButton.setBackground(java.awt.Color.gray);
        fButton.setBackground(java.awt.Color.gray);
        gButton.setBackground(java.awt.Color.gray);
        hButton.setBackground(java.awt.Color.gray);
        iButton.setBackground(java.awt.Color.gray);
        jButton.setBackground(java.awt.Color.gray);
        kButton.setBackground(java.awt.Color.gray);
        lButton.setBackground(java.awt.Color.gray);
        mButton.setBackground(java.awt.Color.gray);
        nButton.setBackground(java.awt.Color.gray);
        oButton.setBackground(java.awt.Color.gray);
        pButton.setBackground(java.awt.Color.gray);
        qButton.setBackground(java.awt.Color.gray);
        rButton.setBackground(java.awt.Color.gray);
        sButton.setBackground(java.awt.Color.gray);
        tButton.setBackground(java.awt.Color.gray);
        uButton.setBackground(java.awt.Color.gray);
        vButton.setBackground(java.awt.Color.gray);
        wButton.setBackground(java.awt.Color.gray);
        xButton.setBackground(java.awt.Color.gray);
        yButton.setBackground(java.awt.Color.gray);
        zButton.setBackground(java.awt.Color.gray);
        aButton.addActionListener(aListener);
        bButton.addActionListener(bListener);
        cButton.addActionListener(cListener);
        dButton.addActionListener(dListener);
        eButton.addActionListener(eListener);
        fButton.addActionListener(fListener);
        gButton.addActionListener(gListener);
        hButton.addActionListener(hListener);
        iButton.addActionListener(iListener);
        jButton.addActionListener(jListener);
        kButton.addActionListener(kListener);
        lButton.addActionListener(lListener);
        mButton.addActionListener(mListener);
        nButton.addActionListener(nListener);
        oButton.addActionListener(oListener);
        pButton.addActionListener(pListener);
        qButton.addActionListener(qListener);
        rButton.addActionListener(rListener);
        sButton.addActionListener(sListener);
        tButton.addActionListener(tListener);
        uButton.addActionListener(uListener);
        vButton.addActionListener(vListener);
        wButton.addActionListener(wListener);
        xButton.addActionListener(xListener);
        yButton.addActionListener(yListener);
        zButton.addActionListener(zListener);
    }
        
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new HangManUI().setVisible(true);
            }
        });
    }
    
    //declare auxiliary elements
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JButton winButton;
    private javax.swing.JButton loseButton;
    
    //declare keyboard elemets
    private javax.swing.JButton tButton = new javax.swing.JButton();
    private javax.swing.JButton uButton = new javax.swing.JButton();
    private javax.swing.JButton vButton = new javax.swing.JButton();
    private javax.swing.JButton wButton = new javax.swing.JButton();
    private javax.swing.JButton xButton = new javax.swing.JButton();
    private javax.swing.JButton yButton = new javax.swing.JButton();
    private javax.swing.JButton zButton = new javax.swing.JButton();
    private javax.swing.JButton kButton = new javax.swing.JButton();
    private javax.swing.JPanel keyboardPanel = new javax.swing.JPanel();
    private javax.swing.JButton lButton = new javax.swing.JButton();
    private javax.swing.JButton mButton = new javax.swing.JButton();
    private javax.swing.JButton nButton = new javax.swing.JButton();
    private javax.swing.JButton oButton = new javax.swing.JButton();
    private javax.swing.JButton pButton = new javax.swing.JButton();
    private javax.swing.JButton qButton = new javax.swing.JButton();
    private javax.swing.JButton rButton = new javax.swing.JButton();
    private javax.swing.JButton sButton = new javax.swing.JButton();
    private javax.swing.JButton hButton = new javax.swing.JButton();
    private javax.swing.JButton iButton = new javax.swing.JButton();
    private javax.swing.JButton jButton = new javax.swing.JButton();
    private javax.swing.JButton eButton = new javax.swing.JButton();
    private javax.swing.JButton fButton = new javax.swing.JButton();
    private javax.swing.JButton gButton = new javax.swing.JButton();
    private javax.swing.JButton dButton = new javax.swing.JButton();
    private javax.swing.JButton aButton = new javax.swing.JButton();
    private javax.swing.JButton bButton = new javax.swing.JButton();
    private javax.swing.JButton cButton = new javax.swing.JButton();
    
    //declare choose level elements
    private javax.swing.JPanel chooseLevelPanel = new javax.swing.JPanel();
    private javax.swing.JButton difOneButton = new javax.swing.JButton();
    private javax.swing.JButton difThreeButton = new javax.swing.JButton();
    private javax.swing.JButton difTwoButton = new javax.swing.JButton();
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel gameBoardPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel stage;
    // End of variables declaration//GEN-END:variables
}
