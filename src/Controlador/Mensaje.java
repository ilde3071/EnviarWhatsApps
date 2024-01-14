
package Controlador;

import java.awt.AWTException;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ilde
 */
public class Mensaje {
    // ---------
    // VARIABLES
    // ---------

    protected String texto;
    protected String numero;
    protected String link;

    
    // -------------
    // CONSTRUCTORES
    // -------------
    
    /**
     * Objeto que contiene la información del mensaje que queremos enviar.
     * @param texto contiene el texto del mensaje
     * @param numero contiene el número de teléfono
     */
    public Mensaje(String texto, String numero) {
        this.texto = texto;
        this.numero = numero;
        this.link = "https://web.whatsapp.com/send?phone=" + numero + "&text=" + texto.replace(" ", "+");
    }

    
    // -----------------
    // GETTERS Y SETTERS
    // -----------------
    
    /**
     * Devuelve un String con el valor de la variable texto.
     * @return variable texto
     */
    public String getTexto() {
        return texto;
    }

    /**
     * Modifica el valor de la variable texto y de la variable link.
     * @param texto valor que queremos modificar
     */
    public void setTexto(String texto) {
        this.texto = texto;
        this.setLink(this.getTexto(), this.getNumero());
    }

    /**
     * Devuelve un String con el valor de la variable numero.
     * @return variable numero
     */
    public String getNumero() {
        return numero;
    }

    /**
     * Modifica el valor de la variable numero y de la variable link.
     * @param numero valor que queremos modificar
     */
    public void setNumero(String numero) {
        this.numero = numero;
        this.setLink(this.getTexto(), this.getNumero());
    }

    /**
     * Devuelve un String con el valor de la variable link.
     * @return variable link
     */
    public String getLink() {
        return link;
    }

    /**
     * Modifica el valor de la variable link.
     * @param texto texto del mensaje
     * @param numero número de teléfono
     */
    public void setLink(String texto, String numero) {
        this.link = "https://web.whatsapp.com/send?phone=" + numero + "&text=" + texto.replace(" ", "+");
    }
    
    
    // -------
    // MÉTODOS
    // -------
    
    /**
     * Envía por WhatsApp el texto que hemos guardado en la variable al número
     * de teléfono que hemos guardado.
     */
    public void enviar(){
        URL url;
        
        try {
            url = new URL(this.getLink());
            
            try {
                // Abrimos el navegador y buscamos la dirección
                Desktop.getDesktop().browse(url.toURI());
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Mensaje.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (MalformedURLException ex) {
            Logger.getLogger(Mensaje.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            // Esperamos 20 segundos
            Thread.sleep(20000);
            
            try {
                // Pulsamos la tecla ENTER
                Robot robot = new Robot();
                robot.keyPress(KeyEvent.VK_ENTER);
                
            } catch (AWTException ex) {
                Logger.getLogger(Mensaje.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        } catch (InterruptedException ex) {
            Logger.getLogger(Mensaje.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
