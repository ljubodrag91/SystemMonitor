package com.main;

import com.misc.SetIcon;
import com.misc.SystemInfo;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.system_resources.CPU_Info;
import com.system_resources.DISK_Info;
import com.system_resources.RAM_Info;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

public class Main {
    
    private static final Runtime runtime = Runtime.getRuntime();
    private static final int numberOfCores=runtime.availableProcessors();
    
    public static void main(String[] args) {
      SetIcon ic=new SetIcon();
      mainFrame frame=new mainFrame();
      ic.setIcon(frame);
      Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
      frame.setLocation(dim.width/2-frame.getSize().width/2, dim.height/2-frame.getSize().height/2);
      frame.setResizable(false);
      frame.mainPanel.setBackground(Color.lightGray);
      frame.cpu_load_monitor.setBackground(Color.lightGray);
      frame.ram_load_monitor.setBackground(Color.lightGray);
      frame.lbl_user.setText(System.getProperty("user.name"));
      frame.lbl_system_name.setText(SystemInfo.OSname());
      frame.lbl_arch.setText(SystemInfo.getRealArchWindows()+" bit");
      frame.lbl_version.setText(SystemInfo.OSversion());
      frame.lbl_cores.setText(String.valueOf(numberOfCores));
      
      int minimum = 0;
      int maximum = 100;
      
      File[] roots = File.listRoots();
      JLabel[] labels={frame.disk_1_lbl,frame.disk_2_lbl};
      JLabel[] gb_labels={frame.gb_lbl_1,frame.gb_lbl_2};
      JProgressBar[] bars={frame.progress_bar_1,frame.progress_bar_2};
      
      
      for(int i=0;i<2;i++){
          labels[i].setText(roots[i].getAbsolutePath());
          bars[i].setMinimum(minimum);
          bars[i].setMaximum(maximum);
          bars[i].setValue((int) DISK_Info.getDiskPercentUsage(i));
          bars[i].setStringPainted(true);
          gb_labels[i].setText("Total : "+String.valueOf(roots[i].getTotalSpace()/1024/1024/1024)+" GB");
          
      }
      
     
      
      frame.setVisible(true);
      //cpu monitor thread
          new Thread(new Runnable() {

        @Override
        public void run() {
    //         for(int num=1;num<=100;num++){
            while(true){
            try {
                frame.cpu_load_monitor.updateProgress(CPU_Info.getProcessCpuLoad());
                frame.cpu_load_monitor.repaint();
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(mainFrame.class.getName()).log(Level.SEVERE, null, ex);
            }   catch (Exception ex) {
                    Logger.getLogger(mainFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
    //    }
        }
        }      
    }).start();
      
      //ram monitor thread    
          new Thread(new Runnable() {

        @Override
        public void run() {
    //         for(int num=1;num<=100;num++){
            while(true){
            try {
                frame.ram_load_monitor.updateProgress(RAM_Info.getRamPercentUsage());
                frame.ram_load_monitor.repaint();
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(mainFrame.class.getName()).log(Level.SEVERE, null, ex);
            }   catch (Exception ex) {
                    Logger.getLogger(mainFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
    //    }
        }
        }      
    }).start();          
          
          
    }
}
