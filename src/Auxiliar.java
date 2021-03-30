
import java.awt.Dimension;
import java.awt.Toolkit;



    /*
     * To change this license header, choose License Headers in Project Properties.
     * To change this template file, choose Tools | Templates
     * and open the template in the editor.
     */

    /**
     *
     * @author macbook
     */
    public class Auxiliar {

        private Dimension screenSize;

        Auxiliar(){
            //Get the screen size
            Toolkit toolkit = Toolkit.getDefaultToolkit();
            this.screenSize = toolkit.getScreenSize();
        }

        int getLocationX(int width){
            return (this.screenSize.width - width) / 2;
        }

        int getLocationY(int height){
            return (this.screenSize.height - height) / 2;
        }
    }
