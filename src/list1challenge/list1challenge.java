package list1challenge;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class list1challenge {
    public static void main(String[] args) {

        ArrayList<Patient> patients = new ArrayList<>();

        Integer option = 1;
        String[] options = {"Cadastrar Paciente", "Gerar Relatório", "Encerrar!"};

        do {

            option = JOptionPane.showOptionDialog(
                    null,
                    "Escolha uma Opção!",
                    "Menu",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    options,
                    options[0]
            );

            switch (option) {
                case 0:
                    String name = JOptionPane.showInputDialog("Nome:");
                    Integer age = Integer.parseInt(JOptionPane.showInputDialog("Idade:"));
                    String sex = JOptionPane.showInputDialog("Sexo (M/F):");
                    Double height = Double.parseDouble(JOptionPane.showInputDialog("Altura (em metros):"));
                    Double weight = Double.parseDouble(JOptionPane.showInputDialog("Peso (em kg):"));

                    Patient patient = new Patient(name, age, sex, height, weight);
                    patients.add(patient);
                    break;

                case 1:
                    if (patients.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Nenhum paciente cadastrado!");
                    } else {

                        String report = "Relatório:\n";
                        report += "Quantidade de pacientes cadastrados: " + patients.size() + "\n";

                        Integer counterPatient18to25 = 0;
                        Integer medAge = 0;
                        Integer counterMan = 0;
                        Integer counterWoman = 0;
                        String oldestMan = null;
                        Integer oldestAge = 0;
                        String shorterWoman = null;
                        Double shorterHeight = 10.0;

                        for (Patient p : patients) {
                            if (p.getAge() >= 18 && p.getAge() <= 25) {
                                counterPatient18to25++;
                            };

                            if (p.getSex().equals("M")) {
                                medAge += p.getAge();
                                counterMan++;

                                if (p.getAge() > oldestAge) {
                                    oldestAge = p.getAge();
                                    oldestMan = p.getName();
                                };
                            };

                            if (p.getSex().equals("F") && (p.getHeight() >= 1.60 && p.getHeight() <= 1.70) && p.getWeight() > 70) {
                                counterWoman++;
                            };

                            if (p.getSex().equals("F")) {
                                if (p.getHeight() < shorterHeight) {
                                    shorterHeight = p.getHeight();
                                    shorterWoman = p.getName();
                                };
                            };
                        };

                        report += "Quantidade de pacientes com idade entre 18 a 25 anos: " + counterPatient18to25 + "\n";

                        if (counterMan > 0) {
                            report += "Idade média dos homens: " + (medAge / counterMan) + "\n";
                        } else {
                            report += "Idade média dos homens: N/A (nenhum homem cadastrado)\n";
                        };

                        report += "Quantidade de mulheres com altura entre 1,60 e 1,70 e peso acima de 70kg: " + counterWoman + "\n";
                        report += "Nome do homem mais velho: " + (oldestMan != null ? oldestMan : "N/A") + " (Idade: " + oldestAge + ")\n";
                        report += "Nome da mulher mais baixa: " + 
                        		(shorterWoman != null ? shorterWoman : "N/A") 
                        		+ " (Altura: " + 
                        		(shorterWoman != null ? shorterHeight : "N/A") + ")\n";

                        JOptionPane.showMessageDialog(null, report);
                    }
                    break;

                case 2:
                    JOptionPane.showMessageDialog(null, "Encerrando!");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Encerrando!");
                    break;
            };

        } while (option != 2);

        JOptionPane.showMessageDialog(null, "Encerrando!");

    };
};
