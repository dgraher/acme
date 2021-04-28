/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acme;

/**
 * Proporciona una manera de activar de forma remota explosivos para hacer volar correcaminos.
 * <p>
 * Trata de usar primero {@link Smartphone#zapRoadRunner} antes
 * de recurrir a {@link Dinamita#blowDinamitaBigBang}. Sin embargo, en casos graves de infestación
 * de correcaminos, el método {@link Smartphone#zapRoadRunner} podría no ser
 * suficientemente eficiente. En estos casos probablemente quieras recurrir a
 * {@link Dinamita#blowDinamitaBigBang} para aniquilarlos a todos a la vez.
 * <b> Advertencia:</b> aléjese primero de la zona!
 * </p>
 */
public class Dinamita {
    
    /**
     * Permite detonar de forma remota una carga de dinamita, <b> aléjese antes de activar el método </b>.
     * 
     * @param megatones indica el número de megatones de explosivo.
     * 
     * @see blowDinamitaSilentBang
     * @see Smartphone#zapRoadRunner
     */
    public void blowDinamitaBigBang(int megatones) {
        
        System.out.println("Colocando un cartucho de dinamita de " + megatones + " megatones.");
        System.out.println("kaboomg! mega explosión!");
        
    }
    
    /**
     * Descripción del método: Permite detonar de forma remota una bomba silenciosa, 
     * <b> no espere la emisión de absolutamente ningún sonido</b>.
     * 
     * @param megatones indica el número de megatones de explosivo.
     * 
     * @see blowDinamitaBigBang
     * @see Smartphone#zapRoadRunner
     */
    public void blowDinamitaSilentBang(int megatones) {
        
        System.out.println("Colocando una bomba silenciosa de " + megatones + " megatones.");
        System.out.println("<boom silencioso>. Nada se oye");
        
    }
    
    
}
