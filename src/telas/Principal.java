/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

import entidades.Hospede;
import entidades.HospedeComboBox;
import entidades.Reserva;
import entidades.Suites;
import entidades.SuitesComboBox;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author douglas
 */
public class Principal extends javax.swing.JFrame {
	private Hospede hospedeComboBox;
	private int capacidadeSuiteSelecionada;
	private float valorDiariaSuiteSelecionada;
	private int totalHospedes;
	private int totalMenores2Anos;
	private int totalDiarias;
	private double totalDesconto;
	private double totalAPagar;
	private Hospede hospedeSelecionado;
	private Suites suiteSelecionada;

	/**
	 * Creates new form Principal
	 */
	
	public Principal() {
		initComponents();
		
		HospedeComboBox hospedeComboBox	=  new HospedeComboBox();
		Hospede hospede01 = new Hospede("Antônio Carlos Magnabosco","Rua Dos Padres, 43 - Santo Antônio", 57);
		Hospede hospede02 = new Hospede("Pedro Duarte Farias","Av. Benedito Valadares, 189 - Centro", 42);
		Hospede hospede03 = new Hospede("Zilda Araújo Maciel","Av. São Pedro, 83 - Centro", 45);
		Hospede hospede04 = new Hospede("Carla Pereira Silva","Rua Nossa Senhora Abadia, 345 - Alto das Torres", 33);
		Hospede hospede05 = new Hospede("Maria das Graças Amui","Rua São Sebastião, 90 - Maria Rosa", 29);
		hospedeComboBox.addHospedes(hospede01);
		hospedeComboBox.addHospedes(hospede02);
		hospedeComboBox.addHospedes(hospede03);
		hospedeComboBox.addHospedes(hospede04);
		hospedeComboBox.addHospedes(hospede05);
		
		this.jComboBoxHospede.setModel(hospedeComboBox);
		
		SuitesComboBox suitesComboBox	=  new SuitesComboBox();
		Suites suite01 = new Suites("001","Simples", 2, 30);
		Suites suite02 = new Suites("002","Simples", 2, 30);
		Suites suite03 = new Suites("003","Simples", 3, 35);
		Suites suite04 = new Suites("004","Simples", 3, 35);
		Suites suite05 = new Suites("005","Simples", 5, 50);
		Suites suite06 = new Suites("006","Luxo", 3, 50);
		Suites suite07 = new Suites("007","Luxo", 3, 50);
		Suites suite08 = new Suites("008","Luxo", 4, 70);
		Suites suite09 = new Suites("009","Luxo", 5, 100);
		Suites suite10 = new Suites("010","Luxo", 5, 100);
		
		suitesComboBox.addSuites(suite01);
		suitesComboBox.addSuites(suite02);
		suitesComboBox.addSuites(suite03);
		suitesComboBox.addSuites(suite04);
		suitesComboBox.addSuites(suite05);
		suitesComboBox.addSuites(suite06);
		suitesComboBox.addSuites(suite07);
		suitesComboBox.addSuites(suite08);
		suitesComboBox.addSuites(suite09);
		suitesComboBox.addSuites(suite10);
		
		this.jComboBoxSuite.setModel(suitesComboBox);
	}
	/**
	 * This method is called from within the constructor to initialize the
	 * form. WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jPanel1 = new javax.swing.JPanel();
                jTextField1 = new javax.swing.JTextField();
                jButton1 = new javax.swing.JButton();
                jPanel3 = new javax.swing.JPanel();
                jLabel1 = new javax.swing.JLabel();
                jLabel3 = new javax.swing.JLabel();
                jComboBoxHospede = new javax.swing.JComboBox<>();
                jComboBoxSuite = new javax.swing.JComboBox<>();
                jPanel5 = new javax.swing.JPanel();
                jPanel6 = new javax.swing.JPanel();
                jLabel4 = new javax.swing.JLabel();
                jLabelEndereco = new javax.swing.JLabel();
                jLabel14 = new javax.swing.JLabel();
                jLabelIdade = new javax.swing.JLabel();
                jLabel13 = new javax.swing.JLabel();
                jLabelTipoSuiteSelecionada = new javax.swing.JLabel();
                jLabel16 = new javax.swing.JLabel();
                jLabelCapacidadeSuiteSelecionada = new javax.swing.JLabel();
                jLabelValorDesconto = new javax.swing.JLabel();
                jButtonSalvar = new javax.swing.JButton();
                jLabel6 = new javax.swing.JLabel();
                jLabel11 = new javax.swing.JLabel();
                jLabel9 = new javax.swing.JLabel();
                jLabel7 = new javax.swing.JLabel();
                jLabelTotalAPagar = new javax.swing.JLabel();
                jLabel5 = new javax.swing.JLabel();
                jLabelValorDiaria = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();
                jComboBoxTotalHospede = new javax.swing.JComboBox<>();
                jComboBoxMenoresDe2Anos = new javax.swing.JComboBox<>();
                jComboBoxTotalDeDiarias = new javax.swing.JComboBox<>();

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 100, Short.MAX_VALUE)
                );
                jPanel1Layout.setVerticalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 100, Short.MAX_VALUE)
                );

                jTextField1.setText("jTextField1");

                jButton1.setText("jButton1");

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setTitle("Reserva de Diárias");

                jLabel1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
                jLabel1.setText("Suíte:");

                jLabel3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
                jLabel3.setText("Hóspede:");

                jComboBoxHospede.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
                jComboBoxHospede.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
                        public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
                        }
                        public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                                jComboBoxHospedePopupMenuWillBecomeInvisible(evt);
                        }
                        public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                        }
                });
                jComboBoxHospede.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jComboBoxHospedeActionPerformed(evt);
                        }
                });

                jComboBoxSuite.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
                jComboBoxSuite.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Número=001, Tipo=Simples, Capacidade=2", "Número=002, Tipo=Simples, Capacidade=2", "Número=003, Tipo=Simples, Capacidade=3", "Número=004, Tipo=Simples, Capacidade=3", "Número=005, Tipo=Simples, Capacidade=5", "Número=006, Tipo=Luxo, Capacidade=3", "Número=007, Tipo=Luxo, Capacidade=3", "Número=008, Tipo=Luxo, Capacidade=4", "Número=009, Tipo=Luxo, Capacidade=5", "Número=010, Tipo=Luxo, Capacidade=5" }));
                jComboBoxSuite.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
                        public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
                        }
                        public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                                jComboBoxSuitePopupMenuWillBecomeInvisible(evt);
                        }
                        public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                        }
                });
                jComboBoxSuite.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jComboBoxSuiteActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
                jPanel5.setLayout(jPanel5Layout);
                jPanel5Layout.setHorizontalGroup(
                        jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
                );
                jPanel5Layout.setVerticalGroup(
                        jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 13, Short.MAX_VALUE)
                );

                javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
                jPanel6.setLayout(jPanel6Layout);
                jPanel6Layout.setHorizontalGroup(
                        jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 197, Short.MAX_VALUE)
                );
                jPanel6Layout.setVerticalGroup(
                        jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
                );

                jLabel4.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
                jLabel4.setText("Endereço:");

                jLabelEndereco.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
                jLabelEndereco.setText("-");

                jLabel14.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
                jLabel14.setText("Idade:");

                jLabelIdade.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

                jLabel13.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
                jLabel13.setText("Tipo:");

                jLabelTipoSuiteSelecionada.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
                jLabelTipoSuiteSelecionada.setText("-");

                jLabel16.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
                jLabel16.setText("Capacidade:");

                jLabelCapacidadeSuiteSelecionada.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
                jLabelCapacidadeSuiteSelecionada.setText("-");

                jLabelValorDesconto.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
                jLabelValorDesconto.setText("R$ 0,00");

                jButtonSalvar.setText("Salvar");
                jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButtonSalvarActionPerformed(evt);
                        }
                });

                jLabel6.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
                jLabel6.setText("Total de hóspedes:");

                jLabel11.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
                jLabel11.setText("Total a pagar:");

                jLabel9.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
                jLabel9.setText("Valor de desconto:");

                jLabel7.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
                jLabel7.setText("Menores de 2 anos:");

                jLabelTotalAPagar.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
                jLabelTotalAPagar.setText("R$ 0,00");

                jLabel5.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
                jLabel5.setText("Valor da diária:");

                jLabelValorDiaria.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
                jLabelValorDiaria.setText("R$ 0,00");

                jLabel2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
                jLabel2.setText("Total de diárias:");

                jComboBoxTotalHospede.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
                jComboBoxTotalHospede.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5" }));
                jComboBoxTotalHospede.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
                        public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
                        }
                        public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                                jComboBoxTotalHospedePopupMenuWillBecomeInvisible(evt);
                        }
                        public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                        }
                });

                jComboBoxMenoresDe2Anos.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
                jComboBoxMenoresDe2Anos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5" }));
                jComboBoxMenoresDe2Anos.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
                        public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
                        }
                        public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                                jComboBoxMenoresDe2AnosPopupMenuWillBecomeInvisible(evt);
                        }
                        public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                        }
                });

                jComboBoxTotalDeDiarias.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
                jComboBoxTotalDeDiarias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
                jComboBoxTotalDeDiarias.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
                        public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
                        }
                        public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                                jComboBoxTotalDeDiariasPopupMenuWillBecomeInvisible(evt);
                        }
                        public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                        }
                });

                javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
                jPanel3.setLayout(jPanel3Layout);
                jPanel3Layout.setHorizontalGroup(
                        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(303, 303, 303)
                                                .addComponent(jButtonSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(5, 5, 5))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabelValorDesconto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jComboBoxTotalHospede, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jComboBoxMenoresDe2Anos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jComboBoxTotalDeDiarias, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                .addGap(18, 18, Short.MAX_VALUE)
                                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(jLabelValorDiaria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(jLabelTotalAPagar, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE))))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(161, 161, 161)
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabelEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel14)
                                                .addComponent(jLabel1)
                                                .addComponent(jLabel13))
                                        .addGap(23, 23, 23)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel3Layout.createSequentialGroup()
                                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jLabelTipoSuiteSelecionada)
                                                                .addComponent(jLabelIdade))
                                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGroup(jPanel3Layout.createSequentialGroup()
                                                        .addComponent(jComboBoxSuite, 0, 322, Short.MAX_VALUE)
                                                        .addGap(47, 47, 47)))))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jComboBoxHospede, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(jLabel16)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabelCapacidadeSuiteSelecionada)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
                jPanel3Layout.setVerticalGroup(
                        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(jComboBoxHospede, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabelEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel14)
                                        .addComponent(jLabelIdade))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(jComboBoxSuite, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel13)
                                        .addComponent(jLabelTipoSuiteSelecionada))
                                .addGap(9, 9, 9)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel16)
                                        .addComponent(jLabelCapacidadeSuiteSelecionada))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel6)
                                                        .addComponent(jLabel2)
                                                        .addComponent(jComboBoxTotalHospede, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jComboBoxTotalDeDiarias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel5)
                                                        .addComponent(jLabelValorDiaria)
                                                        .addComponent(jComboBoxMenoresDe2Anos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel9)
                                                        .addComponent(jLabelValorDesconto)
                                                        .addComponent(jLabel11)
                                                        .addComponent(jLabelTotalAPagar))
                                                .addGap(18, 18, 18)
                                                .addComponent(jButtonSalvar)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(28, Short.MAX_VALUE)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                );

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void jComboBoxSuiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSuiteActionPerformed
                
        }//GEN-LAST:event_jComboBoxSuiteActionPerformed

        private void jComboBoxHospedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxHospedeActionPerformed
        }//GEN-LAST:event_jComboBoxHospedeActionPerformed

        private void jComboBoxHospedePopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBoxHospedePopupMenuWillBecomeInvisible
		hospedeSelecionado = (Hospede)this.jComboBoxHospede.getSelectedItem();
		
		this.jLabelEndereco.setText(hospedeSelecionado.getEndereco());
		this.jLabelIdade.setText(String.valueOf(hospedeSelecionado.getIdade()));
        }//GEN-LAST:event_jComboBoxHospedePopupMenuWillBecomeInvisible

        private void jComboBoxSuitePopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBoxSuitePopupMenuWillBecomeInvisible
                suiteSelecionada = (Suites)this.jComboBoxSuite.getSelectedItem();
		this.jLabelTipoSuiteSelecionada.setText(suiteSelecionada.getTipo());
		this.jLabelCapacidadeSuiteSelecionada.setText(String.valueOf(suiteSelecionada.getCapacidade()+" Pessoas"));
		this.jLabelValorDiaria.setText("R$ "+String.valueOf(suiteSelecionada.getValorDiaria()));
		capacidadeSuiteSelecionada = suiteSelecionada.getCapacidade();
		valorDiariaSuiteSelecionada = suiteSelecionada.getValorDiaria();
		
        }//GEN-LAST:event_jComboBoxSuitePopupMenuWillBecomeInvisible

        private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
                totalHospedes = totalHospedes - totalMenores2Anos;
		if(totalHospedes == 0){
			JOptionPane.showMessageDialog(null,"A quantidade de hóspedes é igual a zero.\nVerifique!");
		}else{
			if(totalHospedes < totalMenores2Anos){
				JOptionPane.showMessageDialog(null, "A quantidade total de menores de 2 anos é superior a quantidade total de hóspedes.\nVerifique!");
				totalHospedes = 0;
				totalMenores2Anos = 0;
				this.jComboBoxMenoresDe2Anos.setSelectedItem(null);
				this.jComboBoxTotalHospede.setSelectedItem(null);
			}else{
				if(totalHospedes > capacidadeSuiteSelecionada){
					JOptionPane.showMessageDialog(null,"A quantidade de hóspedes adultos é superior a capacidade para a suíte.\nVerifique!");
				}else{
					if(totalDiarias == 0){
						JOptionPane.showMessageDialog(null,"A quantidade de diárias é igual a zero.\nVerifique!");
					}else{
						List<Reserva> listaReservas = new ArrayList<Reserva>();
					
					
						Reserva novaReserva = new Reserva();
						novaReserva.setHospede(hospedeSelecionado);
						novaReserva.setQuantidadePessoas(totalHospedes);
						novaReserva.setQuantidadeDiarias(totalDiarias);
						novaReserva.setSuite(suiteSelecionada);
					
						listaReservas.add(novaReserva);
					
						JOptionPane.showMessageDialog(null, "Dados salvos com sucesso!");
						System.out.println("Dados salvos com sucesso.");
						System.out.println(listaReservas);
						this.setVisible(false);
					}
				}
			}
		}
		/*this.jComboBoxHospede.setSelectedItem(null);
		this.jComboBoxSuite.setSelectedItem(null);
		this.jComboBoxMenoresDe2Anos.setSelectedItem(null);
		this.jComboBoxTotalDeDiarias.setSelectedItem(null);
		this.jComboBoxTotalHospede.setSelectedItem(null);
		*/
        }//GEN-LAST:event_jButtonSalvarActionPerformed

        private void jComboBoxTotalHospedePopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBoxTotalHospedePopupMenuWillBecomeInvisible
                totalHospedes = Integer.parseInt(this.jComboBoxTotalHospede.getSelectedItem().toString());
        }//GEN-LAST:event_jComboBoxTotalHospedePopupMenuWillBecomeInvisible

        private void jComboBoxMenoresDe2AnosPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBoxMenoresDe2AnosPopupMenuWillBecomeInvisible
                totalMenores2Anos = Integer.parseInt(this.jComboBoxMenoresDe2Anos.getSelectedItem().toString());
        }//GEN-LAST:event_jComboBoxMenoresDe2AnosPopupMenuWillBecomeInvisible

        private void jComboBoxTotalDeDiariasPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBoxTotalDeDiariasPopupMenuWillBecomeInvisible
                totalDiarias = Integer.parseInt(this.jComboBoxTotalDeDiarias.getSelectedItem().toString());
		if(totalDiarias > 7){
			totalDesconto = ((valorDiariaSuiteSelecionada * totalDiarias)*0.1);
			this.jLabelValorDesconto.setText(String.valueOf("R$ "+totalDesconto));
			totalAPagar = ((valorDiariaSuiteSelecionada * totalDiarias) - totalDesconto);
			this.jLabelTotalAPagar.setText(String.valueOf("R$ "+totalAPagar));
		}else{
			totalAPagar = valorDiariaSuiteSelecionada * totalDiarias;
			this.jLabelTotalAPagar.setText(String.valueOf("R$ "+totalAPagar));
		}
		
        }//GEN-LAST:event_jComboBoxTotalDeDiariasPopupMenuWillBecomeInvisible
                                    
	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Principal().setVisible(true);
			}
			
		});
		
	}

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton jButton1;
        private javax.swing.JButton jButtonSalvar;
        private javax.swing.JComboBox<String> jComboBoxHospede;
        private javax.swing.JComboBox<String> jComboBoxMenoresDe2Anos;
        private javax.swing.JComboBox<String> jComboBoxSuite;
        private javax.swing.JComboBox<String> jComboBoxTotalDeDiarias;
        private javax.swing.JComboBox<String> jComboBoxTotalHospede;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel11;
        private javax.swing.JLabel jLabel13;
        private javax.swing.JLabel jLabel14;
        private javax.swing.JLabel jLabel16;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel jLabel6;
        private javax.swing.JLabel jLabel7;
        private javax.swing.JLabel jLabel9;
        private javax.swing.JLabel jLabelCapacidadeSuiteSelecionada;
        private javax.swing.JLabel jLabelEndereco;
        private javax.swing.JLabel jLabelIdade;
        private javax.swing.JLabel jLabelTipoSuiteSelecionada;
        private javax.swing.JLabel jLabelTotalAPagar;
        private javax.swing.JLabel jLabelValorDesconto;
        private javax.swing.JLabel jLabelValorDiaria;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JPanel jPanel3;
        private javax.swing.JPanel jPanel5;
        private javax.swing.JPanel jPanel6;
        private javax.swing.JTextField jTextField1;
        // End of variables declaration//GEN-END:variables
}
