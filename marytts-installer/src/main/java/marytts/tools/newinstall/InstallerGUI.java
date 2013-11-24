/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package marytts.tools.newinstall;

import java.awt.Color;
import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JPanel;

import marytts.tools.newinstall.objects.Component;
import marytts.tools.newinstall.objects.VoiceComponent;

/**
 * 
 * @author Jonathan
 */
public class InstallerGUI extends javax.swing.JFrame {

	// data
	private Installer installer;

	// current data
	private List<Component> curResources;

	// the attributes and values of the comboBoxes in case they're set.
	private HashMap<String, String> filters;

	/**
	 * Creates new form InstallerGUI
	 */
	public InstallerGUI(Installer installer) {
		if (installer == null) {
			System.err.println("Installer should not be null at this point!");
			System.exit(0);
			// installer = new Installer();
		}
		this.installer = installer;
		this.curResources = this.installer.getAvailableComponents();
		this.filters = new HashMap<String, String>();
		this.filters.put("locale", "");
		this.filters.put("type", "");
		this.filters.put("gender", "");
		this.filters.put("status", "");

		initComponents();

		// TODO can't be filled at construction time as Installer hasn't loaded this data yet by then, figure out solution!
		fillComponentGroupPanels();
		addActionToAdvancedCheckBox();
		addActionToLogButton();
		addActionToMaryPathButton();
		fillComboBoxes();
		addActionToComboBox("locale", this.localeBox);
		addActionToComboBox("type", this.typeBox);
		addActionToComboBox("gender", this.genderBox);
		addActionToComboBox("status", this.statusBox);
	}

	/* @formatter:off */
    /**	
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        maryPathLabel = new javax.swing.JLabel();
        maryPathTextField = new javax.swing.JTextField();
        maryPathButton = new javax.swing.JButton();
        advancedCheckBox = new javax.swing.JCheckBox();
        logButton = new javax.swing.JButton();
        controlsPanel = new javax.swing.JPanel();
        controlsSep = new javax.swing.JSeparator();
        localePanel = new javax.swing.JPanel();
        localeLabel = new javax.swing.JLabel();
        localeBox = new javax.swing.JComboBox();
        typePanel = new javax.swing.JPanel();
        typeLabel = new javax.swing.JLabel();
        typeBox = new javax.swing.JComboBox();
        genderPanel = new javax.swing.JPanel();
        genderBox = new javax.swing.JComboBox();
        genderLabel = new javax.swing.JLabel();
        statusPanel = new javax.swing.JPanel();
        statusLabel = new javax.swing.JLabel();
        statusBox = new javax.swing.JComboBox();
        componentTabbedPane = new javax.swing.JTabbedPane();
        voicesScrollPane = new javax.swing.JScrollPane();
        voicesGroupPanel = new javax.swing.JPanel();
        languagesScrollPane = new javax.swing.JScrollPane();
        languagesGroupPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Component Installer");
        setResizable(false);

        maryPathLabel.setText("Path to marytts installation folder:");

        maryPathButton.setText("dir");

        advancedCheckBox.setForeground(java.awt.Color.lightGray);
        advancedCheckBox.setText("advanced Mode");

        logButton.setText("show log view");

        controlsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Use these controls to filter the list of available components"));

        controlsSep.setOrientation(javax.swing.SwingConstants.VERTICAL);

        localeLabel.setText("Locale");

        localeBox.setMaximumRowCount(20);

        javax.swing.GroupLayout localePanelLayout = new javax.swing.GroupLayout(localePanel);
        localePanel.setLayout(localePanelLayout);
        localePanelLayout.setHorizontalGroup(
            localePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(localePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(localePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(localeBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(localeLabel))
                .addGap(20, 20, 20))
        );
        localePanelLayout.setVerticalGroup(
            localePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(localePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(localeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(localeBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        typeLabel.setText("Type");

        typeBox.setMaximumRowCount(20);

        javax.swing.GroupLayout typePanelLayout = new javax.swing.GroupLayout(typePanel);
        typePanel.setLayout(typePanelLayout);
        typePanelLayout.setHorizontalGroup(
            typePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(typePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(typePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(typeLabel)
                    .addComponent(typeBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 20, Short.MAX_VALUE))
        );
        typePanelLayout.setVerticalGroup(
            typePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(typePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(typeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(typeBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        genderBox.setMaximumRowCount(20);

        genderLabel.setText("Gender");

        javax.swing.GroupLayout genderPanelLayout = new javax.swing.GroupLayout(genderPanel);
        genderPanel.setLayout(genderPanelLayout);
        genderPanelLayout.setHorizontalGroup(
            genderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(genderPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(genderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(genderBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(genderLabel))
                .addGap(20, 20, 20))
        );
        genderPanelLayout.setVerticalGroup(
            genderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(genderPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(genderLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(genderBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        statusLabel.setText("Status");

        statusBox.setMaximumRowCount(20);

        javax.swing.GroupLayout statusPanelLayout = new javax.swing.GroupLayout(statusPanel);
        statusPanel.setLayout(statusPanelLayout);
        statusPanelLayout.setHorizontalGroup(
            statusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statusPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(statusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(statusBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(statusLabel))
                .addGap(20, 20, 20))
        );
        statusPanelLayout.setVerticalGroup(
            statusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statusPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(statusLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(statusBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout controlsPanelLayout = new javax.swing.GroupLayout(controlsPanel);
        controlsPanel.setLayout(controlsPanelLayout);
        controlsPanelLayout.setHorizontalGroup(
            controlsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(localePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(typePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(genderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(controlsSep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(statusPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        controlsPanelLayout.setVerticalGroup(
            controlsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, controlsPanelLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(controlsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(statusPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(genderPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(typePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(controlsSep, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(localePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        componentTabbedPane.setPreferredSize(new java.awt.Dimension(477, 318));

        javax.swing.GroupLayout voicesGroupPanelLayout = new javax.swing.GroupLayout(voicesGroupPanel);
        voicesGroupPanel.setLayout(voicesGroupPanelLayout);
        voicesGroupPanelLayout.setHorizontalGroup(
            voicesGroupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 535, Short.MAX_VALUE)
        );
        voicesGroupPanelLayout.setVerticalGroup(
            voicesGroupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 268, Short.MAX_VALUE)
        );

        voicesScrollPane.setViewportView(voicesGroupPanel);

        componentTabbedPane.addTab("voices", voicesScrollPane);

        javax.swing.GroupLayout languagesGroupPanelLayout = new javax.swing.GroupLayout(languagesGroupPanel);
        languagesGroupPanel.setLayout(languagesGroupPanelLayout);
        languagesGroupPanelLayout.setHorizontalGroup(
            languagesGroupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 535, Short.MAX_VALUE)
        );
        languagesGroupPanelLayout.setVerticalGroup(
            languagesGroupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 268, Short.MAX_VALUE)
        );

        languagesScrollPane.setViewportView(languagesGroupPanel);

        componentTabbedPane.addTab("other", languagesScrollPane);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(advancedCheckBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(logButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(maryPathLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(maryPathTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(maryPathButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(controlsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(componentTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(maryPathLabel)
                    .addComponent(maryPathTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(maryPathButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(controlsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(componentTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(advancedCheckBox)
                    .addComponent(logButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /* @formatter:on */

	// /**
	// * @param args
	// * the command line arguments
	// */
	// public static void main(String args[]) {

	/* Set the Nimbus look and feel */
	// <editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
	/*
	 * If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel. For details see
	 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
	 */
	// try {
	// for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
	// if ("Nimbus".equals(info.getName())) {
	// javax.swing.UIManager.setLookAndFeel(info.getClassName());
	// break;
	// }
	// }
	// } catch (ClassNotFoundException ex) {
	// java.util.logging.Logger.getLogger(InstallerGUITmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	// } catch (InstantiationException ex) {
	// java.util.logging.Logger.getLogger(InstallerGUITmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	// } catch (IllegalAccessException ex) {
	// java.util.logging.Logger.getLogger(InstallerGUITmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	// } catch (javax.swing.UnsupportedLookAndFeelException ex) {
	// java.util.logging.Logger.getLogger(InstallerGUITmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	// }
	// </editor-fold>

	/* Create and display the form */
	// java.awt.EventQueue.invokeLater(new Runnable() {
	// public void run() {
	// Installer installer = new Installer();
	// new InstallerGUITmp(installer).setVisible(true);
	// }
	// });
	// }

	private void addActionToLogButton() {
		this.logButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				java.awt.EventQueue.invokeLater(new Runnable() {
					public void run() {
						LogViewFrame logViewFrame = new LogViewFrame();
						new LogViewFrame().setVisible(true);
					}
				});
			}
		});
	}

	private void addActionToMaryPathButton() {
		this.maryPathButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new FileDialog(InstallerGUI.this);
			}
		});
	}

	private void addActionToComboBox(final String attribute, final JComboBox comboBox) {

		comboBox.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					InstallerGUI.this.filters.put(attribute, comboBox.getSelectedItem().toString());
					InstallerGUI.this.curResources = installer.filterGlobal(InstallerGUI.this.filters);
					System.out.println("number of comps:" + InstallerGUI.this.curResources.size());
					System.out.println(InstallerGUI.this.curResources.toString());
					// fillComponentGroupPanels();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
	}

	private void addActionToAdvancedCheckBox() {
		this.advancedCheckBox.setSelected(false);
		this.componentTabbedPane.setEnabledAt(1, false);
		this.componentTabbedPane.setForegroundAt(1, Color.lightGray);
		this.advancedCheckBox.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					InstallerGUI.this.advancedCheckBox.setForeground(Color.BLACK);
					InstallerGUI.this.componentTabbedPane.setEnabledAt(1, true);
					InstallerGUI.this.componentTabbedPane.setForegroundAt(1, Color.BLACK);
					// java.awt.Component componentAt = InstallerGUITmp.this.componentTabbedPane.getComponentAt(1);
					// System.out.println(componentAt.toString());
				} else {
					InstallerGUI.this.advancedCheckBox.setForeground(Color.lightGray);
					InstallerGUI.this.componentTabbedPane.setEnabledAt(1, false);
					InstallerGUI.this.componentTabbedPane.setForegroundAt(1, Color.lightGray);
					InstallerGUI.this.componentTabbedPane.setSelectedIndex(0);
					// InstallerGUITmp.this.componentTabbedPane.getComponentAt(1).setVisible(true);
				}
			}
		});
	}

	/**
	 * 
	 * @param componentGroupPanel
	 * @param componentTableModel
	 * @return
	 */
	private void fillComponentGroupPanels() {

		this.voicesGroupPanel.removeAll();
		this.languagesGroupPanel.removeAll();
		if (!(this.curResources == null)) {
			for (Component oneComponent : curResources) {
				if (oneComponent instanceof VoiceComponent) {
					this.voicesGroupPanel.setLayout(new BoxLayout(this.voicesGroupPanel, BoxLayout.Y_AXIS));
					VoiceComponentPanel voiceComponentPanel = new VoiceComponentPanel((VoiceComponent) oneComponent);
					this.voicesGroupPanel.add(voiceComponentPanel);
					this.voicesGroupPanel.add(Box.createVerticalGlue());
				} else {
					// TODO to which group panel -> how to distinguish?
					this.languagesGroupPanel.setLayout(new BoxLayout(this.languagesGroupPanel, BoxLayout.Y_AXIS));
					VoiceComponentPanel voiceComponentPanel = new VoiceComponentPanel(oneComponent);
					this.languagesGroupPanel.add(voiceComponentPanel);
					this.languagesGroupPanel.add(Box.createVerticalGlue());
				}
			}
		}
		// validate();
		// repaint();
	}

	private void fillComboBoxes() {
		HashMap<String, HashSet<String>> attributeValues = this.installer.getAttributeValues();
		for (Map.Entry<String, HashSet<String>> oneEntry : attributeValues.entrySet()) {
			JComboBox componentToFill = null;
			String key = oneEntry.getKey();
			if (key.equals("gender")) {
				componentToFill = this.genderBox;
			} else if (key.equals("locale")) {
				componentToFill = this.localeBox;
			} else if (key.equals("status")) {
				componentToFill = this.statusBox;
			} else if (key.equals("type")) {
				componentToFill = this.typeBox;
			}

			componentToFill.addItem("");
			for (String oneValue : attributeValues.get(key)) {
				componentToFill.addItem(oneValue);
			}
			componentToFill.setSelectedIndex(0);

		}
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JCheckBox advancedCheckBox;
	private javax.swing.JTabbedPane componentTabbedPane;
	private javax.swing.JPanel controlsPanel;
	private javax.swing.JSeparator controlsSep;
	private javax.swing.JComboBox genderBox;
	private javax.swing.JLabel genderLabel;
	private javax.swing.JPanel genderPanel;
	private javax.swing.JPanel languagesGroupPanel;
	private javax.swing.JScrollPane languagesScrollPane;
	private javax.swing.JComboBox localeBox;
	private javax.swing.JLabel localeLabel;
	private javax.swing.JPanel localePanel;
	private javax.swing.JButton logButton;
	private javax.swing.JButton maryPathButton;
	private javax.swing.JLabel maryPathLabel;
	private javax.swing.JTextField maryPathTextField;
	private javax.swing.JComboBox statusBox;
	private javax.swing.JLabel statusLabel;
	private javax.swing.JPanel statusPanel;
	private javax.swing.JComboBox typeBox;
	private javax.swing.JLabel typeLabel;
	private javax.swing.JPanel typePanel;
	private javax.swing.JPanel voicesGroupPanel;
	private javax.swing.JScrollPane voicesScrollPane;
	// End of variables declaration//GEN-END:variables
}